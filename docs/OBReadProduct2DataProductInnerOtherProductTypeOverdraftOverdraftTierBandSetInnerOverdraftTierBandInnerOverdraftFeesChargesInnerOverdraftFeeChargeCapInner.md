

# OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner

Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) |  |  |
|**minMaxType** | **OBMinMaxType1Code** |  |  |
|**feeCapOccurrence** | **Integer** | Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it�s part of a government scheme, or whether the rate may vary dependent on the applicant�s circumstances. |  [optional] |
|**feeCapAmount** | **String** | Cap amount charged for a fee/charge |  [optional] |
|**cappingPeriod** | **OBPeriod1Code** |  |  [optional] |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**otherFeeType** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner.md) |  |  [optional] |



## Enum: List&lt;FeeTypeEnum&gt;

| Name | Value |
|---- | -----|
| FBAO | &quot;FBAO&quot; |
| FBAR | &quot;FBAR&quot; |
| FBEB | &quot;FBEB&quot; |
| FBIT | &quot;FBIT&quot; |
| FBOR | &quot;FBOR&quot; |
| FBOS | &quot;FBOS&quot; |
| FBSC | &quot;FBSC&quot; |
| FBTO | &quot;FBTO&quot; |
| FBUB | &quot;FBUB&quot; |
| FBUT | &quot;FBUT&quot; |
| FTOT | &quot;FTOT&quot; |
| FTUT | &quot;FTUT&quot; |



