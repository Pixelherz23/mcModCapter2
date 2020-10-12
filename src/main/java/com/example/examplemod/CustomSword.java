package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

    public CustomSword(ToolMaterial material) {
        super(material);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setRegistryName("my_sword");
        this.setUnlocalizedName("my_sword");

    }
}
