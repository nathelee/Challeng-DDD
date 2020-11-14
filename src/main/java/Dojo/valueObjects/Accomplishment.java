package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Accomplishment implements ValueObject<Accomplishment.Properties> {
    private String label;
    private int point;
    private Date date;

    public Accomplishment(String label, int point, Date date) {
        this.label = label;
        this.point = point;
        this.date = date;
    }

    public interface Properties {
        String label();
        int point();
        Date date();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public String label() {
                return label;
            }

            @Override
            public int point() {
                return point;
            }

            @Override
            public Date date() {
                return date;
            }
        };
    }


}
