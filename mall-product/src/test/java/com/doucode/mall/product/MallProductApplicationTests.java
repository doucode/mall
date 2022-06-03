package com.doucode.mall.product;

import com.doucode.mall.product.entity.BrandEntity;
import com.doucode.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(14L);
        brandEntity.setDescript("pixel");

//        brandEntity.setName("PIXEL");
//        brandService.save(brandEntity);
//        System.out.println("保存成功。。");


    }

}
