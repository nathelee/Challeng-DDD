package Dojo.valueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class DataInfo implements ValueObject<DataInfo.Properties> {
    private String name;
    private String legend;

    public DataInfo(String name, String legend) {
        this.name = name;
        this.legend = legend;
    }

    public DataInfo(){

    }

    public interface Properties{
        String name();
        String legend();
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String name() {
                return name;
            }

            @Override
            public String legend() {
                return legend;
            }
        };
    }

    public String getName() {
        return name;
    }

    public String getLegend() {
        return legend;
    }
}
