package domain.community.dto.request;

import lombok.Builder;

@Builder
public record RequestBanUserDto(
        String ownerUuid,
        String communityName,
        String description,
        String bannerImage,
        String profileImage,
        String youtubeName
) {}