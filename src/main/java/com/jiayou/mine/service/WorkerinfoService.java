package com.jiayou.mine.service;

import com.jiayou.mine.bean.Workerinfo;
import com.jiayou.mine.dao.WorkerinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerinfoService {

    @Autowired
    private WorkerinfoDao workerinfoDao;

    public Workerinfo login(String wid,String wpwd){
        return workerinfoDao.login(wid,wpwd);
    }


}
