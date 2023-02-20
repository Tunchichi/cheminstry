
package net.mcreator.cheminstryte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.cheminstryte.init.CheminstryteModTabs;

public class TesttubeItem extends Item {
	public TesttubeItem() {
		super(new Item.Properties().tab(CheminstryteModTabs.TAB_CHEMYNSTRYTE).stacksTo(64).rarity(Rarity.COMMON));
	}
}
