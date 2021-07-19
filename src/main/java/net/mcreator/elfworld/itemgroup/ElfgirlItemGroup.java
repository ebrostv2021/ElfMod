
package net.mcreator.elfworld.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.elfworld.item.ElfmusicItem;
import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class ElfgirlItemGroup extends ElfworldModElements.ModElement {
	public ElfgirlItemGroup(ElfworldModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabelfgirl") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ElfmusicItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
