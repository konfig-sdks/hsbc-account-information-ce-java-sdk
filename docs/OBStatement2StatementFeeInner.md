

# OBStatement2StatementFeeInner

Set of elements used to provide details of a fee for the statement resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description that may be available for the statement fee. |  [optional] |
|**creditDebitIndicator** | **OBCreditDebitCode0** |  |  |
|**type** | **OBExternalStatementFeeType1Code** |  |  |
|**rate** | **Double** | Rate charged for Statement Fee (where it is charged in terms of a rate rather than an amount) |  [optional] |
|**rateType** | **OBExternalStatementFeeRateType1Code** |  |  [optional] |
|**frequency** | **OBExternalStatementFeeFrequency1Code** |  |  [optional] |
|**amount** | [**OBActiveOrHistoricCurrencyAndAmount6**](OBActiveOrHistoricCurrencyAndAmount6.md) |  |  |



