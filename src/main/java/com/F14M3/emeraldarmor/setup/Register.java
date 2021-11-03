package com.F14M3.emeraldarmor.setup;

import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.F14M3.emeraldarmor.Main.MODID;

import com.F14M3.emeraldarmor.items.*;


public class Register {
	
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
	
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	
	public static final RegistryObject<Item> TestItem = ITEMS.register("testitem", () -> new TestItem(new Item.Properties()));
}
