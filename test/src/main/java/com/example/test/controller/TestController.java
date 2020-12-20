package com.example.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.test.service.TestService;
import com.example.test.vo.MonthDateVO;
import com.example.test.vo.TestVO;

@RestController
public class TestController {
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	@Autowired
	TestService testService;
	@RequestMapping("/month")
	public List<MonthDateVO> testMonth() {
		List<MonthDateVO> monthList=testService.getLoginCountByMonth();
		return monthList;
	}
	@RequestMapping("/date")
	public List<MonthDateVO> testDate(){
		List<MonthDateVO> dateList=testService.getLoginCountByDate();
		return dateList;
	}
}
