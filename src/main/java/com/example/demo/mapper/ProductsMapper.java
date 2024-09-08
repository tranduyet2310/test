package com.example.demo.mapper;

import com.example.demo.entity.Products;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ttd
 * @since 2024-09-09
 */
@Mapper
public interface ProductsMapper extends BaseMapper<Products> {

}
