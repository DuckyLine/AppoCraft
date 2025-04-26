package fr.line.appocraft.packet;

import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.network.PacketDistributor;

public class ThirstManager {

    public static void sendThirstToClient(ServerPlayer player, int thirst) {
        ThirstData data = new ThirstData(thirst);
        PacketDistributor.sendToPlayer(player, data);
    }
}