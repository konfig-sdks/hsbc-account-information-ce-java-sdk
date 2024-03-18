# AccountAccessConsentsApi

All URIs are relative to *https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConsent**](AccountAccessConsentsApi.md#createConsent) | **POST** /account-access-consents | Create Account Access Consents |
| [**deleteConsent**](AccountAccessConsentsApi.md#deleteConsent) | **DELETE** /account-access-consents/{ConsentId} | Delete Account Access Consents |
| [**getByConsentId**](AccountAccessConsentsApi.md#getByConsentId) | **GET** /account-access-consents/{ConsentId} | Get Account Access Consents |


<a name="createConsent"></a>
# **createConsent**
> OBReadConsentResponse1 createConsent(obReadConsent1).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Create Account Access Consents

This endpoint enables TPP to create account access consent. Supports all product types -Personal Current Account, Savings Account, Credit Cards, Foreign Currency Accounts, Global Money, Working Capital

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HsbcAccountInformationCe;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessConsentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
    OBReadConsent1Data data = new OBReadConsent1Data();
    Object risk = null; // The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
    String xFapiAuthDate = "Tue, 18 Apr 2023 14:42:25 UTC"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "12.201.45.125"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "20177a90-5e29-43ba-bea0-cc6c344a9d32"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadConsentResponse1 result = client
              .accountAccessConsents
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getRisk());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadConsentResponse1> response = client
              .accountAccessConsents
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **obReadConsent1** | [**OBReadConsent1**](OBReadConsent1.md)|  | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadConsentResponse1**](OBReadConsentResponse1.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json, application/json; charset=utf-8, application/jose+jwe
 - **Accept**: application/json, application/json; charset=utf-8, application/jose+jwe

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **415** | Unsupported Media Type |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="deleteConsent"></a>
# **deleteConsent**
> deleteConsent(consentId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Delete Account Access Consents

This endpoint enables TPP to delete account access consent

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HsbcAccountInformationCe;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessConsentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
    String consentId = "7404e99b-1a4d-4b08-b441-c327661527f0"; // ConsentId
    String xFapiAuthDate = "Tue, 18 Apr 2023 14:42:25 UTC"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "12.201.45.125"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "20177a90-5e29-43ba-bea0-cc6c344a9d32"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"; // Indicates the user-agent that the PSU is using.
    try {
      client
              .accountAccessConsents
              .deleteConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#deleteConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .accountAccessConsents
              .deleteConsent(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#deleteConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**| ConsentId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth), [TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, application/jose+jwe

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

<a name="getByConsentId"></a>
# **getByConsentId**
> OBReadConsentResponse1 getByConsentId(consentId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).execute();

Get Account Access Consents

This endpoint enables TPP to get account access consent by ConsentId. Supports all product types -Personal Current Account, Savings Account, Credit Cards, Foreign Currency Accounts, Global Money Working Capital

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HsbcAccountInformationCe;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessConsentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
    String consentId = "7404e99b-1a4d-4b08-b441-c327661527f0"; // ConsentId
    String xFapiAuthDate = "Tue, 18 Apr 2023 14:42:25 UTC"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "12.201.45.125"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "20177a90-5e29-43ba-bea0-cc6c344a9d32"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadConsentResponse1 result = client
              .accountAccessConsents
              .getByConsentId(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getRisk());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#getByConsentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadConsentResponse1> response = client
              .accountAccessConsents
              .getByConsentId(consentId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#getByConsentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **consentId** | **String**| ConsentId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |

### Return type

[**OBReadConsentResponse1**](OBReadConsentResponse1.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/json; charset=utf-8, application/jose+jwe

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **401** | Unauthorized |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **405** | Method Not Allowed |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **406** | Not Acceptable |  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |
| **429** | Too Many Requests |  * Retry-After - Number in seconds to wait <br>  * x-fapi-interaction-id - An RFC4122 UID used as a correlation id. <br>  |

