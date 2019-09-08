package com.idwxy.exmybatis.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.List;

public class Job {

    // 主键 id
    private Integer id;
    // 工作名称
    private String jobName;
    // 工作描述
    private String jobDescription;
    // 一对多 哪些用户拥有该工作
    @JsonInclude(Include.NON_DEFAULT)
    private List<UserEntity> users;

    // 构造函数
    public Job() {
        super();
    }

    public Job(String jobName, String jobDescription, List<UserEntity> users) {
        super();
        this.jobName = jobName;
        this.jobDescription = jobDescription;
        this.users = users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    // 重写 toString 方法
    public String toString() {
        return "Job [id=" + id +
                ",jobName=" + jobName +
                ",jobDescription=" + jobDescription +
                ",users=" + users + "]";
    }
}
