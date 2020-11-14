package Challenge.entities;

import Challenge.ValueObjects.Exercise;
import Challenge.ValueObjects.IdKata;
import co.com.sofka.domain.generic.Entity;

import java.util.List;

public class Kata extends Entity<IdKata> {

    protected String purpose;
    protected String description;
    protected Integer limitOfTime;
    protected List<Exercise> exercises;

    protected Kata(IdKata entityId, String purpose, String description,
                Integer limitOfTime, List<Exercise> exercises) {
        super(entityId);
        this.purpose = purpose;
        this.description = description;
        this.limitOfTime = limitOfTime;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getDescription() {
        return description;
    }

    public Integer getLimitOfTime() {
        return limitOfTime;
    }

    public void changeLimitOfTime(){

    }

    public void removeExercise(){

    }

    public void addNewExercise(){

    }
}
