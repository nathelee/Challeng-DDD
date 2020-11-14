package Clan;

import Challenge.ValueObjects.Name;
import Clan.entities.Member;
import Clan.valueObjects.ColorClan;
import Clan.valueObjects.IdClan;
import Clan.valueObjects.NameClan;
import ValueObjectsCommon.GroupGit;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.List;


public class Clan extends AggregateEvent<IdClan> {
    protected List<Member> members;
    protected GroupGit groupGit;
    protected ColorClan color;
    protected NameClan name;

    private Clan(IdClan entityId) {
        super(entityId);
    }

    private Clan(IdClan entityId, List<Member> members,
                 GroupGit groupGit, ColorClan color, NameClan name) {
        super(entityId);
        this.members = members;
        this.groupGit = groupGit;
        this.color = color;
        this.name = name;
    }

    public void addNewMember(){

    }

    public void revokeMember(){

    }

    public void applyColor(){

    }

    public void addScoreToMember(){

    }

    public void updateMember(){

    }

    public void updateName(){

    }
}
