package Challenge;

import Challenge.ValueObjects.*;
import Challenge.entities.Kata;
import Clan.valueObjects.IdClan;
import Dojo.valueObjects.IdDojo;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Challenge extends AggregateEvent<IdChallenge> {
    protected Name name;
    protected List<IdClan> clanIds;
    protected List<IdDojo> dojoIds;
    protected List<Kata> katas;
    protected Assessment assessment;
    protected Boolean isRevoked;
    protected Boolean isVisible;
    protected Integer durationDays;


    private Challenge(IdChallenge entityId) {
        super(entityId);
    }

    private Challenge(IdChallenge entityId, Name name, Assessment assessment,
                     Boolean isRevoked, Boolean isVisible, Integer durationDays) {
        super(entityId);
        this.name = name;
        this.assessment = assessment;
        this.isRevoked = isRevoked;
        this.isVisible = isVisible;
        this.durationDays = durationDays;
    }

    public void addNewKata(){

    }

    public void subscriberClan(){

    }

    public void unSubscriberClan(){

    }

    public void changeDurationDays(){

    }

    public void updateName(){

    }

    public void updateKata(){

    }

    public void addExerciseOfKata(){

    }

    public void assignAssessment(){

    }

    public void revokeChallenge(){

    }
}
