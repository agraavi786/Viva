package com.reactiveDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reactiveDemo.VivaTechEntity.VivaTechEntity;

public interface VivaRepository extends JpaRepository<VivaTechEntity, Integer> {

}
