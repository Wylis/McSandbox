package org.wylis.examplemod;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
//import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ExampleMod.MODID, name = ExampleMod.NAME, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final Block genericBlock = new GenericBlock(Material.portal).setHardness(0.5f).setStepSound(Block.soundTypeSnow).setCreativeTab(CreativeTabs.tabBlock).setBlockName("TheBlock");

    public static final String MODID = "examplemod";
    public static final String NAME = "Example Mod";
    public static final String VERSION = "0.0.1";

    @Mod.Instance("ExampleMod")
    public static ExampleMod instance;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // Some practicing stuff
        ItemStack dirtStack = new ItemStack(Blocks.dirt);
        ItemStack stoneStack = new ItemStack(Blocks.stone);
        ItemStack diamondStack = new ItemStack(Items.diamond, 64);
        ItemStack blackWoolStack = new ItemStack(Blocks.wool, 10, 15);

        GameRegistry.addShapelessRecipe(blackWoolStack, dirtStack);
        GameRegistry.addShapedRecipe(diamondStack, "dsd", "sds", "dsd", 'd', dirtStack, 's', stoneStack);

        GameRegistry.registerBlock(genericBlock, "TheUniqueBlock");


    }
}
