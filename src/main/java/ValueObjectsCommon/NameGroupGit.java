package ValueObjectsCommon;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NameGroupGit implements ValueObject<String> {
    private final String value;

    public NameGroupGit(String value){
        this.value =  Objects.requireNonNull(value, "Name group is required");
    }
    @Override
    public String value() {
        return value;
    }
}
