package com.example.demo.service;

import com.example.demo.entity.Users;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ttd
 * @since 2024-09-09
 */
public interface IUsersService extends IService<Users> {
    List<Users> getUsers();
}
