package fr.line.appocraft.packet;

import net.neoforged.neoforge.network.handling.IPayloadContext;

public class ClientPayloadHandler {

    private static int currentThirst = 20;

    public static void handleDataOnMain(final ThirstData data, final IPayloadContext context) {
        System.out.println("Received Thirst Data on client: " + data.thirst());
        currentThirst = data.thirst();
    }

    public static int getCurrentThirst() {
        return currentThirst;
    }
}
