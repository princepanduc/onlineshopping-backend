package com.jaswanth.OnlineShopingSystem.service;



import com.jaswanth.OnlineShopingSystem.repository.SignUpRepository;
import org.hibernate.type.CharacterArrayType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jaswanth.OnlineShopingSystem.model.SignUp;

@Service
public class SignUpService {

	@Autowired
    SignUpRepository signUpRepository;
	
	public SignUp post(SignUp signUp) {
		if(!signUp.equals(null)) {
			
			return signUpRepository.save(signUp);
		}
		return null;
	}
	
	public SignUp getUser(String username , CharacterArrayType password) {
		return signUpRepository.getUser(username,password);
	}
	
}
