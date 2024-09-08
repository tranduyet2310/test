package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ttd
 * @since 2024-09-09
 */
@RestController
@RequestMapping("api/users")
public class UsersController {
    private final IUsersService usersService;
    @Autowired
    public UsersController(IUsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public List<Users> getAll(){
        return usersService.getUsers();
    }
}
