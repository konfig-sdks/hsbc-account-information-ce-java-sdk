

# OBReadConsent1Data


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) |  |  |
|**expirationDateTime** | **OffsetDateTime** | Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**transactionFromDateTime** | **String** | Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**transactionToDateTime** | **OffsetDateTime** | Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |



## Enum: List&lt;PermissionsEnum&gt;

| Name | Value |
|---- | -----|
| READACCOUNTSBASIC | &quot;ReadAccountsBasic&quot; |
| READACCOUNTSDETAIL | &quot;ReadAccountsDetail&quot; |
| READBALANCES | &quot;ReadBalances&quot; |
| READDIRECTDEBITS | &quot;ReadDirectDebits&quot; |
| READPAN | &quot;ReadPAN&quot; |
| READSCHEDULEDPAYMENTSBASIC | &quot;ReadScheduledPaymentsBasic&quot; |
| READSCHEDULEDPAYMENTSDETAIL | &quot;ReadScheduledPaymentsDetail&quot; |
| READSTANDINGORDERSBASIC | &quot;ReadStandingOrdersBasic&quot; |
| READSTANDINGORDERSDETAIL | &quot;ReadStandingOrdersDetail&quot; |
| READTRANSACTIONSBASIC | &quot;ReadTransactionsBasic&quot; |
| READTRANSACTIONSCREDITS | &quot;ReadTransactionsCredits&quot; |
| READTRANSACTIONSDEBITS | &quot;ReadTransactionsDebits&quot; |
| READTRANSACTIONSDETAIL | &quot;ReadTransactionsDetail&quot; |
| READBENEFICIARIESBASIC | &quot;ReadBeneficiariesBasic&quot; |
| READBENEFICIARIESDETAIL | &quot;ReadBeneficiariesDetail&quot; |
| READPRODUCTS | &quot;ReadProducts&quot; |
| READPARTY | &quot;ReadParty&quot; |



