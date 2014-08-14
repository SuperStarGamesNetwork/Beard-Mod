package perry.mods.IronManMod.common;

import cpw.mods.fml.relauncher.Side;

public class CommonProxy {
	public void registerHandlers() {
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.SERVER);
	}
} 