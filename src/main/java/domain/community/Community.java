package domain.community;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "owner_uuid")
    private String ownerUuid;

    @Column(name = "banner_image")
    private String bannerImage;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(nullable = false, name = "comunity_name")
    private String communityName;

    @Column(name = "description")
    private String description;

    @Column(name = "youtube_name")
    private String youtubeName;

    @Column(nullable = false, name = "community_member_count")
    private Long communityMemberCount;

    // 커뮤니티 생성
    public static Community createCommunity(
            String ownerUuid,
            String bannerImage,
            String profileImage,
            String communityName,
            String description,
            String youtubeName,
            Long memberCount){

        return Community.builder()
                .communityMemberCount(memberCount)
                .bannerImage(bannerImage)
                .profileImage(profileImage)
                .youtubeName(youtubeName)
                .communityName(communityName)
                .description(description)
                .ownerUuid(ownerUuid)
                .build();
    }

    // 커뮤니티 업데이트
    public void updateCommunity(
            String communityName,
            String description,
            String profileImage,
            String bannerImages){

        this.communityName = communityName;
        this.description = description;
        this.bannerImage = bannerImages;
        this.profileImage = profileImage;
    }

    // 커뮤니티 멤버수 증가
    public void updateCommunityMemberCount(Long communityMemberCount) {
        this.communityMemberCount = communityMemberCount;
    }
}
