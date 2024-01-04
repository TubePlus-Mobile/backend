package domain.community.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record ResponseGetJoinedCommunityListDto(
        List<ResponseGetJoinedCommunitiesDto> communityList,
        Long totalPageCount
) {}