package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Location implements ValueObject<Location.Properties> {
    private String urlMeet;
    private String location;
    private String description;
    private OpeningHours openingHours;

    public Location(String urlMeet, String location,
                    String description, OpeningHours openingHours) {
        this.urlMeet = urlMeet;
        this.location = location;
        this.description = description;
        this.openingHours = openingHours;
    }

    /*public Location(){

    }*/

    public interface Properties {
        String urlMeet();
        String location();
        String description();
        OpeningHours openingHours();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public String urlMeet() {
                return urlMeet;
            }

            @Override
            public String location() {
                return location;
            }

            @Override
            public String description() {
                return description;
            }

            @Override
            public OpeningHours openingHours() {
                return openingHours;
            }
        };
    }
}
