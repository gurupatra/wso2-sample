package com.patrag.wso2.sample.service;

import com.patrag.wso2.sample.model.Property;
import com.patrag.wso2.sample.model.PropertyType;
import org.springframework.stereotype.Component;

@Component
public class PropertyService {
  public Property getProperty() {
    Property property = new Property();
    property.setName("2, New House");
    property.setPostCode("AB12 3BA");
    property.setAddressLine("Some Street");
    property.setType(PropertyType.TWOBED);
    return property;
  }

  public void add(Property property) {

  }

  public void update(Property property){

  }

  public void delete(Property property){

  }
}
