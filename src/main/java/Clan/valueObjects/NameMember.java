package Clan.valueObjects;

import Challenge.ValueObjects.Name;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameMember implements ValueObject<String> {
    private final String value;

    public NameMember(String value){
        this.value =  Objects.requireNonNull(value, "Name member is required");
    }
    @Override
    public String value() {
        return value;
    }
}
