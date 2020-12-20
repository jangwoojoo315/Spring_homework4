package com.example.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.mapper.TestMapper;
import com.example.test.vo.MonthDateVO;
import com.example.test.vo.TestVO;

@Service
public class TestService {
	@Autowired
	public TestMapper mapper;
	public List<TestVO> selectTest(){
		return mapper.selectTest();
	}
	public List<MonthDateVO> getLoginCountByMonth(){
		return mapper.getLoginCountByMonth();
	}
	public List<MonthDateVO> getLoginCountByDate(){
		return mapper.getLoginCountByDate();
	}
}
