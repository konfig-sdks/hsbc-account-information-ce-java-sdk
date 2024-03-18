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
 * Other Fee/charge type which is not available in the standard code set
 */
@ApiModel(description = "Other Fee/charge type which is not available in the standard code set")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OtherFeeTypeProperty2 {
  public static final String SERIALIZED_NAME_CODE = "Code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  /**
   * Categorisation of fees and charges into standard categories.
   */
  @JsonAdapter(FeeCategoryEnum.Adapter.class)
 public enum FeeCategoryEnum {
    OTHER("Other"),
    
    SERVICING("Servicing");

    private String value;

    FeeCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeCategoryEnum fromValue(String value) {
      for (FeeCategoryEnum b : FeeCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_CATEGORY = "FeeCategory";
  @SerializedName(SERIALIZED_NAME_FEE_CATEGORY)
  private FeeCategoryEnum feeCategory;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public OtherFeeTypeProperty2() {
  }

  public OtherFeeTypeProperty2 code(String code) {
    
    
    if (code != null && code.length() < 0) {
      throw new IllegalArgumentException("Invalid value for code. Length must be greater than or equal to 0.");
    }
    
    this.code = code;
    return this;
  }

   /**
   * The four letter Mnemonic used within an XML file to identify a code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC", value = "The four letter Mnemonic used within an XML file to identify a code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    if (code != null && code.length() < 0) {
      throw new IllegalArgumentException("Invalid value for code. Length must be greater than or equal to 0.");
    }
    this.code = code;
  }


  public OtherFeeTypeProperty2 feeCategory(FeeCategoryEnum feeCategory) {
    
    
    
    
    this.feeCategory = feeCategory;
    return this;
  }

   /**
   * Categorisation of fees and charges into standard categories.
   * @return feeCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OTHER", required = true, value = "Categorisation of fees and charges into standard categories.")

  public FeeCategoryEnum getFeeCategory() {
    return feeCategory;
  }


  public void setFeeCategory(FeeCategoryEnum feeCategory) {
    
    
    
    this.feeCategory = feeCategory;
  }


  public OtherFeeTypeProperty2 name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Long name associated with the code
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bobby Lee", required = true, value = "Long name associated with the code")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public OtherFeeTypeProperty2 description(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    
    this.description = description;
    return this;
  }

   /**
   * Description to describe the purpose of the code
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "desc.", required = true, value = "Description to describe the purpose of the code")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    if (description != null && description.length() < 1) {
      throw new IllegalArgumentException("Invalid value for description. Length must be greater than or equal to 1.");
    }
    this.description = description;
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
   * @return the OtherFeeTypeProperty2 instance itself
   */
  public OtherFeeTypeProperty2 putAdditionalProperty(String key, Object value) {
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
    OtherFeeTypeProperty2 otherFeeTypeProperty2 = (OtherFeeTypeProperty2) o;
    return Objects.equals(this.code, otherFeeTypeProperty2.code) &&
        Objects.equals(this.feeCategory, otherFeeTypeProperty2.feeCategory) &&
        Objects.equals(this.name, otherFeeTypeProperty2.name) &&
        Objects.equals(this.description, otherFeeTypeProperty2.description)&&
        Objects.equals(this.additionalProperties, otherFeeTypeProperty2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, feeCategory, name, description, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtherFeeTypeProperty2 {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    feeCategory: ").append(toIndentedString(feeCategory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("Code");
    openapiFields.add("FeeCategory");
    openapiFields.add("Name");
    openapiFields.add("Description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FeeCategory");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Description");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OtherFeeTypeProperty2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OtherFeeTypeProperty2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OtherFeeTypeProperty2 is not found in the empty JSON string", OtherFeeTypeProperty2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OtherFeeTypeProperty2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Code") != null && !jsonObj.get("Code").isJsonNull()) && !jsonObj.get("Code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Code").toString()));
      }
      if (!jsonObj.get("FeeCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeCategory").toString()));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OtherFeeTypeProperty2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OtherFeeTypeProperty2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OtherFeeTypeProperty2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OtherFeeTypeProperty2.class));

       return (TypeAdapter<T>) new TypeAdapter<OtherFeeTypeProperty2>() {
           @Override
           public void write(JsonWriter out, OtherFeeTypeProperty2 value) throws IOException {
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
           public OtherFeeTypeProperty2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OtherFeeTypeProperty2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OtherFeeTypeProperty2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OtherFeeTypeProperty2
  * @throws IOException if the JSON string is invalid with respect to OtherFeeTypeProperty2
  */
  public static OtherFeeTypeProperty2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OtherFeeTypeProperty2.class);
  }

 /**
  * Convert an instance of OtherFeeTypeProperty2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

