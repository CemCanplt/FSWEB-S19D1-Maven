package com.workintech.s18d2.dao;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {



}
