package com.patrag.wso2.sample.service;

import com.patrag.wso2.sample.dao.PropertyRepository;
import com.patrag.wso2.sample.domain.model.PropertyData;
import com.patrag.wso2.sample.spec.model.Property;
import com.patrag.wso2.sample.spec.model.PropertyType;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {

  @Autowired
  private PropertyRepository repository;

  public Property getProperty() {
    Property property = new Property();
    property.setId(10000);
    property.setName("2, New House");
    property.setPostCode("AB12 3BA");
    property.setAddressLine("Some Street");
    property.setType(PropertyType.TWOBED);
    return property;
  }

  public void add(Property property) {
    repository.save(mapPropertyData(property));
  }

  public void update(Property property) {

  }

  public void delete(Property property) {

  }

  private PropertyData mapPropertyData(Property property){
    return new PropertyData(property.getName(), property.getAddressLine(),
        property.getPostCode(), property.getType());
  }
}
