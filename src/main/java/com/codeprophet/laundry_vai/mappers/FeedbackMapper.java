package com.codeprophet.laundry_vai.mappers;

import com.codeprophet.laundry_vai.dto.FeedbackDto;
import com.codeprophet.laundry_vai.entity.Feedback;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface FeedbackMapper {
    Feedback toEntity(FeedbackDto feedbackDto);

    FeedbackDto toDto(Feedback feedback);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Feedback partialUpdate(FeedbackDto feedbackDto, @MappingTarget Feedback feedback);
}