package com.nicolas.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolas.workshopmongo.domain.User;
import com.nicolas.workshopmongo.repository.UserRepository;
import com.nicolas.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }

    public User findById(String id){
        return repo.findById(id)
        .orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
