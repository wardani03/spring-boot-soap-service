package com.spring.boot.soap.springbootsoapservice.service;

import com.wardani.spring_boot_soap.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize(){

        User budi = new User();
        budi.setName("Budi");
        budi.setEmpId(90909);
        budi.setSalary(10000000);

        User asfa = new User();
        asfa.setName("Asfa");
        asfa.setEmpId(8989898);
        asfa.setSalary(5000000);

        User way = new User();
        way.setName("Way");
        way.setEmpId(10101010);
        way.setSalary(15000000);

        users.put(budi.getName(), budi);
        users.put(asfa.getName(), asfa);
        users.put(way.getName(), way);
    }

    public User getUser(String name){
        return users.get(name);
    }

}
