

# OBTransactionCardInstrument1

Set of elements to describe the card instrument used in the transaction.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardSchemeName** | [**CardSchemeNameEnum**](#CardSchemeNameEnum) | Name of the card scheme. |  |
|**authorisationType** | [**AuthorisationTypeEnum**](#AuthorisationTypeEnum) | The card authorisation type. |  [optional] |
|**name** | **String** | Name of the cardholder using the card instrument. |  [optional] |
|**identification** | **String** | Identification assigned by an institution to identify the card instrument used in the transaction. This identification is known by the account owner, and may be masked. |  [optional] |



## Enum: CardSchemeNameEnum

| Name | Value |
|---- | -----|
| AMERICANEXPRESS | &quot;AmericanExpress&quot; |
| DINERS | &quot;Diners&quot; |
| DISCOVER | &quot;Discover&quot; |
| MASTERCARD | &quot;MasterCard&quot; |
| VISA | &quot;VISA&quot; |



## Enum: AuthorisationTypeEnum

| Name | Value |
|---- | -----|
| CONSUMERDEVICE | &quot;ConsumerDevice&quot; |
| CONTACTLESS | &quot;Contactless&quot; |
| NONE | &quot;None&quot; |
| PIN | &quot;PIN&quot; |



