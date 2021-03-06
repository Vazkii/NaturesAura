package de.ellpeck.naturesaura.items;

import de.ellpeck.naturesaura.blocks.ModBlocks;
import net.minecraftforge.oredict.OreDictionary;

public final class OreDict {

    public static void init() {
        OreDictionary.registerOre("logWood", ModBlocks.ANCIENT_LOG);
        OreDictionary.registerOre("plankWood", ModBlocks.ANCIENT_PLANKS);
        OreDictionary.registerOre("stickWood", ModItems.ANCIENT_STICK);
        OreDictionary.registerOre("treeLeaves", ModBlocks.ANCIENT_LEAVES);
    }

}
