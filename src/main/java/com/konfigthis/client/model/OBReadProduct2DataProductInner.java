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
import com.konfigthis.client.model.OBBCAData1;
import com.konfigthis.client.model.OBPCAData1;
import com.konfigthis.client.model.OBReadProduct2DataProductInnerOtherProductType;
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
 * Product details associated with the Account
 */
@ApiModel(description = "Product details associated with the Account")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBReadProduct2DataProductInner {
  public static final String SERIALIZED_NAME_PRODUCT_NAME = "ProductName";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "ProductId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SECONDARY_PRODUCT_ID = "SecondaryProductId";
  @SerializedName(SERIALIZED_NAME_SECONDARY_PRODUCT_ID)
  private String secondaryProductId;

  /**
   * Product type : Personal Current Account, Business Current Account
   */
  @JsonAdapter(ProductTypeEnum.Adapter.class)
 public enum ProductTypeEnum {
    BUSINESSCURRENTACCOUNT("BusinessCurrentAccount"),
    
    COMMERCIALCREDITCARD("CommercialCreditCard"),
    
    OTHER("Other"),
    
    PERSONALCURRENTACCOUNT("PersonalCurrentAccount"),
    
    SMELOAN("SMELoan");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProductTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProductTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRODUCT_TYPE = "ProductType";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TYPE)
  private ProductTypeEnum productType;

  public static final String SERIALIZED_NAME_MARKETING_STATE_ID = "MarketingStateId";
  @SerializedName(SERIALIZED_NAME_MARKETING_STATE_ID)
  private String marketingStateId;

  public static final String SERIALIZED_NAME_OTHER_PRODUCT_TYPE = "OtherProductType";
  @SerializedName(SERIALIZED_NAME_OTHER_PRODUCT_TYPE)
  private OBReadProduct2DataProductInnerOtherProductType otherProductType;

  public static final String SERIALIZED_NAME_B_C_A = "BCA";
  @SerializedName(SERIALIZED_NAME_B_C_A)
  private OBBCAData1 BCA;

  public static final String SERIALIZED_NAME_P_C_A = "PCA";
  @SerializedName(SERIALIZED_NAME_P_C_A)
  private OBPCAData1 PCA;

  public OBReadProduct2DataProductInner() {
  }

  public OBReadProduct2DataProductInner productName(String productName) {
    
    
    if (productName != null && productName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for productName. Length must be greater than or equal to 1.");
    }
    
    this.productName = productName;
    return this;
  }

   /**
   * The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CurrentAccount", value = "The name of the Product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    
    
    if (productName != null && productName.length() < 1) {
      throw new IllegalArgumentException("Invalid value for productName. Length must be greater than or equal to 1.");
    }
    this.productName = productName;
  }


  public OBReadProduct2DataProductInner productId(String productId) {
    
    
    if (productId != null && productId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for productId. Length must be greater than or equal to 1.");
    }
    
    this.productId = productId;
    return this;
  }

   /**
   * The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test ID", value = "The unique ID that has been internally assigned by the financial institution to each of the current account banking products they market to their retail and/or small to medium enterprise (SME) customers.")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    
    
    if (productId != null && productId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for productId. Length must be greater than or equal to 1.");
    }
    this.productId = productId;
  }


  public OBReadProduct2DataProductInner accountId(String accountId) {
    
    
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
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WQEF7_6iy3HEWspIs8CDOw", required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    if (accountId != null && accountId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for accountId. Length must be greater than or equal to 1.");
    }
    this.accountId = accountId;
  }


  public OBReadProduct2DataProductInner secondaryProductId(String secondaryProductId) {
    
    
    if (secondaryProductId != null && secondaryProductId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for secondaryProductId. Length must be greater than or equal to 1.");
    }
    
    this.secondaryProductId = secondaryProductId;
    return this;
  }

   /**
   * Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.
   * @return secondaryProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "secondary Product value", value = "Any secondary Identification which  supports Product Identifier to uniquely identify the current account banking products.")

  public String getSecondaryProductId() {
    return secondaryProductId;
  }


  public void setSecondaryProductId(String secondaryProductId) {
    
    
    if (secondaryProductId != null && secondaryProductId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for secondaryProductId. Length must be greater than or equal to 1.");
    }
    this.secondaryProductId = secondaryProductId;
  }


  public OBReadProduct2DataProductInner productType(ProductTypeEnum productType) {
    
    
    
    
    this.productType = productType;
    return this;
  }

   /**
   * Product type : Personal Current Account, Business Current Account
   * @return productType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMMERCIALCREDITCARD", required = true, value = "Product type : Personal Current Account, Business Current Account")

  public ProductTypeEnum getProductType() {
    return productType;
  }


  public void setProductType(ProductTypeEnum productType) {
    
    
    
    this.productType = productType;
  }


  public OBReadProduct2DataProductInner marketingStateId(String marketingStateId) {
    
    
    if (marketingStateId != null && marketingStateId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for marketingStateId. Length must be greater than or equal to 1.");
    }
    
    this.marketingStateId = marketingStateId;
    return this;
  }

   /**
   * Unique and unambiguous identification of a  Product Marketing State.
   * @return marketingStateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5d6b9480-44d5-4c72-8dc5-3ae24f510b7d", value = "Unique and unambiguous identification of a  Product Marketing State.")

  public String getMarketingStateId() {
    return marketingStateId;
  }


  public void setMarketingStateId(String marketingStateId) {
    
    
    if (marketingStateId != null && marketingStateId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for marketingStateId. Length must be greater than or equal to 1.");
    }
    this.marketingStateId = marketingStateId;
  }


  public OBReadProduct2DataProductInner otherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    
    
    
    
    this.otherProductType = otherProductType;
    return this;
  }

   /**
   * Get otherProductType
   * @return otherProductType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBReadProduct2DataProductInnerOtherProductType getOtherProductType() {
    return otherProductType;
  }


  public void setOtherProductType(OBReadProduct2DataProductInnerOtherProductType otherProductType) {
    
    
    
    this.otherProductType = otherProductType;
  }


  public OBReadProduct2DataProductInner BCA(OBBCAData1 BCA) {
    
    
    
    
    this.BCA = BCA;
    return this;
  }

   /**
   * Get BCA
   * @return BCA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBCAData1 getBCA() {
    return BCA;
  }


  public void setBCA(OBBCAData1 BCA) {
    
    
    
    this.BCA = BCA;
  }


  public OBReadProduct2DataProductInner PCA(OBPCAData1 PCA) {
    
    
    
    
    this.PCA = PCA;
    return this;
  }

   /**
   * Get PCA
   * @return PCA
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBPCAData1 getPCA() {
    return PCA;
  }


  public void setPCA(OBPCAData1 PCA) {
    
    
    
    this.PCA = PCA;
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
   * @return the OBReadProduct2DataProductInner instance itself
   */
  public OBReadProduct2DataProductInner putAdditionalProperty(String key, Object value) {
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
    OBReadProduct2DataProductInner obReadProduct2DataProductInner = (OBReadProduct2DataProductInner) o;
    return Objects.equals(this.productName, obReadProduct2DataProductInner.productName) &&
        Objects.equals(this.productId, obReadProduct2DataProductInner.productId) &&
        Objects.equals(this.accountId, obReadProduct2DataProductInner.accountId) &&
        Objects.equals(this.secondaryProductId, obReadProduct2DataProductInner.secondaryProductId) &&
        Objects.equals(this.productType, obReadProduct2DataProductInner.productType) &&
        Objects.equals(this.marketingStateId, obReadProduct2DataProductInner.marketingStateId) &&
        Objects.equals(this.otherProductType, obReadProduct2DataProductInner.otherProductType) &&
        Objects.equals(this.BCA, obReadProduct2DataProductInner.BCA) &&
        Objects.equals(this.PCA, obReadProduct2DataProductInner.PCA)&&
        Objects.equals(this.additionalProperties, obReadProduct2DataProductInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, productId, accountId, secondaryProductId, productType, marketingStateId, otherProductType, BCA, PCA, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBReadProduct2DataProductInner {\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    secondaryProductId: ").append(toIndentedString(secondaryProductId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    marketingStateId: ").append(toIndentedString(marketingStateId)).append("\n");
    sb.append("    otherProductType: ").append(toIndentedString(otherProductType)).append("\n");
    sb.append("    BCA: ").append(toIndentedString(BCA)).append("\n");
    sb.append("    PCA: ").append(toIndentedString(PCA)).append("\n");
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
    openapiFields.add("ProductName");
    openapiFields.add("ProductId");
    openapiFields.add("AccountId");
    openapiFields.add("SecondaryProductId");
    openapiFields.add("ProductType");
    openapiFields.add("MarketingStateId");
    openapiFields.add("OtherProductType");
    openapiFields.add("BCA");
    openapiFields.add("PCA");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("ProductType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBReadProduct2DataProductInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBReadProduct2DataProductInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBReadProduct2DataProductInner is not found in the empty JSON string", OBReadProduct2DataProductInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBReadProduct2DataProductInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ProductName") != null && !jsonObj.get("ProductName").isJsonNull()) && !jsonObj.get("ProductName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProductName").toString()));
      }
      if ((jsonObj.get("ProductId") != null && !jsonObj.get("ProductId").isJsonNull()) && !jsonObj.get("ProductId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProductId").toString()));
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("SecondaryProductId") != null && !jsonObj.get("SecondaryProductId").isJsonNull()) && !jsonObj.get("SecondaryProductId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SecondaryProductId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SecondaryProductId").toString()));
      }
      if (!jsonObj.get("ProductType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ProductType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ProductType").toString()));
      }
      if ((jsonObj.get("MarketingStateId") != null && !jsonObj.get("MarketingStateId").isJsonNull()) && !jsonObj.get("MarketingStateId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MarketingStateId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MarketingStateId").toString()));
      }
      // validate the optional field `OtherProductType`
      if (jsonObj.get("OtherProductType") != null && !jsonObj.get("OtherProductType").isJsonNull()) {
        OBReadProduct2DataProductInnerOtherProductType.validateJsonObject(jsonObj.getAsJsonObject("OtherProductType"));
      }
      // validate the optional field `BCA`
      if (jsonObj.get("BCA") != null && !jsonObj.get("BCA").isJsonNull()) {
        OBBCAData1.validateJsonObject(jsonObj.getAsJsonObject("BCA"));
      }
      // validate the optional field `PCA`
      if (jsonObj.get("PCA") != null && !jsonObj.get("PCA").isJsonNull()) {
        OBPCAData1.validateJsonObject(jsonObj.getAsJsonObject("PCA"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBReadProduct2DataProductInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBReadProduct2DataProductInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBReadProduct2DataProductInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBReadProduct2DataProductInner.class));

       return (TypeAdapter<T>) new TypeAdapter<OBReadProduct2DataProductInner>() {
           @Override
           public void write(JsonWriter out, OBReadProduct2DataProductInner value) throws IOException {
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
           public OBReadProduct2DataProductInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBReadProduct2DataProductInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBReadProduct2DataProductInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBReadProduct2DataProductInner
  * @throws IOException if the JSON string is invalid with respect to OBReadProduct2DataProductInner
  */
  public static OBReadProduct2DataProductInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBReadProduct2DataProductInner.class);
  }

 /**
  * Convert an instance of OBReadProduct2DataProductInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

