package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemTitanium extends Item{

	public ItemTitanium(int par1) {
		super();
		// TODO Auto-generated constructor stub
	}
		public void registerIcons(IIconRegister par1iconRegister) {
			itemIcon = par1iconRegister.registerIcon("IronManMod:Titanium");
		
	}
}
