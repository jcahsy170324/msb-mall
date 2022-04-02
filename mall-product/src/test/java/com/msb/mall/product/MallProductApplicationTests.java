package com.msb.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.msb.mall.product.entity.BrandEntity;
import com.msb.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        entity.setName("华为");
        brandService.save(entity);
    }

    @Test
    void select1(){
        List<BrandEntity> list = brandService.list();
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

    @Test
    void select2(){
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",2));
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

}
