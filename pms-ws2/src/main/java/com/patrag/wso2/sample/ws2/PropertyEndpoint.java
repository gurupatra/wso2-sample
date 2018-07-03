package com.patrag.wso2.sample.ws2;

import com.patrag.pms_ws2.GetPropertyRequest;
import com.patrag.pms_ws2.GetPropertyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PropertyEndpoint {

  private static final String NAMESPACE_URI = "http://patrag.com/pms-ws2";

  private PropertyRepository propertyRepository;

  @Autowired
  public PropertyEndpoint(PropertyRepository propertyRepository) {
    this.propertyRepository = propertyRepository;
  }

  @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPropertyRequest")
  @ResponsePayload
  public GetPropertyResponse getProperty(@RequestPayload GetPropertyRequest request) {
    GetPropertyResponse response = new GetPropertyResponse();
    response.setProperty(propertyRepository.findProperty(request.getName()));

    return response;
  }
}
