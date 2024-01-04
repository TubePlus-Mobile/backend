package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseUpdateCommunityDto(
        Long communityId
) {}
