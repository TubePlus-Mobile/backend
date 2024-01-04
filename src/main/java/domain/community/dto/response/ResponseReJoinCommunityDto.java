package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseReJoinCommunityDto(
        String userUuid,
        Long communityId
) {}
