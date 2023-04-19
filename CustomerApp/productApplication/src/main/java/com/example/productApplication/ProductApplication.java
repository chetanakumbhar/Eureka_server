package com.example.productApplication;

import com.example.productApplication.filter.CustomerFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProductApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductApplication.class, args);
	}
	@Bean
	public FilterRegistrationBean filterIrl()
	{
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new CustomerFilter());
		filterRegistrationBean.addUrlPatterns("/api/customer/v1/get-customer");
		return filterRegistrationBean;
	}

}
