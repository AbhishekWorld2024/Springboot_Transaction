package com.example.Springboot_Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;


@RestController
    @RequestMapping("/api")
    public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping("/UserAddress")
        public String createUser(@RequestBody UserAddressRequest request) throws SQLException {
            User user = new User();
            user.setName(request.getName());

            Address address = new Address();
            address.setCity(request.getCity());

            userService.createUserWithAddress(user, address);
            return "User and Address saved successfully!";
        }
    }



