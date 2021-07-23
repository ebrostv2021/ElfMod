
package net.mcreator.elfworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class DiamondTaItemGroup extends ElfworldModElements.ModElement {
	public DiamondTaItemGroup(ElfworldModElements instance) {
		super(instance, 103);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdiamond_ta") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.DIAMOND_BLOCK, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
