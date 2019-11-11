package com.advanced.academy.adventure.book.system.repository;

import com.advanced.academy.adventure.book.system.model.adventure.Adventure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdventureRepository extends CrudRepository<Adventure,Integer> {

}
