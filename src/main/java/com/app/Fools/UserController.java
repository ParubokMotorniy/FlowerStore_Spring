package com.app.Fools;

import com.app.FlowerStore.Flower;
import com.app.FlowerStoreMain.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/flowers")
public class UserController
{
    private final UserService userService;

    @Autowired
    public UserController(UserService service)
    {
        this.userService = service;
    }
    @GetMapping("/user")
    public List<AppUser> GetUsers()
    {
        return userService.GetUsers();
    }

    @PostMapping("/user")
    public void AddUsers(@RequestBody AppUser user)
    {
        userService.Add(user);
    }
}
