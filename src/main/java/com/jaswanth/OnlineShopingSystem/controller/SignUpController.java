package com.jaswanth.OnlineShopingSystem.controller;





import org.hibernate.type.CharacterArrayType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaswanth.OnlineShopingSystem.model.SignUp;
import com.jaswanth.OnlineShopingSystem.service.SignUpService;

@RestController
@RequestMapping("/signUp")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SignUpController {

	@Autowired
	SignUpService signUpServece;
	
	@PostMapping("/post")
	public SignUp post(@RequestBody SignUp signUp) {
		
		return signUpServece.post(signUp);
	}
	
	@GetMapping("/getUser")
	public SignUp getUser(@RequestParam(value="username") String username ,@RequestParam(value="password") CharacterArrayType password) {
		return signUpServece.getUser(username, password);
	}
}
