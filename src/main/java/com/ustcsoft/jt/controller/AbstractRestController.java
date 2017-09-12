package com.ustcsoft.jt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.vo.User;

public abstract class AbstractRestController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected UserVO getCurrentUser() {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		return user.getUserVo();
	}
}
