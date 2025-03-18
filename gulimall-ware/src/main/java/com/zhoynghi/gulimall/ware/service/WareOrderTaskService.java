package com.zhoynghi.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoynghi.common.utils.PageUtils;
import com.zhoynghi.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 14:40:54
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

