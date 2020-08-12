package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller
@RequestMapping("/user")
@Validated
public class UsersController {

    /**
     * 添加用户
     */
    @RequestMapping("/addUser")
    public String addUser(@ModelAttribute("aa")@Validated Users users, BindingResult result){
        if(result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for(ObjectError err:list){
                FieldError fieldError = (FieldError) err;
                String fieldName = fieldError.getField();
                String msg = fieldError.getDefaultMessage();
                System.out.println(fieldName+"\t"+msg);
            }
            return "addUser";
        }
        System.out.println(users);
        return "ok";
    }

    @PostMapping("/findUser")
    public String findUser(@NotBlank(message = "用户名不能为空") String username){
        System.out.println(username);
        return "ok";
    }
}
