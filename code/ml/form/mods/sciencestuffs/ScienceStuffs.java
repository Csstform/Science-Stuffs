package ml.form.mods.sciencestuffs;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ScienceStuffs.MODID, version = ScienceStuffs.VERSION)
public class ScienceStuffs
{
    public static final String MODID = "sciencestuffs";
    public static final String VERSION = "1.0";
    
    public static Block blockTest;
    
    public static CreativeTabs ssTab = new CreativeTabScienceStuffs("ScienceStuffs");
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	blockTest = new BlockTest().setBlockName("blockTest");
    	GameRegistry.registerBlock(blockTest, blockTest.getUnlocalizedName().substring(5));
    }
}
