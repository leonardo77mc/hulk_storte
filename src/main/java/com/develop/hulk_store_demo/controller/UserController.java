package com.develop.hulk_store_demo.controller;

import com.develop.hulk_store_demo.entity.user.User;
import com.develop.hulk_store_demo.services.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController()
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/save")
    User save(@RequestBody() User user) {
        try {
            return userService.save(user);
        } catch (Exception e) {
            throw e;
        }
    }

}
