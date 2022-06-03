package com.doucode.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.doucode.common.utils.PageUtils;
import com.doucode.mall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author doucode
 * @email dxw696@gmail.com
 * @date 2022-06-03 17:18:28
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

