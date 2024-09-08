package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author ttd
 * @since 2024-09-09
 */
@Getter
@Setter
@TableName("tbl_delivery")
@ApiModel(value = "Delivery对象", description = "")
public class Delivery {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("price")
    private BigDecimal price;

    @TableField("province")
    private String province;

    @TableField("street")
    private String street;

    @TableField("ward")
    private String ward;

    @TableField("detail")
    private String detail;
}
