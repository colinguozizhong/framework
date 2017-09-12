package com.ustcsoft.jt.security;

import javax.annotation.Resource;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mapper.UserMapper;
import com.ustcsoft.jt.vo.User;

/**
 * 自定义的DetailService实现类
 * 
 * @author wt0449 Date: 2014年11月18日
 */
public class TempUserDetailService implements UserDetailsService {

	@Resource
	private UserMapper userMapper;

	/**
	 * 登录验证用户名的权限
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserVO user = null;
		try {
			user = userMapper.loadUserByUsername(username);
		} catch (Exception g) {
			g.printStackTrace();
			throw new BadCredentialsException("系统发生错误,请稍后再试！");
		}
		if (user == null) {
			throw new BadCredentialsException("用户“" + username + "”不存在！");
		}
		User userDetails = new User();
		userDetails.setUserVo(user);
		userDetails.addAuthority(new SimpleGrantedAuthority("ROLE_USER"));
		return userDetails;
	}
}
