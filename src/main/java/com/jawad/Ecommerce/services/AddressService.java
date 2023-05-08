package com.jawad.Ecommerce.services;

import com.jawad.Ecommerce.models.Address;
import com.jawad.Ecommerce.models.Users;
import com.jawad.Ecommerce.repositories.IAddressRepository;
import com.jawad.Ecommerce.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class AddressService {

    @Autowired
    IAddressRepository addressRepo;

    @Autowired
    IUserRepository userRepo;

    public String addAddress(Address address) {

        Users user = address.getUserId();

        Optional<Users> list = userRepo.findById(user.getUserId());

        if(list.isEmpty()){
            return "Address cannot be added";
        }

        address.setUserId(list.get());

        addressRepo.save(address);


        return "Address added successfully";

    }
}
