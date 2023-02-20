
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheminstryte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cheminstryte.item.TesttubeItem;
import net.mcreator.cheminstryte.CheminstryteMod;

public class CheminstryteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CheminstryteMod.MODID);
	public static final RegistryObject<Item> TESTTUBE = REGISTRY.register("testtube", () -> new TesttubeItem());
	public static final RegistryObject<Item> TUNCHIR = block(CheminstryteModBlocks.TUNCHIR, CheminstryteModTabs.TAB_CHEMYNSTRYTE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
