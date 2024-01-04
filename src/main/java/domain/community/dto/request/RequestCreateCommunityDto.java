package domain.community.dto.request;

import lombok.Builder;

@Builder
public record RequestCreateCommunityDto(
        String ownerUuid,
        String communityName,
        String description,
        String bannerImage,
        String profileImage,
        String youtubeName
) {}
