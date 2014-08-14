package perry.mods.IronManMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockPalladiumBlock extends Block {

	public BlockPalladiumBlock(int par1, Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}

	public void registerIcons(IIconRegister par1iconRegister) {
		blockIcon = par1iconRegister.registerIcon("IronManMod:Palladium Block");
	}
}
