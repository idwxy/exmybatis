package com.idwxy.exmybatis.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

public class Hobby {

    // 主键 id
    private Integer id;
    // 爱好名称
    private String hobbyName;
    // 爱好描述
    private String description;
    // 拥有同意爱好的用户
    @JsonInclude(Include.NON_DEFAULT)
    private List<UserEntity> users;

    // 构造函数
    public Hobby() {
        super();
    }

    public Hobby(String hobbyName, String description,List<UserEntity> users) {
        super();
        this.hobbyName = hobbyName;
        this.description = description;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "Hobby [id=" + id +
                ",hobbyName=" + hobbyName +
                ",description=" + description +
                ",users=" + users + "]";
    }
}
