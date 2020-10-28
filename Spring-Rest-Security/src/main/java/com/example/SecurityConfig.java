package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.AbstractRequestMatcherRegistry;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth
		.inMemoryAuthentication()
		.withUser("Harshitha")
		.password(passwordEncoder().encode("harshu"))
		.roles("User")
		.and()
		.withUser("Ramya")
		.password(passwordEncoder().encode("ram24"))
		.roles("USER","ADMIN");
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}
	
	 @Override
	    protected void configure(HttpSecurity http) throws Exception {
	          http.authorizeRequests()
	            .antMatchers("/","/user/**").hasAnyRole("User","admin")
	            .antMatchers("/**").hasAnyRole("admin")
	            .and()
	            .formLogin();
	    }

}
