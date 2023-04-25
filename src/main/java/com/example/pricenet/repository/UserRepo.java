package com.example.pricenet.repository;

import com.example.pricenet.entity.securityEntity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findUsersEntityByEmail(String email);
}
