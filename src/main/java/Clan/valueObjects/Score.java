package Clan.valueObjects;

import Dojo.valueObjects.IdDojo;
import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;

public class Score implements ValueObject<Score.Properties> {
    private int point;
    private IdDojo dojoId;
    private Date date;

    public Score(int point, IdDojo dojoId, Date date) {
        this.point = point;
        this.dojoId = dojoId;
        this.date = date;
    }

    public Score(){

    }

    public interface Properties{
        int point();
        IdDojo dojoId();
        Date date();
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public int point() {
                return point;
            }

            @Override
            public IdDojo dojoId() {
                return dojoId;
            }

            @Override
            public Date date() {
                return date;
            }
        };
    }
}
