package com.doucode.mall.member.dao;

import com.doucode.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:18:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
