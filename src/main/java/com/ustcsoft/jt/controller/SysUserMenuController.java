package com.ustcsoft.jt.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ustcsoft.framework.vo.UserVO;
import com.ustcsoft.jt.mapper.SysMenuMapper;
import com.ustcsoft.jt.mapper.SysUserMenuMapper;
import com.ustcsoft.jt.util.JSONTreeNodeUtil;
import com.ustcsoft.system.model.SysMenuVO;

@RequestMapping("sysUserMenu")
@RestController
public class SysUserMenuController extends AbstractRestController {

	@Resource
	private SysUserMenuMapper sysUserMenuMapper;
	
	

	/**
	 * 查询用户常用菜单
	 * 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("findUserMenuById.do")
	public List<JSONTreeNodeUtil> findUserMenuById() throws Exception {
		UserVO userInfo = getCurrentUser();
		List<Map<String, Object>> list = sysUserMenuMapper.selectUserMenuById(userInfo.getUserId());
		return doJsonStringConfig(list);
	}
	
	private List<JSONTreeNodeUtil> doJsonStringConfig(List<Map<String, Object>> list) {
		String basepath = "";
		String url = "";
		String menuUrl = "";
		List<JSONTreeNodeUtil> nodeList = new ArrayList<JSONTreeNodeUtil>();
		for (Iterator<Map<String, Object>> it = list.iterator(); it.hasNext();) {
			Map<String, Object> map = (Map<String, Object>) it.next();
			JSONTreeNodeUtil treeNode = new JSONTreeNodeUtil();
			Long mid = Long.parseLong((String) map.get("menuId"));
			treeNode.setId(mid.toString());
			treeNode.setText((String) map.get("menuName"));

			url = ((String) map.get("menuUrl")).trim();

			if (url.indexOf("http://") < 0)
				menuUrl = basepath + url;
			else {
				menuUrl = url;
			}
//			treeNode.setMenuUrl(menuUrl);
//			treeNode.setType((String) map.get("menuIco"));
			nodeList.add(treeNode);
		}
		return nodeList;
	}
	
	

}
