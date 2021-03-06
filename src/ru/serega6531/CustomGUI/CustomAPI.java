package ru.serega6531.CustomGUI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomAPI {
	
	public static void showInterface(Player player, CustomInterface cinterface){
		Inventory inv = Bukkit.createInventory(null, 45, cinterface.getName());
		
		ItemStack btn1 = cinterface.getButton1().getMaterial();
		ItemMeta meta1 = btn1.getItemMeta();
		meta1.setDisplayName(cinterface.getButton1().getName());
		btn1.setItemMeta(meta1);
		inv.setItem(10, btn1);
		inv.setItem(11, btn1);
		inv.setItem(12, btn1);
		inv.setItem(19, btn1);
		inv.setItem(20, btn1);
		inv.setItem(21, btn1);
		inv.setItem(28, btn1);
		inv.setItem(29, btn1);
		inv.setItem(30, btn1);
		
		ItemStack btn2 = cinterface.getButton2().getMaterial();
		ItemMeta meta2 = btn2.getItemMeta();
		meta2.setDisplayName(cinterface.getButton2().getName());
		btn2.setItemMeta(meta2);
		inv.setItem(14, btn2);
		inv.setItem(15, btn2);
		inv.setItem(16, btn2);
		inv.setItem(23, btn2);
		inv.setItem(24, btn2);
		inv.setItem(25, btn2);
		inv.setItem(32, btn2);
		inv.setItem(33, btn2);
		inv.setItem(34, btn2);
		
		GUIList.addCustomGUI(cinterface.getName(), cinterface);
		player.openInventory(inv);
	}

}
