package com.ysj.spring.aop.service;

import com.ysj.spring.aop.domain.Product;
import com.ysj.spring.aop.security.AdminOnly;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @AdminOnly
    public void insert(Product product){
        System.out.println("insert product:"+product);
    }

    @AdminOnly
    public void delete(Long id){
        System.out.println("delete product:"+id);
    }
}
