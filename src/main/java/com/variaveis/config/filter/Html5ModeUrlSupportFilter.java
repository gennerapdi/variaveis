package com.variaveis.config.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Html5ModeUrlSupportFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		
		if(isView(request) || isStatic(request) || isApi(request) || isAuthentication(request)) {
			filterChain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/index.jsp")
				   .forward(request, response);
		}
	}

	private boolean isAuthentication(HttpServletRequest request) {
		return request.getRequestURI().indexOf("/auth/") >= 0;
	}

	private boolean isApi(HttpServletRequest request) {
		return request.getRequestURI().indexOf("/api/") >= 0;
	}

	private boolean isStatic(HttpServletRequest request) {
		return request.getRequestURI().indexOf("/assets/") >= 0;
	}

	private boolean isView(HttpServletRequest request) {
		return request.getRequestURI().indexOf("/views/") >= 0;
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}