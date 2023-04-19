package com.virtusa.tms.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	
	@Query("select u  from User u where u.email=:p1 and u.password=:p2")
	public User validateUser(@Param("p1")String email,@Param("p2")String pass);
	
	

}
