package com.Arda.ReturnToArda.Items;

import com.Arda.ReturnToArda.ReturnToArda;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.RegistryOps;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
                        DeferredRegister.create(Registries.ITEM, ReturnToArda.MOD_ID);

    public static final Supplier<Item> Pipeweed =
            ITEMS.register("pipeweed",
                    () -> new Item(new Item.Properties()));
    public static final Supplier<Item> PipeweedLeaf =
            ITEMS.register("pipeweedleaf",
                    () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
