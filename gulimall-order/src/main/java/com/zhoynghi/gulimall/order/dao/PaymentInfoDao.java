package com.zhoynghi.gulimall.order.dao;

import com.zhoynghi.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 11:39:27
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
