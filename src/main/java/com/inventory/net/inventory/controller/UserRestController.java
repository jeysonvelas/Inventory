package com.inventory.net.inventory.controller;


import com.inventory.net.inventory.entity.Users;
import com.inventory.net.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    @Autowired
    private UserService userService;



    //Servicio Rest para obtener una Lista
    @GetMapping("/")
    List<Users> get(){

    return userService.get();

    }

    //Servicio Rest para guardar un nuevo usuario
    @PostMapping("/")
    public ResponseEntity newUser(@RequestBody Users newUser){
        return new ResponseEntity(userService.save(newUser), HttpStatus.CREATED);

    }

    //Servicio Rest para Actualizar un usuario
    /*@PutMapping("/{id}")
    ResponseEntity<User> updateServiceUser(@RequestBody User newUser, @PathVariable Long id){
        return new ResponseEntity<>(updateUser.update(newUser, id), HttpStatus.OK);


    }*/

    //Servicio Rest para eliminar usuarios
    /*@DeleteMapping("/{id}")
    ResponseEntity deleteUser(@PathVariable Long id){
        deleteUser.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }*/

}
