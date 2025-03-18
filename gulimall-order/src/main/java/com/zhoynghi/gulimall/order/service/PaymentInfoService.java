package com.zhoynghi.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoynghi.common.utils.PageUtils;
import com.zhoynghi.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 11:39:27
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

