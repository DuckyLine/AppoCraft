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

    public static final Supplier<CreativeModeTab> APPOCRAFT_WEAPONS = TABS.register("appocraft_weapons",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(items.BASEBALLBAT.get()))
                    .title(Component.translatable("creativetab.appocraft.appocraft_ressources"))
                    .displayItems((Parameters, Output) -> {
                        Output.accept(items.BASEBALLBAT.get());
                    })
                    .build());

    public static final Supplier<CreativeModeTab> APPOCRAFT_BLOCKS = TABS.register("appocraft_blocks",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(items.BRICKS_1.get()))
                    .title(Component.translatable("creativetab.appocraft.appocraft_ressources"))
                    .displayItems((Parameters, Output) -> {
                        Output.accept(blocks.BRICKS_1.get());
                        Output.accept(blocks.ROAD_DOUBLE_LINE.get());
                        Output.accept(blocks.ROAD_DOUBLE_CORNER_LINE.get());
                        Output.accept(blocks.ROAD_STOP_LINE.get());
                        Output.accept(blocks.ROAD_CENTER_LINE.get());
                        Output.accept(blocks.ROAD_CENTER_FULL_LINE.get());
                        Output.accept(blocks.ROAD.get());
                        Output.accept(blocks.METAL_1.get());
                        Output.accept(blocks.METAL_2.get());
                        Output.accept(blocks.METAL_3.get());
                        Output.accept(blocks.METALWALL.get());
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
                        Output.accept(blocks.OAK_COFFEE_TABLE);
                        Output.accept(blocks.BIRCH_COFFEE_TABLE);
                        Output.accept(blocks.SPRUCE_COFFEE_TABLE);
                        Output.accept(blocks.OAK_CLOSET);
                        Output.accept(blocks.BIRCH_CLOSET);
                        Output.accept(blocks.SPRUCE_CLOSET);
                        Output.accept(blocks.FRIDGE);
                        Output.accept(blocks.DISHWASHER);
                        Output.accept(blocks.SHELF);
                        Output.accept(blocks.RED_SOFA);
                        Output.accept(blocks.GREEN_SOFA);
                        Output.accept(blocks.WHITE_SOFA);
                        Output.accept(blocks.BLACK_SOFA);
                        Output.accept(blocks.GRAY_SOFA);
                        Output.accept(blocks.TRASH);
                        Output.accept(blocks.TV);
                        Output.accept(blocks.FOLDING_TABLE);
                        Output.accept(blocks.TRAFFIC_CONE);
                        Output.accept(blocks.BARBED);
                        Output.accept(blocks.FLOOR_LAMP);
                    })
                    .build());

}
