package com.exercise.DogMicroservice.repository;

import com.exercise.DogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
