package com.jawad.Ecommerce.conteollers;

import com.jawad.Ecommerce.models.Orders;
import com.jawad.Ecommerce.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")

public class OrdersController {

    @Autowired
    OrdersService orderService;

    @PostMapping()
    public String addOrder(@RequestBody Orders order){
        return orderService.addOrder(order);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Integer id){
        return orderService.deleteOrder(id);
    }

    @GetMapping()
    public Orders getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }
}
