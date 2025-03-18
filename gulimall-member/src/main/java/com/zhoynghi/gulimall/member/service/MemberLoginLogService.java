package com.zhoynghi.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhoynghi.common.utils.PageUtils;
import com.zhoynghi.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author zhoynghi
 * @email zhoynghi @gmail.com
 * @date 2025-03-18 14:38:02
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

