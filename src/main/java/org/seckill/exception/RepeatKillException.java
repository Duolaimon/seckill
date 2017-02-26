package org.seckill.exception;

/**
 * 重复秒杀异常(运行期异常)
 *
 * @author deity
 *         17-2-17 下午7:32
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepeatKillException(String message) {

        super(message);
    }
}
