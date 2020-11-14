package ValueObjectsCommon;


import co.com.sofka.domain.generic.ValueObject;

public class MemberGit implements ValueObject<MemberGit.Properties> {
    private Integer memberGitId;
    private String imageAvatarUrl;
    private String userName;

    public MemberGit(Integer memberGitId, String imageAvatarUrl, String userName) {
        this.memberGitId = memberGitId;
        this.imageAvatarUrl = imageAvatarUrl;
        this.userName = userName;
    }

    public MemberGit (){
    }

    public interface Properties {
        Integer memberGitId();
        String imageAvatarUrl();
        String userName();
    }

    @Override
    public Properties value(){
        return new Properties() {
            @Override
            public Integer memberGitId() {
                return memberGitId;
            }

            @Override
            public String imageAvatarUrl() {
                return imageAvatarUrl;
            }

            @Override
            public String userName() {
                return userName;
            }
        };
    }
}
