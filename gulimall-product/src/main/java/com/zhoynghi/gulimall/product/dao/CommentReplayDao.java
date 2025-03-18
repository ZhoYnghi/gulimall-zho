package com.zhoynghi.gulimall.product.dao;

import com.zhoynghi.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-17 19:46:24
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
