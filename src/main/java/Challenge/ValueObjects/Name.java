package Challenge.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value,
                "Name is required!");
    }

    @Override
    public String value() {
        return value;
    }
}
