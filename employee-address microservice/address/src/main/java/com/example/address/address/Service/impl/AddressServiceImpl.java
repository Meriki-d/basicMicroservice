package com.example.address.address.Service.impl;

import com.example.address.address.Entity.Address;
import com.example.address.address.Repository.AddressDAO;
import com.example.address.address.Response.AddressResponse;
import com.example.address.address.Service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDAO dbaccess;
    @Autowired
    private ModelMapper mapper;

    @Override
    public ResponseEntity<AddressResponse> getAddressById(int id) {
        Address payload= dbaccess.findById(id).get();
        AddressResponse resp= mapper.map(payload, AddressResponse.class);
        return ResponseEntity.status(HttpStatus.OK).body(resp);
    }
}
