package com.jocata.externalservices.controller;

import com.jocata.externalservices.payload.ExternalServiceRequest;
import com.jocata.externalservices.payload.PanPayload;
import com.jocata.externalservices.response.ExternalServiceResponse;
import com.jocata.externalservices.response.PanResponse;
import com.jocata.externalservices.service.PanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ExternalServicesController {

    @Autowired
    private PanService panService;

    @GetMapping("/getPanDetails")
    public ExternalServiceResponse<PanResponse> getPanInfoDetails(@RequestBody ExternalServiceRequest request) {

        PanPayload payload = request.getPanPayload();
        PanResponse panResponse = panService.getPanInfoDetails(payload);
        return new ExternalServiceResponse<>(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), request.getTxnId(), panResponse);
    }
}
