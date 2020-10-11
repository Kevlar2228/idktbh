package com.sefohui.idktbh.blocks;

import com.sefohui.idktbh.idktbh;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group((idktbh.TAB)));
    }
}
