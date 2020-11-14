package Dojo.valueObjects;

import Dojo.enums.Frecuency;
import co.com.sofka.domain.generic.ValueObject;

public class OpeningHours implements ValueObject<OpeningHours.Properties> {
    private int hourStart;
    private int hourEnd;
    private Frecuency frecuency;

    public OpeningHours(int hourStart, int hourEnd, Frecuency frecuency) {
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.frecuency = frecuency;
    }

    /*public OpeningHours(){

    }*/

    public interface Properties {
        int hourStart();
        int hourEnd();
        Frecuency frecuency();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public int hourStart() {
                return hourStart;
            }

            @Override
            public int hourEnd() {
                return hourEnd;
            }

            @Override
            public Frecuency frecuency(){
                return frecuency;
            }
        };
    }
}
