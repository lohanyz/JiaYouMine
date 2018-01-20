package com.jiayou.mine.dao;

import com.jiayou.mine.bean.Mineinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MineinfoDao extends JpaRepository<Mineinfo,Integer>{

    List<Mineinfo> findAllByDzkh(String dzkh);
    List<Mineinfo> findAllByZcid(String zcid);
    List<Mineinfo> findAllByGcid(String gcid);
    List<Mineinfo> findAllBySjxm(String sjxm);
    List<Mineinfo> findAllByHzh(String hzh);
    List<Mineinfo> findAllByQfh(String qfh);
    List<Mineinfo> findAllByState(int state);

    @Query(value = "select * from mineinfo LIMIT ?1,?2 ",nativeQuery = true)
    List<Mineinfo> findAllChangePage(int bgn,int end);

    @Query(value = "select * from mineinfo where state=?3 LIMIT ?1,?2",nativeQuery = true)
    List<Mineinfo> findAllSameState(int bgn,int end,int state);

}
