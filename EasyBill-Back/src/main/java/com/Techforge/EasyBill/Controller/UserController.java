package com.Techforge.EasyBill.Controller;

import com.Techforge.EasyBill.Entity.User;
import com.Techforge.EasyBill.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public String createuser(@RequestBody User user){
        service.createuser(user);
        return "User save succesully";
    }
}
