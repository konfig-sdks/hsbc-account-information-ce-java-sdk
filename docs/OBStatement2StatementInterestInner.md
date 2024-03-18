

# OBStatement2StatementInterestInner

Set of elements used to provide details of a generic interest amount related to the statement resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description that may be available for the statement interest. |  [optional] |
|**creditDebitIndicator** | **OBCreditDebitCode0** |  |  |
|**type** | **OBExternalStatementInterestType1Code** |  |  |
|**rate** | **Double** | field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary. |  [optional] |
|**rateType** | **OBExternalStatementInterestRateType1Code** |  |  [optional] |
|**frequency** | **OBExternalStatementInterestFrequency1Code** |  |  [optional] |
|**amount** | [**OBActiveOrHistoricCurrencyAndAmount7**](OBActiveOrHistoricCurrencyAndAmount7.md) |  |  |



