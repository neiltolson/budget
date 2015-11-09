package com.neiltolson.budget.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class SecurityConfig 
	extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private SecurityProperties security;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/css/**").permitAll().anyRequest()
//				.fullyAuthenticated().and().formLogin().loginPage("/login")
//				.failureUrl("/login?error").permitAll();
//		http.authorizeRequests().antMatchers("/css/**", "/js/**", "/public/**").permitAll()
//		.antMatchers("/index.html").permitAll();
		http.authorizeRequests().antMatchers("**").permitAll();
	}

	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
	}	
}
