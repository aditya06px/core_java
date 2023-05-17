package com.app.pet;

public class Order {

//	Order (orderId, petId, quantity, status)
	
	private static int idGenerator;
	private int orderId;
	private int petId;
	private int quantity;
	private StatusEnum status;
	
	static {
		idGenerator=1;
	}
	
	public Order( int petId, int quantity) {
		super();
		this.orderId = idGenerator++;
		this.petId = petId;
		this.quantity = quantity;
		this.status = StatusEnum.PLACED;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public int getPetId() {
		return petId;
	}


	public void setPetId(int petId) {
		this.petId = petId;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public StatusEnum getStatus() {
		return status;
	}


	public void setStatus(StatusEnum status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Order orderId=" + orderId + ", petId=" + petId + ", quantity=" + quantity + ", status=" + status ;
	}
	
	
}
