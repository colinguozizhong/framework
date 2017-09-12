package com.ustcsoft.jt;

import javax.annotation.Resource;

import org.junit.Test;

import com.ustcsoft.jt.mapper.SysOrgMapper;
import com.ustcsoft.system.model.OrganizationVO;

public class TestMapperImpl extends Base {

	@Resource
	private SysOrgMapper sysOrgService;

	@Test
	public void testaddOrgInfo() {
		OrganizationVO vo = new OrganizationVO();
		vo.setOrgId("1");
		sysOrgService.addOrgInfo(vo);
		System.out.println(1);
	}

}
