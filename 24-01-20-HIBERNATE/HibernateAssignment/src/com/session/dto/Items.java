package com.session.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Items {
@Id
private int itemId;
private String itemName;
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}

}
