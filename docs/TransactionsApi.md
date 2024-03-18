# TransactionsApi

All URIs are relative to *https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByAccountId**](TransactionsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/transactions | Get Account Transactions |


<a name="getByAccountId"></a>
# **getByAccountId**
> OBReadTransaction6 getByAccountId(accountId).xFapiAuthDate(xFapiAuthDate).xFapiCustomerIpAddress(xFapiCustomerIpAddress).xFapiInteractionId(xFapiInteractionId).xCustomerUserAgent(xCustomerUserAgent).fromBookingDateTime(fromBookingDateTime).toBookingDateTime(toBookingDateTime).execute();

Get Account Transactions

This endpoint enables to get account Transactions by AccountId. Supports all product types -Personal Current Account, Savings Account, Credit Cards, Foreign Currency Accounts, Global Money, Working Capital

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HsbcAccountInformationCe;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    // Configure OAuth2 access token for authorization: PSUOAuth2Security
    configuration.accessToken = "YOUR ACCESS TOKEN";
    HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
    String accountId = "ThR-RpLMV5lZzDu8vrfEFg"; // AccountId
    String xFapiAuthDate = "Tue, 18 Apr 2023 14:42:25 UTC"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "12.201.45.125"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "20177a90-5e29-43ba-bea0-cc6c344a9d32"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"; // Indicates the user-agent that the PSU is using.
    OffsetDateTime fromBookingDateTime = OffsetDateTime.parse("2023-01-04T13:21:07+00:00"); // The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    OffsetDateTime toBookingDateTime = OffsetDateTime.parse("2023-02-04T13:21:07+00:00"); // The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component.
    try {
      OBReadTransaction6 result = client
              .transactions
              .getByAccountId(accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .fromBookingDateTime(fromBookingDateTime)
              .toBookingDateTime(toBookingDateTime)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getByAccountId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadTransaction6> response = client
              .transactions
              .getByAccountId(accountId)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .fromBookingDateTime(fromBookingDateTime)
              .toBookingDateTime(toBookingDateTime)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#getByAccountId");
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
| **accountId** | **String**| AccountId | |
| **xFapiAuthDate** | **String**| The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC | [optional] |
| **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional] |
| **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional] |
| **xCustomerUserAgent** | **String**| Indicates the user-agent that the PSU is using. | [optional] |
| **fromBookingDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter transactions FROM NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |
| **toBookingDateTime** | **OffsetDateTime**| The UTC ISO 8601 Date Time to filter transactions TO NB Time component is optional - set to 00:00:00 for just Date. If the Date Time contains a timezone, the ASPSP must ignore the timezone component. | [optional] |

### Return type

[**OBReadTransaction6**](OBReadTransaction6.md)

### Authorization

[BearerAuth](../README.md#BearerAuth), [PSUOAuth2Security](../README.md#PSUOAuth2Security)

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

