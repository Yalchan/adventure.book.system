package com.advanced.academy.adventure.book.system.model;

import com.advanced.academy.adventure.book.system.model.adventure.Step;
import com.advanced.academy.adventure.book.system.model.adventure.Choise;

import javax.persistence.*;

@Entity
@Table(name="adventures_progresses_history")
public class AdventureProgressHistory {
    @Id
    @Column(name="id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name="hero_id")
    private Hero hero;

    @ManyToOne
    @JoinColumn(name="step_id")
    private Step step;
    @ManyToOne
    @JoinColumn(name="choice_id")
    private Choise choise;

    public void setId(Integer id) {
        this.id = id;
    }

    public Choise getChoise() {
        return choise;
    }

    public void setChoise(Choise choise) {
        this.choise = choise;
    }


    public Integer getId() {
        return id;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }
}
