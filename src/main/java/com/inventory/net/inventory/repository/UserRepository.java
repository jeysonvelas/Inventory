package com.inventory.net.inventory.repository;

import com.inventory.net.inventory.entity.Users;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {


}
