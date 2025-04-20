package fr.line.appocraft.screen.custom;

import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.blocks.entity.ShelfBlockEntity;
import fr.line.appocraft.screen.ModMenuType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.neoforge.items.SlotItemHandler;

public class ShelfMenu extends AbstractContainerMenu {
    public final ShelfBlockEntity shelfBlockEntity;
    public final Level level;

    public ShelfMenu(int containerId, Inventory inv, FriendlyByteBuf extraData) {
        this(containerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()));
    }

    public ShelfMenu(int containerId, Inventory inv, BlockEntity blockEntity) {
        super(ModMenuType.SHELF_MENU.get(), containerId);
        this.shelfBlockEntity = (ShelfBlockEntity) blockEntity;
        this.level = inv.player.level();

        addPlayerInventory(inv);
        addPlayerHotbar(inv);

        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 0, 35, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 1, 53, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 2, 71, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 3, 89, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 4, 107, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 5, 125, 26));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 6, 35, 44));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 7, 53, 44));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 8, 71, 44));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 9, 89, 44));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 10, 107, 44));
        this.addSlot(new SlotItemHandler(this.shelfBlockEntity.inventory, 11, 125, 44));
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;
    private static final int TE_INVENTORY_SLOT_COUNT = 12;
    @Override
    public ItemStack quickMoveStack(Player playerIn, int pIndex) {
        Slot sourceSlot = slots.get(pIndex);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (pIndex < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (pIndex < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + pIndex);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(level, shelfBlockEntity.getBlockPos()),
                player, blocks.SHELF_LEFT_DOWN.get());
    }

    private void addPlayerInventory(Inventory playerInventory) {
        for (int i = 0; i < 3; ++i) {
            for (int l = 0; l < 9; ++l) {
                this.addSlot(new Slot(playerInventory, l + i * 9 + 9, 8 + l * 18, 84 + i * 18));
            }
        }
    }

    private void addPlayerHotbar(Inventory playerInventory) {
        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(playerInventory, i, 8 + i * 18, 142));
        }
    }
}
