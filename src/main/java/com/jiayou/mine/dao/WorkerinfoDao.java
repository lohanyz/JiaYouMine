package com.jiayou.mine.dao;

import com.jiayou.mine.bean.Workerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WorkerinfoDao extends JpaRepository<Workerinfo, Integer>{

    public List<Workerinfo> findByWname(String wname);
    public List<Workerinfo> findByWid(String wid);

    @Query(value = "select * from workerinfo where wname=?1 and wpwd=?2",nativeQuery = true)
    public Workerinfo login(String wid,String wpwd);

}
