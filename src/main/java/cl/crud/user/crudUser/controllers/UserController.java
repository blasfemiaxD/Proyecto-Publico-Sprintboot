package cl.crud.user.crudUser.controllers;

import cl.crud.user.crudUser.models.UserModel;
import cl.crud.user.crudUser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        return "Hola Mundo";
    }

    @GetMapping("")
    public ArrayList<UserModel> allUser(){
        return userService.allUser();
    }

    @PostMapping("")
    public UserModel saveUser(@RequestBody UserModel user) throws SQLException {
        return this.userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<UserModel> findUserById(@PathVariable("id") Long id){
        return this.userService.findUser(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> findUserByPriority(@RequestParam("prioridad") Integer priority){
        return this.userService.findByPriority(priority);
    }

    @DeleteMapping(path = "/{id}")
    public  String deleteUser(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if(ok){
            return "Se elimino el usuario con id "+ id;
        }else {
            return "No se pudo eliminar el usuario con id "+ id;
        }
    }

}
