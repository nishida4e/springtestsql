package com.example.repository;

import com.example.domain.FoodPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodPriceRepository extends JpaRepository<FoodPrice, Integer> {

	List<FoodPrice> findByName(String name);

}
