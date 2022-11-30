package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.registrationImpl;
import com.example.service.registrationService;

//@CrossOrigin("http://localhost:4200")
@Controller
public class regiscontroller {
	@Autowired
	registrationService rs;
//	@GetMapping("/finddetails")
//	public List<registrationImpl> getdetails(){
//		return Stream.of(new registrationImpl(1,"Mounika","Mounika.Veeramreddy669@gmail.com",8465942668L,"Kanigiri",new Date(),
//				"BE","AP",2020),new registrationImpl(2,"Greeshma","Greeshma669@gmail.com",8465942668L,"Kavali",new Date(),
//						"B.Tech","AP",2022),new registrationImpl(2,"Greeshma","Greeshma669@gmail.com",8465942668L,"Kavali",new Date(),
//								"B.Tech","AP",2022)).collect(Collectors.toList());
//				
//				
//	}
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/registraton")
	public String Registrationpage(@ModelAttribute("reg") registrationImpl register) {	
		return "registraton";
	}
	
	@PostMapping("/registraton")
	public String again(@ModelAttribute("reg") registrationImpl register) {
		rs.postdata(register);
		return "afterreg";
	}
	
	@GetMapping("/login1")
	public String logincheck(@ModelAttribute("loging") registrationImpl m) {	
		return "login";
	}
	
	@PostMapping("/login1")
	public String loginchecking(@ModelAttribute("loging") registrationImpl m ) {
		int c;
		c=rs.logincheck(m.getFullNmae(),m.getPassword());
		if (c>0)
			return "succes";
		else
			return "login";
	}

}
