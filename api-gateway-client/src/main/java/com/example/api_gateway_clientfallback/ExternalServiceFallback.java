package com.example.api_gateway_clientfallback;

import com.example.api_gateway_client.client.ExternalServiceClient;
import org.springframework.stereotype.Component;

@Component
public class ExternalServiceFallback implements ExternalServiceClient {

    @Override
    public String getResponse() {
        return "Fallback: External Service is currently unavailable";
    }
}
