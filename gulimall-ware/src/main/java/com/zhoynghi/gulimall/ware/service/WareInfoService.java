package com.zhoynghi.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoynghi.common.utils.PageUtils;
import com.zhoynghi.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 14:40:54
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

