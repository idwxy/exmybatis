package com.idwxy.exmybatis.controller;

import com.idwxy.exmybatis.common.ResultObject;
import com.idwxy.exmybatis.entity.UserEntity;
import com.idwxy.exmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 创建用户
    @PostMapping("/add")
    public ResultObject add(@RequestBody UserEntity user) {
        int result = userService.insert(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 删除用户
    @DeleteMapping("/delete/{id}")
    public ResultObject delete(@PathVariable Integer id) {
        int result = userService.deleteUser(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新用户
    @PutMapping("/modify")
    public ResultObject modify(@RequestBody UserEntity user) {
        int result = userService.updateUser(user);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询用户
    @GetMapping("/find/{id}")
    public ResultObject find(@PathVariable Integer id) {
        UserEntity user = userService.selectUserByid(id);
        Map<String, UserEntity> map = new HashMap<>();
        map.put("user", user);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询所有用户
    @GetMapping("/findAll")
    public ResultObject findAll() {
        List<UserEntity> users = userService.selectAllUser();
        Map<String, List<UserEntity>> map = new HashMap<>();
        map.put("users", users);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
