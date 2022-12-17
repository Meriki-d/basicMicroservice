package com.example.employee.FeignClient;

import com.example.employee.Response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-service",path = "/address-app/api/")
public interface AddressClient {
    @GetMapping("/address/{id}")
    public AddressResponse getAddressById(@PathVariable("id") int id); // this is a proxy class.No need for implementation
}
