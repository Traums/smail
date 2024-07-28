package com.sber.mailmain.repository;

import com.sber.mailmain.model.entity.Attribute;
import jakarta.persistence.Table;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(name = "attribute",schema = "main")
public interface AttributeRepository extends ListCrudRepository<Attribute,Long> {
}
