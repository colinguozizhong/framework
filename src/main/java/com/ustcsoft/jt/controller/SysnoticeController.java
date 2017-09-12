package com.ustcsoft.jt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mapper.MAnnouncementMapper;
import com.ustcsoft.jt.mybatis.Page;
import com.ustcsoft.standard.model.MAnnouncementVO;

@RequestMapping("sysnotice")
@RestController
public class SysnoticeController extends AbstractRestController {

	@Resource
	private MAnnouncementMapper mannouncementMapper;

	@RequestMapping("getNewAnnouncement.do")
	public Map<String, String> getNewAnnouncement(HttpSession session) {
		UserVO userInfo = getCurrentUser();
		String newAnnFlag = (String) session.getAttribute("NewAnnFlag");
		String data = "";
		if (null != userInfo && !"true".equals(newAnnFlag)) {
			data = mannouncementMapper.serchId(userInfo.getUserId().toString(), "M_ANNOUNCEMENT");
			session.setAttribute("NewAnnFlag", "true");
		}
		Integer num = null;
		// 检查是否显示提醒
		num = mannouncementMapper.checkUser(userInfo.getUserId().toString());

		Map<String, String> re = new HashMap<String, String>();
		re.put("announcementId", data);
		if (num != null && num > 0) {
			re.put("checkUser", "true");
		} else {
			re.put("checkUser", "false");
		}

		return re;
	}

	/**
	 * 检索公告列表
	 * 
	 * @throws BusinessException
	 */
	@RequestMapping("searchAnnouncementList.do")
	public Page<MAnnouncementVO> searchAnnouncementList(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo,
			@RequestParam(value = "pageSize", defaultValue = "4") int pageSize) {
		UserVO userInfo = getCurrentUser();
		Page<MAnnouncementVO> page = Page.buildPageRequest(pageNo, pageSize);
		List<MAnnouncementVO> list = mannouncementMapper.searchAnnouncementPage(userInfo.getOrgId(), "00", page);
		page.setItems(list);
		return page;
	}

	@RequestMapping("getUserGongLu.do")
	public boolean getUserGongLu() throws Exception {
		UserVO userInfo = getCurrentUser();
		Integer num = mannouncementMapper.checkUserGongLu(userInfo.getUserId().toString());
		if (num != null && num > 0) {
			return true;
		}
		return false;
	}
}
