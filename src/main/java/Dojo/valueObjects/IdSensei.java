package Dojo.valueObjects;

import Challenge.ValueObjects.IdChallenge;
import co.com.sofka.domain.generic.Identity;

public class IdSensei extends Identity{
    public IdSensei(String value) {
        super(value);
    }

    public static IdSensei of(String value){
        return new IdSensei(value);
    }
}
