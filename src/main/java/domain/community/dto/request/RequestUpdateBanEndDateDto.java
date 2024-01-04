package domain.community.dto.request;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public record RequestUpdateBanEndDateDto(
        String targetUuid,
        LocalDate banEndDate
) { }
