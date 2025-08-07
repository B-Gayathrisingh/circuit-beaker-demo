package com.example.api_gateway_client.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.api_gateway_clientfallback.ExternalServiceFallback;

@FeignClient(
    name = "external-service",
    fallback = ExternalServiceFallback.class
)
public interface ExternalServiceClient {

    @GetMapping("/flaky-endpoint")
    String getResponse();
}
