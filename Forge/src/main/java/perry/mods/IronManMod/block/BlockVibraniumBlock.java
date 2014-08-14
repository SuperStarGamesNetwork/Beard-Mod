package perry.mods.IronManMod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockVibraniumBlock extends Block{

	public BlockVibraniumBlock(int par1, Material par2Material) {
		super (par2Material);
	}
	public void registerIcons(IIconRegister par1iconRegister) {
		blockIcon = par1iconRegister.registerIcon("IronManMod:Vibranium Block");
	}
}