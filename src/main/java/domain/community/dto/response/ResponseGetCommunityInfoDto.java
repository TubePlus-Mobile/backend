package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ResponseGetCommunityInfoDto(
        Long communityId,
        String ownerUuid,
        String bannerImage,
        String profileImage,
        String youtubeName,
        String communityName,
        String description,
        Long communityMemberCount,
        LocalDate createdDate,
        LocalDate updatedDate
) {}
