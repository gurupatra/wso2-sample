package com.patrag.wso2.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.patrag.wso2.sample.model.Property;
import com.patrag.wso2.sample.service.PropertyService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class PropertyServiceTest {

  @Autowired
  private PropertyService propertyService;

  @Before
  public void setUp() {

  }

  @Test
  public void getProperty() {
    Property property = propertyService.getProperty();
    assertNotNull(property);
    assertEquals("Name doesn't match","2, New House", property.getName());
  }
}
