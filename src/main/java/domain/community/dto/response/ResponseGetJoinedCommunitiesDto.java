package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseGetJoinedCommunitiesDto(
        Long communityId,
        String ownerUuid,
        String profileImage,
        String communityName,
        String description,
        String youtubeName,
        Long communityMemberCount
) {
}
