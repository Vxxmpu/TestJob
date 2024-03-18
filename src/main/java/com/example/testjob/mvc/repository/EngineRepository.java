package com.example.testjob.mvc.repository;

import com.example.testjob.mvc.entity.Engine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EngineRepository extends PagingAndSortingRepository<Engine, UUID>, JpaRepository<Engine, UUID> {

}

