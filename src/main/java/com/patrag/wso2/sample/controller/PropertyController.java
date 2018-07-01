package com.patrag.wso2.sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import com.patrag.wso2.sample.model.Property;
import com.patrag.wso2.sample.model.PropertyType;
import com.patrag.wso2.sample.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

  @Autowired
  private PropertyService propertyService;

  @RequestMapping(value = "/property", method = GET)
  public Property getProperty() {
    return propertyService.getProperty();
  }
}
