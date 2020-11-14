package Dojo.valueObjects;

import Challenge.ValueObjects.IdChallenge;
import co.com.sofka.domain.generic.Identity;

public class PersonIdSensei extends Identity {
    public PersonIdSensei(String value) {
        super(value);
    }

    public static PersonIdSensei of(String value){
        return new PersonIdSensei(value);
    }
}
