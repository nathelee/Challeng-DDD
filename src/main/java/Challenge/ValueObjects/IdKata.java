package Challenge.ValueObjects;

import co.com.sofka.domain.generic.Identity;

public class IdKata extends Identity {
    public IdKata(String value){
        super(value);
    }

    public static IdKata of(String value){
        return new IdKata(value);
    }
}
