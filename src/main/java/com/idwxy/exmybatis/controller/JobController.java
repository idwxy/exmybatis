package com.idwxy.exmybatis.controller;

import com.idwxy.exmybatis.common.ResultObject;
import com.idwxy.exmybatis.entity.Job;
import com.idwxy.exmybatis.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    // 创建 job
    @PostMapping("/add")
    public ResultObject add(@RequestBody Job job) {
        int result = jobService.insertJob(job);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 删除 job
    @DeleteMapping("/delete/{id}")
    public ResultObject delete(@PathVariable Integer id) {
        int result = jobService.deleteJob(id);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 更新 job
    @PostMapping("/modify")
    public ResultObject modify(@RequestBody Job job) {
        int result = jobService.updateJob(job);
        Map<String, Integer> map = new HashMap<>();
        map.put("modifyId", result);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询 job
    @GetMapping("/find/{id]")
    public ResultObject find(@PathVariable Integer id) {
        Job job = jobService.selectJobById(id);
        Map<String, Job> map = new HashMap<>();
        map.put("job", job);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }

    // 查询所有 job
    @GetMapping("/finaAll")
    public ResultObject findAll() {
        List<Job> jobs = jobService.selectAllJob();
        Map<String, List<Job>> map = new HashMap<>();
        map.put("jobs", jobs);
        ResultObject resultObject = new ResultObject(200, "success", map);
        return resultObject;
    }
}
