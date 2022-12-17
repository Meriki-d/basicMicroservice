package com.example.employee.Services.Impl;

import com.example.employee.FeignClient.AddressClient;
import com.example.employee.Response.AddressResponse;
import com.example.employee.Response.Response;
import com.example.employee.Entity.Employee1;
import com.example.employee.Repository.EmployeeDAO;
import com.example.employee.Services.ServiceInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeService implements ServiceInterface {
    @Autowired
    private EmployeeDAO dbaccess;

    @Autowired
    private RestTemplate template;

    @Autowired
    private WebClient webclient;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private AddressClient client;

    @Value("${addressservice.base.url}")
    private String baseurl;
    @Override
    public Response getEmpById(int id) {



        //getting employee details
        Employee1 rtn=dbaccess.findById(id).get();
        Response rp=mapper.map(rtn,Response.class);

        //getting address details
        AddressResponse address=new AddressResponse();
//        template.getForObject(baseurl+"/address/{id}",AddressResponse.class,id);
//
//        address = webclient.get().uri("/address/" + id).retrieve().bodyToMono(AddressResponse.class).block();
        address=client.getAddressById(id);

        rp.setAddress(address);
        return rp;
    }
}
