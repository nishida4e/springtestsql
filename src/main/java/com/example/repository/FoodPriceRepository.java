package com.example.repository;

import com.example.domain.FoodPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodPriceRepository extends JpaRepository<FoodPrice, Integer> {

	List<FoodPrice> findByNameContaining(@Param("name") String name);

}
