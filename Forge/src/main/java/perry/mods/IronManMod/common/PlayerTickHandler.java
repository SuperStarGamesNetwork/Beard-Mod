package perry.mods.IronManMod.common;

import java.util.EnumSet;

import net.minecraft.entity.player.EntityPlayer;
import perry.mods.IronManMod.armor.IronManArmor;

public class PlayerTickHandler implements ITickHandler {

	public EntityPlayer player;

	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		playerTick((EntityPlayer) tickData[0]);

	}

	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		// TODO Auto-generated method stub

	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "My Tick Handler";
	}

	private void playerTick(EntityPlayer player) {

		if (player.inventory.armorInventory[0] != null) {
			if (player.inventory.armorInventory[0].getItem() instanceof IronManArmor) {

				player.capabilities.allowFlying = true;

			} else if (player.inventory.armorInventory[0] != null) {
				player.capabilities.isFlying = false;
			}
		}

		else if (!player.capabilities.isCreativeMode) {
			player.capabilities.allowFlying = false;
			player.capabilities.isFlying = false;
		}
	}

	public void damageArmor(float par1) {
		par1 /= 4.0F;

		if (par1 < 1.0F) {
			par1 = 1.0F;
		}

		if (player.capabilities.isFlying == true) {
			player.inventory.armorInventory[0].damageItem((int) par1,
					this.player);
		}

	}

}
