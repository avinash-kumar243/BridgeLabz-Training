package com.generics.onlinemarketplace;

public class GadgetCategory implements Category {

	@Override
	public String getCategoryName() {
		return "Gadget";
	}
	
	@Override
	public String toString() {
		return getCategoryName(); 
	} 
}