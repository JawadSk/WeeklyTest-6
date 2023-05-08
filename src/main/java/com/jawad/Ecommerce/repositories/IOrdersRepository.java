package com.jawad.Ecommerce.repositories;

import com.jawad.Ecommerce.models.Orders;
import com.jawad.Ecommerce.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrdersRepository extends JpaRepository<Orders, Integer> {

}
