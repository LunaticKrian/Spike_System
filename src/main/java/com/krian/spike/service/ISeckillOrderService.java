package com.krian.spike.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.krian.spike.pojo.SeckillOrder;
import com.krian.spike.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 *
 * @author zhoubin
 *
 */
public interface ISeckillOrderService extends IService<SeckillOrder> {

	/**
	 * 功能描述: 获取秒杀结果
	 *
	 * @param:
	 * @return:orderId:成功，-1：秒杀失败，0：排队中
	 *
	 * 乐字节：专注线上IT培训
	 * 答疑老师微信：lezijie
	 * @since: 1.0.0
	 * @Author:zhoubin
	 */
	Long getResult(User user, Long goodsId);
}
