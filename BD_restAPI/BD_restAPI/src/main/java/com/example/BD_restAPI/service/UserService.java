package com.example.BD_restAPI.service;

import com.example.BD_restAPI.model.UserEntidy;
import com.example.BD_restAPI.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserEntidy> obterTodos(){return userRepository.findAll();}
    public UserEntidy obterPorId(String id){return userRepository.findById(id).orElse(null);}
    public UserEntidy inserir(UserEntidy user){return userRepository.save(user);}
    public UserEntidy atualizar(String id,UserEntidy newUser){
        UserEntidy existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null){
            existingUser.setNome(newUser.getNome());
            existingUser.setEmail(newUser.getEmail());
            return userRepository.save(existingUser);
        }else {
            return null;
        }
    }
    public void excluir(String id){userRepository.deleteById(id);}
}
