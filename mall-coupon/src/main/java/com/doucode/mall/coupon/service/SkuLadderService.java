package com.doucode.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:10:22
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

