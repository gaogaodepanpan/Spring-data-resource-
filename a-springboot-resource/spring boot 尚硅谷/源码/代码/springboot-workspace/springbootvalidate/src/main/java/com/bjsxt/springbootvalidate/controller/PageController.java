package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    /**
     * 跳转页面方法
     *解决异常的方式：可以在跳转页面的方法中注入一个Users对象
     * 由于SprignMVC会将该对象放入到Model中传递，key的名称会使用该对象
     * 的驼峰命名规则来作为key
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page, @ModelAttribute("aa") Users suibian){
        return page;
    }
}
