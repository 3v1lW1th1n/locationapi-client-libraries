/*
 * Location API
 * Geolocation, Geocoding and Maps
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.unwired.client.api;

import unwired.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BalanceApi
 */
@Ignore
public class BalanceApiTest {

    private final BalanceApi api = new BalanceApi();

    
    /**
     * balance
     *
     * The Balance API provides a count of request credits left in the user&#39;s account for the day. Balance is reset at midnight UTC everyday (00:00 UTC).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void balanceTest() throws ApiException {
        Object response = api.balance();

        // TODO: test validations
    }
    
}
