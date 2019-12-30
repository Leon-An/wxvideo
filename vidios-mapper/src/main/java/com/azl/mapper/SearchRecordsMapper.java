package com.azl.mapper;

import java.util.List;

import com.azl.pojo.SearchRecords;
import com.azl.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}