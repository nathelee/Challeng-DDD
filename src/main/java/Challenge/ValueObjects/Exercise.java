package Challenge.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Map;
import java.util.TreeMap;

public class Exercise implements ValueObject<Exercise.Properties> {

    private int level;
    private String goal;
    private static Map<Integer, String> metadata ;

    public static void metadata(){
        System.out.println(metadata.toString());
    }

    public Exercise(int level, String goal, Map metadata) {
        this.level = level;
        this.goal = goal;
        this.metadata = metadata;
    }

    public Exercise() {

    }

    public interface Properties {
        int level();
        String goal();
        Map map();
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public int level() {
                return level;
            }

            @Override
            public String goal() {
                return goal;
            }

            @Override
            public Map map() {
                return map();
            }
        };
    }
}
