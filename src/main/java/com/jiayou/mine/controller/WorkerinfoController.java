package com.jiayou.mine.controller;

import com.jiayou.mine.bean.Workerinfo;
import com.jiayou.mine.service.WorkerinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkerinfoController {

    @Autowired
    private WorkerinfoService workerinfoService;

    @GetMapping(value = "/login")
    public Workerinfo login(@RequestParam("wid") String wid,@RequestParam("wpwd") String wpwd){
        return workerinfoService.login(wid,wpwd);
    }

}
