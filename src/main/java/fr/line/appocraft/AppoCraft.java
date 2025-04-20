package fr.line.appocraft;

import fr.line.appocraft.blocks.blocks;
import fr.line.appocraft.blocks.custom.SofaBlock;
import fr.line.appocraft.blocks.entity.ModBlockEntity;
import fr.line.appocraft.items.items;
import fr.line.appocraft.screen.ModMenuType;
import fr.line.appocraft.screen.custom.ClosetScreen;
import fr.line.appocraft.screen.custom.FridgeScreen;
import fr.line.appocraft.screen.custom.ShelfScreen;
import fr.line.appocraft.tabs.tabs;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.List;

@Mod(AppoCraft.MODID)
public class AppoCraft
{
    public static final String MODID = "appocraft";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AppoCraft(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        items.ITEMS.register(modEventBus);
        blocks.BLOCKS.register(modEventBus);
        tabs.TABS.register(modEventBus);

        ModBlockEntity.register(modEventBus);

        ModMenuType.MENUS.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        SofaBlock.sofaStates = List.of(
                blocks.RED_SOFA.get().defaultBlockState(),
                blocks.RED_SOFA_LEFT.get().defaultBlockState(),
                blocks.RED_SOFA_RIGHT.get().defaultBlockState(),
                blocks.RED_SOFA_MIDLE.get().defaultBlockState(),
                blocks.GREEN_SOFA.get().defaultBlockState(),
                blocks.GREEN_SOFA_LEFT.get().defaultBlockState(),
                blocks.GREEN_SOFA_RIGHT.get().defaultBlockState(),
                blocks.GREEN_SOFA_MIDLE.get().defaultBlockState()
        );
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }

        @SubscribeEvent
        public static void registerScreen(RegisterMenuScreensEvent event) {
            event.register(ModMenuType.CLOSET_MENU.get(), ClosetScreen::new);
            event.register(ModMenuType.FRIDGE_MENU.get(), FridgeScreen::new);
            event.register(ModMenuType.SHELF_MENU.get(), ShelfScreen::new);
        }
    }
}
