package Dojo.commands;

import Clan.valueObjects.PersonId;
import Dojo.valueObjects.Accomplishment;
import Dojo.valueObjects.IdSensei;
import Dojo.valueObjects.NameSensei;
import Dojo.valueObjects.PersonIdSensei;
import UseCase.AssignSenseiUseCase;
import ValueObjectsCommon.MemberGit;
import co.com.sofka.domain.generic.Command;

import java.util.List;

public class AssignSenseiCommand implements Command {
    private IdSensei idSensei;
    private NameSensei nameSensei;
    private PersonIdSensei personIdSensei;
    private MemberGit memberGit;
    private List<Accomplishment> accomplishments;

    public AssignSenseiCommand(){

    }

    public AssignSenseiCommand(IdSensei idSensei, NameSensei nameSensei,
                               PersonIdSensei personIdSensei, MemberGit memberGit,
                               List<Accomplishment> accomplishments) {
        this.idSensei = idSensei;
        this.nameSensei = nameSensei;
        this.personIdSensei = personIdSensei;
        this.memberGit = memberGit;
        this.accomplishments = accomplishments;
    }

    public IdSensei getIdSensei() {
        return idSensei;
    }

    public NameSensei getNameSensei() {
        return nameSensei;
    }

    public PersonIdSensei getPersonIdSensei() {
        return personIdSensei;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public List<Accomplishment> getAccomplishments() {
        return accomplishments;
    }
}
