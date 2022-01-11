package br.com.gestao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class InMemorySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	public void configure(AuthenticationManagerBuilder builder) throws Exception {
		builder.inMemoryAuthentication()
			.withUser("admin").password("{noop}123").roles("ADMIN")
			.and()
			.withUser("teste").password("{noop}321").roles("USER");
	}
}
