package Dojo.events;

import Dojo.enums.Status;
import Dojo.valueObjects.DataInfo;
import Dojo.valueObjects.IdDojo;
import Dojo.valueObjects.Location;
import Dojo.valueObjects.Rule;
import ValueObjectsCommon.GroupGit;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class CreatedDojo extends DomainEvent {
    private final IdDojo entityId;
    private final DataInfo dataInfo;
    private final Status status;
    private final List<Rule> rules;
    private final GroupGit groupGit;
    private final Location location;

    public CreatedDojo(IdDojo entityId,
                       DataInfo dataInfo, Status status,
                       List<Rule> rules, GroupGit groupGit, Location location) {
        super("Dojo.CreatedDojo");
        this.entityId = entityId;
        this.dataInfo = dataInfo;
        this.status = status;
        this.rules = rules;
        this.groupGit = groupGit;
        this.location = location;
    }

    public IdDojo getEntityId(){
        return entityId;
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
}
