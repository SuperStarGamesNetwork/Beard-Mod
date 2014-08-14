package perry.mods.IronManMod.Item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPulseThrusters extends Item {

	public ItemPulseThrusters(int par1) {
		super();
	}

	public void registerIcons(IIconRegister par1iconRegister) {
		itemIcon = par1iconRegister.registerIcon("IronManMod:Pulse Thrusters");
	}
}
