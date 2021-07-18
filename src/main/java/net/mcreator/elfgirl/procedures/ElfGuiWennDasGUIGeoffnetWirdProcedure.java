package net.mcreator.elfgirl.procedures;

import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.elfgirl.ElfgirlModElements;
import net.mcreator.elfgirl.ElfgirlMod;

import java.util.function.Supplier;
import java.util.Map;

@ElfgirlModElements.ModElement.Tag
public class ElfGuiWennDasGUIGeoffnetWirdProcedure extends ElfgirlModElements.ModElement {
	public ElfGuiWennDasGUIGeoffnetWirdProcedure(ElfgirlModElements instance) {
		super(instance, 20);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				ElfgirlMod.LOGGER.warn("Failed to load dependency entity for procedure ElfGuiWennDasGUIGeoffnetWird!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) _ent).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
						_current.detectAndSendChanges();
					}
				}
			}
		}
	}
}
