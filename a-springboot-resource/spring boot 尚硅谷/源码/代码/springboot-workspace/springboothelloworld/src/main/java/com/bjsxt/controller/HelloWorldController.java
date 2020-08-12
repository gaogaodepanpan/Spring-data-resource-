package com.bjsxt.controller;

import org.springframework.web.bind.annotation.*;

/**
 * 处理请求Controller
 */
@RestController // @Controller+@ResponsBody 直接返回字符串
public class HelloWorldController {

    //@RequestMapping("/helloWorld")
    @GetMapping("/helloWorld")
    public String showHelloWorld(){
        return "HelloWorld";
    }
}
