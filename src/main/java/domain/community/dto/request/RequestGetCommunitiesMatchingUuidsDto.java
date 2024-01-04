package domain.community.dto.request;

import lombok.Builder;

import java.util.List;

@Builder
public record RequestGetCommunitiesMatchingUuidsDto(
        List<String> uuidList
) {
}
