package com.nit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel, Integer> {

}
