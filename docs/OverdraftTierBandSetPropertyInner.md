

# OverdraftTierBandSetPropertyInner

Tier band set details

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tierBandMethod** | [**TierBandMethodEnum**](#TierBandMethodEnum) | The methodology of how overdraft is charged. It can be: &#39;Whole&#39;  Where the same charge/rate is applied to the entirety of the overdraft balance (where charges are applicable).  &#39;Tiered&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount tiers defined by the lending financial organisation &#39;Banded&#39; Where different charges/rates are applied dependent on overdraft maximum and minimum balance amount bands defined by a government organisation. |  |
|**overdraftType** | [**OverdraftTypeEnum**](#OverdraftTypeEnum) | An overdraft can either be &#39;committed&#39; which means that the facility cannot be withdrawn without reasonable notification before it&#39;s agreed end date, or &#39;on demand&#39; which means that the financial institution can demand repayment at any point in time. |  [optional] |
|**identification** | **String** | Unique and unambiguous identification of a  Tier Band for a overdraft product. |  [optional] |
|**authorisedIndicator** | **Boolean** | Indicates if the Overdraft is authorised (Y) or unauthorised (N) |  [optional] |
|**bufferAmount** | **String** | When a customer exceeds their credit limit, a financial institution will not charge the customer unauthorised overdraft charges if they do not exceed by more than the buffer amount. Note: Authorised overdraft charges may still apply. |  [optional] |
|**notes** | **List&lt;String&gt;** | Optional additional notes to supplement the overdraft Tier Band Set details |  [optional] |
|**overdraftTierBand** | [**List&lt;OverdraftTierBandPropertyInner&gt;**](OverdraftTierBandPropertyInner.md) | Provides overdraft details for a specific tier or band |  |
|**overdraftFeesCharges** | [**List&lt;OverdraftFeesChargesPropertyInner1&gt;**](OverdraftFeesChargesPropertyInner1.md) | Overdraft fees and charges details |  [optional] |



## Enum: TierBandMethodEnum

| Name | Value |
|---- | -----|
| BANDED | &quot;Banded&quot; |
| TIERED | &quot;Tiered&quot; |
| WHOLE | &quot;Whole&quot; |



## Enum: OverdraftTypeEnum

| Name | Value |
|---- | -----|
| COMMITTED | &quot;Committed&quot; |
| ONDEMAND | &quot;OnDemand&quot; |



