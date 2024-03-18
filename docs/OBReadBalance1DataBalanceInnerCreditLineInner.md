

# OBReadBalance1DataBalanceInnerCreditLineInner

Set of elements used to provide details on the credit line.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**included** | **Boolean** | Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account. |  |
|**type** | [**TypeEnum**](#TypeEnum) | Limit type, in a coded form. |  [optional] |
|**amount** | [**OBReadBalance1DataBalanceInnerCreditLineInnerAmount**](OBReadBalance1DataBalanceInnerCreditLineInnerAmount.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;Available&quot; |
| CREDIT | &quot;Credit&quot; |
| EMERGENCY | &quot;Emergency&quot; |
| PRE_AGREED | &quot;Pre-Agreed&quot; |
| TEMPORARY | &quot;Temporary&quot; |



