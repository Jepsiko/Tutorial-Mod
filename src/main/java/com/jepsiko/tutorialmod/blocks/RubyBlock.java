package com.jepsiko.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {

    public RubyBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.METAL); //SoundType is the sound when we walk over the block
        setHardness(5.0f);
        setResistance(30.0f);
        setHarvestLevel("pickaxe", 2);
        //setLightLevel(0.0f);
        //setLightOpacity(1);
        //setBlockUnbreakable();
    }
}
