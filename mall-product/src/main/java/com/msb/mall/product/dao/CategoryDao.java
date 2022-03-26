package com.msb.mall.product.dao;

import com.msb.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jc
 * @email 927901442@qq.com
 * @date 2022-03-26 13:07:15
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
