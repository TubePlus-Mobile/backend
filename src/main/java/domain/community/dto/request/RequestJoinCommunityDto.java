package domain.community.dto.request;

import lombok.Builder;

@Builder
public record RequestJoinCommunityDto(
        String userUuid
) {}