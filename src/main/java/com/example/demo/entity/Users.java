package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

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
@TableName("tbl_users")
@ApiModel(value = "Users对象", description = "")
public class Users {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("email")
    private String email;

    @TableField("password")
    private String password;

    @TableField("logged_in")
    private Boolean loggedIn;

    @TableField("user_token")
    private String userToken;

    @TableField("token_expiration")
    private LocalDateTime tokenExpiration;
}
