package com.study.springcloud.consumer.service;

import com.study.springcloud.consumer.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient("nacos-provider")
public interface UserService {

    @GetMapping("/user/list")
    List<User> list();

}
