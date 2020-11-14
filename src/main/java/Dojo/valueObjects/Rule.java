package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;

public class Rule implements ValueObject<String> {
    private String rule;

    public Rule(String rule) {
        this.rule = rule;
    }

    @Override
    public String value() {
        return value();
    }
}
