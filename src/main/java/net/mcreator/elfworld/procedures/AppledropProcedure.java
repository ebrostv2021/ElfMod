package net.mcreator.elfworld.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.minecraft.link.CurrentDevice;
import net.mcreator.elfworld.ElfworldModElements;
import net.mcreator.elfworld.ElfworldMod;

import java.util.Map;

@ElfworldModElements.ModElement.Tag
public class AppledropProcedure extends ElfworldModElements.ModElement {
	public AppledropProcedure(ElfworldModElements instance) {
		super(instance, 23);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElfworldMod.LOGGER.warn("Failed to load dependency entity for procedure Appledrop!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		CurrentDevice.enableDigitalInputEvents((int) 0);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 5);
	}
}
