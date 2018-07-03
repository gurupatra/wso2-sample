package com.patrag.wso2.sample.domain.model;

import com.patrag.wso2.sample.spec.model.PropertyType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PropertyData {

  @Id
  @GeneratedValue
  private long id;
  private String name;
  private String addressLine;
  private String postCode;
  private PropertyType type;

  public PropertyData() {
  }

  public PropertyData(String name, String addressLine, String postCode,
      PropertyType type) {
    this.name = name;
    this.addressLine = addressLine;
    this.postCode = postCode;
    this.type = type;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public PropertyType getType() {
    return type;
  }

  public void setType(PropertyType type) {
    this.type = type;
  }
}
