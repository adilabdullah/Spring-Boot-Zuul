package com.spring.zuul.ZuulDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.spring.zuul.ZuulDemo.filter.ErrorFilter;
import com.spring.zuul.ZuulDemo.filter.PostFilter;
import com.spring.zuul.ZuulDemo.filter.PreFilter;
import com.spring.zuul.ZuulDemo.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy

public class ZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoApplication.class, args);
	}

	@Bean
	  public PreFilter preFilter() {
	    return new PreFilter();
	  }
	  @Bean
	  public PostFilter postFilter() {
	    return new PostFilter();
	  }
	  @Bean
	  public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	  }
	  @Bean
	  public RouteFilter routeFilter() {
	    return new RouteFilter();
	  }
}
