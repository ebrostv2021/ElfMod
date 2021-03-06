
package net.mcreator.elfworld.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.elfworld.itemgroup.ElfgirlItemGroup;
import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class ElfmusicItem extends ElfworldModElements.ModElement {
	@ObjectHolder("elfworld:elfmusic")
	public static final Item block = null;
	public ElfmusicItem(ElfworldModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ElfworldModElements.sounds.get(new ResourceLocation("elfworld:elf")),
					new Item.Properties().group(ElfgirlItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("elfmusic");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
