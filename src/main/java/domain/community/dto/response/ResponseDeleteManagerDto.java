package domain.community.dto.response;

import lombok.Builder;

@Builder
public record ResponseDeleteManagerDto(
        String managerUuid,
        Long communityId
) {
}
