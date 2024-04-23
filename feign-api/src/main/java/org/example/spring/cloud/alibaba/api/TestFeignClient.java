package org.example.spring.cloud.alibaba.api;

import org.example.spring.cloud.alibaba.api.provider.TestServiceProvider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author JDragon
 * @Date 2021.02.11 上午 12:37
 * @Email 1061917196@qq.com
 * @Des:
 */

@FeignClient(value = "test-service", path = "/test")
public interface TestFeignClient extends TestServiceProvider {
    @Override
    @GetMapping("testMethod1")
    String testMethod1();

    @Override
    @GetMapping("testMethod2")
    String testMethod2();
}
