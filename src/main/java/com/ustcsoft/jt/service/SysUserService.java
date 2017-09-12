package com.ustcsoft.jt.service;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.system.model.SysUserVO;



public interface SysUserService {

	Page<SysUserVO> findUserList(SysUserVO sysUser,UserVO userInfo,int page,int rows);

	int addUser(SysUserVO sysUser);

	int updateUser(SysUserVO sysUser);

	void deleteUser(SysUserVO sysUser);

	void resetUser(SysUserVO sysUser);

	SysUserVO findUserByOrgId(String orgId);
}
