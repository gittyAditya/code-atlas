/* Imagine we are building an application that is used by many customers.
We want to avoid one customer being able to overload the system by sending too many requests,
 so we enforce a per-customer rate limit. The rate limit is defined as:

"Each customer can make X requests per Y seconds"

// Perform rate limiting logic for provided customer ID. Return true if the
// request is allowed, and false if it is not.
boolean rateLimit(int customerId)

public class RateLimiterService {
  //The code should be thread-safe
  public boolean rateLimiter(int customerId){//will return true if request will be served || false if rate limiting has to be done.
  }
}
 */

package com.aditya.systemdesign;

import java.util.HashMap;
import java.util.Map;

public class RateLimiterService {
    private final Map<Integer, CustomerRequestData> customerDataMap;

    public RateLimiterService() {
        customerDataMap = new HashMap<>();
    }

    public boolean rateLimit(int customerId) {
        synchronized (customerDataMap) {
            CustomerRequestData customerData = customerDataMap.get(customerId);
            if (customerData == null) {
                // Default number of requests allowed per customer
                int DEFAULT_REQUEST_LIMIT = 100;
                // Default time window in seconds
                int DEFAULT_TIME_WINDOW = 60;
                customerData = new CustomerRequestData(DEFAULT_REQUEST_LIMIT, DEFAULT_TIME_WINDOW);
                customerDataMap.put(customerId, customerData);
            }
            return customerData.allowRequest();
        }
    }

    private static class CustomerRequestData {
        private final int requestLimit;
        private final int timeWindow;
        private int requestCount;
        private long lastRequestTime;

        public CustomerRequestData(int requestLimit, int timeWindow) {
            this.requestLimit = requestLimit;
            this.timeWindow = timeWindow;
            this.requestCount = 0;
            this.lastRequestTime = System.currentTimeMillis();
        }

        public boolean allowRequest() {
            long currentTime = System.currentTimeMillis();
            if (currentTime - lastRequestTime > timeWindow * 1000L) {
                // Reset request count if the time window has passed
                requestCount = 0;
            }

            if (requestCount < requestLimit) {
                requestCount++;
                lastRequestTime = currentTime;
                return true; // Request is allowed
            }

            return false; // Request is not allowed
        }
    }
}

