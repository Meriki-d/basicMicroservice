package com.example.address.address.Service;

import com.example.address.address.Entity.Address;
import com.example.address.address.Response.AddressResponse;
import org.springframework.http.ResponseEntity;

public interface AddressService {

    public ResponseEntity<AddressResponse> getAddressById(int id);
}
