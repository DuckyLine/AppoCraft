package fr.line.appocraft.tabs;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.items.items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class tabs {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            AppoCraft.MODID);

    public static final Supplier<CreativeModeTab> APPOCRAFT_RESSOURCES = TABS.register("appocraft_ressources",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(items.EMPTY_CAN.get()))
                    .title(Component.translatable("creativetab.appocraft.appocraft_ressources"))
                    .displayItems((Parameters, Output) -> {
                        Output.accept(items.EMPTY_CAN.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> APPOCRAFT_FURNITURES = TABS.register("appocraft_furnitures",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(items.OAK_CHAIR.get()))
                    .title(Component.translatable("creativetab.appocraft.appocraft_furnitures"))
                    .displayItems((Parameters, Output) -> {
                        Output.accept(blocks.OAK_CHAIR);
                        Output.accept(blocks.BIRCH_CHAIR);
                        Output.accept(blocks.SPRUCE_CHAIR);
                        Output.accept(blocks.OAK_TABLE);
                        Output.accept(blocks.BIRCH_TABLE);
                        Output.accept(blocks.SPRUCE_TABLE);
                        Output.accept(blocks.OAK_CLOSET);
                        Output.accept(blocks.BIRCH_CLOSET);
                        Output.accept(blocks.SPRUCE_CLOSET);
                        Output.accept(blocks.FRIDGE);
                        Output.accept(blocks.DISHWASHER);
                    })
                    .build());

}
