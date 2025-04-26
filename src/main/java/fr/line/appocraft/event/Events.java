package fr.line.appocraft.event;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.packet.ThirstManager;
import fr.line.appocraft.thirst.AttachmentType;
import fr.line.appocraft.thirst.Thirst;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = AppoCraft.MODID)
public class Events {

    @SubscribeEvent
    public static void onPlayerTick(PlayerEvent.PlayerLoggedInEvent event) {
        Player player = event.getEntity();
        Thirst thirst = player.getData(AttachmentType.THIRST.get());
        ThirstManager.sendThirstToClient((ServerPlayer) player, thirst.getThirst());
    }

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Pre event) {
        Player player = event.getEntity();

        if (player == null || player.isCreative() || player.isCreative()) return;
        if (player.level().isClientSide()) return;

        Thirst thirst = player.getData(AttachmentType.THIRST.get());
        if (thirst.getThirst() <= 0) {
            player.hurt(player.damageSources().cactus(), 1.0F);
        } else {
            if (event.getEntity().tickCount % 700 == 0) {
                thirst.setThirst(thirst.getThirst() - 1);
                ThirstManager.sendThirstToClient((ServerPlayer) player, thirst.getThirst());
            }
        }
    }
}
