package com.Arda.ReturnToArda.items;

import com.Arda.ReturnToArda.Items.ModItems;
import com.Arda.ReturnToArda.ReturnToArda;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReturnToArda.MOD_ID);

    public static final Supplier<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.Pipeweed.get()))
                    .title(Component.translatable("creativetabs.items_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.Pipeweed.get());
                        pOutput.accept(ModItems.PipeweedLeaf.get());


                    })

                    .build()
    );




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);

    }

}
