package com.zhoynghi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoynghi.common.utils.PageUtils;
import com.zhoynghi.gulimall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 14:38:01
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

