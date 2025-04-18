package fr.line.appocraft.datagen;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.items.items;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ItemModel extends ItemModelProvider {
    public ItemModel(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AppoCraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(items.EMPTY_CAN.get());
    }

}
