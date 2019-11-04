package model;

public class Adventure {
    private Integer id;
    private String name;
    private String story;
    private Step firstSteps;
    private Integer numberOfLives;
    private Integer startingReputation;

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Step getFirstSteps() {
        return firstSteps;
    }

    public void setFirstSteps(Step firstSteps) {
        this.firstSteps = firstSteps;
    }

    public Integer getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(Integer numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public Integer getStartingReputation() {
        return startingReputation;
    }

    public void setStartingReputation(Integer startingReputation) {
        this.startingReputation = startingReputation;
    }
}
