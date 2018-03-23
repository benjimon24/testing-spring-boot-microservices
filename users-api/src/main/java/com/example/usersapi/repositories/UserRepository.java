package com.example.usersapi.repositories;

import com.example.usersapi.models.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public interface UserRepository extends CrudRepository<User, Long> {

}