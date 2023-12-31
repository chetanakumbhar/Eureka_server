package com.example.productApplication.filter;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerFilter extends GenericFilterBean {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        String header = httpServletRequest.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer"))
        {
            throw  new ServletException("Token is Missing...");
        }
        else {
            String myToken = header.substring(7);
            Claims claims = Jwts.parser().setSigningKey("securityKey123").parseClaimsJws(myToken).getBody();
            System.out.println("Received Claims : "+claims);
            httpServletRequest.setAttribute("attr1",claims.get("customerId"));
        }
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }
}
