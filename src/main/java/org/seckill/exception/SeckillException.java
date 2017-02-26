package org.seckill.exception;

/**
 * @author deity
 *         17-2-17 下午7:35
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
