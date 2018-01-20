package com.jiayou.mine.controller;

import com.jiayou.mine.bean.Mineinfo;
import com.jiayou.mine.service.MineinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MineinfoController {

    @Autowired
    private MineinfoService mineinfoService;

    @GetMapping(value = "/getmineinfo")
    public List<Mineinfo> findAll(@RequestParam("bgn") int bgn,@RequestParam("end") int end){
        return mineinfoService.findAll(bgn,end);
    }

    @GetMapping(value = "/getmineinfos")
    public List<Mineinfo> findAllSameState(@RequestParam("bgn") int bgn,@RequestParam("end") int end,@RequestParam("state") int state){
        return mineinfoService.findAllSameState(bgn,end,state);
    }
}
