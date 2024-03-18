

# OverdraftFeeChargeCapPropertyInner

Details about any caps (maximum charges) that apply to a particular fee/charge. Capping can either be based on an amount (in gbp), an amount (in items) or a rate.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeType** | [**List&lt;FeeTypeEnum&gt;**](#List&lt;FeeTypeEnum&gt;) | Fee/charge type which is being capped |  |
|**minMaxType** | [**MinMaxTypeEnum**](#MinMaxTypeEnum) | Min Max type |  |
|**feeCapOccurrence** | **Float** | Indicates whether the advertised overdraft rate is guaranteed to be offered to a borrower by the bank e.g. if it’s part of a government scheme, or whether the rate may vary dependent on the applicant’s circumstances. |  [optional] |
|**feeCapAmount** | **String** | Cap amount charged for a fee/charge |  [optional] |
|**cappingPeriod** | [**CappingPeriodEnum**](#CappingPeriodEnum) | Period e.g. day, week, month etc. for which the fee/charge is capped |  [optional] |
|**notes** | **List&lt;String&gt;** | Notes related to Overdraft fee charge cap |  [optional] |
|**otherFeeType** | [**List&lt;OtherFeeTypePropertyInner&gt;**](OtherFeeTypePropertyInner.md) | Other fee type code which is not available in the standard code set |  [optional] |



## Enum: List&lt;FeeTypeEnum&gt;

| Name | Value |
|---- | -----|
| ARRANGEDOVERDRAFT | &quot;ArrangedOverdraft&quot; |
| ANNUALREVIEW | &quot;AnnualReview&quot; |
| EMERGENCYBORROWING | &quot;EmergencyBorrowing&quot; |
| BORROWINGITEM | &quot;BorrowingItem&quot; |
| OVERDRAFTRENEWAL | &quot;OverdraftRenewal&quot; |
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
| DAY | &quot;Day&quot; |
| HALF_YEAR | &quot;Half Year&quot; |
| MONTH | &quot;Month&quot; |
| QUARTER | &quot;Quarter&quot; |
| WEEK | &quot;Week&quot; |
| YEAR | &quot;Year&quot; |



