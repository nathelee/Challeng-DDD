package Clan.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PersonId implements ValueObject<String> {
    private final String value;

    public PersonId(String value){
        this.value =  Objects.requireNonNull(value, "Id person is required");
    }
    @Override
    public String value() {
        return value;
    }
}
