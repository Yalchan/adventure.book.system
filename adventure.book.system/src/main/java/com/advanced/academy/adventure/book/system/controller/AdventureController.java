package com.advanced.academy.adventure.book.system.controller;

import com.advanced.academy.adventure.book.system.model.adventure.Adventure;
import com.advanced.academy.adventure.book.system.service.AdventureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/adventure")
public class AdventureController  {

    private final AdventureService adventureService;

    @Autowired
    public AdventureController(AdventureService adventureService) {
        this.adventureService = adventureService;
    }

    @PostMapping
    public void createOrUpdate(@RequestBody Adventure adventure){
        adventureService.createOrUpdate(adventure);
    }

    @GetMapping
    public List<Adventure> getAll(){
       return adventureService.getAll();
    }
}
