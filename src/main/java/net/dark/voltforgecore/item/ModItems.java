package net.dark.voltforgecore.item;

import net.dark.voltforgecore.VoltForgeCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(VoltForgeCore.MOD_ID);

    public static final DeferredItem<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
