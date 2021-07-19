
package net.mcreator.elfworld.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class ElvenMaPainting extends ElfworldModElements.ModElement {
	public ElvenMaPainting(ElfworldModElements instance) {
		super(instance, 27);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(32, 16).setRegistryName("elven_ma"));
	}
}
