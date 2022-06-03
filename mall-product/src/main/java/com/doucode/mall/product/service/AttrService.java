package com.doucode.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 16:22:28
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

