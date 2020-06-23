package cn.project.controller;

import cn.project.utils.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api")
public class AutoController {
    @Resource
    BasicDataFeign basicDataFeign;

    @GetMapping("/test2")
    public Response getAdditionalFees() {
        return basicDataFeign.test2();
    }
}
