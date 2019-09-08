package com.idwxy.exmybatis.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


import java.util.List;

public class UserEntity {

    // id 主键
    private Integer id;
    // name 用户名
    private String name;
    // gender 用户性别，如果为 null 不返回给前端
    @JsonInclude(Include.NON_DEFAULT)
    private Integer gender;
    // age 用户年龄，如果为 null 不返回给前端
    @JsonInclude(Include.NON_DEFAULT)
    private Integer age;
    // 一对一 用户身份证信息
    @JsonInclude(Include.NON_DEFAULT)
    private Card card;
    // 多对一 用户工作信息
    @JsonInclude(Include.NON_DEFAULT)
    private Job job;
    // 多对多 用户爱好信息
    @JsonInclude(Include.NON_DEFAULT)
    private List<Hobby> hobbies;

    // 构造函数
    public UserEntity() {
        super();
    }

    public UserEntity(String name, Integer gender, Integer age, Card card, Job job, List<Hobby> hobbies) {
        super();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.card = card;
        this.job = job;
        this.hobbies = hobbies;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    // 重写 toString 方法
    public String toString() {
        return "User [id=" + id +
                ",name=" + name +
                ",gender=" + gender +
                ",age=" + age +
                ",card=" + card +
                ",job=" + job +
                ",hobbies=" +hobbies + "]";
    }
}
