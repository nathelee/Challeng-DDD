package Clan.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class EmailMember implements ValueObject<String> {
    private final String value;

    public EmailMember(String value){
        this.value =  Objects.requireNonNull(value, "Email is required");
    }
    @Override
    public String value() {
        return value;
    }
}
