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
import com.konfigthis.client.model.OverdraftFeesChargesPropertyInner2;
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
 * Provides overdraft details for a specific tier or band
 */
@ApiModel(description = "Provides overdraft details for a specific tier or band")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OverdraftTierBandPropertyInner1 {
  public static final String SERIALIZED_NAME_IDENTIFICATION = "Identification";
  @SerializedName(SERIALIZED_NAME_IDENTIFICATION)
  private String identification;

  public static final String SERIALIZED_NAME_TIER_VALUE_MIN = "TierValueMin";
  @SerializedName(SERIALIZED_NAME_TIER_VALUE_MIN)
  private String tierValueMin;

  public static final String SERIALIZED_NAME_TIER_VALUE_MAX = "TierValueMax";
  @SerializedName(SERIALIZED_NAME_TIER_VALUE_MAX)
  private String tierValueMax;

  /**
   * Interest charged on whole amount or tiered/banded
   */
  @JsonAdapter(OverdraftInterestChargingCoverageEnum.Adapter.class)
 public enum OverdraftInterestChargingCoverageEnum {
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    OverdraftInterestChargingCoverageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OverdraftInterestChargingCoverageEnum fromValue(String value) {
      for (OverdraftInterestChargingCoverageEnum b : OverdraftInterestChargingCoverageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OverdraftInterestChargingCoverageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OverdraftInterestChargingCoverageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OverdraftInterestChargingCoverageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OverdraftInterestChargingCoverageEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OVERDRAFT_INTEREST_CHARGING_COVERAGE = "OverdraftInterestChargingCoverage";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_INTEREST_CHARGING_COVERAGE)
  private OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage;

  public static final String SERIALIZED_NAME_BANK_GUARANTEED_INDICATOR = "BankGuaranteedIndicator";
  @SerializedName(SERIALIZED_NAME_BANK_GUARANTEED_INDICATOR)
  private Boolean bankGuaranteedIndicator;

  public static final String SERIALIZED_NAME_E_A_R = "EAR";
  @SerializedName(SERIALIZED_NAME_E_A_R)
  private String EAR;

  public static final String SERIALIZED_NAME_REPRESENTATIVE_A_P_R = "RepresentativeAPR";
  @SerializedName(SERIALIZED_NAME_REPRESENTATIVE_A_P_R)
  private String representativeAPR;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OVERDRAFT_FEES_CHARGES = "OverdraftFeesCharges";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_FEES_CHARGES)
  private List<OverdraftFeesChargesPropertyInner2> overdraftFeesCharges = null;

  public OverdraftTierBandPropertyInner1() {
  }

  public OverdraftTierBandPropertyInner1 identification(String identification) {
    
    
    if (identification != null && identification.length() < 1) {
      throw new IllegalArgumentException("Invalid value for identification. Length must be greater than or equal to 1.");
    }
    
    this.identification = identification;
    return this;
  }

   /**
   * Unique and unambiguous identification of a  Tier Band for a overdraft.
   * @return identification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "32209458637", value = "Unique and unambiguous identification of a  Tier Band for a overdraft.")

  public String getIdentification() {
    return identification;
  }


  public void setIdentification(String identification) {
    
    
    if (identification != null && identification.length() < 1) {
      throw new IllegalArgumentException("Invalid value for identification. Length must be greater than or equal to 1.");
    }
    this.identification = identification;
  }


  public OverdraftTierBandPropertyInner1 tierValueMin(String tierValueMin) {
    
    
    
    
    this.tierValueMin = tierValueMin;
    return this;
  }

   /**
   * Minimum value of Overdraft Tier/Band
   * @return tierValueMin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "5,000.00", required = true, value = "Minimum value of Overdraft Tier/Band")

  public String getTierValueMin() {
    return tierValueMin;
  }


  public void setTierValueMin(String tierValueMin) {
    
    
    
    this.tierValueMin = tierValueMin;
  }


  public OverdraftTierBandPropertyInner1 tierValueMax(String tierValueMax) {
    
    
    
    
    this.tierValueMax = tierValueMax;
    return this;
  }

   /**
   * Maximum value of Overdraft Tier/Band
   * @return tierValueMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100,000.00", value = "Maximum value of Overdraft Tier/Band")

  public String getTierValueMax() {
    return tierValueMax;
  }


  public void setTierValueMax(String tierValueMax) {
    
    
    
    this.tierValueMax = tierValueMax;
  }


  public OverdraftTierBandPropertyInner1 overdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    
    
    
    
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
    return this;
  }

   /**
   * Interest charged on whole amount or tiered/banded
   * @return overdraftInterestChargingCoverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TIERED", value = "Interest charged on whole amount or tiered/banded")

  public OverdraftInterestChargingCoverageEnum getOverdraftInterestChargingCoverage() {
    return overdraftInterestChargingCoverage;
  }


  public void setOverdraftInterestChargingCoverage(OverdraftInterestChargingCoverageEnum overdraftInterestChargingCoverage) {
    
    
    
    this.overdraftInterestChargingCoverage = overdraftInterestChargingCoverage;
  }


  public OverdraftTierBandPropertyInner1 bankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    
    
    
    
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
    return this;
  }

   /**
   * Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically
   * @return bankGuaranteedIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Indicates that a bank provides the overdraft limit up to TierValueMIn to all customers automatically")

  public Boolean getBankGuaranteedIndicator() {
    return bankGuaranteedIndicator;
  }


  public void setBankGuaranteedIndicator(Boolean bankGuaranteedIndicator) {
    
    
    
    this.bankGuaranteedIndicator = bankGuaranteedIndicator;
  }


  public OverdraftTierBandPropertyInner1 EAR(String EAR) {
    
    
    
    
    this.EAR = EAR;
    return this;
  }

   /**
   * EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.
   * @return EAR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.1", value = "EAR means Effective Annual Rate and/or Equivalent Annual Rate (frequently used interchangeably), being the actual annual interest rate of an Overdraft.")

  public String getEAR() {
    return EAR;
  }


  public void setEAR(String EAR) {
    
    
    
    this.EAR = EAR;
  }


  public OverdraftTierBandPropertyInner1 representativeAPR(String representativeAPR) {
    
    
    
    
    this.representativeAPR = representativeAPR;
    return this;
  }

   /**
   * An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.
   * @return representativeAPR
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.11", value = "An annual percentage rate (APR) is the annual rate charged for borrowing or earned through an investment. APR is expressed as a percentage that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction but does not take compounding into account.")

  public String getRepresentativeAPR() {
    return representativeAPR;
  }


  public void setRepresentativeAPR(String representativeAPR) {
    
    
    
    this.representativeAPR = representativeAPR;
  }


  public OverdraftTierBandPropertyInner1 notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OverdraftTierBandPropertyInner1 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Optional additional notes to supplement the Tier/band details
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier/band details")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public OverdraftTierBandPropertyInner1 overdraftFeesCharges(List<OverdraftFeesChargesPropertyInner2> overdraftFeesCharges) {
    
    
    
    
    this.overdraftFeesCharges = overdraftFeesCharges;
    return this;
  }

  public OverdraftTierBandPropertyInner1 addOverdraftFeesChargesItem(OverdraftFeesChargesPropertyInner2 overdraftFeesChargesItem) {
    if (this.overdraftFeesCharges == null) {
      this.overdraftFeesCharges = new ArrayList<>();
    }
    this.overdraftFeesCharges.add(overdraftFeesChargesItem);
    return this;
  }

   /**
   * Overdraft fees and charges
   * @return overdraftFeesCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Overdraft fees and charges")

  public List<OverdraftFeesChargesPropertyInner2> getOverdraftFeesCharges() {
    return overdraftFeesCharges;
  }


  public void setOverdraftFeesCharges(List<OverdraftFeesChargesPropertyInner2> overdraftFeesCharges) {
    
    
    
    this.overdraftFeesCharges = overdraftFeesCharges;
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
   * @return the OverdraftTierBandPropertyInner1 instance itself
   */
  public OverdraftTierBandPropertyInner1 putAdditionalProperty(String key, Object value) {
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
    OverdraftTierBandPropertyInner1 overdraftTierBandPropertyInner1 = (OverdraftTierBandPropertyInner1) o;
    return Objects.equals(this.identification, overdraftTierBandPropertyInner1.identification) &&
        Objects.equals(this.tierValueMin, overdraftTierBandPropertyInner1.tierValueMin) &&
        Objects.equals(this.tierValueMax, overdraftTierBandPropertyInner1.tierValueMax) &&
        Objects.equals(this.overdraftInterestChargingCoverage, overdraftTierBandPropertyInner1.overdraftInterestChargingCoverage) &&
        Objects.equals(this.bankGuaranteedIndicator, overdraftTierBandPropertyInner1.bankGuaranteedIndicator) &&
        Objects.equals(this.EAR, overdraftTierBandPropertyInner1.EAR) &&
        Objects.equals(this.representativeAPR, overdraftTierBandPropertyInner1.representativeAPR) &&
        Objects.equals(this.notes, overdraftTierBandPropertyInner1.notes) &&
        Objects.equals(this.overdraftFeesCharges, overdraftTierBandPropertyInner1.overdraftFeesCharges)&&
        Objects.equals(this.additionalProperties, overdraftTierBandPropertyInner1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, tierValueMin, tierValueMax, overdraftInterestChargingCoverage, bankGuaranteedIndicator, EAR, representativeAPR, notes, overdraftFeesCharges, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftTierBandPropertyInner1 {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    tierValueMin: ").append(toIndentedString(tierValueMin)).append("\n");
    sb.append("    tierValueMax: ").append(toIndentedString(tierValueMax)).append("\n");
    sb.append("    overdraftInterestChargingCoverage: ").append(toIndentedString(overdraftInterestChargingCoverage)).append("\n");
    sb.append("    bankGuaranteedIndicator: ").append(toIndentedString(bankGuaranteedIndicator)).append("\n");
    sb.append("    EAR: ").append(toIndentedString(EAR)).append("\n");
    sb.append("    representativeAPR: ").append(toIndentedString(representativeAPR)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    overdraftFeesCharges: ").append(toIndentedString(overdraftFeesCharges)).append("\n");
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
    openapiFields.add("Identification");
    openapiFields.add("TierValueMin");
    openapiFields.add("TierValueMax");
    openapiFields.add("OverdraftInterestChargingCoverage");
    openapiFields.add("BankGuaranteedIndicator");
    openapiFields.add("EAR");
    openapiFields.add("RepresentativeAPR");
    openapiFields.add("Notes");
    openapiFields.add("OverdraftFeesCharges");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TierValueMin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverdraftTierBandPropertyInner1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OverdraftTierBandPropertyInner1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverdraftTierBandPropertyInner1 is not found in the empty JSON string", OverdraftTierBandPropertyInner1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OverdraftTierBandPropertyInner1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Identification") != null && !jsonObj.get("Identification").isJsonNull()) && !jsonObj.get("Identification").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Identification` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Identification").toString()));
      }
      if (!jsonObj.get("TierValueMin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TierValueMin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TierValueMin").toString()));
      }
      if ((jsonObj.get("TierValueMax") != null && !jsonObj.get("TierValueMax").isJsonNull()) && !jsonObj.get("TierValueMax").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TierValueMax` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TierValueMax").toString()));
      }
      if ((jsonObj.get("OverdraftInterestChargingCoverage") != null && !jsonObj.get("OverdraftInterestChargingCoverage").isJsonNull()) && !jsonObj.get("OverdraftInterestChargingCoverage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OverdraftInterestChargingCoverage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OverdraftInterestChargingCoverage").toString()));
      }
      if ((jsonObj.get("EAR") != null && !jsonObj.get("EAR").isJsonNull()) && !jsonObj.get("EAR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EAR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EAR").toString()));
      }
      if ((jsonObj.get("RepresentativeAPR") != null && !jsonObj.get("RepresentativeAPR").isJsonNull()) && !jsonObj.get("RepresentativeAPR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RepresentativeAPR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RepresentativeAPR").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      if (jsonObj.get("OverdraftFeesCharges") != null && !jsonObj.get("OverdraftFeesCharges").isJsonNull()) {
        JsonArray jsonArrayoverdraftFeesCharges = jsonObj.getAsJsonArray("OverdraftFeesCharges");
        if (jsonArrayoverdraftFeesCharges != null) {
          // ensure the json data is an array
          if (!jsonObj.get("OverdraftFeesCharges").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `OverdraftFeesCharges` to be an array in the JSON string but got `%s`", jsonObj.get("OverdraftFeesCharges").toString()));
          }

          // validate the optional field `OverdraftFeesCharges` (array)
          for (int i = 0; i < jsonArrayoverdraftFeesCharges.size(); i++) {
            OverdraftFeesChargesPropertyInner2.validateJsonObject(jsonArrayoverdraftFeesCharges.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverdraftTierBandPropertyInner1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverdraftTierBandPropertyInner1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverdraftTierBandPropertyInner1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverdraftTierBandPropertyInner1.class));

       return (TypeAdapter<T>) new TypeAdapter<OverdraftTierBandPropertyInner1>() {
           @Override
           public void write(JsonWriter out, OverdraftTierBandPropertyInner1 value) throws IOException {
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
           public OverdraftTierBandPropertyInner1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OverdraftTierBandPropertyInner1 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OverdraftTierBandPropertyInner1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverdraftTierBandPropertyInner1
  * @throws IOException if the JSON string is invalid with respect to OverdraftTierBandPropertyInner1
  */
  public static OverdraftTierBandPropertyInner1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverdraftTierBandPropertyInner1.class);
  }

 /**
  * Convert an instance of OverdraftTierBandPropertyInner1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
