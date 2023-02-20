
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheminstryte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.cheminstryte.item.TesttubeItem;
import net.mcreator.cheminstryte.CheminstryteMod;

public class CheminstryteModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CheminstryteMod.MODID);
	public static final RegistryObject<Item> TESTTUBE = REGISTRY.register("testtube", () -> new TesttubeItem());
}
