package com.pro.manga.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.pro.manga.service.impl.UserDetailServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	UserDetailServiceImpl userDetailServiceImpl;
	
	@Bean
	BCryptPasswordEncoder getBCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/home", "/css/**", "/js/**", "/fonts/**", "truyenqq", "http", "/admin/mangas/images/**","/register/**", "/resources/**", "/login/**").permitAll()
			.antMatchers("/admin/**").hasAuthority("ADMIN")
			.antMatchers("/manga/favourite", "/manga/history").hasAnyAuthority("ADMIN", "USER")
			.anyRequest().authenticated().and()
			.formLogin()
				.loginPage("/login")
				.usernameParameter("username")
				.passwordParameter("password")
				.permitAll()
				.loginProcessingUrl("/doLogin")
				.defaultSuccessUrl("/home")
				.successForwardUrl("/home")
				.failureUrl("/login?success=false")
				
				
			.and()
			.logout()
				.permitAll()
				.logoutUrl("/doLogout")
				.logoutSuccessUrl("/home");
		
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailServiceImpl).passwordEncoder(getBCryptPasswordEncoder());
		
//		auth.inMemoryAuthentication()
//		.withUser("hhk").password(getBCryptPasswordEncoder().encode("hhk"))
//		.authorities("ADMIN");
	}
	
	
	
}
