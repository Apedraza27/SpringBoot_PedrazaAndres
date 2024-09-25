package com.example.Restaurant.Repository;


import com.example.Restaurant.Model.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepository  extends JpaRepository<Dishes, Long> {
}
