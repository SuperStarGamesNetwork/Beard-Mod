package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemVibraniumCore extends Item {

	public ItemVibraniumCore(int par1) {
		super();
		// TODO Auto-generated constructor stub
	}

	public void registerIcons(IIconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:Vibranium Core");
	}
}