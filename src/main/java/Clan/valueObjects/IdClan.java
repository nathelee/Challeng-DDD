package Clan.valueObjects;

import Challenge.ValueObjects.IdChallenge;
import co.com.sofka.domain.generic.Identity;

public class IdClan extends Identity {
    public IdClan(String value) {
        super(value);
    }

    public static IdClan of(String value){
        return new IdClan(value);
    }
}
