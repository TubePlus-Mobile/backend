package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseRegisterManagerDto(
        Long communityId,
        String managerUuid
) {}
