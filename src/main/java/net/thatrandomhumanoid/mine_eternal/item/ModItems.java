package net.thatrandomhumanoid.mine_eternal.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thatrandomhumanoid.mine_eternal.MineEternal;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineEternal.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}