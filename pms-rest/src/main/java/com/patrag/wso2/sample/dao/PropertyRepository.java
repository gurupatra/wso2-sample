package com.patrag.wso2.sample.dao;

import com.patrag.wso2.sample.domain.model.PropertyData;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<PropertyData, Long> {

}
