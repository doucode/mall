package com.doucode.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 16:22:27
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

