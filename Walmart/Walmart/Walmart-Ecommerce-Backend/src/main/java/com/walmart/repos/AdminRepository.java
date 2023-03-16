package com.walmart.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.walmart.models.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
