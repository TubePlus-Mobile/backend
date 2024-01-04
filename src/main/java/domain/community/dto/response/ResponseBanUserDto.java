package domain.community.dto.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ResponseBanUserDto(
        Long communityId,
        String bannedUserUuid,
        LocalDate banEndDate
) {
}
