package Clan.entities;

import Clan.valueObjects.*;
import Clan.valueObjects.Score;
import ValueObjectsCommon.MemberGit;
import co.com.sofka.domain.generic.Entity;

import java.util.List;

public class Member extends Entity<IdMember> {
    protected NameMember nameMember;
    protected GenderMember genderMember;
    protected Boolean isOwner;
    protected PersonId personId;
    protected MemberGit memberGit;
    protected EmailMember emailMember;
    protected List<Score> score;

    private Member(IdMember entityId) {
        super(entityId);
    }

    protected Member(IdMember entityId, NameMember nameMember,
                  GenderMember genderMember, Boolean isOwner,
                  PersonId personId, MemberGit memberGit,
                  EmailMember emailMember, List<Score> score) {
        super(entityId);
        this.nameMember = nameMember;
        this.genderMember = genderMember;
        this.isOwner = isOwner;
        this.personId = personId;
        this.memberGit = memberGit;
        this.emailMember = emailMember;
        this.score = score;
    }

    public NameMember getNameMember() {
        return nameMember;
    }

    public GenderMember getGenderMember() {
        return genderMember;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public MemberGit getMemberGit() {
        return memberGit;
    }

    public EmailMember getEmailMember() {
        return emailMember;
    }

    public List<Score> getScore() {
        return score;
    }

    public void addScore(){

    }

    public void updateEmailMember(){

    }

    public void updateNameMember(){

    }

    public void updateGenderMember(){

    }


}
