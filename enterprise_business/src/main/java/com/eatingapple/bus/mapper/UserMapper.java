package com.eatingapple.bus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eatingapple.bus.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
