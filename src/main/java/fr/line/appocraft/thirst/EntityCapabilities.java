package fr.line.appocraft.thirst;

import fr.line.appocraft.AppoCraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.capabilities.BaseCapability;
import net.neoforged.neoforge.capabilities.EntityCapability;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class EntityCapabilities<T, C> extends BaseCapability<T, C> {
    protected EntityCapabilities(ResourceLocation name, Class<T> typeClass, Class<C> contextClass) {
        super(name, typeClass, contextClass);
    }

    private static final Map<Object, Object> capabilityStorage = new HashMap<>();

    public static <T, C> C getCapability(T entity, C context) {
        return (C) capabilityStorage.get(entity);  // Récupère la capacité associée à l'entité
    }

    // Vous n'avez plus besoin de méthode statique ici, mais vous pouvez toujours avoir l'instance statique
    public static final EntityCapability<Player, Void> entityCapabilities = EntityCapability.createVoid(
            ResourceLocation.fromNamespaceAndPath("thirst", AppoCraft.MODID),
            Player.class
    );
}