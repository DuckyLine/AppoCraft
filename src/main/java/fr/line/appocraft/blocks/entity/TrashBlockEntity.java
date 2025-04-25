package fr.line.appocraft.blocks.entity;

import fr.line.appocraft.screen.custom.TrashMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;
import org.jetbrains.annotations.Nullable;

public class TrashBlockEntity extends BlockEntity implements MenuProvider {
    public ItemStackHandler inventory;

    private ItemStackHandler createInventoryHandler() {
        return new ItemStackHandler(4) {
            @Override
            protected int getStackLimit(int slot, ItemStack stack) {
                return stack.getMaxStackSize();
            }

            @Override
            protected void onContentsChanged(int slot) {
                setChanged();
                if (!level.isClientSide)
                    level.sendBlockUpdated(getBlockPos(), getBlockState(), getBlockState(), 3);
            }
        };
    }

    public TrashBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntity.TRASH_BE.get(), pos, blockState);
        this.inventory = createInventoryHandler();
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
    }

    @Override
    public Component getDisplayName() {
        return Component.literal("Trash");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return new TrashMenu(i, inventory, this);
    }

    @Nullable
    @Override
    public Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}
