package com.springSecurity.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springSecurity.repo.UserRepository;

@Service
public class CustomService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user= this.userRepository.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("NO user");
		}
		
		return new CustomerUserDetail(user);
	}

}
