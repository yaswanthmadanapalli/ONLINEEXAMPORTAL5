package com.example.dao;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="Registration")
@Data
@AllArgsConstructor
public class registrationImpl {
	
	@Id
	@GeneratedValue
	private Integer Sid;
	private String FullNmae;
	private String Email;
	private Long Mobno;
	private String City;
	private String Dob;
	private String Qual;
	private String State;
	private Integer Yoc;
	private String password;

}
