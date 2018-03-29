package com.vvv.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    private static final Log logger = LogFactory.getLog(HelloWorldController.class);
    @RequestMapping(value="/",method = RequestMethod.GET)
    @ResponseBody
    public String hello(HttpServletRequest request){
        return "hello world";
    }
}
