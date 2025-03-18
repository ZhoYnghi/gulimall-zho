package com.zhoynghi.gulimall.coupon.dao;

import com.zhoynghi.gulimall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 11:52:28
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
