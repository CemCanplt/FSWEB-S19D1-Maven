package com.workintech.s18d2.repository;

import com.workintech.s18d2.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Long> {

    @Query(value = "SELECT v FROM fsweb.vegetable v ORDER BY v.price DESC", nativeQuery = true)
    List<Vegetable> getByPriceDesc();

    @Query(value = "SELECT v FROM fsweb.vegetable v ORDER BY v.price ASC", nativeQuery = true)
    List<Vegetable> getByPriceAsc();

    @Query(value = "SELECT v FROM fsweb.vegetable v WHERE v.name LIKE %:name%", nativeQuery = true)
    List<Vegetable> searchByName(String name);


}
