package com.dk.testing.jpatesting.repositories;

import com.dk.testing.jpatesting.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,Long> {
}
