package com.krian.spike.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.krian.spike.pojo.User;
import com.krian.spike.vo.LoginVO;
import com.krian.spike.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface IUserService extends IService<User> {
	RespBean doLogin(LoginVO loginVo, HttpServletRequest request, HttpServletResponse response);

	User getUserByCookie(String userTicket, HttpServletRequest request, HttpServletResponse response);

	RespBean updatePassword(String userTicket, String password, HttpServletRequest request,
	                        HttpServletResponse response);
}
