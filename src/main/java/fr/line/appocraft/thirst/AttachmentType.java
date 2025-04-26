package fr.line.appocraft.thirst;

import fr.line.appocraft.AppoCraft;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class AttachmentType {
    public static final DeferredRegister<net.neoforged.neoforge.attachment.AttachmentType<?>> ATTACHMENT_TYPE =
            DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, AppoCraft.MODID);

    public static final Supplier<net.neoforged.neoforge.attachment.AttachmentType<Thirst>> THIRST = ATTACHMENT_TYPE.register(
            "thirst", () -> net.neoforged.neoforge.attachment.AttachmentType.serializable(Thirst::new).build()
    );
}
