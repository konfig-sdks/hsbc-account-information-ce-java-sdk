/*
 * Account Information API
 * In this document, you'll find the steps your organization needs to take to use our API services. Included in this guide are details of request and response messages used to support your organization’s integration. The intended audience for this document are **Technical Architects**, **Development Engineers**, **Test Engineers**, and **Operation & Maintenance Engineers** involved in development and support of your organization’s integration. Setting up our API Services is best completed with the assistance of your organization’s IT team, or someone with experience and knowledge of application programming interfaces. This should include experience with **JSON payloads**, **security** and **public key infrastructure (PKI)**. This Document describes the following request and response structure of HSBCnet - Account Information API. For detail implementation guidelines, please refer to the respective section from [develop.hsbc.com](https://develop.hsbc.com/ob-api-documentation/account-information-uk-personal-v319) 
 *
 * The version of the OpenAPI document: 3.1.11
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.OBReadParty3;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PartiesApi
 */
@Disabled
public class PartiesApiTest {

    private static PartiesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PartiesApi(apiClient);
    }

    /**
     * Get Account Parties
     *
     * This endpoint enables to get Parties by AccountId
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByAccountIdTest() throws ApiException {
        String accountId = null;
        String xFapiAuthDate = null;
        String xFapiCustomerIpAddress = null;
        String xFapiInteractionId = null;
        String xCustomerUserAgent = null;
        OBReadParty3 response = api.getByAccountId(accountId)
                .xFapiAuthDate(xFapiAuthDate)
                .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
                .xFapiInteractionId(xFapiInteractionId)
                .xCustomerUserAgent(xCustomerUserAgent)
                .execute();
        // TODO: test validations
    }

}