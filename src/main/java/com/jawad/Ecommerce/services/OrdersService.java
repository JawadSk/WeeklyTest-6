package com.jawad.Ecommerce.services;

import com.jawad.Ecommerce.models.Address;
import com.jawad.Ecommerce.models.Orders;
import com.jawad.Ecommerce.models.Product;
import com.jawad.Ecommerce.models.Users;
import com.jawad.Ecommerce.repositories.IAddressRepository;
import com.jawad.Ecommerce.repositories.IOrdersRepository;
import com.jawad.Ecommerce.repositories.IProductRepository;
import com.jawad.Ecommerce.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class OrdersService {


    @Autowired
    IOrdersRepository orderRepo;

    @Autowired
    IUserRepository userRepo;

    @Autowired
    IAddressRepository addressRepo;

    @Autowired
    IProductRepository productRepo;

    public String addOrder(Orders order) {
        Users user = order.getUserId();
        Address address = order.getAddressId();
        Product product = order.getProductId();

        Optional<Address> addressOptional =  addressRepo.findById(address.getAddressId());
        Optional<Users> userOptional =  userRepo.findById(user.getUserId());
        Optional<Product> productOptional =  productRepo.findById(product.getProductId());

        if(addressOptional.isEmpty()){
            return "Enter the correct addressID";
        } else if (userOptional.isEmpty()) {
            return "Enter the correct userID";
        } else if (productOptional.isEmpty()) {
            return "Enter the correct productID";
        }else{
            order.setAddressId(addressOptional.get());
            order.setProductId(productOptional.get());
            order.setUserId(userOptional.get());

            orderRepo.save(order);
            return "Order placed sucessfully !!!";
        }


    }

    public String deleteOrder(Integer id) {

        Optional<Orders> optionalOrder = orderRepo.findById(id);

        if(optionalOrder.isEmpty()){
            return "Id not found";
        }
        orderRepo.deleteById(id);
        return "Order deleted sucessfully";
    }


    public Orders getOrder(Integer orderId) {
        Optional<Orders> optionalOrder = orderRepo.findById(orderId);

        if(optionalOrder.isEmpty()){
            throw new IllegalStateException("OrderId not found");
        }else{
            return optionalOrder.get();
        }
    }
}
