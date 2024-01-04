package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseLeaveCommunityDto(
        Long communityId,
        String userUuid
) {}
