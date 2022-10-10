package com.krian.spike.vo;

import com.krian.spike.pojo.Goods;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GoodsVO extends Goods {

	private BigDecimal seckillPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}