package com.session.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.session.dto.Address;
import com.session.dto.Ecommerce;
import com.session.dto.Items;
import com.session.dto.Orders;
import com.session.dto.Seller;
import com.session.dto.User;

public class Hibernate {
public static void main(String[] args) {
	
	Address addr = new Address();
	addr.setPincode("455345");
	addr.setStreet("Streett");
	
	Address addr2= new Address();
	addr.setPincode("627272");
	addr.setStreet("Streett2");
	User user1 = new User(1,"chandan","chandan@g.com",2198891,addr);
	User user2 = new User(2,"GEHER","tftsas@yss.com",89298298,addr);

	Items items=new Items();
	items.setItemId(1);
	items.setItemName("Mobile");
	
	Items items1=new Items();
	items.setItemId(2);
	items.setItemName("Laptop");
	
	List<Items> inventory=new ArrayList<Items>();
	inventory.add(items);
	inventory.add(items1);

	
	Seller s1=new Seller();
	s1.setSid(1);
	s1.setSellername("chandan");
	s1.setProducts(inventory);
	
	Orders order=new Orders();
	order.setOrderid(1);
	order.setPlacedOrder(inventory);
	order.setUser(user1);
	
	List<Seller> sellerList=new ArrayList<Seller>();
	sellerList.add(s1);
	
	List<User> userList=new ArrayList<User>();
	userList.add(user1);
	
	
	Ecommerce ecommerce=new Ecommerce();
	ecommerce.setId(1);
	ecommerce.setInventory(inventory);
	ecommerce.setSellers(sellerList);
	ecommerce.setUsers(userList);
	
	
	
	
	
	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	Session session =sessionFactory.openSession();
	session.beginTransaction();
	session.save(user1);
	session.save(user2);
	session.save(items1);
	session.save(items);
	session.save(s1);
	session.save(order);
	session.save(ecommerce);
	session.getTransaction().commit();
	session.close();
	
	Session session1=sessionFactory.openSession();
	
	//HQL QUERY
	List<User> result = session1.createQuery("from User", User.class).getResultList();
	System.out.println("HQL Query");
	for(User u: result) {
		System.out.println(u.getUname());
	}
	
	//named query
	
	Query query = session1.getNamedQuery("HQL_GET_ALL_NAMES");
	result = query.getResultList();
	System.out.println("Named Query");
	for(User u: result) {
		System.out.println(u.getUname());
	}
	
	//native
	Query query2 = session1.getNamedNativeQuery("SQL_GET_ALL_ITEMS");
	List<Object[]> ItemObjArray = query2.getResultList();
	System.out.println("Named Native Query (List of item objects)");
	for(Object[] i: ItemObjArray) {
//		Item item = (Item) i[0];
//		Item item = (Item) i[0];
		System.out.println(i);
	}
	
}
}
