package com.example.employee.Response;

public class Response {
    private String name;
    private String bloodGroup;
    private String email;

    private AddressResponse address;

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    public AddressResponse getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public Response() {
    }

    public Response(String name, String bloodGroup, String email) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
