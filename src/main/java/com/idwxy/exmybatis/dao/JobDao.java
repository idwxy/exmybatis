package com.idwxy.exmybatis.dao;

import com.idwxy.exmybatis.entity.Job;

import java.util.List;

public interface JobDao {

    /**
     * 通过 id 查找工作
     * @return
     */
    Job selectById(Integer id);

    /**
     * 通过 id 查找 job 简要消息
     * @return
     */
    Job selectBriefByid(Integer id);

    /**
     * 查询所有 job
     * @return
     */
    List<Job> selectAll();

    /**
     * 创建 job
     * @param job
     * @return
     */
    int insert(Job job);

    /**
     * 通过 id 更新 job
     * @param job
     * @return
     */
    int update(Job job);

    /**
     * 通过 id 删除 job
     * @param id
     * @return
     */
    int delete(Integer id);
}
