package Dojo.valueObjects;

import Challenge.ValueObjects.IdChallenge;
import co.com.sofka.domain.generic.Identity;

public class IdDojo extends Identity {
    public IdDojo(String value) {
        super(value);
    }

    public static IdDojo of(String value){
        return new IdDojo(value);
    }
}
