package com.zhoynghi.gulimall.order.dao;

import com.zhoynghi.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 11:39:28
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
