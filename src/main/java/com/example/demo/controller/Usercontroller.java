package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class Usercontroller {


    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @GetMapping("/test")
    public String test(){
        return "这是 阿对对队的 测试接口";
    }

    @GetMapping ("/searchAll")
    public List<User> findAll(){
        return userMapper.findAll();
    }

    @PostMapping ("/save")
    public Integer save(@RequestBody User user){return userService.save(user);}

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable int id){return userService.delete(id);}

    @GetMapping ("/searchPage")
    public List<User> findPage(){
        return null;
    }


}
