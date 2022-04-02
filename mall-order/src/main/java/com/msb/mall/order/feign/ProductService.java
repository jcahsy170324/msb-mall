package com.msb.mall.order.feign;

import com.msb.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author jincheng
 * @Description //@FeignClient 指明我们要从注册中心发现的服务名称
 * @Date 8:57 2022/4/2
 * @Param
 * @return
 **/
@FeignClient(name = "mall-product")
public interface ProductService {
    /**
     * @Author jincheng
     * @Description //需要访问的远程方法
     * @Date 8:58 2022/4/2
     * @Param []
     * @return com.msb.mall.common.utils.R
     **/
    @GetMapping("/product/brand/all")
    public R queryAllBrand();
}
