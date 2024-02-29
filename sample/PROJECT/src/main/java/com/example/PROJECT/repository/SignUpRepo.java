package com.example.PROJECT.repository;
import com.example.PROJECT.model.SignUp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp, Integer> {
}