package Challenge.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class IdChallenge extends Identity {
    public IdChallenge(String value) {
        super(value);
    }

    public static IdChallenge of(String value){
        return new IdChallenge(value);
    }
}
