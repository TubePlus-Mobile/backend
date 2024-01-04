package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseJoinCommunityDto(
        String userUuid,
        Long communityId
) {}