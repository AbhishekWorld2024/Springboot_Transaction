package com.example.Springboot_Transaction;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Transactional(rollbackFor = SQLException.class)
    public void createUserWithAddress(User user, Address address)throws SQLException {
        User savedUser = userRepository.save(user);

        address.setStreetId(savedUser.getId());
        addressRepository.save(address);
    }
}

