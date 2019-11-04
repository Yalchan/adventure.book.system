package model;

import model.enums.EndGameType;

import java.util.ArrayList;
import java.util.List;

public class Step {
    private Integer id;
    private Integer reputationChange;
    private EndGameType endGameType;
    private boolean endsGAme=false;
    private String story;
    private List<Choise> choiseList=new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }

    public EndGameType getEndGameType() {
        return endGameType;
    }

    public void setEndGameType(EndGameType endGameType) {
        this.endGameType = endGameType;
    }

    public boolean isEndsGAme() {
        return endsGAme;
    }

    public void setEndsGAme(boolean endsGAme) {
        this.endsGAme = endsGAme;
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
