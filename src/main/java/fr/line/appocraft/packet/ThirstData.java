package fr.line.appocraft.packet;

import fr.line.appocraft.AppoCraft;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record ThirstData(int thirst) implements CustomPacketPayload {

    public static final CustomPacketPayload.Type<ThirstData> TYPE =
            new CustomPacketPayload.Type<>(ResourceLocation.fromNamespaceAndPath(AppoCraft.MODID, "thirst_data"));

    public static final StreamCodec<ByteBuf, ThirstData> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.VAR_INT, ThirstData::thirst, ThirstData::new
    );

    @Override
    public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
        return TYPE;
    }
}