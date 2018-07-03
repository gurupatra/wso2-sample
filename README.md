# wso2-sample
WSO2 Sample Application
The pms-ws2 contans a SOAP service with an endpoint for getProperty, that returns
the details of a property by given name. Start the service

mvn spring-boot:run

The WSDL can be accessed from http://localhost:8080/ws/properties.wsdl

Run WSO2 EI, deploy the pmsproxyCAR_1.0.0.car.

The proxy endpoint is at http://localhost:8280/services/PMS-Proxy.PMS-ProxyHttpSoap12Endpoint

Run SOAPUI, import the soapUITests/PMS-PROXY-soapui-project.xml to import the endpoint tests.
