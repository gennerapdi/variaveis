
package com.variaveis.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.variaveis.config.filter.Html5ModeUrlSupportFilter;
import com.variaveis.config.filter.SimpleCORSFilter;


public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { 
				AppConfig.class,
				DBConfig.class
			};
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {
				new Html5ModeUrlSupportFilter(), 
				new SimpleCORSFilter()
			};
	}
	
} 