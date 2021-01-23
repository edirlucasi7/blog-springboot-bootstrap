package com.spring.blog.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	private static final String[] AUTH_LIST = {
	        "/",
	        "/posts",
	        "/post/{id}",
	        "/newpost",
	        "/editarPosts/{id}",
	        "/editarPost/{id}"
		};

	    @Override
	    protected void configure(HttpSecurity http) throws Exception{
	        http.csrf().disable().authorizeRequests()
	                .antMatchers(AUTH_LIST).permitAll()
	                .anyRequest().authenticated()
	                .and().formLogin().permitAll()
	                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	    }
	    
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
	    	
	    	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	    	
	        auth.inMemoryAuthentication().passwordEncoder(encoder)
	                .withUser("icety").password(encoder.encode("123")).roles("ADMIN");
	    }

}
