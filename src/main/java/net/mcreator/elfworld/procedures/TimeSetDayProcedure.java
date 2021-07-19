package net.mcreator.elfworld.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;

import net.mcreator.elfworld.ElfworldModElements;
import net.mcreator.elfworld.ElfworldMod;

import java.util.Map;

@ElfworldModElements.ModElement.Tag
public class TimeSetDayProcedure extends ElfworldModElements.ModElement {
	public TimeSetDayProcedure(ElfworldModElements instance) {
		super(instance, 67);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				ElfworldMod.LOGGER.warn("Failed to load dependency world for procedure TimeSetDay!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld)
			((ServerWorld) world).setDayTime((int) 1000);
	}
}
