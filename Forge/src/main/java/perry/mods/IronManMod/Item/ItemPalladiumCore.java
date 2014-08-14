package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPalladiumCore extends Item{

	public ItemPalladiumCore(int par1) {
		super();
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IIconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:Palladium Core");
	
	}
}
