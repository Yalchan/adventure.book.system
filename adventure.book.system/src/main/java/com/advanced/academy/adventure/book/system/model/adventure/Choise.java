package com.advanced.academy.adventure.book.system.model.adventure;

import com.advanced.academy.adventure.book.system.model.adventure.Step;

import javax.persistence.*;

@Entity
@Table(name = "choises")
public class Choise {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    @JoinColumn(name = "results_in_step")
    private Step resultsInStep;


    @ManyToOne
    @JoinColumn(name = "step_given_in_id")
    private Step stepGivenIn;

    @Column(name = "reputation_change")
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

    public Step getResultsInStep() {
        return resultsInStep;
    }

    public void setResultsInStep(Step resultsInStep) {
        this.resultsInStep = resultsInStep;
    }

    public Step getStepGivenIn() {
        return stepGivenIn;
    }

    public void setStepGivenIn(Step stepGivenIn) {
        this.stepGivenIn = stepGivenIn;
    }
}
