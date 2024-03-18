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
import com.konfigthis.client.model.OBBalanceType1Code;
import com.konfigthis.client.model.OBCreditDebitCode2;
import com.konfigthis.client.model.OBReadBalance1DataBalanceInnerAmount;
import com.konfigthis.client.model.OBReadBalance1DataBalanceInnerCreditLineInner;
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
 * Set of elements used to define the balance details.
 */
@ApiModel(description = "Set of elements used to define the balance details.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadBalance1DataBalanceInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR = "CreditDebitIndicator";
  @SerializedName(SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR)
  private OBCreditDebitCode2 creditDebitIndicator;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OBBalanceType1Code type;

  public static final String SERIALIZED_NAME_DATE_TIME = "DateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private OffsetDateTime dateTime;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OBReadBalance1DataBalanceInnerAmount amount;

  public static final String SERIALIZED_NAME_CREDIT_LINE = "CreditLine";
  @SerializedName(SERIALIZED_NAME_CREDIT_LINE)
  private List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine = null;

  public OBReadBalance1DataBalanceInner() {
  }

  public OBReadBalance1DataBalanceInner accountId(String accountId) {
    
    
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


  public OBReadBalance1DataBalanceInner creditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBCreditDebitCode2 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }


  public void setCreditDebitIndicator(OBCreditDebitCode2 creditDebitIndicator) {
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
  }


  public OBReadBalance1DataBalanceInner type(OBBalanceType1Code type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBBalanceType1Code getType() {
    return type;
  }


  public void setType(OBBalanceType1Code type) {
    
    
    
    this.type = type;
  }


  public OBReadBalance1DataBalanceInner dateTime(OffsetDateTime dateTime) {
    
    
    
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return dateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getDateTime() {
    return dateTime;
  }


  public void setDateTime(OffsetDateTime dateTime) {
    
    
    
    this.dateTime = dateTime;
  }


  public OBReadBalance1DataBalanceInner amount(OBReadBalance1DataBalanceInnerAmount amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBReadBalance1DataBalanceInnerAmount getAmount() {
    return amount;
  }


  public void setAmount(OBReadBalance1DataBalanceInnerAmount amount) {
    
    
    
    this.amount = amount;
  }


  public OBReadBalance1DataBalanceInner creditLine(List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
    
    
    
    
    this.creditLine = creditLine;
    return this;
  }

  public OBReadBalance1DataBalanceInner addCreditLineItem(OBReadBalance1DataBalanceInnerCreditLineInner creditLineItem) {
    if (this.creditLine == null) {
      this.creditLine = new ArrayList<>();
    }
    this.creditLine.add(creditLineItem);
    return this;
  }

   /**
   * Get creditLine
   * @return creditLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBReadBalance1DataBalanceInnerCreditLineInner> getCreditLine() {
    return creditLine;
  }


  public void setCreditLine(List<OBReadBalance1DataBalanceInnerCreditLineInner> creditLine) {
    
    
    
    this.creditLine = creditLine;
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
   * @return the OBReadBalance1DataBalanceInner instance itself
   */
  public OBReadBalance1DataBalanceInner putAdditionalProperty(String key, Object value) {
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
    OBReadBalance1DataBalanceInner obReadBalance1DataBalanceInner = (OBReadBalance1DataBalanceInner) o;
    return Objects.equals(this.accountId, obReadBalance1DataBalanceInner.accountId) &&
        Objects.equals(this.creditDebitIndicator, obReadBalance1DataBalanceInner.creditDebitIndicator) &&
        Objects.equals(this.type, obReadBalance1DataBalanceInner.type) &&
        Objects.equals(this.dateTime, obReadBalance1DataBalanceInner.dateTime) &&
        Objects.equals(this.amount, obReadBalance1DataBalanceInner.amount) &&
        Objects.equals(this.creditLine, obReadBalance1DataBalanceInner.creditLine)&&
        Objects.equals(this.additionalProperties, obReadBalance1DataBalanceInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, creditDebitIndicator, type, dateTime, amount, creditLine, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadBalance1DataBalanceInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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
    openapiFields.add("CreditDebitIndicator");
    openapiFields.add("Type");
    openapiFields.add("DateTime");
    openapiFields.add("Amount");
    openapiFields.add("CreditLine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("CreditDebitIndicator");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("DateTime");
    openapiRequiredFields.add("Amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadBalance1DataBalanceInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadBalance1DataBalanceInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadBalance1DataBalanceInner is not found in the empty JSON string", OBReadBalance1DataBalanceInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadBalance1DataBalanceInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      // validate the required field `Amount`
      OBReadBalance1DataBalanceInnerAmount.validateJsonObject(jsonObj.getAsJsonObject("Amount"));
      if (jsonObj.get("CreditLine") != null && !jsonObj.get("CreditLine").isJsonNull()) {
        JsonArray jsonArraycreditLine = jsonObj.getAsJsonArray("CreditLine");
        if (jsonArraycreditLine != null) {
          // ensure the json data is an array
          if (!jsonObj.get("CreditLine").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `CreditLine` to be an array in the JSON string but got `%s`", jsonObj.get("CreditLine").toString()));
          }

          // validate the optional field `CreditLine` (array)
          for (int i = 0; i < jsonArraycreditLine.size(); i++) {
            OBReadBalance1DataBalanceInnerCreditLineInner.validateJsonObject(jsonArraycreditLine.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadBalance1DataBalanceInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadBalance1DataBalanceInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadBalance1DataBalanceInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadBalance1DataBalanceInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadBalance1DataBalanceInner>() {
           @Override
           public void write(JsonWriter out, OBReadBalance1DataBalanceInner value) throws IOException {
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
           public OBReadBalance1DataBalanceInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadBalance1DataBalanceInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadBalance1DataBalanceInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadBalance1DataBalanceInner
  * @throws IOException if the JSON string is invalid with respect to OBReadBalance1DataBalanceInner
  */
  public static OBReadBalance1DataBalanceInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadBalance1DataBalanceInner.class);
  }

 /**
  * Convert an instance of OBReadBalance1DataBalanceInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

