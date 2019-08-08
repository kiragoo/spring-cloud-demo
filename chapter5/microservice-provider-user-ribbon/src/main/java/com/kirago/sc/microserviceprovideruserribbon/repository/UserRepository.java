package com.kirago.sc.microserviceprovideruserribbon.repository;

import com.kirago.sc.microserviceprovideruserribbon.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
