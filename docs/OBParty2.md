

# OBParty2


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**partyId** | **String** | A unique and immutable identifier used to identify the customer resource. This identifier has no meaning to the account owner. |  |
|**partyNumber** | **String** | Number assigned by an agent to identify its customer. |  [optional] |
|**partyType** | **OBExternalPartyType1Code** |  |  [optional] |
|**name** | **String** | Name by which a party is known and which is usually used to identify that party. |  [optional] |
|**fullLegalName** | **String** | Specifies a character string with a maximum length of 350 characters. |  [optional] |
|**legalStructure** | **OBExternalLegalStructureType1Code** |  |  [optional] |
|**beneficialOwnership** | **Boolean** |  |  [optional] |
|**accountRole** | **OBExternalAccountRole1Code** |  |  [optional] |
|**emailAddress** | **String** | Address for electronic mail (e-mail). |  [optional] |
|**phone** | **String** | Collection of information that identifies a phone number, as defined by telecom services. |  [optional] |
|**mobile** | **String** | Collection of information that identifies a mobile phone number, as defined by telecom services. |  [optional] |
|**relationships** | [**OBPartyRelationships1**](OBPartyRelationships1.md) |  |  [optional] |
|**address** | [**List&lt;OBParty2AddressInner&gt;**](OBParty2AddressInner.md) |  |  [optional] |



