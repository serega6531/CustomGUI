package ru.serega6531.CustomGUI;

import java.util.HashMap;

public class GUIList {
	
	private static HashMap<String, CustomInterface> invs = new HashMap<String, CustomInterface>();
	
	public static void addCustomGUI(String name, CustomInterface nint){
		invs.put(name, nint);
	}
	
	public static boolean isCustomGUI(String name){
		return invs.containsKey(name);
	}
	
	public static CustomInterface getCustomGUI(String name){
		return invs.get(name);
	}
	
	public static void removeCustomGUI(String name){
		invs.remove(name);
	}

	public static void clearList() {
		invs.clear();
	}

}
