package com.ustcsoft.jt.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.sf.jasperreports.engine.JRException;

@Controller
public class SampleController {

	@RequestMapping(value = "sample_print.do", method = RequestMethod.GET)
	public ModelAndView sample_print(ModelMap model, HttpServletRequest request, HttpServletResponse response)
			throws IOException, JRException {
		List<Object> listOb = new ArrayList<Object>();
		Map<String, Object> beanData = new HashMap<String, Object>();
		beanData.put("key", "value");
		listOb.add(beanData);
		model.addAttribute("datasource", listOb); // datasource
		return new ModelAndView("printView", model);
	}

	@RequestMapping(value = "sample_echarts.do", method = RequestMethod.GET)
	public String sample_echarts() {
		return "sample/sample_echarts";
	}
}
