package com.krian.spike.vo;

import com.krian.spike.pojo.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVO {
	private Order order;

	private GoodsVO goodsVo;
}
