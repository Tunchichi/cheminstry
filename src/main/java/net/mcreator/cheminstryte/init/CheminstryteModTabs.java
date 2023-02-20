
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheminstryte.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CheminstryteModTabs {
	public static CreativeModeTab TAB_CHEMYNSTRYTE;

	public static void load() {
		TAB_CHEMYNSTRYTE = new CreativeModeTab("tabchemynstryte") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CheminstryteModItems.TESTTUBE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
