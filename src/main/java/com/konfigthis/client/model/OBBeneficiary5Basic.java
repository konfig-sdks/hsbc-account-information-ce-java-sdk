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
import com.konfigthis.client.model.OBBeneficiaryType1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * OBBeneficiary5Basic
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBBeneficiary5Basic {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_BENEFICIARY_ID = "BeneficiaryId";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_ID)
  private String beneficiaryId;

  public static final String SERIALIZED_NAME_BENEFICIARY_TYPE = "BeneficiaryType";
  @SerializedName(SERIALIZED_NAME_BENEFICIARY_TYPE)
  private OBBeneficiaryType1Code beneficiaryType;

  public static final String SERIALIZED_NAME_REFERENCE = "Reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY_DATA = "SupplementaryData";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY_DATA)
  private Map<String, Object> supplementaryData = null;

  public OBBeneficiary5Basic() {
  }

  public OBBeneficiary5Basic accountId(String accountId) {
    
    
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
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WQEF7_6iy3HEWspIs8CDOw", value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    this.accountId = accountId;
  }


  public OBBeneficiary5Basic beneficiaryId(String beneficiaryId) {
    
    
    if (beneficiaryId != null && beneficiaryId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for beneficiaryId. Length must be greater than or equal to 1.");
    }
    
    this.beneficiaryId = beneficiaryId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
   * @return beneficiaryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BeneficiaryId", value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")

  public String getBeneficiaryId() {
    return beneficiaryId;
  }


  public void setBeneficiaryId(String beneficiaryId) {
    
    
    if (beneficiaryId != null && beneficiaryId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for beneficiaryId. Length must be greater than or equal to 1.");
    }
    this.beneficiaryId = beneficiaryId;
  }


  public OBBeneficiary5Basic beneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    
    
    
    
    this.beneficiaryType = beneficiaryType;
    return this;
  }

   /**
   * Get beneficiaryType
   * @return beneficiaryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBeneficiaryType1Code getBeneficiaryType() {
    return beneficiaryType;
  }


  public void setBeneficiaryType(OBBeneficiaryType1Code beneficiaryType) {
    
    
    
    this.beneficiaryType = beneficiaryType;
  }


  public OBBeneficiary5Basic reference(String reference) {
    
    
    if (reference != null && reference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for reference. Length must be greater than or equal to 1.");
    }
    
    this.reference = reference;
    return this;
  }

   /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example Reference", value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    
    
    if (reference != null && reference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for reference. Length must be greater than or equal to 1.");
    }
    this.reference = reference;
  }


  public OBBeneficiary5Basic supplementaryData(Map<String, Object> supplementaryData) {
    
    
    
    
    this.supplementaryData = supplementaryData;
    return this;
  }

  public OBBeneficiary5Basic putSupplementaryDataItem(String key, Object supplementaryDataItem) {
    if (this.supplementaryData == null) {
      this.supplementaryData = new HashMap<>();
    }
    this.supplementaryData.put(key, supplementaryDataItem);
    return this;
  }

   /**
   * Additional information that can not be captured in the structured fields and/or any other specific block.
   * @return supplementaryData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional information that can not be captured in the structured fields and/or any other specific block.")

  public Map<String, Object> getSupplementaryData() {
    return supplementaryData;
  }


  public void setSupplementaryData(Map<String, Object> supplementaryData) {
    
    
    
    this.supplementaryData = supplementaryData;
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
   * @return the OBBeneficiary5Basic instance itself
   */
  public OBBeneficiary5Basic putAdditionalProperty(String key, Object value) {
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
    OBBeneficiary5Basic obBeneficiary5Basic = (OBBeneficiary5Basic) o;
    return Objects.equals(this.accountId, obBeneficiary5Basic.accountId) &&
        Objects.equals(this.beneficiaryId, obBeneficiary5Basic.beneficiaryId) &&
        Objects.equals(this.beneficiaryType, obBeneficiary5Basic.beneficiaryType) &&
        Objects.equals(this.reference, obBeneficiary5Basic.reference) &&
        Objects.equals(this.supplementaryData, obBeneficiary5Basic.supplementaryData)&&
        Objects.equals(this.additionalProperties, obBeneficiary5Basic.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, beneficiaryType, reference, supplementaryData, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBBeneficiary5Basic {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    beneficiaryType: ").append(toIndentedString(beneficiaryType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    supplementaryData: ").append(toIndentedString(supplementaryData)).append("\n");
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
    openapiFields.add("BeneficiaryId");
    openapiFields.add("BeneficiaryType");
    openapiFields.add("Reference");
    openapiFields.add("SupplementaryData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBBeneficiary5Basic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBBeneficiary5Basic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBBeneficiary5Basic is not found in the empty JSON string", OBBeneficiary5Basic.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("AccountId") != null && !jsonObj.get("AccountId").isJsonNull()) && !jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("BeneficiaryId") != null && !jsonObj.get("BeneficiaryId").isJsonNull()) && !jsonObj.get("BeneficiaryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `BeneficiaryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("BeneficiaryId").toString()));
      }
      if ((jsonObj.get("Reference") != null && !jsonObj.get("Reference").isJsonNull()) && !jsonObj.get("Reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Reference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBBeneficiary5Basic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBBeneficiary5Basic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBBeneficiary5Basic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBBeneficiary5Basic.class));

       return (TypeAdapter<T>) new TypeAdapter<OBBeneficiary5Basic>() {
           @Override
           public void write(JsonWriter out, OBBeneficiary5Basic value) throws IOException {
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
           public OBBeneficiary5Basic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBBeneficiary5Basic instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBBeneficiary5Basic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBBeneficiary5Basic
  * @throws IOException if the JSON string is invalid with respect to OBBeneficiary5Basic
  */
  public static OBBeneficiary5Basic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBBeneficiary5Basic.class);
  }

 /**
  * Convert an instance of OBBeneficiary5Basic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

