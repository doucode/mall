package com.doucode.mall.product.dao;

import com.doucode.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 16:22:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
