package com.spring.zuul.ZuulDemo.filter;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class PreFilter extends ZuulFilter{
//	private static Logger log=LoggerFactory.getLogger(PreFilter.class);

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx=RequestContext.getCurrentContext();
		HttpServletRequest request=(HttpServletRequest) ctx.getRequest();
//		log.info("Route Filter "+request.getMethod()+" to "+request.getRequestURL().toString());
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "Pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
