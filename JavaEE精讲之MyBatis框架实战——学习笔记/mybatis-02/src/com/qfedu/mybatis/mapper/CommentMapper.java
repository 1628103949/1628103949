package com.qfedu.mybatis.mapper;

import java.util.List;

public interface CommentMapper {

	List<CommentMapper> selectCommentByPostId(Integer postId);
}
