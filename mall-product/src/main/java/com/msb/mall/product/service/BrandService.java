package com.msb.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.mall.common.utils.PageUtils;
import com.msb.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jc
 * @email 927901442@qq.com
 * @date 2022-03-26 13:07:15
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

