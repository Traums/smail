package com.sber.mailmain.mapper;

import com.sber.mailmain.model.dto.AttributeDTO;
import com.sber.mailmain.model.entity.Attribute;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttributeMapper {
    AttributeDTO toDTO(Attribute attribute);
    Attribute toEntity(AttributeDTO attributeDTO);
}
