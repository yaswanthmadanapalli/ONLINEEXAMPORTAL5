package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.dao.IRegistration;
import com.example.dao.registrationImpl;

@Service
public class registrationService {
	
	@Autowired
	IRegistration reg;
	
	public int postdata(registrationImpl r) {
		
		return reg.save(r).getSid();
	}
	
	public int logincheck(String user,String pass) {
		return reg.query(user,pass);
		
		
		
	}
}
