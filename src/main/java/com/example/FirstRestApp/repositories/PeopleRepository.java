package com.example.FirstRestApp.repositories;

import com.example.FirstRestApp.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<Person,Integer> {
}
