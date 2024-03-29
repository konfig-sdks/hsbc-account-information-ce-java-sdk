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
import com.konfigthis.client.model.OtherFeeTypeProperty4Inner;
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
 * Details about any caps (maximum charges) that apply to a particular fee/charge
 */
@ApiModel(description = "Details about any caps (maximum charges) that apply to a particular fee/charge")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OverdraftFeeChargeCapProperty {
  /**
   * Overdraft fee type
   */
  @JsonAdapter(FeeTypeEnum.Adapter.class)
 public enum FeeTypeEnum {
    ARRANGEDOVERDRAFT("ArrangedOverdraft"),
    
    EMERGENCYBORROWING("EmergencyBorrowing"),
    
    BORROWINGITEM("BorrowingItem"),
    
    OVERDRAFTRENEWAL("OverdraftRenewal"),
    
    ANNUALREVIEW("AnnualReview"),
    
    OVERDRAFTSETUP("OverdraftSetup"),
    
    SURCHARGE("Surcharge"),
    
    TEMPOVERDRAFT("TempOverdraft"),
    
    UNAUTHORISEDBORROWING("UnauthorisedBorrowing"),
    
    UNAUTHORISEDPAIDTRANS("UnauthorisedPaidTrans"),
    
    OTHER("Other"),
    
    UNAUTHORISEDUNPAIDTRANS("UnauthorisedUnpaidTrans");

    private String value;

    FeeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeTypeEnum fromValue(String value) {
      for (FeeTypeEnum b : FeeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_TYPE = "FeeType";
  @SerializedName(SERIALIZED_NAME_FEE_TYPE)
  private List<FeeTypeEnum> feeType = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERDRAFT_CONTROL_INDICATOR = "OverdraftControlIndicator";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_CONTROL_INDICATOR)
  private Boolean overdraftControlIndicator;

  /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   */
  @JsonAdapter(MinMaxTypeEnum.Adapter.class)
 public enum MinMaxTypeEnum {
    MINIMUM("Minimum"),
    
    MAXIMUM("Maximum");

    private String value;

    MinMaxTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MinMaxTypeEnum fromValue(String value) {
      for (MinMaxTypeEnum b : MinMaxTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MinMaxTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MinMaxTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MinMaxTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return MinMaxTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MIN_MAX_TYPE = "MinMaxType";
  @SerializedName(SERIALIZED_NAME_MIN_MAX_TYPE)
  private MinMaxTypeEnum minMaxType;

  public static final String SERIALIZED_NAME_FEE_CAP_OCCURRENCE = "FeeCapOccurrence";
  @SerializedName(SERIALIZED_NAME_FEE_CAP_OCCURRENCE)
  private Float feeCapOccurrence;

  public static final String SERIALIZED_NAME_FEE_CAP_AMOUNT = "FeeCapAmount";
  @SerializedName(SERIALIZED_NAME_FEE_CAP_AMOUNT)
  private String feeCapAmount;

  /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   */
  @JsonAdapter(CappingPeriodEnum.Adapter.class)
 public enum CappingPeriodEnum {
    ACADEMICTERM("AcademicTerm"),
    
    DAY("Day"),
    
    HALF_YEAR("Half Year"),
    
    MONTH("Month"),
    
    QUARTER("Quarter"),
    
    WEEK("Week"),
    
    YEAR("Year");

    private String value;

    CappingPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CappingPeriodEnum fromValue(String value) {
      for (CappingPeriodEnum b : CappingPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CappingPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CappingPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CappingPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CappingPeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAPPING_PERIOD = "CappingPeriod";
  @SerializedName(SERIALIZED_NAME_CAPPING_PERIOD)
  private CappingPeriodEnum cappingPeriod;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OTHER_FEE_TYPE = "OtherFeeType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_TYPE)
  private List<OtherFeeTypeProperty4Inner> otherFeeType = null;

  public OverdraftFeeChargeCapProperty() {
  }

  public OverdraftFeeChargeCapProperty feeType(List<FeeTypeEnum> feeType) {
    
    
    
    
    this.feeType = feeType;
    return this;
  }

  public OverdraftFeeChargeCapProperty addFeeTypeItem(FeeTypeEnum feeTypeItem) {
    this.feeType.add(feeTypeItem);
    return this;
  }

   /**
   * Fee/charge type which is being capped
   * @return feeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Fee/charge type which is being capped")

  public List<FeeTypeEnum> getFeeType() {
    return feeType;
  }


  public void setFeeType(List<FeeTypeEnum> feeType) {
    
    
    
    this.feeType = feeType;
  }


  public OverdraftFeeChargeCapProperty overdraftControlIndicator(Boolean overdraftControlIndicator) {
    
    
    
    
    this.overdraftControlIndicator = overdraftControlIndicator;
    return this;
  }

   /**
   * Specifies for the overdraft control feature/benefit
   * @return overdraftControlIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Specifies for the overdraft control feature/benefit")

  public Boolean getOverdraftControlIndicator() {
    return overdraftControlIndicator;
  }


  public void setOverdraftControlIndicator(Boolean overdraftControlIndicator) {
    
    
    
    this.overdraftControlIndicator = overdraftControlIndicator;
  }


  public OverdraftFeeChargeCapProperty minMaxType(MinMaxTypeEnum minMaxType) {
    
    
    
    
    this.minMaxType = minMaxType;
    return this;
  }

   /**
   * Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution
   * @return minMaxType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MINIMUM", required = true, value = "Indicates that this is the minimum/ maximum fee/charge that can be applied by the financial institution")

  public MinMaxTypeEnum getMinMaxType() {
    return minMaxType;
  }


  public void setMinMaxType(MinMaxTypeEnum minMaxType) {
    
    
    
    this.minMaxType = minMaxType;
  }


  public OverdraftFeeChargeCapProperty feeCapOccurrence(Float feeCapOccurrence) {
    
    
    
    
    this.feeCapOccurrence = feeCapOccurrence;
    return this;
  }

   /**
   * fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount
   * @return feeCapOccurrence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.99", value = "fee/charges are captured dependent on the number of occurrences rather than capped at a particular amount")

  public Float getFeeCapOccurrence() {
    return feeCapOccurrence;
  }


  public void setFeeCapOccurrence(Float feeCapOccurrence) {
    
    
    
    this.feeCapOccurrence = feeCapOccurrence;
  }


  public OverdraftFeeChargeCapProperty feeCapAmount(String feeCapAmount) {
    
    
    
    
    this.feeCapAmount = feeCapAmount;
    return this;
  }

   /**
   * Cap amount charged for a fee/charge
   * @return feeCapAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Cap amount charged for a fee/charge")

  public String getFeeCapAmount() {
    return feeCapAmount;
  }


  public void setFeeCapAmount(String feeCapAmount) {
    
    
    
    this.feeCapAmount = feeCapAmount;
  }


  public OverdraftFeeChargeCapProperty cappingPeriod(CappingPeriodEnum cappingPeriod) {
    
    
    
    
    this.cappingPeriod = cappingPeriod;
    return this;
  }

   /**
   * Period e.g. day, week, month etc. for which the fee/charge is capped
   * @return cappingPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAY", value = "Period e.g. day, week, month etc. for which the fee/charge is capped")

  public CappingPeriodEnum getCappingPeriod() {
    return cappingPeriod;
  }


  public void setCappingPeriod(CappingPeriodEnum cappingPeriod) {
    
    
    
    this.cappingPeriod = cappingPeriod;
  }


  public OverdraftFeeChargeCapProperty notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OverdraftFeeChargeCapProperty addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Notes related to Overdraft fee charge cap
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notes related to Overdraft fee charge cap")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public OverdraftFeeChargeCapProperty otherFeeType(List<OtherFeeTypeProperty4Inner> otherFeeType) {
    
    
    
    
    this.otherFeeType = otherFeeType;
    return this;
  }

  public OverdraftFeeChargeCapProperty addOtherFeeTypeItem(OtherFeeTypeProperty4Inner otherFeeTypeItem) {
    if (this.otherFeeType == null) {
      this.otherFeeType = new ArrayList<>();
    }
    this.otherFeeType.add(otherFeeTypeItem);
    return this;
  }

   /**
   * Other fee type code which is not available in the standard code set
   * @return otherFeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other fee type code which is not available in the standard code set")

  public List<OtherFeeTypeProperty4Inner> getOtherFeeType() {
    return otherFeeType;
  }


  public void setOtherFeeType(List<OtherFeeTypeProperty4Inner> otherFeeType) {
    
    
    
    this.otherFeeType = otherFeeType;
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
   * @return the OverdraftFeeChargeCapProperty instance itself
   */
  public OverdraftFeeChargeCapProperty putAdditionalProperty(String key, Object value) {
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
    OverdraftFeeChargeCapProperty overdraftFeeChargeCapProperty = (OverdraftFeeChargeCapProperty) o;
    return Objects.equals(this.feeType, overdraftFeeChargeCapProperty.feeType) &&
        Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeCapProperty.overdraftControlIndicator) &&
        Objects.equals(this.minMaxType, overdraftFeeChargeCapProperty.minMaxType) &&
        Objects.equals(this.feeCapOccurrence, overdraftFeeChargeCapProperty.feeCapOccurrence) &&
        Objects.equals(this.feeCapAmount, overdraftFeeChargeCapProperty.feeCapAmount) &&
        Objects.equals(this.cappingPeriod, overdraftFeeChargeCapProperty.cappingPeriod) &&
        Objects.equals(this.notes, overdraftFeeChargeCapProperty.notes) &&
        Objects.equals(this.otherFeeType, overdraftFeeChargeCapProperty.otherFeeType)&&
        Objects.equals(this.additionalProperties, overdraftFeeChargeCapProperty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, overdraftControlIndicator, minMaxType, feeCapOccurrence, feeCapAmount, cappingPeriod, notes, otherFeeType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeeChargeCapProperty {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    minMaxType: ").append(toIndentedString(minMaxType)).append("\n");
    sb.append("    feeCapOccurrence: ").append(toIndentedString(feeCapOccurrence)).append("\n");
    sb.append("    feeCapAmount: ").append(toIndentedString(feeCapAmount)).append("\n");
    sb.append("    cappingPeriod: ").append(toIndentedString(cappingPeriod)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
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
    openapiFields.add("FeeType");
    openapiFields.add("OverdraftControlIndicator");
    openapiFields.add("MinMaxType");
    openapiFields.add("FeeCapOccurrence");
    openapiFields.add("FeeCapAmount");
    openapiFields.add("CappingPeriod");
    openapiFields.add("Notes");
    openapiFields.add("OtherFeeType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FeeType");
    openapiRequiredFields.add("MinMaxType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverdraftFeeChargeCapProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OverdraftFeeChargeCapProperty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverdraftFeeChargeCapProperty is not found in the empty JSON string", OverdraftFeeChargeCapProperty.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OverdraftFeeChargeCapProperty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("FeeType") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("FeeType").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeType` to be an array in the JSON string but got `%s`", jsonObj.get("FeeType").toString()));
      }
      if (!jsonObj.get("MinMaxType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MinMaxType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MinMaxType").toString()));
      }
      if ((jsonObj.get("FeeCapAmount") != null && !jsonObj.get("FeeCapAmount").isJsonNull()) && !jsonObj.get("FeeCapAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeCapAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeCapAmount").toString()));
      }
      if ((jsonObj.get("CappingPeriod") != null && !jsonObj.get("CappingPeriod").isJsonNull()) && !jsonObj.get("CappingPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CappingPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CappingPeriod").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      if (jsonObj.get("OtherFeeType") != null && !jsonObj.get("OtherFeeType").isJsonNull()) {
        JsonArray jsonArrayotherFeeType = jsonObj.getAsJsonArray("OtherFeeType");
        if (jsonArrayotherFeeType != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OtherFeeType").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OtherFeeType` to be an array in the JSON string but got `%s`", jsonObj.get("OtherFeeType").toString()));
          }

          // validate the optional field `OtherFeeType` (array)
          for (int i = 0; i < jsonArrayotherFeeType.size(); i++) {
            OtherFeeTypeProperty4Inner.validateJsonObject(jsonArrayotherFeeType.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverdraftFeeChargeCapProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverdraftFeeChargeCapProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverdraftFeeChargeCapProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverdraftFeeChargeCapProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<OverdraftFeeChargeCapProperty>() {
           @Override
           public void write(JsonWriter out, OverdraftFeeChargeCapProperty value) throws IOException {
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
           public OverdraftFeeChargeCapProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OverdraftFeeChargeCapProperty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OverdraftFeeChargeCapProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverdraftFeeChargeCapProperty
  * @throws IOException if the JSON string is invalid with respect to OverdraftFeeChargeCapProperty
  */
  public static OverdraftFeeChargeCapProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverdraftFeeChargeCapProperty.class);
  }

 /**
  * Convert an instance of OverdraftFeeChargeCapProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

