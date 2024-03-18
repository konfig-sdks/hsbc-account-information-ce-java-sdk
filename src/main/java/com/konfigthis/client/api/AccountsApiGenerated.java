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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.OBReadAccount6;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AccountsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AccountsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AccountsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getAllCall(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xFapiAuthDate != null) {
            localVarHeaderParams.put("x-fapi-auth-date", localVarApiClient.parameterToString(xFapiAuthDate));
        }

        if (xFapiCustomerIpAddress != null) {
            localVarHeaderParams.put("x-fapi-customer-ip-address", localVarApiClient.parameterToString(xFapiCustomerIpAddress));
        }

        if (xFapiInteractionId != null) {
            localVarHeaderParams.put("x-fapi-interaction-id", localVarApiClient.parameterToString(xFapiInteractionId));
        }

        if (xCustomerUserAgent != null) {
            localVarHeaderParams.put("x-customer-user-agent", localVarApiClient.parameterToString(xCustomerUserAgent));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/json; charset=utf-8",
            "application/jose+jwe"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth", "PSUOAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        return getAllCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);

    }


    private ApiResponse<OBReadAccount6> getAllWithHttpInfo(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, null);
        Type localVarReturnType = new TypeToken<OBReadAccount6>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback<OBReadAccount6> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        Type localVarReturnType = new TypeToken<OBReadAccount6>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {
        private String xFapiAuthDate;
        private String xFapiCustomerIpAddress;
        private String xFapiInteractionId;
        private String xCustomerUserAgent;

        private GetAllRequestBuilder() {
        }

        /**
         * Set xFapiAuthDate
         * @param xFapiAuthDate The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiAuthDate(String xFapiAuthDate) {
            this.xFapiAuthDate = xFapiAuthDate;
            return this;
        }
        
        /**
         * Set xFapiCustomerIpAddress
         * @param xFapiCustomerIpAddress The PSU&#39;s IP address if the PSU is currently logged in with the TPP. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiCustomerIpAddress(String xFapiCustomerIpAddress) {
            this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
            return this;
        }
        
        /**
         * Set xFapiInteractionId
         * @param xFapiInteractionId An RFC4122 UID used as a correlation id. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xFapiInteractionId(String xFapiInteractionId) {
            this.xFapiInteractionId = xFapiInteractionId;
            return this;
        }
        
        /**
         * Set xCustomerUserAgent
         * @param xCustomerUserAgent Indicates the user-agent that the PSU is using. (optional)
         * @return GetAllRequestBuilder
         */
        public GetAllRequestBuilder xCustomerUserAgent(String xCustomerUserAgent) {
            this.xCustomerUserAgent = xCustomerUserAgent;
            return this;
        }
        
        /**
         * Build call for getAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllCall(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }


        /**
         * Execute getAll request
         * @return OBReadAccount6
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public OBReadAccount6 execute() throws ApiException {
            ApiResponse<OBReadAccount6> localVarResp = getAllWithHttpInfo(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;OBReadAccount6&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public ApiResponse<OBReadAccount6> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OBReadAccount6> _callback) throws ApiException {
            return getAllAsync(xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }
    }

    /**
     * Get Accounts
     * This endpoint enables to get Accounts. Supports all product types -Personal Current Account, Savings Account, Credit Cards, Foreign Currency Accounts, Global Money, Working Capital
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
    private okhttp3.Call getBalancesByAccountIdCall(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/accounts/{AccountId}"
            .replace("{" + "AccountId" + "}", localVarApiClient.escapeString(accountId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xFapiAuthDate != null) {
            localVarHeaderParams.put("x-fapi-auth-date", localVarApiClient.parameterToString(xFapiAuthDate));
        }

        if (xFapiCustomerIpAddress != null) {
            localVarHeaderParams.put("x-fapi-customer-ip-address", localVarApiClient.parameterToString(xFapiCustomerIpAddress));
        }

        if (xFapiInteractionId != null) {
            localVarHeaderParams.put("x-fapi-interaction-id", localVarApiClient.parameterToString(xFapiInteractionId));
        }

        if (xCustomerUserAgent != null) {
            localVarHeaderParams.put("x-customer-user-agent", localVarApiClient.parameterToString(xCustomerUserAgent));
        }

        final String[] localVarAccepts = {
            "application/json",
            "application/json; charset=utf-8",
            "application/jose+jwe"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "BearerAuth", "PSUOAuth2Security" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getBalancesByAccountIdValidateBeforeCall(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling getBalancesByAccountId(Async)");
        }

        return getBalancesByAccountIdCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);

    }


    private ApiResponse<OBReadAccount6> getBalancesByAccountIdWithHttpInfo(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent) throws ApiException {
        okhttp3.Call localVarCall = getBalancesByAccountIdValidateBeforeCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, null);
        Type localVarReturnType = new TypeToken<OBReadAccount6>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getBalancesByAccountIdAsync(String accountId, String xFapiAuthDate, String xFapiCustomerIpAddress, String xFapiInteractionId, String xCustomerUserAgent, final ApiCallback<OBReadAccount6> _callback) throws ApiException {

        okhttp3.Call localVarCall = getBalancesByAccountIdValidateBeforeCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        Type localVarReturnType = new TypeToken<OBReadAccount6>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetBalancesByAccountIdRequestBuilder {
        private final String accountId;
        private String xFapiAuthDate;
        private String xFapiCustomerIpAddress;
        private String xFapiInteractionId;
        private String xCustomerUserAgent;

        private GetBalancesByAccountIdRequestBuilder(String accountId) {
            this.accountId = accountId;
        }

        /**
         * Set xFapiAuthDate
         * @param xFapiAuthDate The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC (optional)
         * @return GetBalancesByAccountIdRequestBuilder
         */
        public GetBalancesByAccountIdRequestBuilder xFapiAuthDate(String xFapiAuthDate) {
            this.xFapiAuthDate = xFapiAuthDate;
            return this;
        }
        
        /**
         * Set xFapiCustomerIpAddress
         * @param xFapiCustomerIpAddress The PSU&#39;s IP address if the PSU is currently logged in with the TPP. (optional)
         * @return GetBalancesByAccountIdRequestBuilder
         */
        public GetBalancesByAccountIdRequestBuilder xFapiCustomerIpAddress(String xFapiCustomerIpAddress) {
            this.xFapiCustomerIpAddress = xFapiCustomerIpAddress;
            return this;
        }
        
        /**
         * Set xFapiInteractionId
         * @param xFapiInteractionId An RFC4122 UID used as a correlation id. (optional)
         * @return GetBalancesByAccountIdRequestBuilder
         */
        public GetBalancesByAccountIdRequestBuilder xFapiInteractionId(String xFapiInteractionId) {
            this.xFapiInteractionId = xFapiInteractionId;
            return this;
        }
        
        /**
         * Set xCustomerUserAgent
         * @param xCustomerUserAgent Indicates the user-agent that the PSU is using. (optional)
         * @return GetBalancesByAccountIdRequestBuilder
         */
        public GetBalancesByAccountIdRequestBuilder xCustomerUserAgent(String xCustomerUserAgent) {
            this.xCustomerUserAgent = xCustomerUserAgent;
            return this;
        }
        
        /**
         * Build call for getBalancesByAccountId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getBalancesByAccountIdCall(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }


        /**
         * Execute getBalancesByAccountId request
         * @return OBReadAccount6
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public OBReadAccount6 execute() throws ApiException {
            ApiResponse<OBReadAccount6> localVarResp = getBalancesByAccountIdWithHttpInfo(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getBalancesByAccountId request with HTTP info returned
         * @return ApiResponse&lt;OBReadAccount6&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public ApiResponse<OBReadAccount6> executeWithHttpInfo() throws ApiException {
            return getBalancesByAccountIdWithHttpInfo(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent);
        }

        /**
         * Execute getBalancesByAccountId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<OBReadAccount6> _callback) throws ApiException {
            return getBalancesByAccountIdAsync(accountId, xFapiAuthDate, xFapiCustomerIpAddress, xFapiInteractionId, xCustomerUserAgent, _callback);
        }
    }

    /**
     * Get Accounts by AccountId
     * This endpoint enables to get Balances by AccountId. Supports all product types -Personal Current Account, Savings Account, Credit Cards, Foreign Currency Accounts, Global Money, Working Capital
     * @param accountId AccountId (required)
     * @return GetBalancesByAccountIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 405 </td><td> Method Not Allowed </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  </td></tr>
     </table>
     */
    public GetBalancesByAccountIdRequestBuilder getBalancesByAccountId(String accountId) throws IllegalArgumentException {
        if (accountId == null) throw new IllegalArgumentException("\"accountId\" is required but got null");
            

        return new GetBalancesByAccountIdRequestBuilder(accountId);
    }
}
