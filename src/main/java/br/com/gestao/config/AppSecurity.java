package br.com.gestao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class AppSecurity {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder){
		try {
			builder.inMemoryAuthentication()
				.withUser("deivison").password("123").roles("USER")
				.and()
				.withUser("admin").password("321").roles("USER")
				.and()
				.withUser("teste").password("teste").roles("USER");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
