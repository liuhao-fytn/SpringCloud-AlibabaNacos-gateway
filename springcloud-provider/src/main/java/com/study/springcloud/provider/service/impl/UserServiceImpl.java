package com.study.springcloud.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.springcloud.provider.mapper.UserMapper;
import com.study.springcloud.provider.model.User;
import com.study.springcloud.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
