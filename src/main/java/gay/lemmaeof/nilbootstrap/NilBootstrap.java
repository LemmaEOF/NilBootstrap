package gay.lemmaeof.nilbootstrap;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NilBootstrap implements PreLaunchEntrypoint {
	public static final Logger LOGGER = LoggerFactory.getLogger("NilBootstrap");


	@Override
	public void onPreLaunch(ModContainer mod) {
		LOGGER.info("Did someone say Nil? NilBootstrap is hijacking!");
		// NilLoader.hijack();
	}
}
