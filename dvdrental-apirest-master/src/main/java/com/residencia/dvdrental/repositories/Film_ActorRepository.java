package com.residencia.dvdrental.repositories;

import com.residencia.dvdrental.entities.Film_Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Film_ActorRepository extends JpaRepository<Film_Actor, Integer> {
}
