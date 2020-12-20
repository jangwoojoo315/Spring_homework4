package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.test.vo.MonthDateVO;
import com.example.test.vo.TestVO;

@Repository
@Mapper
public interface TestMapper {
	List<TestVO> selectTest();

	List<MonthDateVO> getLoginCountByMonth();
	List<MonthDateVO> getLoginCountByDate();
}
