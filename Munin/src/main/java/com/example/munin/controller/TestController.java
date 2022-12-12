package com.example.munin.controller;

import com.example.munin.bean.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller is use for test
 * @author Hoxton on 2022/12/12
 * @since 1.2.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public Message getHello() {
        return new Message("title","hello");
    }
}
