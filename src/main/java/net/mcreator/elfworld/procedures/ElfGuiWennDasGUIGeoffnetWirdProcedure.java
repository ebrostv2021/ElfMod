package net.mcreator.elfworld.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.minecraft.link.CurrentDevice;
import net.mcreator.elfworld.ElfworldModElements;
import net.mcreator.elfworld.ElfworldMod;

import java.util.Map;

@ElfworldModElements.ModElement.Tag
public class ElfGuiWennDasGUIGeoffnetWirdProcedure extends ElfworldModElements.ModElement {
	public ElfGuiWennDasGUIGeoffnetWirdProcedure(ElfworldModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElfworldMod.LOGGER.warn("Failed to load dependency entity for procedure ElfGuiWennDasGUIGeoffnetWird!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		CurrentDevice.enableDigitalInputEvents((int) 7);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 5);
	}
}
