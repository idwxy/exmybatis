package com.idwxy.exmybatis.dao;

import com.idwxy.exmybatis.entity.Hobby;

public interface UserHobbyDao {

    /**
     * 通过 id 查找 hobby
     * @param id
     * @return
     */
    Hobby findHobbyById(Integer id);
}
