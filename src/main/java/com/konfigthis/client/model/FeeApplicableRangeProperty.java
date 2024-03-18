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
 * Range or amounts or rates for which the fee/charge applies
 */
@ApiModel(description = "Range or amounts or rates for which the fee/charge applies")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FeeApplicableRangeProperty {
  public static final String SERIALIZED_NAME_MINIMUM_AMOUNT = "MinimumAmount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_AMOUNT)
  private String minimumAmount;

  public static final String SERIALIZED_NAME_MAXIMUM_AMOUNT = "MaximumAmount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_AMOUNT)
  private String maximumAmount;

  public static final String SERIALIZED_NAME_MINIMUM_RATE = "MinimumRate";
  @SerializedName(SERIALIZED_NAME_MINIMUM_RATE)
  private String minimumRate;

  public static final String SERIALIZED_NAME_MAXIMUM_RATE = "MaximumRate";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_RATE)
  private String maximumRate;

  public FeeApplicableRangeProperty() {
  }

  public FeeApplicableRangeProperty minimumAmount(String minimumAmount) {
    
    
    
    
    this.minimumAmount = minimumAmount;
    return this;
  }

   /**
   * Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)
   * @return minimumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Minimum Amount on which fee/charge is applicable (where it is expressed as an amount)")

  public String getMinimumAmount() {
    return minimumAmount;
  }


  public void setMinimumAmount(String minimumAmount) {
    
    
    
    this.minimumAmount = minimumAmount;
  }


  public FeeApplicableRangeProperty maximumAmount(String maximumAmount) {
    
    
    
    
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * Maximum Amount on which fee is applicable (where it is expressed as an amount)
   * @return maximumAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "Maximum Amount on which fee is applicable (where it is expressed as an amount)")

  public String getMaximumAmount() {
    return maximumAmount;
  }


  public void setMaximumAmount(String maximumAmount) {
    
    
    
    this.maximumAmount = maximumAmount;
  }


  public FeeApplicableRangeProperty minimumRate(String minimumRate) {
    
    
    
    
    this.minimumRate = minimumRate;
    return this;
  }

   /**
   * Minimum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return minimumRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Minimum rate on which fee/charge is applicable(where it is expressed as an rate)")

  public String getMinimumRate() {
    return minimumRate;
  }


  public void setMinimumRate(String minimumRate) {
    
    
    
    this.minimumRate = minimumRate;
  }


  public FeeApplicableRangeProperty maximumRate(String maximumRate) {
    
    
    
    
    this.maximumRate = maximumRate;
    return this;
  }

   /**
   * Maximum rate on which fee/charge is applicable(where it is expressed as an rate)
   * @return maximumRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Maximum rate on which fee/charge is applicable(where it is expressed as an rate)")

  public String getMaximumRate() {
    return maximumRate;
  }


  public void setMaximumRate(String maximumRate) {
    
    
    
    this.maximumRate = maximumRate;
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
   * @return the FeeApplicableRangeProperty instance itself
   */
  public FeeApplicableRangeProperty putAdditionalProperty(String key, Object value) {
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
    FeeApplicableRangeProperty feeApplicableRangeProperty = (FeeApplicableRangeProperty) o;
    return Objects.equals(this.minimumAmount, feeApplicableRangeProperty.minimumAmount) &&
        Objects.equals(this.maximumAmount, feeApplicableRangeProperty.maximumAmount) &&
        Objects.equals(this.minimumRate, feeApplicableRangeProperty.minimumRate) &&
        Objects.equals(this.maximumRate, feeApplicableRangeProperty.maximumRate)&&
        Objects.equals(this.additionalProperties, feeApplicableRangeProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumAmount, maximumAmount, minimumRate, maximumRate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeeApplicableRangeProperty {\n");
    sb.append("    minimumAmount: ").append(toIndentedString(minimumAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    minimumRate: ").append(toIndentedString(minimumRate)).append("\n");
    sb.append("    maximumRate: ").append(toIndentedString(maximumRate)).append("\n");
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
    openapiFields.add("MinimumAmount");
    openapiFields.add("MaximumAmount");
    openapiFields.add("MinimumRate");
    openapiFields.add("MaximumRate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeeApplicableRangeProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FeeApplicableRangeProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeeApplicableRangeProperty is not found in the empty JSON string", FeeApplicableRangeProperty.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("MinimumAmount") != null && !jsonObj.get("MinimumAmount").isJsonNull()) && !jsonObj.get("MinimumAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MinimumAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MinimumAmount").toString()));
      }
      if ((jsonObj.get("MaximumAmount") != null && !jsonObj.get("MaximumAmount").isJsonNull()) && !jsonObj.get("MaximumAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaximumAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MaximumAmount").toString()));
      }
      if ((jsonObj.get("MinimumRate") != null && !jsonObj.get("MinimumRate").isJsonNull()) && !jsonObj.get("MinimumRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MinimumRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MinimumRate").toString()));
      }
      if ((jsonObj.get("MaximumRate") != null && !jsonObj.get("MaximumRate").isJsonNull()) && !jsonObj.get("MaximumRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MaximumRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MaximumRate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeeApplicableRangeProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeeApplicableRangeProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeeApplicableRangeProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeeApplicableRangeProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<FeeApplicableRangeProperty>() {
           @Override
           public void write(JsonWriter out, FeeApplicableRangeProperty value) throws IOException {
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
           public FeeApplicableRangeProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FeeApplicableRangeProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FeeApplicableRangeProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeeApplicableRangeProperty
  * @throws IOException if the JSON string is invalid with respect to FeeApplicableRangeProperty
  */
  public static FeeApplicableRangeProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeeApplicableRangeProperty.class);
  }

 /**
  * Convert an instance of FeeApplicableRangeProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

