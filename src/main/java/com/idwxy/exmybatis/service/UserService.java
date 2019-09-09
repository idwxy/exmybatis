package com.idwxy.exmybatis.service;


import com.idwxy.exmybatis.entity.UserEntity;

import java.util.List;

public interface UserService {

    /**
     * 创建用户
     * @param user
     * @return
     */
    int insert(UserEntity user);

    /**
     * 通过 id 删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 更新 user
     * @param user
     * @return
     */
    int updateUser(UserEntity user);

    /**
     * 通过 id 查询用户
     * @param id
     * @return
     */
    UserEntity selectUserByid(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<UserEntity> selectAllUser();

}
