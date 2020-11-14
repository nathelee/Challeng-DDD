package ValueObjectsCommon;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PathGroupGit implements ValueObject<String> {
    private final String value;

    public PathGroupGit(String value){
        this.value =  Objects.requireNonNull(value, "Path group is required");
    }
    @Override
    public String value() {
        return value;
    }
}
