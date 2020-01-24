package com.spring.boot.soap.springbootsoapservice.endpoint;

import com.spring.boot.soap.springbootsoapservice.service.UserService;
import com.wardani.spring_boot_soap.GetUserRequest;
import com.wardani.spring_boot_soap.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;

    @PayloadRoot(namespace = "http://wardani.com/spring.boot.soap.service", localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.getUser(request.getName()));
        return response;
    }
}
