package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseGetCommunitiesMatchingUuidsDto(
        Long communityId,
        String ownerId,
        String profileImage,
        String communityName,
        String youtubeName,
        Long communityMemberCount
) {}
