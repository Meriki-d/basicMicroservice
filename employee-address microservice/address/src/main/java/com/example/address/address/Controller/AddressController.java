package com.example.address.address.Controller;

import com.example.address.address.Entity.Address;
import com.example.address.address.Response.AddressResponse;
import com.example.address.address.Service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    private AddressServiceImpl service;

    @GetMapping("/address/{id}")
    public ResponseEntity<AddressResponse> fetchAddress(@PathVariable int id){
        return service.getAddressById(id);
    }

}
