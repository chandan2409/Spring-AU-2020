package com.session.dto;

import java.util.List;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class Orders {
@Id
private int orderid;
@OneToOne
@JoinColumn(name="UserId")
private User user;

@ElementCollection(fetch=FetchType.EAGER)
@GenericGenerator(name="s",strategy="sequence")
@CollectionId(columns= {@Column(name="OrderList")}, generator="s", type=@Type(type="long"))
private List<Items> placedOrder;

public int getOrderid() {
	return orderid;
}

public void setOrderid(int orderid) {
	this.orderid = orderid;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public List<Items> getPlacedOrder() {
	return placedOrder;
}

public void setPlacedOrder(List<Items> placedOrder) {
	this.placedOrder = placedOrder;
}



}
