package com.doucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:37:27
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

