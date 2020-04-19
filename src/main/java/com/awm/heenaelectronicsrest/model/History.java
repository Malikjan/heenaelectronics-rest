package com.awm.heenaelectronicsrest.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

//@Document
public class History {
	
	@Id
	private String id;
	private Date createdDate;
	private String addPoint;
	private String redeemPoint;
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
}
