package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

public interface SeckillDao {
    /**商品库存-1
     * @param seckillId 商品id
     * @param killTime 秒杀时间
     * @return 标记库存-1操作是否成功，返回值>1，表示更新的记录行数
     */
    public int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     * 根据id查询商品
     * @param seckillId
     * @return 返回商品实体类对象
     */
    public Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询商品列表
     * @param offset 偏移量
     * @param limit 在偏移量之后要取多少条记录
     * @return 商品列表
     */
    public List<Seckill>  queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
