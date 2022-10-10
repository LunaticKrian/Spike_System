package com.krian.spike.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.krian.spike.mapper.GoodsMapper;
import com.krian.spike.pojo.Goods;
import com.krian.spike.service.IGoodsService;
import com.krian.spike.vo.GoodsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 * 乐字节：专注线上IT培训
 * 答疑老师微信：lezijie
 *
 * @author zhoubin
 *
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

	@Autowired
	private GoodsMapper goodsMapper;

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
	@Override
	public List<GoodsVO> findGoodsVo() {
		return goodsMapper.findGoodsVo();
	}



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
	@Override
	public GoodsVO findGoodsVoByGoodsId(Long goodsId) {
		return goodsMapper.findGoodsVoByGoodsId(goodsId);
	}
}
