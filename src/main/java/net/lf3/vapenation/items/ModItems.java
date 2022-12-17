package net.lf3.vapenation.items;

import net.lf3.vapenation.VapeNation;
import net.lf3.vapenation.items.custom.GoGreenVapeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VapeNation.MODID);

    public static final RegistryObject<Item> GO_GREEN_VAPE = ITEMS.register("go_green_vape",
            () -> new GoGreenVapeItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1)));
}
