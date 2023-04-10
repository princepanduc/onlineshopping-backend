package com.jaswanth.OnlineShopingSystem.repository;



import org.hibernate.type.CharacterArrayType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jaswanth.OnlineShopingSystem.model.SignUp;

@Repository
public interface SignUpRepository extends JpaRepository<SignUp,Long>{
	
	@Query(value = "SELECT * FROM sign_up where username =:usrname and password=:password limit 1", nativeQuery = true)
    SignUp getUser(@Param("usrname") String usrname,@Param("password") CharacterArrayType password);

}
