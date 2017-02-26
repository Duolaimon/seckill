package org.seckill.test;

import org.junit.Test;
import org.seckill.enums.SeckillStatEnum;

/**
 * @author deity
 *         17-2-26 下午12:47
 */
public class EnumTest {
    @Test
    public void test1() {
        SeckillStatEnum s1 = SeckillStatEnum.stateOf(1);
        System.out.println(s1);
    }
}
