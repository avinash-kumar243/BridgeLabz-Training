package com.tabhistorymanager;

// Tab class
public class Tab {
	private String tabId;
	protected Tab back;
	protected Tab forward;

	public Tab(String tabId) {
		this.tabId = tabId;
		this.back = this.forward = null;
	}

	
	// Getters and Setters
	public String getTabId() {
		return tabId;
	}
	public void setTabId(String tabId) {
		this.tabId = tabId;
	}	
}