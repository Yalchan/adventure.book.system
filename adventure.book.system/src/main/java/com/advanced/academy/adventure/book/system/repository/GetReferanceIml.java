package com.advanced.academy.adventure.book.system.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class GetReferanceIml implements GetReference {

    private final EntityManager entityManager;

    @Autowired
    public GetReferanceIml(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public <T> T getReference(Class<T> tClass, Integer id){
        return entityManager.getReference(tClass,id);
    }
}
