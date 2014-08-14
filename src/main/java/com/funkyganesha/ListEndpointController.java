package com.funkyganesha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.Map;

/**
 * Created by barga009 on 8/10/14 at 3:01 PM. Comment {"$EXPR$"}
 */
@RestController
public class ListEndpointController {
    private final RequestMappingHandlerMapping requestMappingHandlerMapping;

    @Autowired
    public ListEndpointController(RequestMappingHandlerMapping requestMappingHandlerMapping) {
        this.requestMappingHandlerMapping = requestMappingHandlerMapping;
    }

    @RequestMapping (value = "/listEndpoints", produces = "application/json")
    public Map<RequestMappingInfo, HandlerMethod> listAllAvailableEndpoints() {
        return requestMappingHandlerMapping.getHandlerMethods();
    }
}
