package com.jawad.Ecommerce.conteollers;

import com.jawad.Ecommerce.models.Address;
import com.jawad.Ecommerce.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping()
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

}
