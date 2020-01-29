package com.session.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
@Entity
@NamedNativeQueries({ 
	@NamedNativeQuery(name = "SQL_GET_ALL_ITEMS", 
					   query = "select seller_sellerid, products_itemid,products from seller_items") })
public class Seller {
@Id
@Column(name="SellerId")
private int sid;
private String sellername;

@ElementCollection(fetch=FetchType.EAGER)
@GenericGenerator(name="s",strategy="sequence")
@CollectionId(columns= {@Column(name="Products")}, generator="s", type=@Type(type="long"))
private List<Items> products;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public List<Items> getProducts() {
	return products;
}
public void setProducts(List<Items> products) {
	this.products = products;
}
public String getSellername() {
	return sellername;
}
public void setSellername(String sellername) {
	this.sellername = sellername;
}

}

