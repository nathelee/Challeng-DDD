package ValueObjectsCommon;

import co.com.sofka.domain.generic.ValueObject;

public class GroupGit implements ValueObject<GroupGit.Properties> {
    private Integer groupId;
    private PathGroupGit path;
    private NameGroupGit name;

    public GroupGit(Integer groupId, PathGroupGit path, NameGroupGit name) {
        this.groupId = groupId;
        this.path = path;
        this.name = name;
    }

    public interface Properties {
        Integer groupId();
        PathGroupGit path();
        NameGroupGit name();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public Integer groupId() {
                return groupId;
            }

            @Override
            public PathGroupGit path() {
                return path;
            }

            @Override
            public NameGroupGit name() {
                return name;
            }
        };
    }
}
