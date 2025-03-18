package com.zhoynghi.gulimall.order.dao;

import com.zhoynghi.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 11:39:28
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
