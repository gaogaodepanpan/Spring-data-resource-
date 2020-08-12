package com.bjsxt.springbootthymeleaf.controller;

import com.bjsxt.springbootthymeleaf.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * 页面跳转Controller
 */
@Controller
public class PageController {

    /**
     * 页面跳转方法
     */
    @GetMapping("/show")
    public String showPage(Model model,HttpServletRequest request){
        model.addAttribute("msg","Hello Thymeleaf");
        model.addAttribute("date",new Date());
        model.addAttribute("sex","女");
        model.addAttribute("id","12");
        List<Users> list = new ArrayList<>();
        list.add(new Users("1","admin",23));
        list.add(new Users("2","kevin",22));
        list.add(new Users("3","oldlu",25));
        list.add(new Users("4","xiaoli",26));
        model.addAttribute("list",list);

        Map<String,Users> map = new HashMap<>();
        map.put("user1",new Users("1","admin",23));
        map.put("user2",new Users("2","kevin",22));
        map.put("user3",new Users("3","oldlu",25));
        model.addAttribute("map",map);

        request.setAttribute("req","HttpServletRequest");
        request.getSession().setAttribute("ses","HttpSession");
        request.getSession().getServletContext().setAttribute("app","application");

        model.addAttribute("id","100");
        model.addAttribute("name","oldlu");
        return "index";
    }

    @GetMapping("/show2")
    public String show2(String id,String name){
        System.out.println(id+"\t"+name);
        return "index2";
    }
    @GetMapping("/show3/{id}/{name}")
    public String show3(@PathVariable String id,@PathVariable String name){
        System.out.println(id+"\t"+name);
        return "index2";
    }

    @GetMapping("/show4/{id}")
    public String show4(@PathVariable String id,String name){
        System.out.println(id+"\t"+name);
        return "index2";
    }

    @GetMapping("/show5")
    public String show5(){
        return "index2";
    }

}
