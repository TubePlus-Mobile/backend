package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResponseGetBannedMemberListDto(
        String userUuid,
        LocalDateTime createdDate,
        LocalDateTime updatedDate,
        LocalDateTime banEndDate,
        Boolean isMembershipUser
) {
}
