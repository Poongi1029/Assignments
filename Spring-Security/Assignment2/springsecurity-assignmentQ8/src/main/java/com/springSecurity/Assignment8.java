package com.springSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springSecurity.Model.User;
import com.springSecurity.repo.UserRepository;

@SpringBootApplication
public class Assignment8 implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(Assignment8.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user=new User();
		user.setUsername("poo");
		user.setPassword(this.bCryptPasswordEncoder.encode("poo"));
		user.setEmail("poo29@gmail.com");
		user.setRole("ROLE_NORMAL");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
		
		User user2=new User();
		user2.setUsername("iman");
		user2.setPassword(this.bCryptPasswordEncoder.encode("iman"));
		user2.setEmail("iman10@gmail.com");
		user2.setRole("ROLE_ADMIN");
		
		User user22 = this.userRepository.save(user2);
		System.out.println(user22);
	
		
	}

}
