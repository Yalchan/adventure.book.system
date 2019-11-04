package model;

public class Choise {
    private Integer id;
    private String description;
    private Step resultToStep;
    private Integer reputationChange;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Step getResultToStep() {
        return resultToStep;
    }

    public void setResultToStep(Step resultToStep) {
        this.resultToStep = resultToStep;
    }
}
