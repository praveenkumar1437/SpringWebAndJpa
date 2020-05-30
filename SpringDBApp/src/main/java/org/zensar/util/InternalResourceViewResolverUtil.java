package org.zensar.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class InternalResourceViewResolverUtil {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {

		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();

		resourceViewResolver.setPrefix("/views/");

		resourceViewResolver.setSuffix(".jsp");

		return resourceViewResolver;

	}
}
