
package net.mcreator.elfworld.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.elfworld.procedures.EffectEatProcedure;
import net.mcreator.elfworld.itemgroup.ElfgirlItemGroup;
import net.mcreator.elfworld.ElfworldModElements;

import java.util.Map;
import java.util.HashMap;

@ElfworldModElements.ModElement.Tag
public class ElfGoldAppleItem extends ElfworldModElements.ModElement {
	@ObjectHolder("elfworld:elf_gold_apple")
	public static final Item block = null;
	public ElfGoldAppleItem(ElfworldModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ElfgirlItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(5).saturation(0.3f).build()));
			setRegistryName("elf_gold_apple");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				EffectEatProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
