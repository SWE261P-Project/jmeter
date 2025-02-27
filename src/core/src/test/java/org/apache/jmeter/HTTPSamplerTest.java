package org.apache.jmeter;

import org.apache.jmeter.protocol.http.sampler.HTTPSampler;
import org.apache.jmeter.samplers.SampleResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HTTPSamplerTest {

    @Test
    public void testHttpGetRequest() {
        HTTPSampler sampler = new HTTPSampler();
        sampler.setMethod("GET");
        sampler.setPath("/test-get");
        SampleResult result = sampler.sample();
        assertEquals(200, result.getResponseCode(), "GET request should return 200");
    }

    @Test
    public void testHttpPostRequestWithPayload() {
        HTTPSampler sampler = new HTTPSampler();
        sampler.setMethod("POST");
        sampler.setPath("/test-post");
        sampler.addArgument("param", "value");
        SampleResult result = sampler.sample();
        assertEquals(200, result.getResponseCode(), "POST request should return 200");
    }

    @Test
    public void testHttpRequestNotFound() {
        HTTPSampler sampler = new HTTPSampler();
        sampler.setMethod("GET");
        sampler.setPath("/invalid-endpoint");
        SampleResult result = sampler.sample();
        assertEquals(404, result.getResponseCode(), "GET request to an invalid endpoint should return 404");
    }
}

