package Dojo;

import Dojo.entities.Sensei;
import Dojo.enums.Status;
import Dojo.events.AssignedSensei;
import Dojo.events.CreatedDojo;
import Dojo.valueObjects.*;
import ValueObjectsCommon.GroupGit;
import ValueObjectsCommon.MemberGit;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;

public class Dojo extends AggregateEvent<IdDojo> {
    protected Sensei sensei;
    protected DataInfo dataInfo;
    protected Status status;
    protected List<Rule> rules;
    protected GroupGit groupGit;
    protected Location location;

    private Dojo(IdDojo entityId) {
        super(entityId);
        subscribe(new DojoEventChange(this));
    }

    public Dojo(IdDojo entityId, DataInfo dataInfo, Status status,
                List<Rule> rules, GroupGit groupGit, Location location) {
        super(entityId);
        this.dataInfo = dataInfo;
        this.status = status;
        this.rules = rules;
        this.groupGit = groupGit;
        this.location = location;
        appendChange(new CreatedDojo(entityId, dataInfo, status, rules,
                groupGit, location)).apply();
    }

    public Sensei getSensei() {
        return sensei;
    }

    public DataInfo getDataInfo() {
        return dataInfo;
    }

    public Status getStatus() {
        return status;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public GroupGit getGroupGit() {
        return groupGit;
    }

    public Location getLocation() {
        return location;
    }

    public void changeLocation(){

    }

    public void addRole(){

    }

    public void assignSensei(IdSensei idSensei, NameSensei nameSensei,
                             PersonIdSensei personIdSensei, Specialty specialty,
                             MemberGit memberGit, List<Accomplishment> accomplishments){
        appendChange(new AssignedSensei(idSensei, nameSensei, personIdSensei,
                specialty, memberGit, accomplishments)).apply();
    }

    public void removeRole(){

    }

    public void cancelDojo(){

    }

    public void openDojo(){

    }

    public void addAccomplishmentToSensei(){

    }

    public void updateDataToSensei(){

    }

    public void closeDojo(){

    }

    public void changeDataInfo(){

    }

    public void evaluateClan(){

    }
}
