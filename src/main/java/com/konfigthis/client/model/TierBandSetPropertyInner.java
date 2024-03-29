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
import com.konfigthis.client.model.TierBandPropertyInner;
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
 * The group of tiers or bands for which credit interest can be applied.
 */
@ApiModel(description = "The group of tiers or bands for which credit interest can be applied.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TierBandSetPropertyInner {
  /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
   */
  @JsonAdapter(TierBandMethodEnum.Adapter.class)
 public enum TierBandMethodEnum {
    BANDED("Banded"),
    
    TIERED("Tiered"),
    
    WHOLE("Whole");

    private String value;

    TierBandMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TierBandMethodEnum fromValue(String value) {
      for (TierBandMethodEnum b : TierBandMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TierBandMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TierBandMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TierBandMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TierBandMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIER_BAND_METHOD = "TierBandMethod";
  @SerializedName(SERIALIZED_NAME_TIER_BAND_METHOD)
  private TierBandMethodEnum tierBandMethod;

  /**
   * Methods of calculating interest
   */
  @JsonAdapter(CalculationMethodEnum.Adapter.class)
 public enum CalculationMethodEnum {
    COMPOUND("Compound"),
    
    SIMPLEINTEREST("SimpleInterest");

    private String value;

    CalculationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationMethodEnum fromValue(String value) {
      for (CalculationMethodEnum b : CalculationMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CalculationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationMethodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_METHOD = "CalculationMethod";
  @SerializedName(SERIALIZED_NAME_CALCULATION_METHOD)
  private CalculationMethodEnum calculationMethod;

  /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   */
  @JsonAdapter(DestinationEnum.Adapter.class)
 public enum DestinationEnum {
    PAYAWAY("PayAway"),
    
    SELFCREDIT("SelfCredit");

    private String value;

    DestinationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationEnum fromValue(String value) {
      for (DestinationEnum b : DestinationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION = "Destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private DestinationEnum destination;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_TIER_BAND = "TierBand";
  @SerializedName(SERIALIZED_NAME_TIER_BAND)
  private List<TierBandPropertyInner> tierBand = new ArrayList<>();

  public TierBandSetPropertyInner() {
  }

  public TierBandSetPropertyInner tierBandMethod(TierBandMethodEnum tierBandMethod) {
    
    
    
    
    this.tierBandMethod = tierBandMethod;
    return this;
  }

   /**
   * The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance
   * @return tierBandMethod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WHOLE", required = true, value = "The methodology of how credit interest is paid/applied. It can be:-  1. Banded Interest rates are banded. i.e. Increasing rate on whole balance as balance increases.  2. Tiered Interest rates are tiered. i.e. increasing rate for each tier as balance increases, but interest paid on tier fixed for that tier and not on whole balance.  3. Whole The same interest rate is applied irrespective of the BCA balance")

  public TierBandMethodEnum getTierBandMethod() {
    return tierBandMethod;
  }


  public void setTierBandMethod(TierBandMethodEnum tierBandMethod) {
    
    
    
    this.tierBandMethod = tierBandMethod;
  }


  public TierBandSetPropertyInner calculationMethod(CalculationMethodEnum calculationMethod) {
    
    
    
    
    this.calculationMethod = calculationMethod;
    return this;
  }

   /**
   * Methods of calculating interest
   * @return calculationMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPOUND", value = "Methods of calculating interest")

  public CalculationMethodEnum getCalculationMethod() {
    return calculationMethod;
  }


  public void setCalculationMethod(CalculationMethodEnum calculationMethod) {
    
    
    
    this.calculationMethod = calculationMethod;
  }


  public TierBandSetPropertyInner destination(DestinationEnum destination) {
    
    
    
    
    this.destination = destination;
    return this;
  }

   /**
   * Describes whether accrued interest is payable only to the BCA or to another bank account
   * @return destination
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PAYAWAY", required = true, value = "Describes whether accrued interest is payable only to the BCA or to another bank account")

  public DestinationEnum getDestination() {
    return destination;
  }


  public void setDestination(DestinationEnum destination) {
    
    
    
    this.destination = destination;
  }


  public TierBandSetPropertyInner notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public TierBandSetPropertyInner addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Optional additional notes to supplement the Tier Band Set details
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional additional notes to supplement the Tier Band Set details")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public TierBandSetPropertyInner tierBand(List<TierBandPropertyInner> tierBand) {
    
    
    
    
    this.tierBand = tierBand;
    return this;
  }

  public TierBandSetPropertyInner addTierBandItem(TierBandPropertyInner tierBandItem) {
    this.tierBand.add(tierBandItem);
    return this;
  }

   /**
   * Tier Band Details
   * @return tierBand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tier Band Details")

  public List<TierBandPropertyInner> getTierBand() {
    return tierBand;
  }


  public void setTierBand(List<TierBandPropertyInner> tierBand) {
    
    
    
    this.tierBand = tierBand;
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
   * @return the TierBandSetPropertyInner instance itself
   */
  public TierBandSetPropertyInner putAdditionalProperty(String key, Object value) {
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
    TierBandSetPropertyInner tierBandSetPropertyInner = (TierBandSetPropertyInner) o;
    return Objects.equals(this.tierBandMethod, tierBandSetPropertyInner.tierBandMethod) &&
        Objects.equals(this.calculationMethod, tierBandSetPropertyInner.calculationMethod) &&
        Objects.equals(this.destination, tierBandSetPropertyInner.destination) &&
        Objects.equals(this.notes, tierBandSetPropertyInner.notes) &&
        Objects.equals(this.tierBand, tierBandSetPropertyInner.tierBand)&&
        Objects.equals(this.additionalProperties, tierBandSetPropertyInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tierBandMethod, calculationMethod, destination, notes, tierBand, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TierBandSetPropertyInner {\n");
    sb.append("    tierBandMethod: ").append(toIndentedString(tierBandMethod)).append("\n");
    sb.append("    calculationMethod: ").append(toIndentedString(calculationMethod)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    tierBand: ").append(toIndentedString(tierBand)).append("\n");
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
    openapiFields.add("TierBandMethod");
    openapiFields.add("CalculationMethod");
    openapiFields.add("Destination");
    openapiFields.add("Notes");
    openapiFields.add("TierBand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TierBandMethod");
    openapiRequiredFields.add("Destination");
    openapiRequiredFields.add("TierBand");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TierBandSetPropertyInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TierBandSetPropertyInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TierBandSetPropertyInner is not found in the empty JSON string", TierBandSetPropertyInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TierBandSetPropertyInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("TierBandMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TierBandMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TierBandMethod").toString()));
      }
      if ((jsonObj.get("CalculationMethod") != null && !jsonObj.get("CalculationMethod").isJsonNull()) && !jsonObj.get("CalculationMethod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CalculationMethod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CalculationMethod").toString()));
      }
      if (!jsonObj.get("Destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Destination").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("TierBand").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TierBand` to be an array in the JSON string but got `%s`", jsonObj.get("TierBand").toString()));
      }

      JsonArray jsonArraytierBand = jsonObj.getAsJsonArray("TierBand");
      // validate the required field `TierBand` (array)
      for (int i = 0; i < jsonArraytierBand.size(); i++) {
        TierBandPropertyInner.validateJsonObject(jsonArraytierBand.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TierBandSetPropertyInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TierBandSetPropertyInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TierBandSetPropertyInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TierBandSetPropertyInner.class));

       return (TypeAdapter<T>) new TypeAdapter<TierBandSetPropertyInner>() {
           @Override
           public void write(JsonWriter out, TierBandSetPropertyInner value) throws IOException {
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
           public TierBandSetPropertyInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TierBandSetPropertyInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TierBandSetPropertyInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TierBandSetPropertyInner
  * @throws IOException if the JSON string is invalid with respect to TierBandSetPropertyInner
  */
  public static TierBandSetPropertyInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TierBandSetPropertyInner.class);
  }

 /**
  * Convert an instance of TierBandSetPropertyInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

