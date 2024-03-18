/*
 * Account Information API
 * In this document, you'll find the steps your organization needs to take to use our API services. Included in this guide are details of request and response messages used to support your organization’s integration. The intended audience for this document are **Technical Architects**, **Development Engineers**, **Test Engineers**, and **Operation & Maintenance Engineers** involved in development and support of your organization’s integration. Setting up our API Services is best completed with the assistance of your organization’s IT team, or someone with experience and knowledge of application programming interfaces. This should include experience with **JSON payloads**, **security** and **public key infrastructure (PKI)**. This Document describes the following request and response structure of HSBCnet - Account Information API. For detail implementation guidelines, please refer to the respective section from [develop.hsbc.com](https://develop.hsbc.com/ob-api-documentation/account-information-uk-personal-v319) 
 *
 * The version of the OpenAPI document: 3.1.11
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.OBExternalStatementType1Code;
import com.konfigthis.client.model.OBStatement2StatementAmountInner;
import com.konfigthis.client.model.OBStatement2StatementBenefitInner;
import com.konfigthis.client.model.OBStatement2StatementDateTimeInner;
import com.konfigthis.client.model.OBStatement2StatementFeeInner;
import com.konfigthis.client.model.OBStatement2StatementInterestInner;
import com.konfigthis.client.model.OBStatement2StatementRateInner;
import com.konfigthis.client.model.OBStatement2StatementValueInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Provides further details on a statement resource.
 */
@ApiModel(description = "Provides further details on a statement resource.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBStatement2Detail {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STATEMENT_ID = "StatementId";
  @SerializedName(SERIALIZED_NAME_STATEMENT_ID)
  private String statementId;

  public static final String SERIALIZED_NAME_STATEMENT_REFERENCE = "StatementReference";
  @SerializedName(SERIALIZED_NAME_STATEMENT_REFERENCE)
  private String statementReference;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OBExternalStatementType1Code type;

  public static final String SERIALIZED_NAME_START_DATE_TIME = "StartDateTime";
  @SerializedName(SERIALIZED_NAME_START_DATE_TIME)
  private OffsetDateTime startDateTime;

  public static final String SERIALIZED_NAME_END_DATE_TIME = "EndDateTime";
  @SerializedName(SERIALIZED_NAME_END_DATE_TIME)
  private OffsetDateTime endDateTime;

  public static final String SERIALIZED_NAME_CREATION_DATE_TIME = "CreationDateTime";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE_TIME)
  private OffsetDateTime creationDateTime;

  public static final String SERIALIZED_NAME_STATEMENT_DESCRIPTION = "StatementDescription";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DESCRIPTION)
  private List<String> statementDescription = null;

  public static final String SERIALIZED_NAME_STATEMENT_BENEFIT = "StatementBenefit";
  @SerializedName(SERIALIZED_NAME_STATEMENT_BENEFIT)
  private List<OBStatement2StatementBenefitInner> statementBenefit = null;

  public static final String SERIALIZED_NAME_STATEMENT_FEE = "StatementFee";
  @SerializedName(SERIALIZED_NAME_STATEMENT_FEE)
  private List<OBStatement2StatementFeeInner> statementFee = null;

  public static final String SERIALIZED_NAME_STATEMENT_INTEREST = "StatementInterest";
  @SerializedName(SERIALIZED_NAME_STATEMENT_INTEREST)
  private List<OBStatement2StatementInterestInner> statementInterest = null;

  public static final String SERIALIZED_NAME_STATEMENT_AMOUNT = "StatementAmount";
  @SerializedName(SERIALIZED_NAME_STATEMENT_AMOUNT)
  private List<OBStatement2StatementAmountInner> statementAmount = null;

  public static final String SERIALIZED_NAME_STATEMENT_DATE_TIME = "StatementDateTime";
  @SerializedName(SERIALIZED_NAME_STATEMENT_DATE_TIME)
  private List<OBStatement2StatementDateTimeInner> statementDateTime = null;

  public static final String SERIALIZED_NAME_STATEMENT_RATE = "StatementRate";
  @SerializedName(SERIALIZED_NAME_STATEMENT_RATE)
  private List<OBStatement2StatementRateInner> statementRate = null;

  public static final String SERIALIZED_NAME_STATEMENT_VALUE = "StatementValue";
  @SerializedName(SERIALIZED_NAME_STATEMENT_VALUE)
  private List<OBStatement2StatementValueInner> statementValue = null;

  public OBStatement2Detail() {
  }

  public OBStatement2Detail accountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WQEF7_6iy3HEWspIs8CDOw", required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    this.accountId = accountId;
  }


  public OBStatement2Detail statementId(String statementId) {
    
    
    if (statementId != null && statementId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for statementId. Length must be greater than or equal to 1.");
    }
    
    this.statementId = statementId;
    return this;
  }

   /**
   * Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.
   * @return statementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example StatementId", value = "Unique identifier for the statement resource within an servicing institution. This identifier is both unique and immutable.")

  public String getStatementId() {
    return statementId;
  }


  public void setStatementId(String statementId) {
    
    
    if (statementId != null && statementId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for statementId. Length must be greater than or equal to 1.");
    }
    this.statementId = statementId;
  }


  public OBStatement2Detail statementReference(String statementReference) {
    
    
    if (statementReference != null && statementReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for statementReference. Length must be greater than or equal to 1.");
    }
    
    this.statementReference = statementReference;
    return this;
  }

   /**
   * Unique reference for the statement. This reference may be optionally populated if available.
   * @return statementReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example StatementReference", value = "Unique reference for the statement. This reference may be optionally populated if available.")

  public String getStatementReference() {
    return statementReference;
  }


  public void setStatementReference(String statementReference) {
    
    
    if (statementReference != null && statementReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for statementReference. Length must be greater than or equal to 1.");
    }
    this.statementReference = statementReference;
  }


  public OBStatement2Detail type(OBExternalStatementType1Code type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBExternalStatementType1Code getType() {
    return type;
  }


  public void setType(OBExternalStatementType1Code type) {
    
    
    
    this.type = type;
  }


  public OBStatement2Detail startDateTime(OffsetDateTime startDateTime) {
    
    
    
    
    this.startDateTime = startDateTime;
    return this;
  }

   /**
   * Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return startDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-01-04T00:00Z", required = true, value = "Date and time at which the statement period starts.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getStartDateTime() {
    return startDateTime;
  }


  public void setStartDateTime(OffsetDateTime startDateTime) {
    
    
    
    this.startDateTime = startDateTime;
  }


  public OBStatement2Detail endDateTime(OffsetDateTime endDateTime) {
    
    
    
    
    this.endDateTime = endDateTime;
    return this;
  }

   /**
   * Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return endDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-03-04T13:21:59Z", required = true, value = "Date and time at which the statement period ends.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getEndDateTime() {
    return endDateTime;
  }


  public void setEndDateTime(OffsetDateTime endDateTime) {
    
    
    
    this.endDateTime = endDateTime;
  }


  public OBStatement2Detail creationDateTime(OffsetDateTime creationDateTime) {
    
    
    
    
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return creationDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-01-04T13:22:20Z", required = true, value = "Date and time at which the resource was created.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getCreationDateTime() {
    return creationDateTime;
  }


  public void setCreationDateTime(OffsetDateTime creationDateTime) {
    
    
    
    this.creationDateTime = creationDateTime;
  }


  public OBStatement2Detail statementDescription(List<String> statementDescription) {
    
    
    
    
    this.statementDescription = statementDescription;
    return this;
  }

  public OBStatement2Detail addStatementDescriptionItem(String statementDescriptionItem) {
    if (this.statementDescription == null) {
      this.statementDescription = new ArrayList<>();
    }
    this.statementDescription.add(statementDescriptionItem);
    return this;
  }

   /**
   * Get statementDescription
   * @return statementDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getStatementDescription() {
    return statementDescription;
  }


  public void setStatementDescription(List<String> statementDescription) {
    
    
    
    this.statementDescription = statementDescription;
  }


  public OBStatement2Detail statementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    
    
    
    
    this.statementBenefit = statementBenefit;
    return this;
  }

  public OBStatement2Detail addStatementBenefitItem(OBStatement2StatementBenefitInner statementBenefitItem) {
    if (this.statementBenefit == null) {
      this.statementBenefit = new ArrayList<>();
    }
    this.statementBenefit.add(statementBenefitItem);
    return this;
  }

   /**
   * Get statementBenefit
   * @return statementBenefit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementBenefitInner> getStatementBenefit() {
    return statementBenefit;
  }


  public void setStatementBenefit(List<OBStatement2StatementBenefitInner> statementBenefit) {
    
    
    
    this.statementBenefit = statementBenefit;
  }


  public OBStatement2Detail statementFee(List<OBStatement2StatementFeeInner> statementFee) {
    
    
    
    
    this.statementFee = statementFee;
    return this;
  }

  public OBStatement2Detail addStatementFeeItem(OBStatement2StatementFeeInner statementFeeItem) {
    if (this.statementFee == null) {
      this.statementFee = new ArrayList<>();
    }
    this.statementFee.add(statementFeeItem);
    return this;
  }

   /**
   * Get statementFee
   * @return statementFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementFeeInner> getStatementFee() {
    return statementFee;
  }


  public void setStatementFee(List<OBStatement2StatementFeeInner> statementFee) {
    
    
    
    this.statementFee = statementFee;
  }


  public OBStatement2Detail statementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    
    
    
    
    this.statementInterest = statementInterest;
    return this;
  }

  public OBStatement2Detail addStatementInterestItem(OBStatement2StatementInterestInner statementInterestItem) {
    if (this.statementInterest == null) {
      this.statementInterest = new ArrayList<>();
    }
    this.statementInterest.add(statementInterestItem);
    return this;
  }

   /**
   * Get statementInterest
   * @return statementInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementInterestInner> getStatementInterest() {
    return statementInterest;
  }


  public void setStatementInterest(List<OBStatement2StatementInterestInner> statementInterest) {
    
    
    
    this.statementInterest = statementInterest;
  }


  public OBStatement2Detail statementAmount(List<OBStatement2StatementAmountInner> statementAmount) {
    
    
    
    
    this.statementAmount = statementAmount;
    return this;
  }

  public OBStatement2Detail addStatementAmountItem(OBStatement2StatementAmountInner statementAmountItem) {
    if (this.statementAmount == null) {
      this.statementAmount = new ArrayList<>();
    }
    this.statementAmount.add(statementAmountItem);
    return this;
  }

   /**
   * Get statementAmount
   * @return statementAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementAmountInner> getStatementAmount() {
    return statementAmount;
  }


  public void setStatementAmount(List<OBStatement2StatementAmountInner> statementAmount) {
    
    
    
    this.statementAmount = statementAmount;
  }


  public OBStatement2Detail statementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    
    
    
    
    this.statementDateTime = statementDateTime;
    return this;
  }

  public OBStatement2Detail addStatementDateTimeItem(OBStatement2StatementDateTimeInner statementDateTimeItem) {
    if (this.statementDateTime == null) {
      this.statementDateTime = new ArrayList<>();
    }
    this.statementDateTime.add(statementDateTimeItem);
    return this;
  }

   /**
   * Get statementDateTime
   * @return statementDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementDateTimeInner> getStatementDateTime() {
    return statementDateTime;
  }


  public void setStatementDateTime(List<OBStatement2StatementDateTimeInner> statementDateTime) {
    
    
    
    this.statementDateTime = statementDateTime;
  }


  public OBStatement2Detail statementRate(List<OBStatement2StatementRateInner> statementRate) {
    
    
    
    
    this.statementRate = statementRate;
    return this;
  }

  public OBStatement2Detail addStatementRateItem(OBStatement2StatementRateInner statementRateItem) {
    if (this.statementRate == null) {
      this.statementRate = new ArrayList<>();
    }
    this.statementRate.add(statementRateItem);
    return this;
  }

   /**
   * Get statementRate
   * @return statementRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementRateInner> getStatementRate() {
    return statementRate;
  }


  public void setStatementRate(List<OBStatement2StatementRateInner> statementRate) {
    
    
    
    this.statementRate = statementRate;
  }


  public OBStatement2Detail statementValue(List<OBStatement2StatementValueInner> statementValue) {
    
    
    
    
    this.statementValue = statementValue;
    return this;
  }

  public OBStatement2Detail addStatementValueItem(OBStatement2StatementValueInner statementValueItem) {
    if (this.statementValue == null) {
      this.statementValue = new ArrayList<>();
    }
    this.statementValue.add(statementValueItem);
    return this;
  }

   /**
   * Get statementValue
   * @return statementValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBStatement2StatementValueInner> getStatementValue() {
    return statementValue;
  }


  public void setStatementValue(List<OBStatement2StatementValueInner> statementValue) {
    
    
    
    this.statementValue = statementValue;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the OBStatement2Detail instance itself
   */
  public OBStatement2Detail putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OBStatement2Detail obStatement2Detail = (OBStatement2Detail) o;
    return Objects.equals(this.accountId, obStatement2Detail.accountId) &&
        Objects.equals(this.statementId, obStatement2Detail.statementId) &&
        Objects.equals(this.statementReference, obStatement2Detail.statementReference) &&
        Objects.equals(this.type, obStatement2Detail.type) &&
        Objects.equals(this.startDateTime, obStatement2Detail.startDateTime) &&
        Objects.equals(this.endDateTime, obStatement2Detail.endDateTime) &&
        Objects.equals(this.creationDateTime, obStatement2Detail.creationDateTime) &&
        Objects.equals(this.statementDescription, obStatement2Detail.statementDescription) &&
        Objects.equals(this.statementBenefit, obStatement2Detail.statementBenefit) &&
        Objects.equals(this.statementFee, obStatement2Detail.statementFee) &&
        Objects.equals(this.statementInterest, obStatement2Detail.statementInterest) &&
        Objects.equals(this.statementAmount, obStatement2Detail.statementAmount) &&
        Objects.equals(this.statementDateTime, obStatement2Detail.statementDateTime) &&
        Objects.equals(this.statementRate, obStatement2Detail.statementRate) &&
        Objects.equals(this.statementValue, obStatement2Detail.statementValue)&&
        Objects.equals(this.additionalProperties, obStatement2Detail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, statementId, statementReference, type, startDateTime, endDateTime, creationDateTime, statementDescription, statementBenefit, statementFee, statementInterest, statementAmount, statementDateTime, statementRate, statementValue, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
    sb.append("    statementReference: ").append(toIndentedString(statementReference)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    statementDescription: ").append(toIndentedString(statementDescription)).append("\n");
    sb.append("    statementBenefit: ").append(toIndentedString(statementBenefit)).append("\n");
    sb.append("    statementFee: ").append(toIndentedString(statementFee)).append("\n");
    sb.append("    statementInterest: ").append(toIndentedString(statementInterest)).append("\n");
    sb.append("    statementAmount: ").append(toIndentedString(statementAmount)).append("\n");
    sb.append("    statementDateTime: ").append(toIndentedString(statementDateTime)).append("\n");
    sb.append("    statementRate: ").append(toIndentedString(statementRate)).append("\n");
    sb.append("    statementValue: ").append(toIndentedString(statementValue)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AccountId");
    openapiFields.add("StatementId");
    openapiFields.add("StatementReference");
    openapiFields.add("Type");
    openapiFields.add("StartDateTime");
    openapiFields.add("EndDateTime");
    openapiFields.add("CreationDateTime");
    openapiFields.add("StatementDescription");
    openapiFields.add("StatementBenefit");
    openapiFields.add("StatementFee");
    openapiFields.add("StatementInterest");
    openapiFields.add("StatementAmount");
    openapiFields.add("StatementDateTime");
    openapiFields.add("StatementRate");
    openapiFields.add("StatementValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("StartDateTime");
    openapiRequiredFields.add("EndDateTime");
    openapiRequiredFields.add("CreationDateTime");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBStatement2Detail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBStatement2Detail.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBStatement2Detail is not found in the empty JSON string", OBStatement2Detail.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBStatement2Detail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("StatementId") != null && !jsonObj.get("StatementId").isJsonNull()) && !jsonObj.get("StatementId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatementId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatementId").toString()));
      }
      if ((jsonObj.get("StatementReference") != null && !jsonObj.get("StatementReference").isJsonNull()) && !jsonObj.get("StatementReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatementReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StatementReference").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("StatementDescription") != null && !jsonObj.get("StatementDescription").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `StatementDescription` to be an array in the JSON string but got `%s`", jsonObj.get("StatementDescription").toString()));
      }
      if (jsonObj.get("StatementBenefit") != null && !jsonObj.get("StatementBenefit").isJsonNull()) {
        JsonArray jsonArraystatementBenefit = jsonObj.getAsJsonArray("StatementBenefit");
        if (jsonArraystatementBenefit != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementBenefit").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementBenefit` to be an array in the JSON string but got `%s`", jsonObj.get("StatementBenefit").toString()));
          }

          // validate the optional field `StatementBenefit` (array)
          for (int i = 0; i < jsonArraystatementBenefit.size(); i++) {
            OBStatement2StatementBenefitInner.validateJsonObject(jsonArraystatementBenefit.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementFee") != null && !jsonObj.get("StatementFee").isJsonNull()) {
        JsonArray jsonArraystatementFee = jsonObj.getAsJsonArray("StatementFee");
        if (jsonArraystatementFee != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementFee").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementFee` to be an array in the JSON string but got `%s`", jsonObj.get("StatementFee").toString()));
          }

          // validate the optional field `StatementFee` (array)
          for (int i = 0; i < jsonArraystatementFee.size(); i++) {
            OBStatement2StatementFeeInner.validateJsonObject(jsonArraystatementFee.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementInterest") != null && !jsonObj.get("StatementInterest").isJsonNull()) {
        JsonArray jsonArraystatementInterest = jsonObj.getAsJsonArray("StatementInterest");
        if (jsonArraystatementInterest != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementInterest").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementInterest` to be an array in the JSON string but got `%s`", jsonObj.get("StatementInterest").toString()));
          }

          // validate the optional field `StatementInterest` (array)
          for (int i = 0; i < jsonArraystatementInterest.size(); i++) {
            OBStatement2StatementInterestInner.validateJsonObject(jsonArraystatementInterest.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementAmount") != null && !jsonObj.get("StatementAmount").isJsonNull()) {
        JsonArray jsonArraystatementAmount = jsonObj.getAsJsonArray("StatementAmount");
        if (jsonArraystatementAmount != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementAmount").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementAmount` to be an array in the JSON string but got `%s`", jsonObj.get("StatementAmount").toString()));
          }

          // validate the optional field `StatementAmount` (array)
          for (int i = 0; i < jsonArraystatementAmount.size(); i++) {
            OBStatement2StatementAmountInner.validateJsonObject(jsonArraystatementAmount.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementDateTime") != null && !jsonObj.get("StatementDateTime").isJsonNull()) {
        JsonArray jsonArraystatementDateTime = jsonObj.getAsJsonArray("StatementDateTime");
        if (jsonArraystatementDateTime != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementDateTime").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementDateTime` to be an array in the JSON string but got `%s`", jsonObj.get("StatementDateTime").toString()));
          }

          // validate the optional field `StatementDateTime` (array)
          for (int i = 0; i < jsonArraystatementDateTime.size(); i++) {
            OBStatement2StatementDateTimeInner.validateJsonObject(jsonArraystatementDateTime.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementRate") != null && !jsonObj.get("StatementRate").isJsonNull()) {
        JsonArray jsonArraystatementRate = jsonObj.getAsJsonArray("StatementRate");
        if (jsonArraystatementRate != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementRate").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementRate` to be an array in the JSON string but got `%s`", jsonObj.get("StatementRate").toString()));
          }

          // validate the optional field `StatementRate` (array)
          for (int i = 0; i < jsonArraystatementRate.size(); i++) {
            OBStatement2StatementRateInner.validateJsonObject(jsonArraystatementRate.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StatementValue") != null && !jsonObj.get("StatementValue").isJsonNull()) {
        JsonArray jsonArraystatementValue = jsonObj.getAsJsonArray("StatementValue");
        if (jsonArraystatementValue != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StatementValue").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StatementValue` to be an array in the JSON string but got `%s`", jsonObj.get("StatementValue").toString()));
          }

          // validate the optional field `StatementValue` (array)
          for (int i = 0; i < jsonArraystatementValue.size(); i++) {
            OBStatement2StatementValueInner.validateJsonObject(jsonArraystatementValue.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBStatement2Detail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBStatement2Detail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBStatement2Detail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBStatement2Detail.class));

       return (TypeAdapter<T>) new TypeAdapter<OBStatement2Detail>() {
           @Override
           public void write(JsonWriter out, OBStatement2Detail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public OBStatement2Detail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBStatement2Detail instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OBStatement2Detail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBStatement2Detail
  * @throws IOException if the JSON string is invalid with respect to OBStatement2Detail
  */
  public static OBStatement2Detail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBStatement2Detail.class);
  }

 /**
  * Convert an instance of OBStatement2Detail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

