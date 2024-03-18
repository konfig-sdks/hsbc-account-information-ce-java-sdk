

# TierBandSetPropertyInner1

The group of tiers or bands for which credit interest can be applied.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how credit interest is charged. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the PCA balance |  |
|**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) | Methods of calculating interest |  [optional] |
|**destination** | [**DestinationEnum**](#DestinationEnum) | Describes whether accrued interest is payable only to the PCA or to another bank account |  [optional] |
|**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the Tier Band Set details |  [optional] |
|**tierBand** | [**List&lt;TierBandPropertyInner1&gt;**](TierBandPropertyInner1.md) | Tier Band Details |  |



## Enum: TierBandMethodEnum

| Name | Value |
|---- | -----|
| TIERED | &quot;Tiered&quot; |
| WHOLE | &quot;Whole&quot; |



## Enum: CalculationMethodEnum

| Name | Value |
|---- | -----|
| COMPOUND | &quot;Compound&quot; |
| SIMPLEINTEREST | &quot;SimpleInterest&quot; |



## Enum: DestinationEnum

| Name | Value |
|---- | -----|
| PAYAWAY | &quot;PayAway&quot; |
| SELFCREDIT | &quot;SelfCredit&quot; |



