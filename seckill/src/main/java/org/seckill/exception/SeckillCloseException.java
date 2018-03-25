package org.seckill.exception;

/**
 * 秒杀关闭异常:比如我们秒杀已经关闭，用户还在发送秒杀请求就会抛出这个异常
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
