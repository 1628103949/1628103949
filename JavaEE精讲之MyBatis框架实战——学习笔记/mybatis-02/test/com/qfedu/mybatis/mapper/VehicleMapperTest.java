package com.qfedu.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.qfedu.mybatis.pojo.Vehicle;
import com.qfedu.mybatis.util.MyBatisUtil;

public class VehicleMapperTest {

	@Test
	public void testSelectVehicleById() {
		
		SqlSession session = MyBatisUtil.getSqlSession();
		
		VehicleMapper vehicleMapper = session.getMapper(VehicleMapper.class);
		/*Car vehicle1 = (Car)vehicleMapper.selectVehicleById(1);
		Suv vehicle3 = (Suv)vehicleMapper.selectVehicleById(3);*/
		Vehicle vehicle1 = vehicleMapper.selectVehicleById(1);
		Vehicle vehicle3 = vehicleMapper.selectVehicleById(3);
		
		session.close();
		
		System.out.println(vehicle1.test());
		System.out.println(vehicle3);
	}
}
