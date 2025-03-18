package com.zhoynghi.gulimall.member.dao;

import com.zhoynghi.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 14:38:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
