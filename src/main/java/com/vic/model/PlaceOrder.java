package com.vic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.springframework.stereotype.Component;

@Entity
@Component
public class PlaceOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ord_id;
	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Product prod;
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = MainCart.class)
	private MainCart order_cart;
	private String order_date;
	private String order_status;

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public MainCart getOrder_cart() {
		return order_cart;
	}

	public void setOrder_cart(MainCart order_cart) {
		this.order_cart = order_cart;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

}