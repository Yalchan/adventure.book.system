package com.advanced.academy.adventure.book.system.model.adventure;

import com.advanced.academy.adventure.book.system.model.enums.EndGameType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="steps")
public class Step {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="end_game_type")
    @Enumerated(EnumType.STRING)
    private EndGameType endGameType;

    @Column(name="ends_game")
    private boolean endsGame =false;

    @Column(name="story", columnDefinition = "TEXT")
    private String story;

    @OneToMany(mappedBy = "stepGivenIn",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private List<Choise> choiseList=new ArrayList<>();


    public Integer getId() {
        return id;
    }

    public EndGameType getEndGameType() {
        return endGameType;
    }

    public void setEndGameType(EndGameType endGameType) {
        this.endGameType = endGameType;
    }

    public boolean isEndsGame() {
        return endsGame;
    }

    public void setEndsGame(boolean endsGame) {
        this.endsGame = endsGame;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Choise> getChoiseList() {
        return choiseList;
    }

    public void setChoiseList(List<Choise> choiseList) {
        this.choiseList = choiseList;
    }
}
