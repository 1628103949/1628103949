package com.qfedu.mybatis.pojo;

public class Suv extends Vehicle{

	private Boolean allWheelDrive;//全轮驱动 awd

	public Suv() {}

	public Boolean getAllWheelDrive() {
		return allWheelDrive;
	}
	public void setAllWheelDrive(Boolean allWheelDrive) {
		this.allWheelDrive = allWheelDrive;
	}

	@Override
	public String toString() {
		return "Suv [allWheelDrive=" + allWheelDrive + "]";
	}
	
	
}
