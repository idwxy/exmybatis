package com.idwxy.exmybatis.dao;

import com.idwxy.exmybatis.entity.UserEntity;

import java.util.List;

public interface UserDao {

    /**
     * 通过用户 ID 查找用户
     * @param id
     * @return
     */
    UserEntity selectById(Integer id);

    /**
     * 通过 JobId 查找 用户
     * @param id
     * @return
     */
    UserEntity selectByJobId(Integer id);

    /**
     * 查询所有用户
     * @return
     */
    List<UserEntity> selectAll();

    /**
     * 创建新用户
     * @param user
     * @return
     */
    int insert(UserEntity user);

    /**
     * 通过 id 更新用户信息
     * @param user
     * @return
     */
    int update(UserEntity user);

    /**
     * 通过 id 删除用户
     * @param id
     * @return
     */
    int delete(Integer id);
}
