package ru.serega6531.CustomGUI;

public class CustomInterface {
	
	private String name;
	private GUIButton button1, button2;
	
	public CustomInterface(String name, GUIButton button1, GUIButton button2){
		this.name = name;
		this.button1 = button1;
		this.button2 = button2;
	}
	
	public CustomInterface(String name, GUIButton button){
		this.name = name;
		this.button1 = button;
		this.button2 = button;
	}
	
	public String getName(){
		return name;
	}
	
	public GUIButton getButton1(){
		return button1;
	}
	
	public GUIButton getButton2(){
		return button2;
	}

}
