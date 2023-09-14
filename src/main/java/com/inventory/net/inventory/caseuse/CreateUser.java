package com.inventory.net.inventory.caseuse;


import com.inventory.net.inventory.entity.Users;
import com.inventory.net.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {

    @Autowired
    private UserService userService;

    public Users save(Users newUsers){

        return userService.save(newUsers);

    }


}
