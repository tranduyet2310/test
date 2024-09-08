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
@TableName("tbl_payment")
@ApiModel(value = "Payment对象", description = "")
public class Payment {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("payment_method")
    private String paymentMethod;

    @TableField("payment_status")
    private String paymentStatus;

    @TableField("payment_amount")
    private BigDecimal paymentAmount;

    @TableField("order_id")
    private Integer orderId;
}
