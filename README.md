<div align="left">

[![Visit Hsbc](./header.png)](https://hsbc.com)

# [Hsbc](https://hsbc.com)

In this document, you'll find the steps your organization needs to take to use our API services. Included in this guide are details of request and response messages used to support your organization’s integration. The intended audience for this document are **Technical Architects**, **Development Engineers**, **Test Engineers**, and **Operation & Maintenance Engineers** involved in development and support of your organization’s integration. Setting up our API Services is best completed with the assistance of your organization’s IT team, or someone with experience and knowledge of application programming interfaces. This should include experience with **JSON payloads**, **security** and **public key infrastructure (PKI)**. This Document describes the following request and response structure of HSBCnet - Account Information API. For detail implementation guidelines, please refer to the respective section from [develop.hsbc.com](https://develop.hsbc.com/ob-api-documentation/account-information-uk-personal-v319)


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=HSBC&serviceName=AccountInformationCE&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>hsbc-account-information-ce-java-sdk</artifactId>
  <version>3.1.11</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:hsbc-account-information-ce-java-sdk:3.1.11"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hsbc-account-information-ce-java-sdk-3.1.11.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.HsbcAccountInformationCe;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountAccessConsentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
    OBReadConsent1Data data = new OBReadConsent1Data();
    Object risk = null; // The Risk section is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
    String xFapiAuthDate = "Tue, 18 Apr 2023 14:42:25 UTC"; // The time when the PSU last logged in with the TPP.  All dates in the HTTP headers are represented as RFC 7231 Full Dates. An example is below:  Sun, 10 Sep 2017 19:43:31 UTC
    String xFapiCustomerIpAddress = "12.201.45.125"; // The PSU's IP address if the PSU is currently logged in with the TPP.
    String xFapiInteractionId = "20177a90-5e29-43ba-bea0-cc6c344a9d32"; // An RFC4122 UID used as a correlation id.
    String xCustomerUserAgent = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36"; // Indicates the user-agent that the PSU is using.
    try {
      OBReadConsentResponse1 result = client
              .accountAccessConsents
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getRisk());
      System.out.println(result.getLinks());
      System.out.println(result.getMeta());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OBReadConsentResponse1> response = client
              .accountAccessConsents
              .createConsent(data, risk)
              .xFapiAuthDate(xFapiAuthDate)
              .xFapiCustomerIpAddress(xFapiCustomerIpAddress)
              .xFapiInteractionId(xFapiInteractionId)
              .xCustomerUserAgent(xCustomerUserAgent)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountAccessConsentsApi#createConsent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountAccessConsentsApi* | [**createConsent**](docs/AccountAccessConsentsApi.md#createConsent) | **POST** /account-access-consents | Create Account Access Consents
*AccountAccessConsentsApi* | [**deleteConsent**](docs/AccountAccessConsentsApi.md#deleteConsent) | **DELETE** /account-access-consents/{ConsentId} | Delete Account Access Consents
*AccountAccessConsentsApi* | [**getByConsentId**](docs/AccountAccessConsentsApi.md#getByConsentId) | **GET** /account-access-consents/{ConsentId} | Get Account Access Consents
*AccountsApi* | [**getAll**](docs/AccountsApi.md#getAll) | **GET** /accounts | Get Accounts
*AccountsApi* | [**getBalancesByAccountId**](docs/AccountsApi.md#getBalancesByAccountId) | **GET** /accounts/{AccountId} | Get Accounts by AccountId
*BalancesApi* | [**getByAccountId**](docs/BalancesApi.md#getByAccountId) | **GET** /accounts/{AccountId}/balances | Get Account Balances
*BeneficiariesApi* | [**getByAccountId**](docs/BeneficiariesApi.md#getByAccountId) | **GET** /accounts/{AccountId}/beneficiaries | Get Account Beneficiaries
*DirectDebitsApi* | [**getByAccountId**](docs/DirectDebitsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/direct-debits | Get Account Direct Debits
*PartiesApi* | [**getByAccountId**](docs/PartiesApi.md#getByAccountId) | **GET** /accounts/{AccountId}/parties | Get Account Parties
*ProductsApi* | [**getByAccountId**](docs/ProductsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/product | Get Account Products
*ScheduledPaymentsApi* | [**getByAccountId**](docs/ScheduledPaymentsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/scheduled-payments | Get Account Scheduled Payments
*StandingOrdersApi* | [**getByAccountId**](docs/StandingOrdersApi.md#getByAccountId) | **GET** /accounts/{AccountId}/standing-orders | Get Account Standing Orders
*TransactionsApi* | [**getByAccountId**](docs/TransactionsApi.md#getByAccountId) | **GET** /accounts/{AccountId}/transactions | Get Account Transactions


## Documentation for Models

 - [CreditInterestProperty](docs/CreditInterestProperty.md)
 - [CreditInterestProperty1](docs/CreditInterestProperty1.md)
 - [FeeApplicableRangeProperty](docs/FeeApplicableRangeProperty.md)
 - [FeeApplicableRangeProperty1](docs/FeeApplicableRangeProperty1.md)
 - [FeeChargeCapPropertyInner](docs/FeeChargeCapPropertyInner.md)
 - [FeeChargeCapPropertyInner1](docs/FeeChargeCapPropertyInner1.md)
 - [FeeChargeCapPropertyInner2](docs/FeeChargeCapPropertyInner2.md)
 - [FeeChargeCapPropertyInner3](docs/FeeChargeCapPropertyInner3.md)
 - [FeeChargeDetailPropertyInner](docs/FeeChargeDetailPropertyInner.md)
 - [FeeChargeDetailPropertyInner1](docs/FeeChargeDetailPropertyInner1.md)
 - [Links](docs/Links.md)
 - [Meta](docs/Meta.md)
 - [Model](docs/Model.md)
 - [OBAccount6](docs/OBAccount6.md)
 - [OBAccount6AccountInner](docs/OBAccount6AccountInner.md)
 - [OBAccount6Basic](docs/OBAccount6Basic.md)
 - [OBAccount6Detail](docs/OBAccount6Detail.md)
 - [OBAccount6DetailAccountInner](docs/OBAccount6DetailAccountInner.md)
 - [OBAccountStatus1Code](docs/OBAccountStatus1Code.md)
 - [OBActiveOrHistoricCurrencyAndAmount0](docs/OBActiveOrHistoricCurrencyAndAmount0.md)
 - [OBActiveOrHistoricCurrencyAndAmount1](docs/OBActiveOrHistoricCurrencyAndAmount1.md)
 - [OBActiveOrHistoricCurrencyAndAmount10](docs/OBActiveOrHistoricCurrencyAndAmount10.md)
 - [OBActiveOrHistoricCurrencyAndAmount11](docs/OBActiveOrHistoricCurrencyAndAmount11.md)
 - [OBActiveOrHistoricCurrencyAndAmount2](docs/OBActiveOrHistoricCurrencyAndAmount2.md)
 - [OBActiveOrHistoricCurrencyAndAmount3](docs/OBActiveOrHistoricCurrencyAndAmount3.md)
 - [OBActiveOrHistoricCurrencyAndAmount4](docs/OBActiveOrHistoricCurrencyAndAmount4.md)
 - [OBActiveOrHistoricCurrencyAndAmount5](docs/OBActiveOrHistoricCurrencyAndAmount5.md)
 - [OBActiveOrHistoricCurrencyAndAmount6](docs/OBActiveOrHistoricCurrencyAndAmount6.md)
 - [OBActiveOrHistoricCurrencyAndAmount7](docs/OBActiveOrHistoricCurrencyAndAmount7.md)
 - [OBActiveOrHistoricCurrencyAndAmount8](docs/OBActiveOrHistoricCurrencyAndAmount8.md)
 - [OBActiveOrHistoricCurrencyAndAmount9](docs/OBActiveOrHistoricCurrencyAndAmount9.md)
 - [OBAddressTypeCode](docs/OBAddressTypeCode.md)
 - [OBBCAData1](docs/OBBCAData1.md)
 - [OBBalanceType1Code](docs/OBBalanceType1Code.md)
 - [OBBankTransactionCodeStructure1](docs/OBBankTransactionCodeStructure1.md)
 - [OBBeneficiary5](docs/OBBeneficiary5.md)
 - [OBBeneficiary5Basic](docs/OBBeneficiary5Basic.md)
 - [OBBeneficiary5Detail](docs/OBBeneficiary5Detail.md)
 - [OBBeneficiaryType1Code](docs/OBBeneficiaryType1Code.md)
 - [OBBranchAndFinancialInstitutionIdentification50](docs/OBBranchAndFinancialInstitutionIdentification50.md)
 - [OBBranchAndFinancialInstitutionIdentification51](docs/OBBranchAndFinancialInstitutionIdentification51.md)
 - [OBBranchAndFinancialInstitutionIdentification60](docs/OBBranchAndFinancialInstitutionIdentification60.md)
 - [OBBranchAndFinancialInstitutionIdentification61](docs/OBBranchAndFinancialInstitutionIdentification61.md)
 - [OBBranchAndFinancialInstitutionIdentification62](docs/OBBranchAndFinancialInstitutionIdentification62.md)
 - [OBCashAccount50](docs/OBCashAccount50.md)
 - [OBCashAccount51](docs/OBCashAccount51.md)
 - [OBCashAccount60](docs/OBCashAccount60.md)
 - [OBCashAccount61](docs/OBCashAccount61.md)
 - [OBCreditDebitCode0](docs/OBCreditDebitCode0.md)
 - [OBCreditDebitCode1](docs/OBCreditDebitCode1.md)
 - [OBCreditDebitCode2](docs/OBCreditDebitCode2.md)
 - [OBCurrencyExchange5](docs/OBCurrencyExchange5.md)
 - [OBCurrencyExchange5InstructedAmount](docs/OBCurrencyExchange5InstructedAmount.md)
 - [OBEntryStatus1Code](docs/OBEntryStatus1Code.md)
 - [OBError1](docs/OBError1.md)
 - [OBExternalAccountIdentification4Code](docs/OBExternalAccountIdentification4Code.md)
 - [OBExternalAccountRole1Code](docs/OBExternalAccountRole1Code.md)
 - [OBExternalAccountSubType1Code](docs/OBExternalAccountSubType1Code.md)
 - [OBExternalAccountType1Code](docs/OBExternalAccountType1Code.md)
 - [OBExternalDirectDebitStatus1Code](docs/OBExternalDirectDebitStatus1Code.md)
 - [OBExternalFinancialInstitutionIdentification4Code](docs/OBExternalFinancialInstitutionIdentification4Code.md)
 - [OBExternalLegalStructureType1Code](docs/OBExternalLegalStructureType1Code.md)
 - [OBExternalPartyType1Code](docs/OBExternalPartyType1Code.md)
 - [OBExternalScheduleType1Code](docs/OBExternalScheduleType1Code.md)
 - [OBExternalStandingOrderStatus1Code](docs/OBExternalStandingOrderStatus1Code.md)
 - [OBExternalStatementAmountType1Code](docs/OBExternalStatementAmountType1Code.md)
 - [OBExternalStatementBenefitType1Code](docs/OBExternalStatementBenefitType1Code.md)
 - [OBExternalStatementDateTimeType1Code](docs/OBExternalStatementDateTimeType1Code.md)
 - [OBExternalStatementFeeFrequency1Code](docs/OBExternalStatementFeeFrequency1Code.md)
 - [OBExternalStatementFeeRateType1Code](docs/OBExternalStatementFeeRateType1Code.md)
 - [OBExternalStatementFeeType1Code](docs/OBExternalStatementFeeType1Code.md)
 - [OBExternalStatementInterestFrequency1Code](docs/OBExternalStatementInterestFrequency1Code.md)
 - [OBExternalStatementInterestRateType1Code](docs/OBExternalStatementInterestRateType1Code.md)
 - [OBExternalStatementInterestType1Code](docs/OBExternalStatementInterestType1Code.md)
 - [OBExternalStatementRateType1Code](docs/OBExternalStatementRateType1Code.md)
 - [OBExternalStatementType1Code](docs/OBExternalStatementType1Code.md)
 - [OBExternalStatementValueType1Code](docs/OBExternalStatementValueType1Code.md)
 - [OBExternalSwitchStatusCode](docs/OBExternalSwitchStatusCode.md)
 - [OBFeeCategory1Code](docs/OBFeeCategory1Code.md)
 - [OBFeeFrequency1Code0](docs/OBFeeFrequency1Code0.md)
 - [OBFeeFrequency1Code1](docs/OBFeeFrequency1Code1.md)
 - [OBFeeFrequency1Code2](docs/OBFeeFrequency1Code2.md)
 - [OBFeeFrequency1Code3](docs/OBFeeFrequency1Code3.md)
 - [OBFeeFrequency1Code4](docs/OBFeeFrequency1Code4.md)
 - [OBFeeType1Code](docs/OBFeeType1Code.md)
 - [OBInterestCalculationMethod1Code](docs/OBInterestCalculationMethod1Code.md)
 - [OBInterestFixedVariableType1Code](docs/OBInterestFixedVariableType1Code.md)
 - [OBInterestRateType1Code0](docs/OBInterestRateType1Code0.md)
 - [OBInterestRateType1Code1](docs/OBInterestRateType1Code1.md)
 - [OBMerchantDetails1](docs/OBMerchantDetails1.md)
 - [OBMinMaxType1Code](docs/OBMinMaxType1Code.md)
 - [OBOtherCodeType10](docs/OBOtherCodeType10.md)
 - [OBOtherCodeType11](docs/OBOtherCodeType11.md)
 - [OBOtherCodeType12](docs/OBOtherCodeType12.md)
 - [OBOtherCodeType13](docs/OBOtherCodeType13.md)
 - [OBOtherCodeType14](docs/OBOtherCodeType14.md)
 - [OBOtherCodeType15](docs/OBOtherCodeType15.md)
 - [OBOtherCodeType16](docs/OBOtherCodeType16.md)
 - [OBOtherCodeType17](docs/OBOtherCodeType17.md)
 - [OBOtherCodeType18](docs/OBOtherCodeType18.md)
 - [OBOtherFeeChargeDetailType](docs/OBOtherFeeChargeDetailType.md)
 - [OBOverdraftFeeType1Code](docs/OBOverdraftFeeType1Code.md)
 - [OBPCAData1](docs/OBPCAData1.md)
 - [OBParty2](docs/OBParty2.md)
 - [OBParty2AddressInner](docs/OBParty2AddressInner.md)
 - [OBPartyRelationships1](docs/OBPartyRelationships1.md)
 - [OBPartyRelationships1Account](docs/OBPartyRelationships1Account.md)
 - [OBPeriod1Code](docs/OBPeriod1Code.md)
 - [OBPostalAddress6](docs/OBPostalAddress6.md)
 - [OBReadAccount6](docs/OBReadAccount6.md)
 - [OBReadAccount6Data](docs/OBReadAccount6Data.md)
 - [OBReadBalance1](docs/OBReadBalance1.md)
 - [OBReadBalance1Data](docs/OBReadBalance1Data.md)
 - [OBReadBalance1DataBalanceInner](docs/OBReadBalance1DataBalanceInner.md)
 - [OBReadBalance1DataBalanceInnerAmount](docs/OBReadBalance1DataBalanceInnerAmount.md)
 - [OBReadBalance1DataBalanceInnerCreditLineInner](docs/OBReadBalance1DataBalanceInnerCreditLineInner.md)
 - [OBReadBalance1DataBalanceInnerCreditLineInnerAmount](docs/OBReadBalance1DataBalanceInnerCreditLineInnerAmount.md)
 - [OBReadBeneficiary5](docs/OBReadBeneficiary5.md)
 - [OBReadBeneficiary5Data](docs/OBReadBeneficiary5Data.md)
 - [OBReadConsent1](docs/OBReadConsent1.md)
 - [OBReadConsent1Data](docs/OBReadConsent1Data.md)
 - [OBReadConsentResponse1](docs/OBReadConsentResponse1.md)
 - [OBReadConsentResponse1Data](docs/OBReadConsentResponse1Data.md)
 - [OBReadDataStatement2](docs/OBReadDataStatement2.md)
 - [OBReadDataTransaction6](docs/OBReadDataTransaction6.md)
 - [OBReadDirectDebit2](docs/OBReadDirectDebit2.md)
 - [OBReadDirectDebit2Data](docs/OBReadDirectDebit2Data.md)
 - [OBReadDirectDebit2DataDirectDebitInner](docs/OBReadDirectDebit2DataDirectDebitInner.md)
 - [OBReadOffer1](docs/OBReadOffer1.md)
 - [OBReadOffer1Data](docs/OBReadOffer1Data.md)
 - [OBReadOffer1DataOfferInner](docs/OBReadOffer1DataOfferInner.md)
 - [OBReadOffer1DataOfferInnerAmount](docs/OBReadOffer1DataOfferInnerAmount.md)
 - [OBReadOffer1DataOfferInnerFee](docs/OBReadOffer1DataOfferInnerFee.md)
 - [OBReadParty2](docs/OBReadParty2.md)
 - [OBReadParty2Data](docs/OBReadParty2Data.md)
 - [OBReadParty3](docs/OBReadParty3.md)
 - [OBReadParty3Data](docs/OBReadParty3Data.md)
 - [OBReadProduct2](docs/OBReadProduct2.md)
 - [OBReadProduct2Data](docs/OBReadProduct2Data.md)
 - [OBReadProduct2DataProductInner](docs/OBReadProduct2DataProductInner.md)
 - [OBReadProduct2DataProductInnerOtherProductType](docs/OBReadProduct2DataProductInnerOtherProductType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterest](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterest.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType](docs/OBReadProduct2DataProductInnerOtherProductTypeCreditInterestTierBandSetInnerTierBandInnerOtherBankInterestType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterest](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerLoanInterestFeesChargesInnerLoanInterestFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType](docs/OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInnerLoanInterestTierBandInnerOtherLoanProviderInterestRateType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeApplicableRange.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType](docs/OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraft](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraft.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeCapInnerOtherFeeTypeInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeOverdraftOverdraftTierBandSetInnerOverdraftTierBandInnerOverdraftFeesChargesInnerOverdraftFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeProductDetails](docs/OBReadProduct2DataProductInnerOtherProductTypeProductDetails.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepayment](docs/OBReadProduct2DataProductInnerOtherProductTypeRepayment.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherAmountType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentFrequency.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentOtherRepaymentType.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeCharges.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeCapInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentFeeChargesRepaymentFeeChargeDetailInner.md)
 - [OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner](docs/OBReadProduct2DataProductInnerOtherProductTypeRepaymentRepaymentHolidayInner.md)
 - [OBReadScheduledPayment3](docs/OBReadScheduledPayment3.md)
 - [OBReadScheduledPayment3Data](docs/OBReadScheduledPayment3Data.md)
 - [OBReadStandingOrder6](docs/OBReadStandingOrder6.md)
 - [OBReadStandingOrder6Data](docs/OBReadStandingOrder6Data.md)
 - [OBReadStatement2](docs/OBReadStatement2.md)
 - [OBReadTransaction6](docs/OBReadTransaction6.md)
 - [OBScheduledPayment3](docs/OBScheduledPayment3.md)
 - [OBScheduledPayment3Basic](docs/OBScheduledPayment3Basic.md)
 - [OBScheduledPayment3Detail](docs/OBScheduledPayment3Detail.md)
 - [OBStandingOrder6](docs/OBStandingOrder6.md)
 - [OBStandingOrder6Basic](docs/OBStandingOrder6Basic.md)
 - [OBStandingOrder6Detail](docs/OBStandingOrder6Detail.md)
 - [OBStatement2](docs/OBStatement2.md)
 - [OBStatement2Basic](docs/OBStatement2Basic.md)
 - [OBStatement2Detail](docs/OBStatement2Detail.md)
 - [OBStatement2StatementAmountInner](docs/OBStatement2StatementAmountInner.md)
 - [OBStatement2StatementBenefitInner](docs/OBStatement2StatementBenefitInner.md)
 - [OBStatement2StatementDateTimeInner](docs/OBStatement2StatementDateTimeInner.md)
 - [OBStatement2StatementFeeInner](docs/OBStatement2StatementFeeInner.md)
 - [OBStatement2StatementInterestInner](docs/OBStatement2StatementInterestInner.md)
 - [OBStatement2StatementRateInner](docs/OBStatement2StatementRateInner.md)
 - [OBStatement2StatementValueInner](docs/OBStatement2StatementValueInner.md)
 - [OBTransaction6](docs/OBTransaction6.md)
 - [OBTransaction6Basic](docs/OBTransaction6Basic.md)
 - [OBTransaction6Detail](docs/OBTransaction6Detail.md)
 - [OBTransactionCardInstrument1](docs/OBTransactionCardInstrument1.md)
 - [OBTransactionCashBalance](docs/OBTransactionCashBalance.md)
 - [OBTransactionCashBalanceAmount](docs/OBTransactionCashBalanceAmount.md)
 - [OBTransactionMutability1Code](docs/OBTransactionMutability1Code.md)
 - [OtherApplicationFrequencyProperty](docs/OtherApplicationFrequencyProperty.md)
 - [OtherApplicationFrequencyProperty1](docs/OtherApplicationFrequencyProperty1.md)
 - [OtherApplicationFrequencyProperty2](docs/OtherApplicationFrequencyProperty2.md)
 - [OtherApplicationFrequencyProperty3](docs/OtherApplicationFrequencyProperty3.md)
 - [OtherApplicationFrequencyProperty4](docs/OtherApplicationFrequencyProperty4.md)
 - [OtherApplicationFrequencyProperty5](docs/OtherApplicationFrequencyProperty5.md)
 - [OtherApplicationFrequencyProperty6](docs/OtherApplicationFrequencyProperty6.md)
 - [OtherApplicationFrequencyProperty7](docs/OtherApplicationFrequencyProperty7.md)
 - [OtherBankInterestTypeProperty](docs/OtherBankInterestTypeProperty.md)
 - [OtherBankInterestTypeProperty1](docs/OtherBankInterestTypeProperty1.md)
 - [OtherCalculationFrequencyProperty](docs/OtherCalculationFrequencyProperty.md)
 - [OtherCalculationFrequencyProperty1](docs/OtherCalculationFrequencyProperty1.md)
 - [OtherCalculationFrequencyProperty2](docs/OtherCalculationFrequencyProperty2.md)
 - [OtherCalculationFrequencyProperty3](docs/OtherCalculationFrequencyProperty3.md)
 - [OtherCalculationFrequencyProperty4](docs/OtherCalculationFrequencyProperty4.md)
 - [OtherCalculationFrequencyProperty5](docs/OtherCalculationFrequencyProperty5.md)
 - [OtherCalculationFrequencyProperty6](docs/OtherCalculationFrequencyProperty6.md)
 - [OtherCalculationFrequencyProperty7](docs/OtherCalculationFrequencyProperty7.md)
 - [OtherFeeCategoryTypeProperty](docs/OtherFeeCategoryTypeProperty.md)
 - [OtherFeeCategoryTypeProperty1](docs/OtherFeeCategoryTypeProperty1.md)
 - [OtherFeeRateTypeProperty](docs/OtherFeeRateTypeProperty.md)
 - [OtherFeeRateTypeProperty1](docs/OtherFeeRateTypeProperty1.md)
 - [OtherFeeRateTypeProperty2](docs/OtherFeeRateTypeProperty2.md)
 - [OtherFeeRateTypeProperty3](docs/OtherFeeRateTypeProperty3.md)
 - [OtherFeeRateTypeProperty4](docs/OtherFeeRateTypeProperty4.md)
 - [OtherFeeRateTypeProperty5](docs/OtherFeeRateTypeProperty5.md)
 - [OtherFeeTypeProperty](docs/OtherFeeTypeProperty.md)
 - [OtherFeeTypeProperty1](docs/OtherFeeTypeProperty1.md)
 - [OtherFeeTypeProperty1Inner](docs/OtherFeeTypeProperty1Inner.md)
 - [OtherFeeTypeProperty1Inner1](docs/OtherFeeTypeProperty1Inner1.md)
 - [OtherFeeTypeProperty2](docs/OtherFeeTypeProperty2.md)
 - [OtherFeeTypeProperty2Inner](docs/OtherFeeTypeProperty2Inner.md)
 - [OtherFeeTypeProperty3](docs/OtherFeeTypeProperty3.md)
 - [OtherFeeTypeProperty3Inner](docs/OtherFeeTypeProperty3Inner.md)
 - [OtherFeeTypeProperty3Inner1](docs/OtherFeeTypeProperty3Inner1.md)
 - [OtherFeeTypeProperty4](docs/OtherFeeTypeProperty4.md)
 - [OtherFeeTypeProperty4Inner](docs/OtherFeeTypeProperty4Inner.md)
 - [OtherFeeTypeProperty4Inner1](docs/OtherFeeTypeProperty4Inner1.md)
 - [OtherFeeTypeProperty5](docs/OtherFeeTypeProperty5.md)
 - [OtherFeeTypeProperty5Inner](docs/OtherFeeTypeProperty5Inner.md)
 - [OtherFeeTypeProperty6Inner](docs/OtherFeeTypeProperty6Inner.md)
 - [OtherFeeTypeProperty6Inner1](docs/OtherFeeTypeProperty6Inner1.md)
 - [OtherFeeTypePropertyInner](docs/OtherFeeTypePropertyInner.md)
 - [OtherFeeTypePropertyInner1](docs/OtherFeeTypePropertyInner1.md)
 - [OtherFeesChargesProperty](docs/OtherFeesChargesProperty.md)
 - [OtherFeesChargesPropertyInner](docs/OtherFeesChargesPropertyInner.md)
 - [OtherTariffTypeProperty](docs/OtherTariffTypeProperty.md)
 - [OverdraftFeeChargeCapProperty](docs/OverdraftFeeChargeCapProperty.md)
 - [OverdraftFeeChargeCapProperty1](docs/OverdraftFeeChargeCapProperty1.md)
 - [OverdraftFeeChargeCapProperty1Inner](docs/OverdraftFeeChargeCapProperty1Inner.md)
 - [OverdraftFeeChargeCapPropertyInner](docs/OverdraftFeeChargeCapPropertyInner.md)
 - [OverdraftFeeChargeCapPropertyInner1](docs/OverdraftFeeChargeCapPropertyInner1.md)
 - [OverdraftFeeChargeCapPropertyInner2](docs/OverdraftFeeChargeCapPropertyInner2.md)
 - [OverdraftFeeChargeCapPropertyInner3](docs/OverdraftFeeChargeCapPropertyInner3.md)
 - [OverdraftFeeChargeCapPropertyInner4](docs/OverdraftFeeChargeCapPropertyInner4.md)
 - [OverdraftFeeChargeDetailPropertyInner](docs/OverdraftFeeChargeDetailPropertyInner.md)
 - [OverdraftFeeChargeDetailPropertyInner1](docs/OverdraftFeeChargeDetailPropertyInner1.md)
 - [OverdraftFeeChargeDetailPropertyInner2](docs/OverdraftFeeChargeDetailPropertyInner2.md)
 - [OverdraftFeeChargeDetailPropertyInner3](docs/OverdraftFeeChargeDetailPropertyInner3.md)
 - [OverdraftFeesChargesPropertyInner](docs/OverdraftFeesChargesPropertyInner.md)
 - [OverdraftFeesChargesPropertyInner1](docs/OverdraftFeesChargesPropertyInner1.md)
 - [OverdraftFeesChargesPropertyInner2](docs/OverdraftFeesChargesPropertyInner2.md)
 - [OverdraftFeesChargesPropertyInner3](docs/OverdraftFeesChargesPropertyInner3.md)
 - [OverdraftProperty](docs/OverdraftProperty.md)
 - [OverdraftProperty1](docs/OverdraftProperty1.md)
 - [OverdraftTierBandPropertyInner](docs/OverdraftTierBandPropertyInner.md)
 - [OverdraftTierBandPropertyInner1](docs/OverdraftTierBandPropertyInner1.md)
 - [OverdraftTierBandSetPropertyInner](docs/OverdraftTierBandSetPropertyInner.md)
 - [OverdraftTierBandSetPropertyInner1](docs/OverdraftTierBandSetPropertyInner1.md)
 - [ProductDetailsProperty](docs/ProductDetailsProperty.md)
 - [ProductDetailsProperty1](docs/ProductDetailsProperty1.md)
 - [ProprietaryBankTransactionCodeStructure1](docs/ProprietaryBankTransactionCodeStructure1.md)
 - [TierBandPropertyInner](docs/TierBandPropertyInner.md)
 - [TierBandPropertyInner1](docs/TierBandPropertyInner1.md)
 - [TierBandSetPropertyInner](docs/TierBandSetPropertyInner.md)
 - [TierBandSetPropertyInner1](docs/TierBandSetPropertyInner1.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
