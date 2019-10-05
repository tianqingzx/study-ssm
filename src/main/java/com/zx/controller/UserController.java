package com.zx.controller;

import com.zx.pojo.User;
import com.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/my",method = RequestMethod.GET)
public class UserController {

    @Autowired
    private UserService  userService= null;

    @RequestMapping(value = "/getUser/{id}")
    @ResponseBody
    public User getUserById(@PathVariable("id") long id){
        System.out.println(id);
        User user = userService.getUserById(id);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/index")
    public ModelAndView getIndex(){
        System.out.println("/my/index");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/index");
        return mv;
    }
}
