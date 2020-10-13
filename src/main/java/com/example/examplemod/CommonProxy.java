package com.example.examplemod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//todo check the javadoc to this annotation
//it will load the mod into minecraft
@Mod.EventBusSubscriber
public class CommonProxy {
    //register the sword image
    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        //bad code class var
        registerRender(ExampleMod.sword);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        //bad code. Class Variable!!
        event.getRegistry().registerAll(ExampleMod.sword);


    }
}
