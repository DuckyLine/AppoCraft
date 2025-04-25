package fr.line.appocraft.screen;

import fr.line.appocraft.AppoCraft;
import fr.line.appocraft.screen.custom.ClosetMenu;
import fr.line.appocraft.screen.custom.FridgeMenu;
import fr.line.appocraft.screen.custom.ShelfMenu;
import fr.line.appocraft.screen.custom.TrashMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModMenuType {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, AppoCraft.MODID);

    public static final DeferredHolder<MenuType<?>, MenuType<ClosetMenu>> CLOSET_MENU =
            registerMenuType("closet_menu", ClosetMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<FridgeMenu>> FRIDGE_MENU =
            registerMenuType("fridge_menu", FridgeMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<ShelfMenu>> SHELF_MENU =
            registerMenuType("shelf_menu", ShelfMenu::new);

    public static final DeferredHolder<MenuType<?>, MenuType<TrashMenu>> TRASH_MENU =
            registerMenuType("trash_menu", TrashMenu::new);

    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> registerMenuType(String name,
                                                                                                              IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }


}
