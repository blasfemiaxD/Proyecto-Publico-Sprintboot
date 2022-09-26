package cl.crud.user.crudUser.controllers;

import cl.crud.user.crudUser.models.UserModel;
import cl.crud.user.crudUser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "Hola Mundo";
    }

    @GetMapping()
    public ArrayList<UserModel> allUser(){
        return userService.allUser();
    }

    @PostMapping()
    public UserModel saveUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }



}
