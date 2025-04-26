package fr.line.appocraft.thirst;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.packet.ClientPayloadHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RenderGuiLayerEvent;

@EventBusSubscriber(modid = AppoCraft.MODID, value = Dist.CLIENT)
public class ThirstHudOverlay {

    private static final ResourceLocation THIRST_1 =
            ResourceLocation.fromNamespaceAndPath(AppoCraft.MODID, "textures/gui/thirst/thirst_1.png");
    private static final ResourceLocation THIRST_2 =
            ResourceLocation.fromNamespaceAndPath(AppoCraft.MODID, "textures/gui/thirst/thirst_2.png");
    private static final ResourceLocation THIRST_3 =
            ResourceLocation.fromNamespaceAndPath(AppoCraft.MODID, "textures/gui/thirst/thirst_3.png");

    @SubscribeEvent
    public static void onRenderOverlay(RenderGuiLayerEvent.Pre event) {
        Player player = Minecraft.getInstance().player;

        if (player == null || player.isCreative() || player.isSpectator()) return;

        int thirst = ClientPayloadHandler.getCurrentThirst();
        GuiGraphics guiGraphics = event.getGuiGraphics();

        int left = guiGraphics.guiWidth() / 2;
        int top = guiGraphics.guiHeight() - 49;

        int thirstValue = thirst;
        int fullGouttes = thirstValue / 2;

        Minecraft.getInstance().getTextureManager().bindForSetup(THIRST_1);
        Minecraft.getInstance().getTextureManager().bindForSetup(THIRST_2);
        Minecraft.getInstance().getTextureManager().bindForSetup(THIRST_3);

        for (int i = 0; i < 10; i++) {
            int x = left + i * 8 + 9;
            int y = top;

            guiGraphics.blit(THIRST_2,x,y,0,0,9,9, 9,9);

            if (i < fullGouttes) {
                guiGraphics.blit(THIRST_1,x,y,0,0,9,9, 9,9);
            } else if (i == fullGouttes && thirstValue % 2 != 0) {
                guiGraphics.blit(THIRST_3,x,y,0,0,9,9, 9,9);
            }
        }
    }

}
