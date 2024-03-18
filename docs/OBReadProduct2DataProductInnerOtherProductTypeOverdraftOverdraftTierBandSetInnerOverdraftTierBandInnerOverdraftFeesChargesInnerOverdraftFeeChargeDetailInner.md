

# OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner

Details about the fees/charges

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | **OBOverdraftFeeType1Code** |  |  |
|**negotiableIndicator** | **Boolean** | Indicates whether fee and charges are negotiable |  [optional] |
|**overdraftControlIndicator** | **Boolean** | Indicates if the fee/charge is already covered by an &#39;Overdraft Control&#39; fee or not. |  [optional] |
|**incrementalBorrowingAmount** | **String** | Every additional tranche of an overdraft balance to which an overdraft fee is applied |  [optional] |
|**feeAmount** | **String** | Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional] |
|**feeRate** | **String** | Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount) |  [optional] |
|**feeRateType** | **OBInterestRateType1Code0** |  |  [optional] |
|**applicationFrequency** | **OBFeeFrequency1Code0** |  |  |
|**calculationFrequency** | **OBFeeFrequency1Code1** |  |  [optional] |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**overdraftFeeChargeCap** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner.md) |  |  [optional] |
|**otherFeeType** | [**OBOtherCodeType13**](OBOtherCodeType13.md) |  |  [optional] |
|**otherFeeRateType** | [**OBOtherCodeType14**](OBOtherCodeType14.md) |  |  [optional] |
|**otherApplicationFrequency** | [**OBOtherCodeType11**](OBOtherCodeType11.md) |  |  [optional] |
|**otherCalculationFrequency** | [**OBOtherCodeType12**](OBOtherCodeType12.md) |  |  [optional] |



