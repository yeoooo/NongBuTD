package com.td.NongbuTD.repository;

import com.td.NongbuTD.domain.Item;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
