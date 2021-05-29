package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Film_Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Film_CategoryRepository extends JpaRepository<Film_Category, Integer> {
}
