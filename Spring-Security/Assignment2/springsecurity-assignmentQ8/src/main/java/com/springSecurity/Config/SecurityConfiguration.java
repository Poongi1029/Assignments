package com.springSecurity.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

import com.springSecurity.Model.CustomService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomService customService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/public/**").hasRole("NORMAL")
			.antMatchers("/ghai").hasRole("ADMIN")
			.anyRequest()
			.authenticated()
			.and()
			//.httpBasic()
			.formLogin();
			
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	//	auth
//			.inMemoryAuthentication()
//			.withUser("poo")
//			.password(this.passwordEncoder().encode("poo"))
//			.roles("NORMAL")
//			.and()
//			.withUser("iman")
//			.password(this.passwordEncoder().encode("iman"))
//			.roles("ADMIN");
		
		auth.userDetailsService(customService).passwordEncoder(passwordEncoder());
		
	}
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);
	}

}
