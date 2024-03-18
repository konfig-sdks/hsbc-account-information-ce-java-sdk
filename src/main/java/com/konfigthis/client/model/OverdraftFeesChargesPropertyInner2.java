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
import com.konfigthis.client.model.OverdraftFeeChargeCapPropertyInner4;
import com.konfigthis.client.model.OverdraftFeeChargeDetailPropertyInner2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * Overdraft fees and charges
 */
@ApiModel(description = "Overdraft fees and charges")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OverdraftFeesChargesPropertyInner2 {
  public static final String SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_CAP = "OverdraftFeeChargeCap";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_CAP)
  private List<OverdraftFeeChargeCapPropertyInner4> overdraftFeeChargeCap = null;

  public static final String SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_DETAIL = "OverdraftFeeChargeDetail";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_DETAIL)
  private List<OverdraftFeeChargeDetailPropertyInner2> overdraftFeeChargeDetail = new ArrayList<>();

  public OverdraftFeesChargesPropertyInner2() {
  }

  public OverdraftFeesChargesPropertyInner2 overdraftFeeChargeCap(List<OverdraftFeeChargeCapPropertyInner4> overdraftFeeChargeCap) {
    
    
    
    
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

  public OverdraftFeesChargesPropertyInner2 addOverdraftFeeChargeCapItem(OverdraftFeeChargeCapPropertyInner4 overdraftFeeChargeCapItem) {
    if (this.overdraftFeeChargeCap == null) {
      this.overdraftFeeChargeCap = new ArrayList<>();
    }
    this.overdraftFeeChargeCap.add(overdraftFeeChargeCapItem);
    return this;
  }

   /**
   * Details about any caps (maximum charges) that apply to a particular fee/charge
   * @return overdraftFeeChargeCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details about any caps (maximum charges) that apply to a particular fee/charge")

  public List<OverdraftFeeChargeCapPropertyInner4> getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }


  public void setOverdraftFeeChargeCap(List<OverdraftFeeChargeCapPropertyInner4> overdraftFeeChargeCap) {
    
    
    
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
  }


  public OverdraftFeesChargesPropertyInner2 overdraftFeeChargeDetail(List<OverdraftFeeChargeDetailPropertyInner2> overdraftFeeChargeDetail) {
    
    
    
    
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
    return this;
  }

  public OverdraftFeesChargesPropertyInner2 addOverdraftFeeChargeDetailItem(OverdraftFeeChargeDetailPropertyInner2 overdraftFeeChargeDetailItem) {
    this.overdraftFeeChargeDetail.add(overdraftFeeChargeDetailItem);
    return this;
  }

   /**
   * Details about the fees/charges
   * @return overdraftFeeChargeDetail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Details about the fees/charges")

  public List<OverdraftFeeChargeDetailPropertyInner2> getOverdraftFeeChargeDetail() {
    return overdraftFeeChargeDetail;
  }


  public void setOverdraftFeeChargeDetail(List<OverdraftFeeChargeDetailPropertyInner2> overdraftFeeChargeDetail) {
    
    
    
    this.overdraftFeeChargeDetail = overdraftFeeChargeDetail;
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
   * @return the OverdraftFeesChargesPropertyInner2 instance itself
   */
  public OverdraftFeesChargesPropertyInner2 putAdditionalProperty(String key, Object value) {
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
    OverdraftFeesChargesPropertyInner2 overdraftFeesChargesPropertyInner2 = (OverdraftFeesChargesPropertyInner2) o;
    return Objects.equals(this.overdraftFeeChargeCap, overdraftFeesChargesPropertyInner2.overdraftFeeChargeCap) &&
        Objects.equals(this.overdraftFeeChargeDetail, overdraftFeesChargesPropertyInner2.overdraftFeeChargeDetail)&&
        Objects.equals(this.additionalProperties, overdraftFeesChargesPropertyInner2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overdraftFeeChargeCap, overdraftFeeChargeDetail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeesChargesPropertyInner2 {\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
    sb.append("    overdraftFeeChargeDetail: ").append(toIndentedString(overdraftFeeChargeDetail)).append("\n");
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
    openapiFields.add("OverdraftFeeChargeCap");
    openapiFields.add("OverdraftFeeChargeDetail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("OverdraftFeeChargeDetail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverdraftFeesChargesPropertyInner2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OverdraftFeesChargesPropertyInner2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverdraftFeesChargesPropertyInner2 is not found in the empty JSON string", OverdraftFeesChargesPropertyInner2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OverdraftFeesChargesPropertyInner2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("OverdraftFeeChargeCap") != null && !jsonObj.get("OverdraftFeeChargeCap").isJsonNull()) {
        JsonArray jsonArrayoverdraftFeeChargeCap = jsonObj.getAsJsonArray("OverdraftFeeChargeCap");
        if (jsonArrayoverdraftFeeChargeCap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OverdraftFeeChargeCap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OverdraftFeeChargeCap` to be an array in the JSON string but got `%s`", jsonObj.get("OverdraftFeeChargeCap").toString()));
          }

          // validate the optional field `OverdraftFeeChargeCap` (array)
          for (int i = 0; i < jsonArrayoverdraftFeeChargeCap.size(); i++) {
            OverdraftFeeChargeCapPropertyInner4.validateJsonObject(jsonArrayoverdraftFeeChargeCap.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("OverdraftFeeChargeDetail").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `OverdraftFeeChargeDetail` to be an array in the JSON string but got `%s`", jsonObj.get("OverdraftFeeChargeDetail").toString()));
      }

      JsonArray jsonArrayoverdraftFeeChargeDetail = jsonObj.getAsJsonArray("OverdraftFeeChargeDetail");
      // validate the required field `OverdraftFeeChargeDetail` (array)
      for (int i = 0; i < jsonArrayoverdraftFeeChargeDetail.size(); i++) {
        OverdraftFeeChargeDetailPropertyInner2.validateJsonObject(jsonArrayoverdraftFeeChargeDetail.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverdraftFeesChargesPropertyInner2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverdraftFeesChargesPropertyInner2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverdraftFeesChargesPropertyInner2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverdraftFeesChargesPropertyInner2.class));

       return (TypeAdapter<T>) new TypeAdapter<OverdraftFeesChargesPropertyInner2>() {
           @Override
           public void write(JsonWriter out, OverdraftFeesChargesPropertyInner2 value) throws IOException {
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
           public OverdraftFeesChargesPropertyInner2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OverdraftFeesChargesPropertyInner2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OverdraftFeesChargesPropertyInner2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverdraftFeesChargesPropertyInner2
  * @throws IOException if the JSON string is invalid with respect to OverdraftFeesChargesPropertyInner2
  */
  public static OverdraftFeesChargesPropertyInner2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverdraftFeesChargesPropertyInner2.class);
  }

 /**
  * Convert an instance of OverdraftFeesChargesPropertyInner2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

