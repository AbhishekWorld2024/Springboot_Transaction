package com.example.Springboot_Transaction;
import org.springframework.data.jpa.repository.JpaRepository;



    public interface UserRepository extends JpaRepository<User, Integer> {

}
