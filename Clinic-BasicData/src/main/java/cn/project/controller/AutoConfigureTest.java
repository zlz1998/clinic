package cn.project.controller;

import cn.project.utils.Response;
import cn.project.utils.ResponseEnum;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("auto")
public class AutoConfigureTest {
    @Value("${spring.test}")
    private String test;
    @Value("${server.port}")
    private String test2;

    @GetMapping("/test")
    public String test() {
        return test;
    }

    @GetMapping("/test2")
    public Response test2() {
        return new Response(ResponseEnum.SUCCESS).setResponseBody(test2);
    }
}
