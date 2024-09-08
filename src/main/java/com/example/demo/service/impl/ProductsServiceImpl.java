package com.example.demo.service.impl;

import com.example.demo.entity.Products;
import com.example.demo.mapper.ProductsMapper;
import com.example.demo.service.IProductsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ttd
 * @since 2024-09-09
 */
@Service
public class ProductsServiceImpl extends ServiceImpl<ProductsMapper, Products> implements IProductsService {

}
