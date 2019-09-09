package com.idwxy.exmybatis.service;

import com.idwxy.exmybatis.entity.Job;

import java.util.List;

public interface JobService {

    /**
     * 创建 job
     * @param job
     * @return
     */
    int insertJob(Job job);

    /**
     * 删除 job
     * @param id
     * @return
     */
    int deleteJob(Integer id);

    /**
     * 更新 job
     * @param job
     * @return
     */
    int updateJob(Job job);

    /**
     * 通过 id 查找 job
     * @param id
     * @return
     */
    Job selectJobById(Integer id);

    /**
     * 查找所有 job
     * @return
     */
    List<Job> selectAllJob();
}
