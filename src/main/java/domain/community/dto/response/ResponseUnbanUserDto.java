package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseUnbanUserDto(
        String unbannedUuid
) {}
