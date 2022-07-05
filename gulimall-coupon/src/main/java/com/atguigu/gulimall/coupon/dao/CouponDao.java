package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author liuhuzhi
 * @email liuhuzhidiyi@163.com
 * @date 2022-06-30 14:57:07
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
