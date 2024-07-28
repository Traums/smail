package com.sber.mailmain.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "attribute", schema = "main")
public class Attribute {
    @Id
    @Schema(name = "attribute", description = "Атрибут")
    private Long id;
    private String name;
    private String description;
    @Column(name = "corel_key")
    private Long corelKey;
}
