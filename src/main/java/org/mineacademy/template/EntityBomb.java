package org.mineacademy.template;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class EntityBomb extends SimplePlugin {

	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */
	@Override
	protected void onPluginStart() {
		System.out.println("Right click with caution!");
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example theEvent that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param theEvent
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent theEvent) {
		theEvent.getRightClicked().getWorld().createExplosion(theEvent.getRightClicked().getLocation(), 5);
//		if (theEvent.getRightClicked().getType() == EntityType.COW)
//			theEvent.getRightClicked().getWorld().createExplosion(theEvent.getRightClicked().getLocation(), 5);
	}
}
