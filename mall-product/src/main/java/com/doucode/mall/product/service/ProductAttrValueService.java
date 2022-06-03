package com.doucode.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 16:22:27
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

