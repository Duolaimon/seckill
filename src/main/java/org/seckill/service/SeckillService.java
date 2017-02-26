package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * @author deity
 *         17-2-17 下午7:18
 */
public interface SeckillService {

    /**
     *
     * @return 查询所有秒杀记录
     */
    List<Seckill> getSeckillList();

    /**
     *
     * @param seckillId 秒杀id
     * @return 查询单个秒杀记录
     */
    Seckill getById(long seckillId);

    /**
     * 秒杀开启输出秒杀接口地址,
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
    throws SeckillException,RepeatKillException,RepeatKillException;

}
