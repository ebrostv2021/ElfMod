
package net.mcreator.elfworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.elfworld.itemgroup.ElfgirlItemGroup;
import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class ElfSwordItem extends ElfworldModElements.ModElement {
	@ObjectHolder("elfworld:elf_sword")
	public static final Item block = null;
	public ElfSwordItem(ElfworldModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 4;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ElfGoldItem.block, (int) (1)));
			}
		}, 3, 6f, new Item.Properties().group(ElfgirlItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("elf_sword"));
	}
}
