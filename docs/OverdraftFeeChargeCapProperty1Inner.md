

# OverdraftFeeChargeCapProperty1Inner

Details about any caps (maximum charges) that apply to a particular fee/charge

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped |  |
|**overdraftControlIndicator** | **Boolean** | Specifies for the overdraft control feature/benefit |  [optional] |
|**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution |  |
|**feeCapOccurrence** | **Float** | fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount |  [optional] |
|**feeCapAmount** | **String** | Cap amount charged for a fee/charge |  [optional] |
|**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional] |
|**notes** | **List&lt;String&gt;** | Notes related to Overdraft fee charge cap |  [optional] |
|**otherFeeType** | [**List&lt;OtherFeeTypeProperty4Inner1&gt;**](OtherFeeTypeProperty4Inner1.md) | Other fee type code which is not available in the standard code set |  [optional] |



## Enum: List&lt;FeeTypeEnum&gt;

| Name | Value |
|---- | -----|
| ARRANGEDOVERDRAFT | &quot;ArrangedOverdraft&quot; |
| EMERGENCYBORROWING | &quot;EmergencyBorrowing&quot; |
| BORROWINGITEM | &quot;BorrowingItem&quot; |
| OVERDRAFTRENEWAL | &quot;OverdraftRenewal&quot; |
| ANNUALREVIEW | &quot;AnnualReview&quot; |
| OVERDRAFTSETUP | &quot;OverdraftSetup&quot; |
| SURCHARGE | &quot;Surcharge&quot; |
| TEMPOVERDRAFT | &quot;TempOverdraft&quot; |
| UNAUTHORISEDBORROWING | &quot;UnauthorisedBorrowing&quot; |
| UNAUTHORISEDPAIDTRANS | &quot;UnauthorisedPaidTrans&quot; |
| OTHER | &quot;Other&quot; |
| UNAUTHORISEDUNPAIDTRANS | &quot;UnauthorisedUnpaidTrans&quot; |



## Enum: MinMaxTypeEnum

| Name | Value |
|---- | -----|
| MINIMUM | &quot;Minimum&quot; |
| MAXIMUM | &quot;Maximum&quot; |



## Enum: CappingPeriodEnum

| Name | Value |
|---- | -----|
| ACADEMICTERM | &quot;AcademicTerm&quot; |
| DAY | &quot;Day&quot; |
| HALF_YEAR | &quot;Half Year&quot; |
| MONTH | &quot;Month&quot; |
| QUARTER | &quot;Quarter&quot; |
| WEEK | &quot;Week&quot; |
| YEAR | &quot;Year&quot; |



