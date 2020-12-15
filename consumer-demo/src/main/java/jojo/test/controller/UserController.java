package jojo.test.controller;

import jojo.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("sayHi")
    public String sayHi(){
        String s = userService.sayHi();
        System.out.println(s);
        return s;
    }
}
