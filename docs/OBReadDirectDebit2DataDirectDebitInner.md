

# OBReadDirectDebit2DataDirectDebitInner

Account to or from which a cash entry is made.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**directDebitId** | **String** | A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner. |  [optional] |
|**mandateIdentification** | **String** | Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference. |  |
|**directDebitStatusCode** | **OBExternalDirectDebitStatus1Code** |  |  [optional] |
|**name** | **String** | Name of Service User. |  |
|**previousPaymentDateTime** | **OffsetDateTime** | Date of most recent direct debit collection.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Regularity with which direct debit instructions are to be created and processed. |  [optional] |
|**previousPaymentAmount** | [**OBActiveOrHistoricCurrencyAndAmount0**](OBActiveOrHistoricCurrencyAndAmount0.md) |  |  [optional] |



## Enum: FrequencyEnum

| Name | Value |
|---- | -----|
| ANNUAL | &quot;UK.OBIE.Annual&quot; |
| DAILY | &quot;UK.OBIE.Daily&quot; |
| FORTNIGHTLY | &quot;UK.OBIE.Fortnightly&quot; |
| HALFYEARLY | &quot;UK.OBIE.HalfYearly&quot; |
| MONTHLY | &quot;UK.OBIE.Monthly&quot; |
| NOTKNOWN | &quot;UK.OBIE.NotKnown&quot; |
| QUARTERLY | &quot;UK.OBIE.Quarterly&quot; |
| WEEKLY | &quot;UK.OBIE.Weekly&quot; |



