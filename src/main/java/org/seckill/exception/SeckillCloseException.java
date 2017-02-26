package org.seckill.exception;

/**
 * 秒杀关闭异常
 *
 * @author deity
 *         17-2-17 下午7:34
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }

    public SeckillCloseException(String message) {

        super(message);
    }
}
