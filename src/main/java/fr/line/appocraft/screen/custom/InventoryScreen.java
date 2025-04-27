package fr.line.appocraft.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import fr.line.appocraft.AppoCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
public class InventoryScreen extends net.minecraft.client.gui.screens.inventory.InventoryScreen {
    public InventoryScreen(Player player) {
        super(player);
    }

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath(AppoCraft.MODID, "textures/gui/container/inventory.png");

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
        Minecraft.getInstance().getTextureManager().bindForSetup(TEXTURE);

        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();

        int x = this.leftPos - 54;
        int y = this.topPos;
        guiGraphics.blit(TEXTURE, x, y, 0, 0, 256, 256, 256, 256);

        RenderSystem.disableBlend();
    }
}
