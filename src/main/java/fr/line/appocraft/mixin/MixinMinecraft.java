package fr.line.appocraft.mixin;

import fr.line.appocraft.screen.custom.InventoryScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(method = "setScreen(Lnet/minecraft/client/gui/screens/Screen;)V", at = @At("HEAD"), cancellable = true)
    private void onSetScreen(Screen guiScreen, CallbackInfo ci) {
        Minecraft mc = Minecraft.getInstance();

        if (guiScreen instanceof net.minecraft.client.gui.screens.inventory.InventoryScreen
                && !(guiScreen instanceof InventoryScreen)) {
            mc.setScreen(new InventoryScreen(mc.player));
            ci.cancel();
        }
    }
}