package domain.community.dto.request;

import lombok.Builder;

@Builder
public record RequestUpdateCommunityDto(
        String bannerImage,
        String profileImage,
        String description,
        String communityName
) { }
