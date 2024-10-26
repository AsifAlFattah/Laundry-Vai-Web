package com.codeprophet.laundry_vai.mappers;

import com.codeprophet.laundry_vai.dto.ServiceDto;
import com.codeprophet.laundry_vai.entity.Service;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ServiceMapper {

    Service toEntity(ServiceDto serviceDto);

    ServiceDto toDto(Service service);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Service partialUpdate(ServiceDto serviceDto, @MappingTarget Service service);
}