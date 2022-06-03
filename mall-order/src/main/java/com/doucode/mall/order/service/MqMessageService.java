package com.doucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:37:27
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

