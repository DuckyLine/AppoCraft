package fr.line.appocraft.blocks.custom.type;

import net.minecraft.util.StringRepresentable;

public enum WoodType implements StringRepresentable {
    OAK("oak"),
    BIRCH("birch"),
    SPRUCE("spruce");

    private final String name;

    WoodType(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
