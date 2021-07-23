
package net.mcreator.elfworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.elfworld.itemgroup.DwarfMountainItemGroup;
import net.mcreator.elfworld.ElfworldModElements;

@ElfworldModElements.ModElement.Tag
public class DwarfsSwordItem extends ElfworldModElements.ModElement {
	@ObjectHolder("elfworld:dwarfs_sword")
	public static final Item block = null;
	public DwarfsSwordItem(ElfworldModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 441;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 21;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(DwarfsIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(DwarfMountainItemGroup.tab)) {
		}.setRegistryName("dwarfs_sword"));
	}
}
