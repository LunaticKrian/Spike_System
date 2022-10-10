package com.krian.spike.controller;


import com.krian.spike.service.ISeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private ISeckillGoodsService orderService;

//	@RequestMapping("/detail")
//	@ResponseBody
//	public RespBean detail(User user, Long orderId) {
//		if (user == null) {
//			return RespBean.error(RespBeanEnum.SESSION_ERROR);
//		}
//		OrderDetailVo detail = orderService.detail(orderId);
//		return RespBean.success(detail);
//	}

}
