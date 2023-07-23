package com.lti;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.entity.Address;
import com.lti.entity.Farmer;
import com.lti.repository.FarmerRepository;
import com.lti.repository.FarmerRepositoryImpl;

@SpringBootTest
class FarmerSchemeApplicationTests {
	
FarmerRepository dao=new FarmerRepositoryImpl();

	@Test
	public void addOrUpdateFarmer() {
		System.out.println(dao);
        Farmer farmer=new Farmer();
        farmer.setAadharNo(7878676567876567L);
        farmer.setBalance(40000);
        farmer.setContactNo("8767886156");
        farmer.setEmail("sam@gmail.com");
        farmer.setFarmerFirstName("Saurabh");
        farmer.setFarmerLastName("Jadhav");
        farmer.setLandDetails("2 Hectar");
        farmer.setPassword("saurabh123");
        
        
        //Address Setting
        
        Address addr = new Address();
        addr.setCity("Mumbai");
        addr.setFarmer(farmer);
        addr.setPincode("400037");
        addr.setState("Maharashtra");
        addr.setStreet("salt");
        
        
        int savedFarmer=dao.addOrUpdateFarmer(farmer);
        System.out.println(savedFarmer);
        assertNotNull(farmer);

    }

}
