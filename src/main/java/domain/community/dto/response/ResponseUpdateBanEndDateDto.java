package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ResponseUpdateBanEndDateDto(
        Long communityId,
        String bannedUserUuid,
        LocalDate banEndDate
) {}
