package ru.serega6531.CustomGUI;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;

public class EventListener implements Listener {
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent e){
		Inventory inv = e.getInventory();
		InventoryAction act = e.getAction();
		CustomInterface intr = GUIList.getCustomGUI(inv.getName());
		if(     ((act.equals(InventoryAction.PICKUP_ONE)) ||
				(act.equals(InventoryAction.PICKUP_SOME)) ||
		   		(act.equals(InventoryAction.PICKUP_ALL))) &&
		   		(GUIList.isCustomGUI(inv.getName())) &&
		   		((e.getCurrentItem().getItemMeta().getDisplayName().equals(intr.getButton1().getName()) ||
		   		(e.getCurrentItem().getItemMeta().getDisplayName().equals(intr.getButton2().getName()))))){
			int slot = e.getSlot();
			Player player = (Player) e.getWhoClicked();
			if((slot > 9 && slot < 13) ||
			   (slot > 18 && slot < 22) ||
			   (slot > 27 && slot < 31)){
				intr.getButton1().onClick(player, (byte) 1);
			} else if((slot > 13 && slot < 17) ||
					   (slot > 22 && slot < 26) ||
					   (slot > 31 && slot < 35)){
				intr.getButton2().onClick(player, (byte) 2);
			}
			e.setCancelled(true);
			player.closeInventory();
		}
	}
	
	@EventHandler
	public void onInventoryClosed(InventoryCloseEvent e){
		GUIList.removeCustomGUI(e.getInventory().getName());
	}

}
