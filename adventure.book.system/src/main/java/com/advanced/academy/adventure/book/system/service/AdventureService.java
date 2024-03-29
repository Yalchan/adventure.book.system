package com.advanced.academy.adventure.book.system.service;

import com.advanced.academy.adventure.book.system.model.adventure.Adventure;
import com.advanced.academy.adventure.book.system.repository.AdventureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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


    public List<Adventure> getAll(){
        List<Adventure>  adventures=new ArrayList<>();
        Iterable<Adventure> result =adventureRepository.findAll();
        if(null!=result){
            result.forEach(adventure -> adventures.add(adventure));
        }
        return adventures;
    }

}
