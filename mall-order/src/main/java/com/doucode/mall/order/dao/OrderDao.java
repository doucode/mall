package com.doucode.mall.order.dao;

import com.doucode.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:37:27
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
