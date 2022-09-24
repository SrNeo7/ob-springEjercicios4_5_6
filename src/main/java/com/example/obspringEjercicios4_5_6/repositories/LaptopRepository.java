package com.example.obspringEjercicios4_5_6.repositories;

import com.example.obspringEjercicios4_5_6.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop,Long> {
}
