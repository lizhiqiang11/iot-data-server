package com.hnair.iot.dataserver.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hnair.iot.dataserver.model.User;
import com.hnair.iot.dataserver.repository.EquipmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestMongoSave {

	@Autowired
	EquipmentService equipmentService;
	@Test
	public void saveTest(){
		
//		User user = new User();
//		user.setName("guojiateng");
//		user.setAge(22);
//		user.setSex("AAAA");
//		equipmentService.save(user);
		
	}
}
