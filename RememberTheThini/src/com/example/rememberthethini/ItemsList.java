package com.example.rememberthethini;

public class ItemsList {
	
	private String description;
	private boolean isChecked;
	

	public ItemsList(String string, boolean b) {
		this.description = string;
		this.isChecked = b;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getIsChecked() {
		return isChecked;
	}
	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

}
