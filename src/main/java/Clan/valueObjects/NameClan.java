package Clan.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameClan implements ValueObject<String> {
    private final String value;

    public NameClan(String value){
        this.value =  Objects.requireNonNull(value, "Name Clan is required");
    }
    @Override
    public String value() {
        return value;
    }
}
