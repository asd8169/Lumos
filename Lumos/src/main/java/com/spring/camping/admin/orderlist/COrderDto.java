package com.spring.camping.admin.orderlist;


public class COrderDto {

	String orderNo;
	String pName;
	int orderQuantity;
	int pprice;
	String orderAddress;
	String userId;
	String orderDate;
	
	public COrderDto() {
		// TODO Auto-generated constructor stub
	}

	public COrderDto(String orderNo, String pName, int orderQuantity, int pprice, String orderAddress, String userId,
			String orderDate) {
		super();
		this.orderNo = orderNo;
		this.pName = pName;
		this.orderQuantity = orderQuantity;
		this.pprice = pprice;
		this.orderAddress = orderAddress;
		this.userId = userId;
		this.orderDate = orderDate;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public String getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	
	
	
	
	
} // ----
