package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@TableName("tbl_orders")
@ApiModel(value = "Orders对象", description = "")
public class Orders {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("order_uid")
    private String orderUid;

    @TableField("price")
    private BigDecimal price;

    @TableField("order_status")
    private String orderStatus;

    @TableField("user_id")
    private Integer userId;

    @TableField("delivery_id")
    private Integer deliveryId;

    @TableField("date_created")
    private LocalDateTime dateCreated;

    @TableField("date_updated")
    private LocalDateTime dateUpdated;
}
