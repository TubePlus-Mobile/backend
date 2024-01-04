package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record ResponseGetCommunityMemberListDto(
        String userUuid,
        Boolean isBanned,
        Boolean isManager,
        LocalDateTime createdDate,
        LocalDateTime updateDate
) {
}
