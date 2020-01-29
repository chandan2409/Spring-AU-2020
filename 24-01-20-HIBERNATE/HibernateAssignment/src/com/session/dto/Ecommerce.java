package com.session.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table
public class Ecommerce {
@Id
private int id;
@OneToMany
@JoinTable(name="UserEcommerceTable",joinColumns =@JoinColumn(name="id"),inverseJoinColumns =@JoinColumn(name="UserId") )
private List<User> users=new ArrayList<User>();

@ElementCollection(fetch=FetchType.EAGER)
@GenericGenerator(name="s",strategy="sequence")
@CollectionId(columns= {@Column(name="Inventory")}, generator="s", type=@Type(type="long"))
private List<Items> inventory=new ArrayList<Items>();

@OneToMany
@JoinTable(name="SellerList",joinColumns =@JoinColumn(name="id"),inverseJoinColumns =@JoinColumn(name="SellerId") )
private List<Seller> sellers;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<User> getUsers() {
	return users;
}
public void setUsers(List<User> users) {
	this.users = users;
}
public List<Items> getInventory() {
	return inventory;
}
public void setInventory(List<Items> inventory) {
	this.inventory = inventory;
}
public List<Seller> getSellers() {
	return sellers;
}
public void setSellers(List<Seller> sellers) {
	this.sellers = sellers;
}

}
