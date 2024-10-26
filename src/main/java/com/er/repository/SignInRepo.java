package com.er.repository;

import com.er.dto.LoginDTO;
import com.er.entity.SignInPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface SignInRepo extends JpaRepository<SignInPage,Integer> {
   public Optional<LoginDTO> findOneByEmailAndPassword(String email, String password);
    // public LoginDTO findByEmail(String email);
}
