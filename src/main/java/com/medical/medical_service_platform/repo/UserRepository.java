package com.medical.medical_service_platform.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medical.medical_service_platform.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
