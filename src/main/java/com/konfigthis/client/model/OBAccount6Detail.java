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
import com.konfigthis.client.model.OBAccount6DetailAccountInner;
import com.konfigthis.client.model.OBAccountStatus1Code;
import com.konfigthis.client.model.OBBranchAndFinancialInstitutionIdentification50;
import com.konfigthis.client.model.OBExternalAccountSubType1Code;
import com.konfigthis.client.model.OBExternalAccountType1Code;
import com.konfigthis.client.model.OBExternalSwitchStatusCode;
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
 * Unambiguous identification of the account to which credit and debit entries are made.
 */
@ApiModel(description = "Unambiguous identification of the account to which credit and debit entries are made.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBAccount6Detail {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private OBAccountStatus1Code status;

  public static final String SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME = "StatusUpdateDateTime";
  @SerializedName(SERIALIZED_NAME_STATUS_UPDATE_DATE_TIME)
  private OffsetDateTime statusUpdateDateTime;

  public static final String SERIALIZED_NAME_CURRENCY = "Currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "AccountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private OBExternalAccountType1Code accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_SUB_TYPE = "AccountSubType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_SUB_TYPE)
  private OBExternalAccountSubType1Code accountSubType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NICKNAME = "Nickname";
  @SerializedName(SERIALIZED_NAME_NICKNAME)
  private String nickname;

  public static final String SERIALIZED_NAME_OPENING_DATE = "OpeningDate";
  @SerializedName(SERIALIZED_NAME_OPENING_DATE)
  private OffsetDateTime openingDate;

  public static final String SERIALIZED_NAME_MATURITY_DATE = "MaturityDate";
  @SerializedName(SERIALIZED_NAME_MATURITY_DATE)
  private OffsetDateTime maturityDate;

  public static final String SERIALIZED_NAME_SWITCH_STATUS = "SwitchStatus";
  @SerializedName(SERIALIZED_NAME_SWITCH_STATUS)
  private OBExternalSwitchStatusCode switchStatus;

  public static final String SERIALIZED_NAME_ACCOUNT = "Account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private List<OBAccount6DetailAccountInner> account = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICER = "Servicer";
  @SerializedName(SERIALIZED_NAME_SERVICER)
  private OBBranchAndFinancialInstitutionIdentification50 servicer;

  public OBAccount6Detail() {
  }

  public OBAccount6Detail accountId(String accountId) {
    
    
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


  public OBAccount6Detail status(OBAccountStatus1Code status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBAccountStatus1Code getStatus() {
    return status;
  }


  public void setStatus(OBAccountStatus1Code status) {
    
    
    
    this.status = status;
  }


  public OBAccount6Detail statusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    
    
    
    
    this.statusUpdateDateTime = statusUpdateDateTime;
    return this;
  }

   /**
   * Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return statusUpdateDateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-04T00:00Z", value = "Date and time at which the resource status was updated.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getStatusUpdateDateTime() {
    return statusUpdateDateTime;
  }


  public void setStatusUpdateDateTime(OffsetDateTime statusUpdateDateTime) {
    
    
    
    this.statusUpdateDateTime = statusUpdateDateTime;
  }


  public OBAccount6Detail currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "x5555", required = true, value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public OBAccount6Detail accountType(OBExternalAccountType1Code accountType) {
    
    
    
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBExternalAccountType1Code getAccountType() {
    return accountType;
  }


  public void setAccountType(OBExternalAccountType1Code accountType) {
    
    
    
    this.accountType = accountType;
  }


  public OBAccount6Detail accountSubType(OBExternalAccountSubType1Code accountSubType) {
    
    
    
    
    this.accountSubType = accountSubType;
    return this;
  }

   /**
   * Get accountSubType
   * @return accountSubType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBExternalAccountSubType1Code getAccountSubType() {
    return accountSubType;
  }


  public void setAccountSubType(OBExternalAccountSubType1Code accountSubType) {
    
    
    
    this.accountSubType = accountSubType;
  }


  public OBAccount6Detail description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the description of the account type.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test Description", value = "Specifies the description of the account type.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public OBAccount6Detail nickname(String nickname) {
    
    
    if (nickname != null && nickname.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nickname. Length must be greater than or equal to 1.");
    }
    
    this.nickname = nickname;
    return this;
  }

   /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAB ALL CARE", value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")

  public String getNickname() {
    return nickname;
  }


  public void setNickname(String nickname) {
    
    
    if (nickname != null && nickname.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nickname. Length must be greater than or equal to 1.");
    }
    this.nickname = nickname;
  }


  public OBAccount6Detail openingDate(OffsetDateTime openingDate) {
    
    
    
    
    this.openingDate = openingDate;
    return this;
  }

   /**
   * Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return openingDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-04T00:00Z", value = "Date on which the account and related basic services are effectively operational for the account owner.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getOpeningDate() {
    return openingDate;
  }


  public void setOpeningDate(OffsetDateTime openingDate) {
    
    
    
    this.openingDate = openingDate;
  }


  public OBAccount6Detail maturityDate(OffsetDateTime maturityDate) {
    
    
    
    
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-01-04T13:21:59Z", value = "Maturity date of the account.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getMaturityDate() {
    return maturityDate;
  }


  public void setMaturityDate(OffsetDateTime maturityDate) {
    
    
    
    this.maturityDate = maturityDate;
  }


  public OBAccount6Detail switchStatus(OBExternalSwitchStatusCode switchStatus) {
    
    
    
    
    this.switchStatus = switchStatus;
    return this;
  }

   /**
   * Get switchStatus
   * @return switchStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBExternalSwitchStatusCode getSwitchStatus() {
    return switchStatus;
  }


  public void setSwitchStatus(OBExternalSwitchStatusCode switchStatus) {
    
    
    
    this.switchStatus = switchStatus;
  }


  public OBAccount6Detail account(List<OBAccount6DetailAccountInner> account) {
    
    
    
    
    this.account = account;
    return this;
  }

  public OBAccount6Detail addAccountItem(OBAccount6DetailAccountInner accountItem) {
    this.account.add(accountItem);
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OBAccount6DetailAccountInner> getAccount() {
    return account;
  }


  public void setAccount(List<OBAccount6DetailAccountInner> account) {
    
    
    
    this.account = account;
  }


  public OBAccount6Detail servicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    
    
    
    
    this.servicer = servicer;
    return this;
  }

   /**
   * Get servicer
   * @return servicer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBranchAndFinancialInstitutionIdentification50 getServicer() {
    return servicer;
  }


  public void setServicer(OBBranchAndFinancialInstitutionIdentification50 servicer) {
    
    
    
    this.servicer = servicer;
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
   * @return the OBAccount6Detail instance itself
   */
  public OBAccount6Detail putAdditionalProperty(String key, Object value) {
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
    OBAccount6Detail obAccount6Detail = (OBAccount6Detail) o;
    return Objects.equals(this.accountId, obAccount6Detail.accountId) &&
        Objects.equals(this.status, obAccount6Detail.status) &&
        Objects.equals(this.statusUpdateDateTime, obAccount6Detail.statusUpdateDateTime) &&
        Objects.equals(this.currency, obAccount6Detail.currency) &&
        Objects.equals(this.accountType, obAccount6Detail.accountType) &&
        Objects.equals(this.accountSubType, obAccount6Detail.accountSubType) &&
        Objects.equals(this.description, obAccount6Detail.description) &&
        Objects.equals(this.nickname, obAccount6Detail.nickname) &&
        Objects.equals(this.openingDate, obAccount6Detail.openingDate) &&
        Objects.equals(this.maturityDate, obAccount6Detail.maturityDate) &&
        Objects.equals(this.switchStatus, obAccount6Detail.switchStatus) &&
        Objects.equals(this.account, obAccount6Detail.account) &&
        Objects.equals(this.servicer, obAccount6Detail.servicer)&&
        Objects.equals(this.additionalProperties, obAccount6Detail.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, statusUpdateDateTime, currency, accountType, accountSubType, description, nickname, openingDate, maturityDate, switchStatus, account, servicer, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBAccount6Detail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdateDateTime: ").append(toIndentedString(statusUpdateDateTime)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountSubType: ").append(toIndentedString(accountSubType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    switchStatus: ").append(toIndentedString(switchStatus)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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
    openapiFields.add("Status");
    openapiFields.add("StatusUpdateDateTime");
    openapiFields.add("Currency");
    openapiFields.add("AccountType");
    openapiFields.add("AccountSubType");
    openapiFields.add("Description");
    openapiFields.add("Nickname");
    openapiFields.add("OpeningDate");
    openapiFields.add("MaturityDate");
    openapiFields.add("SwitchStatus");
    openapiFields.add("Account");
    openapiFields.add("Servicer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("Currency");
    openapiRequiredFields.add("AccountType");
    openapiRequiredFields.add("AccountSubType");
    openapiRequiredFields.add("Account");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBAccount6Detail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBAccount6Detail.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBAccount6Detail is not found in the empty JSON string", OBAccount6Detail.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBAccount6Detail.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if (!jsonObj.get("Currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Currency").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Nickname") != null && !jsonObj.get("Nickname").isJsonNull()) && !jsonObj.get("Nickname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Nickname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Nickname").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Account").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Account` to be an array in the JSON string but got `%s`", jsonObj.get("Account").toString()));
      }

      JsonArray jsonArrayaccount = jsonObj.getAsJsonArray("Account");
      // validate the required field `Account` (array)
      for (int i = 0; i < jsonArrayaccount.size(); i++) {
        OBAccount6DetailAccountInner.validateJsonObject(jsonArrayaccount.get(i).getAsJsonObject());
      };
      // validate the optional field `Servicer`
      if (jsonObj.get("Servicer") != null && !jsonObj.get("Servicer").isJsonNull()) {
        OBBranchAndFinancialInstitutionIdentification50.validateJsonObject(jsonObj.getAsJsonObject("Servicer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBAccount6Detail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBAccount6Detail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBAccount6Detail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBAccount6Detail.class));

       return (TypeAdapter<T>) new TypeAdapter<OBAccount6Detail>() {
           @Override
           public void write(JsonWriter out, OBAccount6Detail value) throws IOException {
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
           public OBAccount6Detail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBAccount6Detail instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBAccount6Detail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBAccount6Detail
  * @throws IOException if the JSON string is invalid with respect to OBAccount6Detail
  */
  public static OBAccount6Detail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBAccount6Detail.class);
  }

 /**
  * Convert an instance of OBAccount6Detail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
