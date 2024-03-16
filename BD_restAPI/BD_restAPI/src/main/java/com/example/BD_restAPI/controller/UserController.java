package com.example.BD_restAPI.controller;

import com.example.BD_restAPI.model.UserEntidy;
import com.example.BD_restAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntidy> obterTodos(){
        return userService.obterTodos();
    }
    @GetMapping("/{id}")
    public UserEntidy obterPorId(@PathVariable String id){
        return userService.obterPorId(id);
    }

    @PostMapping
    public UserEntidy inserir(@RequestBody UserEntidy user){
        return userService.inserir(user);
    }

    @PutMapping("/{id}")
    public UserEntidy atualizar(@PathVariable String id, @RequestBody UserEntidy user){
        return userService.atualizar(id,user);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id){
        userService.excluir(id);
    }
}
