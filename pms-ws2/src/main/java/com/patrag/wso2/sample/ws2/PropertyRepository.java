package com.patrag.wso2.sample.ws2;

import com.patrag.pms_ws2.Property;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class PropertyRepository {

  private static final Map<String, Property> properties = new HashMap<>();

  @PostConstruct
  public void initData() {
    Property property1 = new Property();
    property1.setName("2-New House");
    property1.setAddress("St Andrews Square, Cardiff");
    property1.setPostcode("CF3 5EA");
    property1.setPrice(300000);

    properties.put(property1.getName(), property1);

    Property property2 = new Property();
    property2.setName("30 Newton Avenue");
    property2.setAddress("Admiral Roard, London");
    property2.setPostcode("EC1 7CB");
    property2.setPrice(3000000);

    properties.put(property2.getName(), property2);

    Property property3 = new Property();
    property3.setName("20 Kings Place");
    property3.setAddress("Newbury Lane, Leeds");
    property3.setPostcode("LE15 2AB");
    property3.setPrice(30000);

    properties.put(property3.getName(), property3);
  }


  public Property findProperty(String name) {
    return properties.get(name);
  }

}
