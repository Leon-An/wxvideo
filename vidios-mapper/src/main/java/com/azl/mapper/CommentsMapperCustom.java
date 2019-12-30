package com.azl.mapper;

import java.util.List;

import com.azl.pojo.Comments;
import com.azl.pojo.vo.CommentsVO;
import com.azl.utils.MyMapper;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}