package Clan.valueObjects;

import Challenge.ValueObjects.IdChallenge;
import co.com.sofka.domain.generic.Identity;

public class IdMember extends Identity {
    public IdMember(String value) {
        super(value);
    }

    public static IdMember of(String value){
        return new IdMember(value);
    }
}
