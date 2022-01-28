package com.thiagoleal.cursodoglas.repository;

import com.thiagoleal.cursodoglas.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository <Todo, Long >{
}
