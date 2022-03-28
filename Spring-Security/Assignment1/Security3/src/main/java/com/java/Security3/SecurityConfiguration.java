package com.java.Security3;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//Set your configuration on auth object
		
		auth.jdbcAuthentication()
		//configured spring to point to h2 database
			.dataSource(dataSource);
//			.withDefaultSchema();
//            .withUser(
//                    User.withUsername("user")
//                    .password("user")
//                    .roles("USER")
//            )
//            .withUser(
//                    User.withUsername("admin")
//                    .password("admin")
//                    .roles("ADMIN")
//            );
				
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			// if it is user allow both user and admin access
			.antMatchers("/user").hasAnyRole("USER","ADMIN") 
			//root url accessible by all
			.antMatchers("/").permitAll()
            .and().formLogin().loginPage("/login")
            .failureForwardUrl("/failure")
            .and().logout().permitAll();
    http.csrf().disable();
			
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	 

}
