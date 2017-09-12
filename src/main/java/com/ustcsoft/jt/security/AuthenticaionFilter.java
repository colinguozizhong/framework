package com.ustcsoft.jt.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.ustcsoft.jt.util.MD5Util;

public class AuthenticaionFilter extends UsernamePasswordAuthenticationFilter {

	private UserDetailsService userDetailsService;

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {

		String username = obtainUsername(request);
		String password = obtainPassword(request);

		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			throw new BadCredentialsException("用户名或密码不正确！");
		}

		UserDetails userDetails = (UserDetails) this.userDetailsService.loadUserByUsername(username);
		if (userDetails == null) {
			throw new BadCredentialsException("用户名或密码不正确！");
		}

		if (!MD5Util.MD5(password).equals(userDetails.getPassword())) {
			throw new BadCredentialsException("用户名或密码不正确！");
		}
		
		UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(userDetails, password,
				userDetails.getAuthorities());
		return result;
	}

	public void setUserDetailsService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

}
