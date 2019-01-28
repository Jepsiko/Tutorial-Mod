package com.jepsiko.tutorialmod.items.tools;

import com.jepsiko.tutorialmod.Main;
import com.jepsiko.tutorialmod.init.ModItems;
import com.jepsiko.tutorialmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel {

    public ToolAxe(String name, ToolMaterial material) {
        super(material, 6.0f, -3.2f);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
