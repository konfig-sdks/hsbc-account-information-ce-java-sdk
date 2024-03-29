

# TierBandPropertyInner

Tier Band Details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a BCA. |  [optional] |
|**tierValueMinimum** | **String** | Minimum deposit value for which the credit interest tier applies. |  |
|**tierValueMaximum** | **String** | Maximum deposit value for which the credit interest tier applies. |  [optional] |
|**calculationFrequency** | [**CalculationFrequencyEnum**](#CalculationFrequencyEnum) | How often is credit interest calculated for the account. |  [optional] |
|**applicationFrequency** | [**ApplicationFrequencyEnum**](#ApplicationFrequencyEnum) | How often is interest applied to the BCA for this tier/band i.e. how often the financial institution pays accumulated interest to the customer&#39;s BCA. |  |
|**depositInterestAppliedCoverage** | [**DepositInterestAppliedCoverageEnum**](#DepositInterestAppliedCoverageEnum) | Amount on which Interest applied. |  [optional] |
|**fixedVariableInterestRateType** | [**FixedVariableInterestRateTypeEnum**](#FixedVariableInterestRateTypeEnum) | Type of interest rate, Fixed or Variable |  |
|**AER** | **String** | The annual equivalent rate (AER) is interest that is calculated under the assumption that any interest paid is combined with the original balance and the next interest payment will be based on the slightly higher account balance. Overall, this means that interest can be compounded several times in a year depending on the number of times that interest payments are made.   Read more: Annual Equivalent Rate (AER) http://www.investopedia.com/terms/a/aer.asp#ixzz4gfR7IO1A |  |
|**bankInterestRateType** | [**BankInterestRateTypeEnum**](#BankInterestRateTypeEnum) | Interest rate types, other than AER, which financial institutions may use to describe the annual interest rate payable to the BCA. |  [optional] |
|**bankInterestRate** | **String** | Bank Interest for the BCA product |  [optional] |
|**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band details |  [optional] |
|**otherBankInterestType** | [**OtherBankInterestTypeProperty**](OtherBankInterestTypeProperty.md) |  |  [optional] |
|**otherApplicationFrequency** | [**OtherApplicationFrequencyProperty**](OtherApplicationFrequencyProperty.md) |  |  [optional] |
|**otherCalculationFrequency** | [**OtherCalculationFrequencyProperty**](OtherCalculationFrequencyProperty.md) |  |  [optional] |



## Enum: CalculationFrequencyEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;Daily&quot; |
| HALFYEARLY | &quot;HalfYearly&quot; |
| MONTHLY | &quot;Monthly&quot; |
| OTHER | &quot;Other&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| PERSTATEMENTDATE | &quot;PerStatementDate&quot; |
| WEEKLY | &quot;Weekly&quot; |
| YEARLY | &quot;Yearly&quot; |



## Enum: ApplicationFrequencyEnum

| Name | Value |
|---- | -----|
| DAILY | &quot;Daily&quot; |
| HALFYEARLY | &quot;HalfYearly&quot; |
| MONTHLY | &quot;Monthly&quot; |
| OTHER | &quot;Other&quot; |
| QUARTERLY | &quot;Quarterly&quot; |
| PERSTATEMENTDATE | &quot;PerStatementDate&quot; |
| WEEKLY | &quot;Weekly&quot; |
| YEARLY | &quot;Yearly&quot; |



## Enum: DepositInterestAppliedCoverageEnum

| Name | Value |
|---- | -----|
| BANDED | &quot;Banded&quot; |
| TIERED | &quot;Tiered&quot; |
| WHOLE | &quot;Whole&quot; |



## Enum: FixedVariableInterestRateTypeEnum

| Name | Value |
|---- | -----|
| FIXED | &quot;Fixed&quot; |
| VARIABLE | &quot;Variable&quot; |



## Enum: BankInterestRateTypeEnum

| Name | Value |
|---- | -----|
| GROSS | &quot;Gross&quot; |
| OTHER | &quot;Other&quot; |



