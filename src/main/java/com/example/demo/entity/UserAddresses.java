package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

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
@TableName("tbl_user_addresses")
@ApiModel(value = "UserAddresses对象", description = "")
public class UserAddresses {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("user_id")
    private Integer userId;

    @TableField("contact_name")
    private String contactName;

    @TableField("phone_number")
    private String phoneNumber;

    @TableField("province")
    private String province;

    @TableField("street")
    private String street;

    @TableField("ward")
    private String ward;
}
