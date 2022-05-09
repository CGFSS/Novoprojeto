package com.api.api_user.domain.repository;

import java.util.List;

import com.api.api_user.domain.entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente,Long>  {

   
}
