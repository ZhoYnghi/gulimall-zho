package com.zhoynghi.gulimall.member.feign;

import com.zhoynghi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明式的仓储服务远程feign调用
 *
 * @author zhaoyonghui
 * @date 2025/3/19 21:31
 * @change 2025/3/19 21:31 by zhaoyonghui for init
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
