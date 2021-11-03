package com.F14M3.emeraldarmor.datagen;

import com.F14M3.emeraldarmor.Main;
import com.F14M3.emeraldarmor.setup.Register;

import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class Items extends ItemModelProvider {
	 
	public Items(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, Main.MODID, existingFileHelper);
	}
	@Override
	protected void registerModels() {
		singleTexture(
				Register.TestItem.get().getRegistryName().getPath(),
				new ResourceLocation("item/handheld"),
				"layer0",
				new ResourceLocation(Main.MODID, "item/pickaxe")
				);
	}
}
