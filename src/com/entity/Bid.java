package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bid")
public class Bid {
	
	@Id
	@Column(name="bid_id")	
	private int id;
	@Column(name="bid_price")
	private float bidPrice;
	
	@ManyToOne
	@JoinColumn(name="bid_item_id")
	private Item item;
	
	public Bid() {
		// TODO Auto-generated constructor stub
	}

	public Bid(int id, float bidPrice) {
		super();
		this.id = id;
		this.bidPrice = bidPrice;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(float bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	

}
