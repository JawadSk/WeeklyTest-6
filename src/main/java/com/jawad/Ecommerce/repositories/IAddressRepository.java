package com.jawad.Ecommerce.repositories;

import com.jawad.Ecommerce.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IAddressRepository  extends JpaRepository<Address , Integer> {


}
