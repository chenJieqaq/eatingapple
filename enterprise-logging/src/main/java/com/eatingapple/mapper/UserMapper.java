package com.eatingapple.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eatingapple.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
