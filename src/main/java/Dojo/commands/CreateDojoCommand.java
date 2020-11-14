package Dojo.commands;

import Dojo.entities.Sensei;
import Dojo.enums.Status;
import Dojo.events.CreatedDojo;
import Dojo.valueObjects.DataInfo;
import Dojo.valueObjects.IdDojo;
import Dojo.valueObjects.Location;
import Dojo.valueObjects.Rule;
import ValueObjectsCommon.GroupGit;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class CreateDojoCommand implements Command {
    private IdDojo idDojo;
    private DataInfo dataInfo;
    private Status status;
    private List<Rule> rules;
    private GroupGit groupGit;
    private Location location;

    public CreateDojoCommand(){

    }

    public CreateDojoCommand(IdDojo idDojo, DataInfo dataInfo, Status status,
                             List<Rule> rules, GroupGit groupGit, Location location) {
        this.idDojo = idDojo;
        this.dataInfo = dataInfo;
        this.status = status;
        this.rules = rules;
        this.groupGit = groupGit;
        this.location = location;
    }

    public IdDojo getIdDojo() {
        return idDojo;
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
