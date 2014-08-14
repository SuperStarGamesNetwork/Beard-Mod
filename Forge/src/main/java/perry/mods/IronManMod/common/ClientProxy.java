package perry.mods.IronManMod.common;

import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerHandlers() {
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.SERVER);
		TickRegistry.registerTickHandler(new PlayerTickHandler(), Side.CLIENT);
	}

}