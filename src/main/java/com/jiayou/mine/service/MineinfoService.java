package com.jiayou.mine.service;

import com.jiayou.mine.bean.Mineinfo;
import com.jiayou.mine.dao.MineinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MineinfoService {

    @Autowired
    private MineinfoDao mineinfoDao;

    public List<Mineinfo> findAll(int bgn,int end){
        return mineinfoDao.findAllChangePage(bgn,end);
    }

    public List<Mineinfo> findAllSameState(int bgn,int end,int state){
        return mineinfoDao.findAllSameState(bgn,end,state);
    }
}
