package domain.community.dto.request;

import lombok.Builder;

@Builder
public record RequestDeleteManagerDto(
        String targetUuid
) {}
