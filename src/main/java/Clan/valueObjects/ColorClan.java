package Clan.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class ColorClan implements ValueObject<String> {
    private final String value;

    public ColorClan(String value){
        this.value = "white";
    }
    @Override
    public String value() {
        return value;
    }
}
