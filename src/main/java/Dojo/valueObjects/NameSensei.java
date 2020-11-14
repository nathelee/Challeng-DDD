package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameSensei implements ValueObject<String> {
    private final String name;

    public NameSensei(String value){
        this.name = Objects.requireNonNull(value, "Name is required");

    }

    @Override
    public String value() {
        return name;
    }
}
