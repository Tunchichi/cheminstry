
package net.mcreator.cheminstryte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChemicaliconItem extends Item {
	public ChemicaliconItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}