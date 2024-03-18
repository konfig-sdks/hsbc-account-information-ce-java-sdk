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
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType;
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
 * Contains details of fees and charges which are not associated with either Overdraft or features/benefits
 */
@ApiModel(description = "Contains details of fees and charges which are not associated with either Overdraft or features/benefits")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {
  /**
   * TariffType which defines the fee and charges.
   */
  @JsonAdapter(TariffTypeEnum.Adapter.class)
 public enum TariffTypeEnum {
    TTEL("TTEL"),
    
    TTMX("TTMX"),
    
    TTOT("TTOT");

    private String value;

    TariffTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TariffTypeEnum fromValue(String value) {
      for (TariffTypeEnum b : TariffTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TariffTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TariffTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TariffTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TariffTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TARIFF_TYPE = "TariffType";
  @SerializedName(SERIALIZED_NAME_TARIFF_TYPE)
  private TariffTypeEnum tariffType;

  public static final String SERIALIZED_NAME_TARIFF_NAME = "TariffName";
  @SerializedName(SERIALIZED_NAME_TARIFF_NAME)
  private String tariffName;

  public static final String SERIALIZED_NAME_OTHER_TARIFF_TYPE = "OtherTariffType";
  @SerializedName(SERIALIZED_NAME_OTHER_TARIFF_TYPE)
  private OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType;

  public static final String SERIALIZED_NAME_FEE_CHARGE_DETAIL = "FeeChargeDetail";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_DETAIL)
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEE_CHARGE_CAP = "FeeChargeCap";
  @SerializedName(SERIALIZED_NAME_FEE_CHARGE_CAP)
  private List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap = null;

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner() {
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffType(TariffTypeEnum tariffType) {
    
    
    
    
    this.tariffType = tariffType;
    return this;
  }

   /**
   * TariffType which defines the fee and charges.
   * @return tariffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TariffType which defines the fee and charges.")

  public TariffTypeEnum getTariffType() {
    return tariffType;
  }


  public void setTariffType(TariffTypeEnum tariffType) {
    
    
    
    this.tariffType = tariffType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner tariffName(String tariffName) {
    
    
    if (tariffName != null && tariffName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for tariffName. Length must be greater than or equal to 1.");
    }
    
    this.tariffName = tariffName;
    return this;
  }

   /**
   * Name of the tariff
   * @return tariffName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the tariff")

  public String getTariffName() {
    return tariffName;
  }


  public void setTariffName(String tariffName) {
    
    
    if (tariffName != null && tariffName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for tariffName. Length must be greater than or equal to 1.");
    }
    this.tariffName = tariffName;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner otherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    
    
    
    
    this.otherTariffType = otherTariffType;
    return this;
  }

   /**
   * Get otherTariffType
   * @return otherTariffType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType getOtherTariffType() {
    return otherTariffType;
  }


  public void setOtherTariffType(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType otherTariffType) {
    
    
    
    this.otherTariffType = otherTariffType;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    
    
    
    
    this.feeChargeDetail = feeChargeDetail;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeDetailItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner feeChargeDetailItem) {
    this.feeChargeDetail.add(feeChargeDetailItem);
    return this;
  }

   /**
   * Get feeChargeDetail
   * @return feeChargeDetail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> getFeeChargeDetail() {
    return feeChargeDetail;
  }


  public void setFeeChargeDetail(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner> feeChargeDetail) {
    
    
    
    this.feeChargeDetail = feeChargeDetail;
  }


  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner feeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    
    
    
    
    this.feeChargeCap = feeChargeCap;
    return this;
  }

  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner addFeeChargeCapItem(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner feeChargeCapItem) {
    if (this.feeChargeCap == null) {
      this.feeChargeCap = new ArrayList<>();
    }
    this.feeChargeCap.add(feeChargeCapItem);
    return this;
  }

   /**
   * Get feeChargeCap
   * @return feeChargeCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> getFeeChargeCap() {
    return feeChargeCap;
  }


  public void setFeeChargeCap(List<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner> feeChargeCap) {
    
    
    
    this.feeChargeCap = feeChargeCap;
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
   * @return the OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner instance itself
   */
  public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner = (OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner) o;
    return Objects.equals(this.tariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffType) &&
        Objects.equals(this.tariffName, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.tariffName) &&
        Objects.equals(this.otherTariffType, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.otherTariffType) &&
        Objects.equals(this.feeChargeDetail, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeDetail) &&
        Objects.equals(this.feeChargeCap, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.feeChargeCap)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tariffType, tariffName, otherTariffType, feeChargeDetail, feeChargeCap, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner {\n");
    sb.append("    tariffType: ").append(toIndentedString(tariffType)).append("\n");
    sb.append("    tariffName: ").append(toIndentedString(tariffName)).append("\n");
    sb.append("    otherTariffType: ").append(toIndentedString(otherTariffType)).append("\n");
    sb.append("    feeChargeDetail: ").append(toIndentedString(feeChargeDetail)).append("\n");
    sb.append("    feeChargeCap: ").append(toIndentedString(feeChargeCap)).append("\n");
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
    openapiFields.add("TariffType");
    openapiFields.add("TariffName");
    openapiFields.add("OtherTariffType");
    openapiFields.add("FeeChargeDetail");
    openapiFields.add("FeeChargeCap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FeeChargeDetail");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner is not found in the empty JSON string", OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("TariffType") != null && !jsonObj.get("TariffType").isJsonNull()) && !jsonObj.get("TariffType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TariffType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TariffType").toString()));
      }
      if ((jsonObj.get("TariffName") != null && !jsonObj.get("TariffName").isJsonNull()) && !jsonObj.get("TariffName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TariffName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TariffName").toString()));
      }
      // validate the optional field `OtherTariffType`
      if (jsonObj.get("OtherTariffType") != null && !jsonObj.get("OtherTariffType").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerOtherTariffType.validateJsonObject(jsonObj.getAsJsonObject("OtherTariffType"));
      }
      // ensure the json data is an array
      if (!jsonObj.get("FeeChargeDetail").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeChargeDetail` to be an array in the JSON string but got `%s`", jsonObj.get("FeeChargeDetail").toString()));
      }

      JsonArray jsonArrayfeeChargeDetail = jsonObj.getAsJsonArray("FeeChargeDetail");
      // validate the required field `FeeChargeDetail` (array)
      for (int i = 0; i < jsonArrayfeeChargeDetail.size(); i++) {
        OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInner.validateJsonObject(jsonArrayfeeChargeDetail.get(i).getAsJsonObject());
      };
      if (jsonObj.get("FeeChargeCap") != null && !jsonObj.get("FeeChargeCap").isJsonNull()) {
        JsonArray jsonArrayfeeChargeCap = jsonObj.getAsJsonArray("FeeChargeCap");
        if (jsonArrayfeeChargeCap != null) {
          // ensure the json data is an array
          if (!jsonObj.get("FeeChargeCap").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `FeeChargeCap` to be an array in the JSON string but got `%s`", jsonObj.get("FeeChargeCap").toString()));
          }

          // validate the optional field `FeeChargeCap` (array)
          for (int i = 0; i < jsonArrayfeeChargeCap.size(); i++) {
            OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInnerFeeChargeDetailInnerFeeChargeCapInner.validateJsonObject(jsonArrayfeeChargeCap.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner value) throws IOException {
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
           public OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner
  */
  public static OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInnerOtherProductTypeOtherFeesChargesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

