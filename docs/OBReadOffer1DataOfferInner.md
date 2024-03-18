

# OBReadOffer1DataOfferInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**offerId** | **String** | A unique and immutable identifier used to identify the offer resource. This identifier has no meaning to the account owner. |  [optional] |
|**offerType** | [**OfferTypeEnum**](#OfferTypeEnum) | Offer type, in a coded form. |  [optional] |
|**description** | **String** | Further details of the offer. |  [optional] |
|**startDateTime** | **OffsetDateTime** | Date and time at which the offer starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**endDateTime** | **OffsetDateTime** | Date and time at which the offer ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**rate** | **String** | Rate associated with the offer type. |  [optional] |
|**value** | **Integer** | Value associated with the offer type. |  [optional] |
|**term** | **String** | Further details of the term of the offer. |  [optional] |
|**URL** | **String** | URL (Uniform Resource Locator) where documentation on the offer can be found |  [optional] |
|**amount** | [**OBReadOffer1DataOfferInnerAmount**](OBReadOffer1DataOfferInnerAmount.md) |  |  [optional] |
|**fee** | [**OBReadOffer1DataOfferInnerFee**](OBReadOffer1DataOfferInnerFee.md) |  |  [optional] |



## Enum: OfferTypeEnum

| Name | Value |
|---- | -----|
| BALANCETRANSFER | &quot;BalanceTransfer&quot; |
| LIMITINCREASE | &quot;LimitIncrease&quot; |
| MONEYTRANSFER | &quot;MoneyTransfer&quot; |
| OTHER | &quot;Other&quot; |
| PROMOTIONALRATE | &quot;PromotionalRate&quot; |



