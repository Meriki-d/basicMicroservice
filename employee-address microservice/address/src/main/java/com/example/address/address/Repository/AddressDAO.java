package com.example.address.address.Repository;

import com.example.address.address.Entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressDAO extends CrudRepository<Address,Integer> {
}
