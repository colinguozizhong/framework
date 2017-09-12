package com.ustcsoft.jt.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface SysUserMenuMapper {

	List<Map<String, Object>> selectUserMenuById(@Param("userId")Long userId);



}
