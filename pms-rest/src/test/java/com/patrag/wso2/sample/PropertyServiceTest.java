package com.patrag.wso2.sample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import com.patrag.wso2.sample.dao.PropertyRepository;
import com.patrag.wso2.sample.service.PropertyService;
import com.patrag.wso2.sample.spec.model.Property;
import com.patrag.wso2.sample.spec.model.PropertyType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class PropertyServiceTest {
  private PropertyService propertyService;
  private Property property;

  @Mock
  private PropertyRepository repository;

  @Before
  public void setUp() {
    propertyService = new PropertyService();

    Property property = new Property();
    property.setName("2, New House");
    property.setPostCode("AB12 3BA");
    property.setAddressLine("Some Street");
    property.setType(PropertyType.TWOBED);
  }

  @Test
  public void getProperty() {
    Property fetchedProperty = propertyService.getProperty();
    assertNotNull(fetchedProperty);
  }

  @Test
  public void addProperty() {
    Property property = propertyService.getProperty();
    assertNotNull(property);
    assertEquals("Name doesn't match","2, New House", property.getName());
  }
}
