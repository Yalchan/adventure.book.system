package com.advanced.academy.adventure.book.system.repository;

public interface GetReferance {

    public <T> T getReference(Class<T> tClass, Integer id);
}
