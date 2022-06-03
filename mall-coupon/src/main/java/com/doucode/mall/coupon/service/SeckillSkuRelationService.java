package com.doucode.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:10:22
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

