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
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner;
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
 * Details about the interest that may be payable to the SME Loan holders
 */
@ApiModel(description = "Details about the interest that may be payable to the SME Loan holders")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {
  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_LOAN_INTEREST_TIER_BAND_SET = "LoanInterestTierBandSet";
  @SerializedName(SERIALIZED_NAME_LOAN_INTEREST_TIER_BAND_SET)
  private List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet = new ArrayList<>();

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest() {
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest loanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    
    
    
    
    this.loanInterestTierBandSet = loanInterestTierBandSet;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest addLoanInterestTierBandSetItem(OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner loanInterestTierBandSetItem) {
    this.loanInterestTierBandSet.add(loanInterestTierBandSetItem);
    return this;
  }

   /**
   * Get loanInterestTierBandSet
   * @return loanInterestTierBandSet
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> getLoanInterestTierBandSet() {
    return loanInterestTierBandSet;
  }


  public void setLoanInterestTierBandSet(List<OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner> loanInterestTierBandSet) {
    
    
    
    this.loanInterestTierBandSet = loanInterestTierBandSet;
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
   * @return the OBReadProduct2DataProductInnerOtherProductTypeLoanInterest instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductTypeLoanInterest obReadProduct2DataProductInnerOtherProductTypeLoanInterest = (OBReadProduct2DataProductInnerOtherProductTypeLoanInterest) o;
    return Objects.equals(this.notes, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.notes) &&
        Objects.equals(this.loanInterestTierBandSet, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.loanInterestTierBandSet)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductTypeLoanInterest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notes, loanInterestTierBandSet, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeLoanInterest {\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    loanInterestTierBandSet: ").append(toIndentedString(loanInterestTierBandSet)).append("\n");
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
    openapiFields.add("Notes");
    openapiFields.add("LoanInterestTierBandSet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("LoanInterestTierBandSet");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductTypeLoanInterest is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("LoanInterestTierBandSet").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LoanInterestTierBandSet` to be an array in the JSON string but got `%s`", jsonObj.get("LoanInterestTierBandSet").toString()));
      }

      JsonArray jsonArrayloanInterestTierBandSet = jsonObj.getAsJsonArray("LoanInterestTierBandSet");
      // validate the required field `LoanInterestTierBandSet` (array)
      for (int i = 0; i < jsonArrayloanInterestTierBandSet.size(); i++) {
        OBReadProduct2DataProductInnerOtherProductTypeLoanInterestLoanInterestTierBandSetInner.validateJsonObject(jsonArrayloanInterestTierBandSet.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductTypeLoanInterest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeLoanInterest>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductTypeLoanInterest value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductTypeLoanInterest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductTypeLoanInterest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterest
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeLoanInterest
  */
  public static OBReadProduct2DataProductInnerOtherProductTypeLoanInterest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductTypeLoanInterest.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductTypeLoanInterest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

