package com.advanced.academy.adventure.book.system.controller;

import com.advanced.academy.adventure.book.system.model.Hero;
import com.advanced.academy.adventure.book.system.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hero")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }


        @GetMapping(value = "customer/{customerId}")
        public List<Hero> getHeroList(@PathVariable("customer") Integer customerId) {
            return heroService.getHeroByCustomerId(customerId);
    }

    @GetMapping(value ="/{heroId}")
    public Hero getHero(@PathVariable("heroId") Integer heroId){
        return heroService.getByHeroId(heroId);
    }
}
