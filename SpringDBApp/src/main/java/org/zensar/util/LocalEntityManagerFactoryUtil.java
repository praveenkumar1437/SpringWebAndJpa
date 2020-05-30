package org.zensar.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class LocalEntityManagerFactoryUtil {

	@Bean
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		
		LocalEntityManagerFactoryBean entityManagerFactoryBean = new LocalEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setPersistenceUnitName("praveen");
		
		return entityManagerFactoryBean;
	}
}
