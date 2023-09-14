package com.inventory.net.inventory.controller;


import com.inventory.net.inventory.caseuse.CreateUser;
import com.inventory.net.inventory.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {


    //private GetUser getUser;
    @Autowired
    private CreateUser createUser;

    //private DeleteUser deleteUser;

    //private UpdateUser updateUser;


    //Servicio Rest para obtener una Lista
    /*@GetMapping("/")
    List<User> get(){

    return getUser.getAll();

    }*/

    //Servicio Rest para guardar un nuevo usuario
    @PostMapping("/")
    ResponseEntity<Users> newUser(@RequestBody Users newUser){

        return new ResponseEntity<>(createUser.save(newUser), HttpStatus.CREATED);

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