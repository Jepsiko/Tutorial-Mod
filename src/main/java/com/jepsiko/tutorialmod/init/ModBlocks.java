package com.jepsiko.tutorialmod.init;

import com.jepsiko.tutorialmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<BlockBase> BLOCKS = new ArrayList<>();

    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
}
