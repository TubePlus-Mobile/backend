package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResponseGetManagerListDto(
        String userUuid,
        LocalDateTime createdDate,
        LocalDateTime updatedDate,
        Boolean isMembershipUser
) {
}
