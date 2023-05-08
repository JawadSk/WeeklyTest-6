package com.jawad.Ecommerce.services;

import com.jawad.Ecommerce.models.Users;
import com.jawad.Ecommerce.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {

    @Autowired
    IUserRepository userRepo;

    public String addUsers(List<Users> usersList) {
        List<Users> list = userRepo.saveAll(usersList);

        if(list==null){
            return "Users not added successfully";
        }else{
            return "Users added successfully";
        }
    }

    public Users getUser(Integer userID) {
        Optional<Users> optionalUser = userRepo.findById(userID);

        if(optionalUser.isEmpty()){
            throw new IllegalStateException("UserID not found");
        }else{
            return optionalUser.get();
        }
    }
}
