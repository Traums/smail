package com.sber.mailmain.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Attribute {
    @Id
    @Schema(name = "attribute", description = "Атрибут")
    private Long id;
    private String name;
    private String description;
    private Long corelKey;
}
