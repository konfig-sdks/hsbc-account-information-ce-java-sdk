

# OBAccount6AccountInner

Provides the details to identify an account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**schemeName** | [**SchemeNameEnum**](#SchemeNameEnum) | Name of the identification scheme, in a coded form as published in an external list. |  |
|**identification** | **String** | Identification assigned by an institution to identify an account. This identification is known by the account owner. |  |
|**name** | **String** | The account name is the name or names of the account owner(s) represented at an account level, as displayed by the ASPSP&#39;s online channels. Note, the account name is not the product name or the nickname of the account. |  [optional] |
|**secondaryIdentification** | **String** | This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination). |  [optional] |



## Enum: SchemeNameEnum

| Name | Value |
|---- | -----|
| BBAN | &quot;UK.OBIE.BBAN&quot; |
| IBAN | &quot;UK.OBIE.IBAN&quot; |
| PAN | &quot;UK.OBIE.PAN&quot; |
| PAYM | &quot;UK.OBIE.Paym&quot; |
| SORTCODEACCOUNTNUMBER | &quot;UK.OBIE.SortCodeAccountNumber&quot; |
| WALLET | &quot;UK.OBIE.Wallet&quot; |



