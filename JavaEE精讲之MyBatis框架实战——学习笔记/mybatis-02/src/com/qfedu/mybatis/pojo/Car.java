package com.qfedu.mybatis.pojo;

public class Car extends Vehicle{

	private Integer doorCount;

	public Car() {}

	public Integer getDoorCount() {
		return doorCount;
	}
	public void setDoorCount(Integer doorCount) {
		this.doorCount = doorCount;
	}
	
	public String test() {
		return "car test";
	}

	@Override
	public String toString() {
		return "Car [doorCount=" + doorCount + "]";
	}
	
	
}
