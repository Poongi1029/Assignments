package Assignmanet2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		 
		http
			.csrf().disable()
			.authorizeRequests()
			.antMatchers("/hello","/Welcome").permitAll()
			.anyRequest()
			.authenticated()
			.and()
			//.httpBasic()
			.formLogin();
			
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("poo")
			.password(this.passwordEncoder().encode("poo"))
			.roles("NORMAL")
			.and()
			.withUser("simbu")
			.password(this.passwordEncoder().encode("simbu"))
			.roles("ADMIN");
		
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		//return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);
	}
}



