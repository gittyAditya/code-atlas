package com.aditya.systemdesign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RateLimiterServiceTest {

    private RateLimiterService rateLimiterService;

    @BeforeEach
    public void setup() {
        rateLimiterService = new RateLimiterService();
    }

    @Test
    public void testRateLimit_RequestWithinLimit_ReturnsTrue() {
        int customerId = 1;
        boolean result = rateLimiterService.rateLimit(customerId);

        assertTrue(result);
    }

    @Test
    public void testRateLimit_RequestExceedsLimit_ReturnsFalse() {
        int customerId = 2;

        for (int i = 0; i < 100; i++) {
            boolean result = rateLimiterService.rateLimit(customerId);
            assertTrue(result);
        }

        boolean exceededResult = rateLimiterService.rateLimit(customerId);
        assertFalse(exceededResult);
    }
}




