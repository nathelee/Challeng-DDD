package Dojo.entities;

import Dojo.valueObjects.*;
import ValueObjectsCommon.MemberGit;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;

import java.util.List;

public class Sensei extends Entity<IdSensei> {

    protected NameSensei nameSensei;
    protected PersonIdSensei personIdSensei;
    protected Specialty specialty;
    protected MemberGit memberGit;
    protected List<Accomplishment> accomplishments;

    public Sensei(IdSensei entityId, NameSensei nameSensei,
                  PersonIdSensei personIdSensei, Specialty specialty,
                  MemberGit memberGit, List<Accomplishment> accomplishments) {
        super(entityId);
        this.nameSensei = nameSensei;
        this.personIdSensei = personIdSensei;
        this.specialty = specialty;
        this.memberGit = memberGit;
        this.accomplishments = accomplishments;
    }

    private Sensei(IdSensei entityId) {
        super(entityId);
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

    public void changeSpecialty(){

    }

    public void addAccomplishment(){

    }

    public void update(){

    }
}
