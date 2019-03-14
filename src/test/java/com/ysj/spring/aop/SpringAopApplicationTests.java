package com.ysj.spring.aop;

import com.ysj.spring.aop.security.CurrentUserHolder;
import com.ysj.spring.aop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAopApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void annoInsertTest() {
        CurrentUserHolder.set("tom");
        productService.delete(1L);
    }

    @Test
    public void adminInsert(){
        CurrentUserHolder.set("admin");
        productService.delete(1L);
    }

}
