

# OBReadBalance1DataBalanceInner

Set of elements used to define the balance details.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**creditDebitIndicator** | **OBCreditDebitCode2** |  |  |
|**type** | **OBBalanceType1Code** |  |  |
|**dateTime** | **OffsetDateTime** | Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  |
|**amount** | [**OBReadBalance1DataBalanceInnerAmount**](OBReadBalance1DataBalanceInnerAmount.md) |  |  |
|**creditLine** | [**List&lt;OBReadBalance1DataBalanceInnerCreditLineInner&gt;**](OBReadBalance1DataBalanceInnerCreditLineInner.md) |  |  [optional] |



