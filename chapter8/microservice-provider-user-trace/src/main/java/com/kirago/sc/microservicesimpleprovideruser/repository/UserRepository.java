package com.kirago.sc.microservicesimpleprovideruser.repository;

import com.kirago.sc.microservicesimpleprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
