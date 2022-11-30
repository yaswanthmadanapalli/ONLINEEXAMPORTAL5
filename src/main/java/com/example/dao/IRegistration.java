package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IRegistration extends JpaRepository<registrationImpl, Integer> {
	
	@Query("select count(*) from registrationImpl where FullNmae=?1 and password=?2")
	public int query(String user,String pass);

}
