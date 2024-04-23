package org.example.spring.cloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.example.spring.cloud.alibaba.api.provider.TestServiceProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController implements TestServiceProvider {

    @Value("${test}")
    private String test;

    @Override
    @GetMapping("/testMethod1")
    public String testMethod1() {
        return test;
    }

    @Override
    @GetMapping("/testMethod2")
    public String testMethod2() {
        return test + "2";
    }
}
