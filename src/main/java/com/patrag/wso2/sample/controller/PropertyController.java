package com.patrag.wso2.sample.controller;

import com.patrag.wso2.sample.spec.model.Property;
import com.patrag.wso2.sample.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/property")
public class PropertyController {

  @Autowired
  private PropertyService propertyService;

  @GetMapping
  public Property getProperty() {
    return propertyService.getProperty();
  }

  @PostMapping
  public ResponseEntity<?> add(@RequestBody Property property){
    return ResponseEntity.noContent().build();
  }

  @PutMapping
  public ResponseEntity<?> update(@RequestBody Property property){
    return ResponseEntity.noContent().build();
  }

  @DeleteMapping
  public ResponseEntity<?> delete(@RequestBody Property property){
    return ResponseEntity.noContent().build();
  }

}
