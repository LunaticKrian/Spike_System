package com.krian.spike.vo;

import com.krian.spike.pojo.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailVO {

	private User user;

	private GoodsVO goodsVo;

	private int secKillStatus;

	private int remainSeconds;
}
