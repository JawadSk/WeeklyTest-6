package com.jawad.Ecommerce.conteollers;

import com.jawad.Ecommerce.models.Users;
import com.jawad.Ecommerce.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public String addUsers(@RequestBody List<Users> usersList){
        return userService.addUsers(usersList);
    }

    @GetMapping()
    public Users getUser(@RequestParam Integer userID){
        return userService.getUser(userID);
    }
}
