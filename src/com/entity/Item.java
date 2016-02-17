package com.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {

	@Id
	@Column(name="item_id")
	private int id;
	@Column(name="item_name")
	private String name;
	@Column(name="item_price")
	private float price;
	
	@OneToMany(mappedBy="item")
	private Set<Bid> bids;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Set<Bid> getBids() {
		return bids;
	}
	
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
	

}
