

# OBAccount6

Unambiguous identification of the account to which credit and debit entries are made. The following fields are optional only for accounts that are switched:    * Data.Currency     * Data.AccountType     * Data.AccountSubType  For all other accounts, the fields must be populated by the ASPSP.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. |  |
|**status** | **OBAccountStatus1Code** |  |  [optional] |
|**statusUpdateDateTime** | **OffsetDateTime** | Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**currency** | **String** | Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account. |  [optional] |
|**accountType** | **OBExternalAccountType1Code** |  |  [optional] |
|**accountSubType** | **OBExternalAccountSubType1Code** |  |  [optional] |
|**description** | **String** | Specifies the description of the account type. |  [optional] |
|**nickname** | **String** | The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account. |  [optional] |
|**openingDate** | **OffsetDateTime** | Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**maturityDate** | **OffsetDateTime** | Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00 |  [optional] |
|**switchStatus** | **OBExternalSwitchStatusCode** |  |  [optional] |
|**account** | [**List&lt;OBAccount6AccountInner&gt;**](OBAccount6AccountInner.md) |  |  [optional] |
|**servicer** | [**OBBranchAndFinancialInstitutionIdentification50**](OBBranchAndFinancialInstitutionIdentification50.md) |  |  [optional] |



