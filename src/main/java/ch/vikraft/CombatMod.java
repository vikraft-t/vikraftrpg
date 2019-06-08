package ch.vikraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CombatMod implements ModInitializer {

    public static final Item IRON_WARAXE = new Item(new Item.Settings().group(ItemGroup.COMBAT).maxDamage(6));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("vikraft", "iron_waraxe"), IRON_WARAXE);
    }
}
