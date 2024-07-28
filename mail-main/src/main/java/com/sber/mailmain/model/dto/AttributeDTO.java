package com.sber.mailmain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AttributeDTO implements AbstractDTO{
    private Long id;
    private String name;
    private String description;
    private Long corelKey;
}
