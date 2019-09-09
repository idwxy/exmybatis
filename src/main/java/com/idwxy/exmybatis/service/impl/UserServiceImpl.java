package com.idwxy.exmybatis.service.impl;

import com.idwxy.exmybatis.dao.UserDao;
import com.idwxy.exmybatis.entity.UserEntity;
import com.idwxy.exmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // 自动注入 mapper
    @Resource
    private UserDao userDao;

    @Override
    public int insert(UserEntity user) {

        return userDao.insert(user);
    }

    @Override
    public int deleteUser(Integer id) {

        return userDao.delete(id);
    }

    @Override
    public int updateUser(UserEntity user) {

        return userDao.update(user);
    }

    @Override
    public UserEntity selectUserByid(Integer id) {

        return userDao.selectById(id);
    }

    @Override
    public List<UserEntity> selectAllUser() {

        return userDao.selectAll();
    }
}
