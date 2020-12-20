package com.example.test.vo;

import java.sql.Timestamp;

public class MonthDateVO {
	private Timestamp createtime;
	private Integer count;
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
}
