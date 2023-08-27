package com.lunch.manage.domain;

public class Lunch {

	private String name;
	private String itemName;
	private int items;

	public Lunch() {
		super();
	}

	public Lunch(String name, String itemName, int items) {
		super();
		this.name = name;
		this.itemName = itemName;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Lunch [name=" + name + ", itemName=" + itemName + ", items=" + items + "]";
	}

}
