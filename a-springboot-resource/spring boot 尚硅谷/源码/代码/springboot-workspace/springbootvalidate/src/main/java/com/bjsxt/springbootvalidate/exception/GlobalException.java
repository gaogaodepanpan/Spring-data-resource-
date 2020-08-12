package com.bjsxt.springbootvalidate.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;

@Configuration
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception e) {
        ModelAndView mv = new ModelAndView();
        //判断不同异常类型，做不同视图的跳转
        if(e instanceof NullPointerException){
            mv.setViewName("error5");
        }
        if(e instanceof ArithmeticException){
            mv.setViewName("error6");
        }
        if(e instanceof ConstraintViolationException){
            mv.setViewName("findUser");
        }
        mv.addObject("error",e.getMessage().split(":")[1]);
        return mv;
    }
}
