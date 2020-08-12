package com.bjsxt.springbootfreemarker.controller;

import com.bjsxt.springbootfreemarker.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * UsersController
 */
@Controller
public class UsersController {


    /**
     * 处理请求，返回数据
     */
    @GetMapping("/showUsers")
    public String  showUsers(Model model){
        List<Users> list = new ArrayList<>();
        list.add(new Users("admin","F","32"));
        list.add(new Users("Lisi","M","23"));
        list.add(new Users("xiaoli","F","23"));
        model.addAttribute("list",list);
        return "usersList";
    }
}
