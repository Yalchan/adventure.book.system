package com.advanced.academy.adventure.book.system.service;

import com.advanced.academy.adventure.book.system.model.adventure.Adventure;
import com.advanced.academy.adventure.book.system.repository.AdventureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdventureService {
    private final AdventureRepository adventureRepository;

    @Autowired
    public AdventureService(AdventureRepository adventureRepository) {
        this.adventureRepository = adventureRepository;
    }

    public void createOrUpdate(Adventure adventure){
        adventureRepository.save(adventure);
    }

}
