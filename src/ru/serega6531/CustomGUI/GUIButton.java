package ru.serega6531.CustomGUI;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class GUIButton {
	
	String name = "Button";
	ItemStack material = new ItemStack(Material.WOOL);
	
	public GUIButton(){};
	
	public GUIButton(String name){
		this.name = name;
	}
	
	public GUIButton(String name, Material material){
		this.name = name;
		this.material = new ItemStack(material);
	}
	
	public GUIButton(String name, ItemStack material){
		this.name = name;
		this.material = material;
	}
	
	public ItemStack getMaterial(){
		return material;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void onClick(Player player, Byte button);

}
