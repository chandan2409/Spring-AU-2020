package com.session.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
@Entity
@Table(name="UserTable")
@NamedQueries({
	@NamedQuery(name="HQL_GET_ALL_NAMES",
				query="from User")
})
public class User {
	
@Id   
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="UserId")
private int userid;
private String Uname;
private String Email;
private long Phone;


@ElementCollection(fetch=FetchType.EAGER)
@GenericGenerator(name="s",strategy="sequence")
@CollectionId(columns= {@Column(name="UserCart")}, generator="s", type=@Type(type="long"))
private List<Items> cart = new ArrayList<Items>();


@Embedded
@AttributeOverrides({
	@AttributeOverride(name="street", column =@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="pincode", column = @Column(name="HOME_PINCODE"))
})
private Address home_address;
public User() {
	// TODO Auto-generated method stub

}
public User(int userid, String uname, String email, long phone, Address home_address) {
	super();
	this.userid = userid;
	this.Uname = uname;
	this.Email = email;
	this.Phone = phone;
	this.home_address = home_address;
}

public List<Items> getCart() {
	return cart;
}
public void setCart(List<Items> cart) {
	this.cart = cart;
}
public Address getHome_address() {
	return home_address;
}
public void setHome_address(Address home_address) {
	this.home_address = home_address;
}

public String getUname() {
	return Uname;
}
public void setUname(String uname) {
	Uname = uname;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public long getPhone() {
	return Phone;
}
public void setPhone(long phone) {
	Phone = phone;
}

}
