package fr.line.appocraft.blocks.custom.type;

import fr.line.appocraft.blocks.blocks;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.List;

public class SofaType {

    public static List<DeferredBlock<Block>> getSofaType(Block block) {
        if (block == blocks.GREEN_SOFA.get() ||
                block == blocks.GREEN_SOFA_LEFT.get() ||
                block == blocks.GREEN_SOFA_RIGHT.get() ||
                block == blocks.GREEN_SOFA_MIDLE.get())
            return (GreenSofa);
        else if (block == blocks.WHITE_SOFA.get() ||
                block == blocks.WHITE_SOFA_LEFT.get() ||
                block == blocks.WHITE_SOFA_RIGHT.get() ||
                block == blocks.WHITE_SOFA_MIDLE.get())
            return (WhiteSofa);
        else if (block == blocks.BLACK_SOFA.get() ||
                block == blocks.BLACK_SOFA_LEFT.get() ||
                block == blocks.BLACK_SOFA_RIGHT.get() ||
                block == blocks.BLACK_SOFA_MIDLE.get())
            return (BlackSofa);
        else if (block == blocks.GRAY_SOFA.get() ||
                block == blocks.GRAY_SOFA_LEFT.get() ||
                block == blocks.GRAY_SOFA_RIGHT.get() ||
                block == blocks.GRAY_SOFA_MIDLE.get())
            return (GraySofa);
        return (RedSofa);
    }

    public static List<DeferredBlock<Block>> RedSofa = List.of(
            blocks.RED_SOFA, blocks.RED_SOFA_LEFT, blocks.RED_SOFA_RIGHT, blocks.RED_SOFA_MIDLE
    );

    public static List<DeferredBlock<Block>> GreenSofa = List.of(
            blocks.GREEN_SOFA, blocks.GREEN_SOFA_LEFT, blocks.GREEN_SOFA_RIGHT, blocks.GREEN_SOFA_MIDLE
    );

    public static List<DeferredBlock<Block>> WhiteSofa = List.of(
            blocks.WHITE_SOFA, blocks.WHITE_SOFA_LEFT, blocks.WHITE_SOFA_RIGHT, blocks.WHITE_SOFA_MIDLE
    );

    public static List<DeferredBlock<Block>> BlackSofa = List.of(
            blocks.BLACK_SOFA, blocks.BLACK_SOFA_LEFT, blocks.BLACK_SOFA_RIGHT, blocks.BLACK_SOFA_MIDLE
    );

    public static List<DeferredBlock<Block>> GraySofa = List.of(
            blocks.GRAY_SOFA, blocks.GRAY_SOFA_LEFT, blocks.GRAY_SOFA_RIGHT, blocks.GRAY_SOFA_MIDLE
    );

}
