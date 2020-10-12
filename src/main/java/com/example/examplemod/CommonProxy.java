package com.example.examplemod;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//todo check the javadoc to this annotation
//it will load the mod into minecraft
@Mod.EventBusSubscriber
public class CommonProxy {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        //bad code. Class VAriable!!
        event.getRegistry().registerAll(ExampleMod.sword);


    }
}
