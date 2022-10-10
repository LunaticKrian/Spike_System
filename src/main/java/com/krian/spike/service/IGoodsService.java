package com.krian.spike.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.krian.spike.pojo.Goods;
import com.krian.spike.vo.GoodsVO;

import java.util.List;

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
public interface IGoodsService extends IService<Goods> {

	/**
	 * 功能描述: 获取商品列表
	 *
	 * @param:
	 * @return:
	 *
	 * 乐字节：专注线上IT培训
	 * 答疑老师微信：lezijie
	 * @since: 1.0.0
	 * @Author:zhoubin
	 */
	List<GoodsVO> findGoodsVo();


	/**
	 * 功能描述: 获取商品详情
	 *
	 * @param:
	 * @return:
	 *
	 * 乐字节：专注线上IT培训
	 * 答疑老师微信：lezijie
	 * @since: 1.0.0
	 * @Author:zhoubin
	 */
	GoodsVO findGoodsVoByGoodsId(Long goodsId);
}
