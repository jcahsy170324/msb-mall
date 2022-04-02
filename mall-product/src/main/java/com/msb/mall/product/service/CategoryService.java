package com.msb.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msb.mall.common.utils.PageUtils;
import com.msb.mall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author jc
 * @email 927901442@qq.com
 * @date 2022-03-26 13:07:15
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> queryPageWithTree(Map<String, Object> params);
}

