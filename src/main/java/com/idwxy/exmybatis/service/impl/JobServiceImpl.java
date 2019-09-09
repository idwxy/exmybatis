package com.idwxy.exmybatis.service.impl;

import com.idwxy.exmybatis.dao.JobDao;
import com.idwxy.exmybatis.entity.Job;
import com.idwxy.exmybatis.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired(required = false)
    private JobDao jobDao;

    @Override
    public int insertJob(Job job) {

        return jobDao.insert(job);
    }

    @Override
    public int deleteJob(Integer id) {

        return jobDao.delete(id);
    }

    @Override
    public int updateJob(Job job) {

        return jobDao.update(job);
    }

    @Override
    public Job selectJobById(Integer id) {

        return jobDao.selectById(id);
    }

    @Override
    public List<Job> selectAllJob() {

        return jobDao.selectAll();
    }
}
