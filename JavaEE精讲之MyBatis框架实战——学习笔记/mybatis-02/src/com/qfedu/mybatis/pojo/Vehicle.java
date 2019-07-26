package com.qfedu.mybatis.pojo;

import java.util.Date;

public abstract class Vehicle {

	private Integer id;
	private String vin;//车辆识别代码Veterinary information network
	private Date year;
	private String make;//品牌：what make is it
	private String model;//
	private String color;
	
	public Vehicle() {}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
		this.year = year;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String test() {
		return "vehicle test";
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vin=" + vin + ", year=" + year + ", make=" + make + ", model=" + model
				+ ", color=" + color + "]";
	}
	
}
