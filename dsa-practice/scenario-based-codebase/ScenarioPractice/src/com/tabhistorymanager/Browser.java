package com.tabhistorymanager;

import java.util.LinkedList;
import java.util.Stack;

public class Browser {
	LinkedList<Tab> openTabs = new LinkedList<>();
	Stack<Tab> closeTabs = new Stack<>();
	
	
	// Open a new Tab :- add a new tab into doubly LinkedList - opedTabs
	public void openTab(Tab newTab) {
		if(newTab == null) {
			System.out.println("Tab not found!");
			return;
		}
		
		// Duplicate tab id
		for(Tab tab : openTabs) {
			if(tab.getTabId().equalsIgnoreCase(newTab.getTabId())) {
				System.out.println("Duplicate tab is not allowed!!!");
				return;
			}
		}
		
		// Opening tab
		openTabs.push(newTab);
		System.out.println("Tab opened");
	}
	
	
	// Close a Tab :- add a tab into Stack - closeTabs
	public void closeTab(String tabId) {
		for(Tab tab : openTabs) {
			if(tab.getTabId().equalsIgnoreCase(tabId)) {
				openTabs.remove(tab);
				closeTabs.push(tab);
				System.out.println("Tab id: " + tabId + " -> Tab closed");
				return;
			}
		}
		System.out.println("Invalid Tab Id. Tab not found");
	}
	
	
	// Open tab history :- See all opened tabs :- from doubly LinkedList
	public void viewOpenedTabs() {
		int count = 0;
		System.out.println("\nAll opened tab details are :- ");
		
		for(Tab tab : openTabs) {
			System.out.println("Tab " + count + " is open - Tab id: " + tab.getTabId());
			count++;
		}
	}
	
	
	// Close tab history :- See all closed tabs :- from Stack
	public void viewClosedTabs() {
		int count = 0;
		System.out.println("\nAll closed tab details are :- ");
		
		for(Tab tab : closeTabs) {
			System.out.println("Tab " + count + " has closed - Tab id: " + tab.getTabId());
			count++;
		}
	}
}