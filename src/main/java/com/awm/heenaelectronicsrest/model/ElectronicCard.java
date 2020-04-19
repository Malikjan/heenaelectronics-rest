package com.awm.heenaelectronicsrest.model;

import org.springframework.data.annotation.Id;

//@Document(collection = "card")
public class ElectronicCard {

	@Id
	private String id;
	private String number;
	private String point;
	private String addPoint;
	private String redeemPoint;
	private String type;

	public String getPoint() {
		return point;
	}

	public String getAddPoint() {
		return addPoint;
	}

	public void setAddPoint(String addPoint) {
		this.addPoint = addPoint;
	}

	public String getRedeemPoint() {
		return redeemPoint;
	}

	public void setRedeemPoint(String redeemPoint) {
		this.redeemPoint = redeemPoint;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
