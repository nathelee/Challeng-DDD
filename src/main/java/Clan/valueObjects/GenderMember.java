package Clan.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class GenderMember implements ValueObject<String> {
    private final String value;

    public GenderMember(String value){
        this.value =  Objects.requireNonNull(value, "Gender is required");
    }
    @Override
    public String value() {
        return value;
    }
}
