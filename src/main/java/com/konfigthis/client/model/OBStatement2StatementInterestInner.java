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
import com.konfigthis.client.model.OBActiveOrHistoricCurrencyAndAmount7;
import com.konfigthis.client.model.OBCreditDebitCode0;
import com.konfigthis.client.model.OBExternalStatementInterestFrequency1Code;
import com.konfigthis.client.model.OBExternalStatementInterestRateType1Code;
import com.konfigthis.client.model.OBExternalStatementInterestType1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Set of elements used to provide details of a generic interest amount related to the statement resource.
 */
@ApiModel(description = "Set of elements used to provide details of a generic interest amount related to the statement resource.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBStatement2StatementInterestInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR = "CreditDebitIndicator";
  @SerializedName(SERIALIZED_NAME_CREDIT_DEBIT_INDICATOR)
  private OBCreditDebitCode0 creditDebitIndicator;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OBExternalStatementInterestType1Code type;

  public static final String SERIALIZED_NAME_RATE = "Rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private Double rate;

  public static final String SERIALIZED_NAME_RATE_TYPE = "RateType";
  @SerializedName(SERIALIZED_NAME_RATE_TYPE)
  private OBExternalStatementInterestRateType1Code rateType;

  public static final String SERIALIZED_NAME_FREQUENCY = "Frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private OBExternalStatementInterestFrequency1Code frequency;

  public static final String SERIALIZED_NAME_AMOUNT = "Amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private OBActiveOrHistoricCurrencyAndAmount7 amount;

  public OBStatement2StatementInterestInner() {
  }

  public OBStatement2StatementInterestInner description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * Description that may be available for the statement interest.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test Description", value = "Description that may be available for the statement interest.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
  }


  public OBStatement2StatementInterestInner creditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
    return this;
  }

   /**
   * Get creditDebitIndicator
   * @return creditDebitIndicator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBCreditDebitCode0 getCreditDebitIndicator() {
    return creditDebitIndicator;
  }


  public void setCreditDebitIndicator(OBCreditDebitCode0 creditDebitIndicator) {
    
    
    
    this.creditDebitIndicator = creditDebitIndicator;
  }


  public OBStatement2StatementInterestInner type(OBExternalStatementInterestType1Code type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBExternalStatementInterestType1Code getType() {
    return type;
  }


  public void setType(OBExternalStatementInterestType1Code type) {
    
    
    
    this.type = type;
  }


  public OBStatement2StatementInterestInner rate(Double rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

  public OBStatement2StatementInterestInner rate(Integer rate) {
    
    
    
    
    this.rate = rate.doubleValue();
    return this;
  }

   /**
   * field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12", value = "field representing a percentage (e.g. 0.05 represents 5% and 0.9525 represents 95.25%). Note the number of decimal places may vary.")

  public Double getRate() {
    return rate;
  }


  public void setRate(Double rate) {
    
    
    
    this.rate = rate;
  }


  public OBStatement2StatementInterestInner rateType(OBExternalStatementInterestRateType1Code rateType) {
    
    
    
    
    this.rateType = rateType;
    return this;
  }

   /**
   * Get rateType
   * @return rateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBExternalStatementInterestRateType1Code getRateType() {
    return rateType;
  }


  public void setRateType(OBExternalStatementInterestRateType1Code rateType) {
    
    
    
    this.rateType = rateType;
  }


  public OBStatement2StatementInterestInner frequency(OBExternalStatementInterestFrequency1Code frequency) {
    
    
    
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBExternalStatementInterestFrequency1Code getFrequency() {
    return frequency;
  }


  public void setFrequency(OBExternalStatementInterestFrequency1Code frequency) {
    
    
    
    this.frequency = frequency;
  }


  public OBStatement2StatementInterestInner amount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    
    
    
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBActiveOrHistoricCurrencyAndAmount7 getAmount() {
    return amount;
  }


  public void setAmount(OBActiveOrHistoricCurrencyAndAmount7 amount) {
    
    
    
    this.amount = amount;
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
   * @return the OBStatement2StatementInterestInner instance itself
   */
  public OBStatement2StatementInterestInner putAdditionalProperty(String key, Object value) {
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
    OBStatement2StatementInterestInner obStatement2StatementInterestInner = (OBStatement2StatementInterestInner) o;
    return Objects.equals(this.description, obStatement2StatementInterestInner.description) &&
        Objects.equals(this.creditDebitIndicator, obStatement2StatementInterestInner.creditDebitIndicator) &&
        Objects.equals(this.type, obStatement2StatementInterestInner.type) &&
        Objects.equals(this.rate, obStatement2StatementInterestInner.rate) &&
        Objects.equals(this.rateType, obStatement2StatementInterestInner.rateType) &&
        Objects.equals(this.frequency, obStatement2StatementInterestInner.frequency) &&
        Objects.equals(this.amount, obStatement2StatementInterestInner.amount)&&
        Objects.equals(this.additionalProperties, obStatement2StatementInterestInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, creditDebitIndicator, type, rate, rateType, frequency, amount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBStatement2StatementInterestInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    rateType: ").append(toIndentedString(rateType)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("CreditDebitIndicator");
    openapiFields.add("Type");
    openapiFields.add("Rate");
    openapiFields.add("RateType");
    openapiFields.add("Frequency");
    openapiFields.add("Amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CreditDebitIndicator");
    openapiRequiredFields.add("Type");
    openapiRequiredFields.add("Amount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBStatement2StatementInterestInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBStatement2StatementInterestInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBStatement2StatementInterestInner is not found in the empty JSON string", OBStatement2StatementInterestInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBStatement2StatementInterestInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // validate the required field `Amount`
      OBActiveOrHistoricCurrencyAndAmount7.validateJsonObject(jsonObj.getAsJsonObject("Amount"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBStatement2StatementInterestInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBStatement2StatementInterestInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBStatement2StatementInterestInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBStatement2StatementInterestInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBStatement2StatementInterestInner>() {
           @Override
           public void write(JsonWriter out, OBStatement2StatementInterestInner value) throws IOException {
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
           public OBStatement2StatementInterestInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBStatement2StatementInterestInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBStatement2StatementInterestInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBStatement2StatementInterestInner
  * @throws IOException if the JSON string is invalid with respect to OBStatement2StatementInterestInner
  */
  public static OBStatement2StatementInterestInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBStatement2StatementInterestInner.class);
  }

 /**
  * Convert an instance of OBStatement2StatementInterestInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
