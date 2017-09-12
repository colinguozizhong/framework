package com.ustcsoft.jt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.standard.model.MAnnouncementVO;

public interface MAnnouncementMapper {

	String serchId(@Param("userId") String userId, @Param("tableName") String tableName);

	int checkUser(@Param("userId") String userId);

	List<MAnnouncementVO> searchAnnouncementPage(@Param("reciverOrgId") String reciverOrgId,
			@Param("delFlg") String deleteflagNormal, @Param("page") Page<MAnnouncementVO> page);
	
	int checkUserGongLu(@Param("userId") String userId);
}
