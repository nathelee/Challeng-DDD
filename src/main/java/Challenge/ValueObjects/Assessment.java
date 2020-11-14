package Challenge.ValueObjects;

import co.com.sofka.domain.generic.ValueObject;

public class Assessment implements ValueObject<Assessment.Properties> {
    private int degreeOfDifficulty;
    private String repoUrl;
    private String summary;

    public Assessment(int degreeOfDifficulty, String repoUrl, String summary) {
        this.degreeOfDifficulty = degreeOfDifficulty;
        this.repoUrl = repoUrl;
        this.summary = summary;
    }

    public Assessment(){

    }

    public interface Properties {
        int degreeOfDifficulty();
        String repoUrl();
        String summary();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public int degreeOfDifficulty() {
                return degreeOfDifficulty;
            }

            @Override
            public String repoUrl() {
                return repoUrl;
            }

            @Override
            public String summary() {
                return summary;
            }
        };
    }
}
