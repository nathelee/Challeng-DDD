package Dojo.events;

import Dojo.valueObjects.*;
import ValueObjectsCommon.MemberGit;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;

public class AssignedSensei extends DomainEvent {
    private IdSensei idSensei;
    private NameSensei nameSensei;
    private PersonIdSensei personIdSensei;
    private Specialty specialty;
    private MemberGit memberGit;
    private List<Accomplishment> accomplishments;

    public AssignedSensei(IdSensei idSensei, NameSensei nameSensei,
                          PersonIdSensei personIdSensei, Specialty specialty,
                          MemberGit memberGit, List<Accomplishment> accomplishments) {
        super("Dojo.AssignedSensei");
        this.idSensei = idSensei;
        this.nameSensei = nameSensei;
        this.personIdSensei = personIdSensei;
        this.specialty = specialty;
        this.memberGit = memberGit;
        this.accomplishments = accomplishments;
    }

    public IdSensei getIdSensei(){
        return idSensei;
    }

    public NameSensei getNameSensei() {
        return nameSensei;
    }

    public PersonIdSensei getPersonIdSensei() {
        return personIdSensei;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public List<Accomplishment> getAccomplishments() {
        return accomplishments;
    }
}
