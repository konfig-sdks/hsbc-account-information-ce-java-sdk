

# OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner

Tier Band Details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a SME Loan. |  [optional] |
|**tierValueMinimum** | **String** | Minimum loan value for which the loan interest tier applies. |  |
|**tierValueMaximum** | **String** | Maximum loan value for which the loan interest tier applies. |  [optional] |
|**tierValueMinTerm** | **Integer** | Minimum loan term for which the loan interest tier applies. |  |
|**minTermPeriod** | [**MinTermPeriodEnum**](#MinTermPeriodEnum) | The unit of period (days, weeks, months etc.) of the Minimum Term |  |
|**tierValueMaxTerm** | **Integer** | Maximum loan term for which the loan interest tier applies. |  [optional] |
|**maxTermPeriod** | [**MaxTermPeriodEnum**](#MaxTermPeriodEnum) | The unit of period (days, weeks, months etc.) of the Maximum Term |  [optional] |
|**fixedVariableInterestRateType** | **OBInterestFixedVariableType1Code** |  |  |
|**repAPR** | **String** | The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.  For SME Loan, this APR is the representative APR which includes any account fees. |  |
|**loanProviderInterestRateType** | [**LoanProviderInterestRateTypeEnum**](#LoanProviderInterestRateTypeEnum) | Interest rate types, other than APR, which financial institutions may use to describe the annual interest rate payable for the SME Loan. |  [optional] |
|**loanProviderInterestRate** | **String** | Loan provider Interest for the SME Loan product |  [optional] |
|**notes** | **List&lt;String&gt;** |  |  [optional] |
|**otherLoanProviderInterestRateType** | [**OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType**](OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType.md) |  |  [optional] |
|**loanInterestFeesCharges** | [**List&lt;OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner&gt;**](OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.md) |  |  [optional] |



## Enum: MinTermPeriodEnum

| Name | Value |
|---- | -----|
| PACT | &quot;PACT&quot; |
| PDAY | &quot;PDAY&quot; |
| PHYR | &quot;PHYR&quot; |
| PMTH | &quot;PMTH&quot; |
| PQTR | &quot;PQTR&quot; |
| PWEK | &quot;PWEK&quot; |
| PYER | &quot;PYER&quot; |



## Enum: MaxTermPeriodEnum

| Name | Value |
|---- | -----|
| PACT | &quot;PACT&quot; |
| PDAY | &quot;PDAY&quot; |
| PHYR | &quot;PHYR&quot; |
| PMTH | &quot;PMTH&quot; |
| PQTR | &quot;PQTR&quot; |
| PWEK | &quot;PWEK&quot; |
| PYER | &quot;PYER&quot; |



## Enum: LoanProviderInterestRateTypeEnum

| Name | Value |
|---- | -----|
| INBB | &quot;INBB&quot; |
| INFR | &quot;INFR&quot; |
| INGR | &quot;INGR&quot; |
| INLR | &quot;INLR&quot; |
| INNE | &quot;INNE&quot; |
| INOT | &quot;INOT&quot; |



