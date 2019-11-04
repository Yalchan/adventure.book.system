package model;

public class AdventureProgressHistory {
    private Integer id;
    private Hero hero;
    private Step step;

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
