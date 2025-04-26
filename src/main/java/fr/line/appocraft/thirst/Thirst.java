package fr.line.appocraft.thirst;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.common.util.INBTSerializable;
import org.jetbrains.annotations.UnknownNullability;

public class Thirst implements INBTSerializable<CompoundTag> {

    private Integer thirst = 20;

    public Integer getThirst() {
        return thirst;
    }

    public void setThirst(Integer add) {
        this.thirst = add;
    }

    @Override
    public @UnknownNullability CompoundTag serializeNBT(HolderLookup.Provider provider) {
        CompoundTag tag = new CompoundTag();
        tag.putInt("thirst", thirst);
        return tag;
    }

    @Override
    public void deserializeNBT(HolderLookup.Provider provider, CompoundTag compoundTag) {
        thirst = compoundTag.getInt("thirst");
    }
}
