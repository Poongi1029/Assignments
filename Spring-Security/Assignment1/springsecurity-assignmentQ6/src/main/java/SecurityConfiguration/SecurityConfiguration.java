package SecurityConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub		super.configure(auth);
		auth.inMemoryAuthentication()
						.withUser("poo")
						.password("poo")
						.roles("USER")
						.and()
						.withUser("pong")
						.password("pong")
						.roles("ADMIN");
	}
		
		@Bean
		public PasswordEncoder getEncodedPassword()
		{
			return NoOpPasswordEncoder.getInstance();
		}
	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder()
//	{
//		//return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder(10);
//	}
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/User").hasAnyRole("USER","ADMIN")
			.antMatchers("/").permitAll()
			.and().formLogin();
		}
		
		
	}


