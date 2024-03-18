

# FeeChargeCapPropertyInner

Details about any caps (maximum charges) that apply to a particular or group of fee/charge

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped |  |
|**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Min Max type |  |
|**feeCapOccurrence** | **Float** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional] |
|**feeCapAmount** | **String** | Cap amount charged for a fee/charge (where it is charged in terms of an amount rather than a rate) |  [optional] |
|**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional] |
|**notes** | **List&lt;String&gt;** | Free text for adding  extra details for fee charge cap |  [optional] |
|**otherFeeType** | [**List&lt;OtherFeeTypeProperty2Inner&gt;**](OtherFeeTypeProperty2Inner.md) | Other fee type code which is not available in the standard code set |  [optional] |



## Enum: List&lt;FeeTypeEnum&gt;

| Name | Value |
|---- | -----|
| OTHER | &quot;Other&quot; |
| SERVICECACCOUNTFEE | &quot;ServiceCAccountFee&quot; |
| SERVICECACCOUNTFEEMONTHLY | &quot;ServiceCAccountFeeMonthly&quot; |
| SERVICECACCOUNTFEEQUARTERLY | &quot;ServiceCAccountFeeQuarterly&quot; |
| SERVICECFIXEDTARIFF | &quot;ServiceCFixedTariff&quot; |
| SERVICECBUSIDEPACCBREAKAGE | &quot;ServiceCBusiDepAccBreakage&quot; |
| SERVICECMINIMUMMONTHLYFEE | &quot;ServiceCMinimumMonthlyFee&quot; |
| SERVICECOTHER | &quot;ServiceCOther&quot; |



## Enum: MinMaxTypeEnum

| Name | Value |
|---- | -----|
| MINIMUM | &quot;Minimum&quot; |
| MAXIMUM | &quot;Maximum&quot; |



## Enum: CappingPeriodEnum

| Name | Value |
|---- | -----|
| DAY | &quot;Day&quot; |
| HALF_YEAR | &quot;Half Year&quot; |
| MONTH | &quot;Month&quot; |
| QUARTER | &quot;Quarter&quot; |
| WEEK | &quot;Week&quot; |
| YEAR | &quot;Year&quot; |



