package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Specialty implements ValueObject<String> {
    private final String value;

    public Specialty(String value){
        this.value = Objects.requireNonNull(value, "Specialty is required");
    }

    @Override
    public String value() {
        return value;
    }
}
