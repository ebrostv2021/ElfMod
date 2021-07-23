
package net.mcreator.elfworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elfworld.item.DwarfsSwordItem;
import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class DwarfMountainItemGroup extends ElfworldModElements.ModElement {
	public DwarfMountainItemGroup(ElfworldModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdwarf_mountain") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DwarfsSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
