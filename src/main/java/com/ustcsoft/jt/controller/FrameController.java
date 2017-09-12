package com.ustcsoft.jt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.sf.jasperreports.engine.JRException;

@Controller
public class FrameController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	// 不指定responsebody 返回页面VIEW
	@RequestMapping("frameJsp.do")
	public String frameJsp() {
		logger.info("frameJsp.do");
		return "frameJsp";
	}

}
