

# OtherFeesChargesPropertyInner

Contains details of fees and charges which are not associated with either Overdraft or features/benefits

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tariffType** | [**TariffTypeEnum**](#TariffTypeEnum) | TariffType which defines the fee and charges. |  [optional] |
|**tariffName** | **String** | Name of the tariff |  [optional] |
|**otherTariffType** | [**OtherTariffTypeProperty**](OtherTariffTypeProperty.md) |  |  [optional] |
|**feeChargeDetail** | [**List&lt;FeeChargeDetailPropertyInner&gt;**](FeeChargeDetailPropertyInner.md) | Other fees/charges details |  |
|**feeChargeCap** | [**List&lt;FeeChargeCapPropertyInner1&gt;**](FeeChargeCapPropertyInner1.md) | Details about any caps (maximum charges) that apply to a particular or group of fee/charge |  [optional] |



## Enum: TariffTypeEnum

| Name | Value |
|---- | -----|
| ELECTRONIC | &quot;Electronic&quot; |
| MIXED | &quot;Mixed&quot; |
| OTHER | &quot;Other&quot; |



