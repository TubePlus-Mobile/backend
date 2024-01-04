package domain.community.dto.request;

import lombok.Builder;


@Builder
public record RequestLeaveCommunityDto(
        String userUuid
) { }
