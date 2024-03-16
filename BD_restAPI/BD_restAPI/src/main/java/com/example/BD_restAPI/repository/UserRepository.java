package com.example.BD_restAPI.repository;
import com.example.BD_restAPI.model.UserEntidy;
import org.springframework.data.mongodb.repository.MongoRepository;
import  org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<UserEntidy,String>{
}
