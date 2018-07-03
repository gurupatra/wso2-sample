# wso2-sample
SAOP service, exposes endpoint getProperty.

sample request payload


<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:pms="http://patrag.com/pms-ws2">
   <soapenv:Header/>
   <soapenv:Body>
      <pms:getPropertyRequest>
         <pms:name>30 Newton Avenue</pms:name>
      </pms:getPropertyRequest>
   </soapenv:Body>
</soapenv:Envelope>