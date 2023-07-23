package com.lti.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lti.entity.Address;
import com.lti.entity.Farmer;
import com.lti.repository.FarmerRepository;

@Component
public class FarmerRunner implements CommandLineRunner{

	@Autowired
	FarmerRepository dao;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
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
		
	}

	
	
}
