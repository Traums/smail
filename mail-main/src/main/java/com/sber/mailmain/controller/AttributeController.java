package com.sber.mailmain.controller;

import com.sber.mailmain.exceptionhandler.exceptions.DataNotExistException;
import com.sber.mailmain.mapper.AttributeMapper;
import com.sber.mailmain.model.dto.AttributeDTO;
import com.sber.mailmain.model.entity.Attribute;
import com.sber.mailmain.repository.AttributeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/attribute")
@RequiredArgsConstructor
public class AttributeController {
    private final AttributeRepository attributeRepository;
    private final AttributeMapper attributeMapper;

    @GetMapping("/{attributeId}")
    public ResponseEntity<AttributeDTO> getAttribute(@PathVariable Long attributeId) {
        Attribute attribute = attributeRepository.findById(attributeId)
                .orElseThrow(() -> new DataNotExistException("Attribute not exist", attributeId));
        return ResponseEntity.ok(attributeMapper.toDTO(attribute));
    }
}
