package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPalladium extends Item {

	public ItemPalladium(int par1) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void registerIcons(IIconRegister par1IconRegister) {
		itemIcon = par1IconRegister.registerIcon("IronManMod:Palladium");
	}
}
