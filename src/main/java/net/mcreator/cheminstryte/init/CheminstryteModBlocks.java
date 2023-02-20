
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cheminstryte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.cheminstryte.block.TunchirBlock;
import net.mcreator.cheminstryte.CheminstryteMod;

public class CheminstryteModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CheminstryteMod.MODID);
	public static final RegistryObject<Block> TUNCHIR = REGISTRY.register("tunchir", () -> new TunchirBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			TunchirBlock.registerRenderLayer();
		}
	}
}
