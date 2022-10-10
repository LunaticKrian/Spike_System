package com.krian.spike.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.krian.spike.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
