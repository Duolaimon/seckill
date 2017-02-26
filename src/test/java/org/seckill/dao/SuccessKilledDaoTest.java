package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author deity
 *         17-2-17 下午2:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        /*
            第一次:insertCount:1
            第二次:insertCount:0
         */
        long id = 1000L;
        long phone = 13003031914L;
        int insertCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("insertCount:"+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {
        long id = 1000L;
        long phone = 13003031914L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println(successKilled);
//        System.out.println(successKilled.getSeckill());
    }

}