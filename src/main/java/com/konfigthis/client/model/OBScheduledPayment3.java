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
import com.konfigthis.client.model.OBActiveOrHistoricCurrencyAndAmount1;
import com.konfigthis.client.model.OBBranchAndFinancialInstitutionIdentification51;
import com.konfigthis.client.model.OBCashAccount51;
import com.konfigthis.client.model.OBExternalScheduleType1Code;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * OBScheduledPayment3
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OBScheduledPayment3 {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "AccountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_ID = "ScheduledPaymentId";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_ID)
  private String scheduledPaymentId;

  public static final String SERIALIZED_NAME_SCHEDULED_PAYMENT_DATE_TIME = "ScheduledPaymentDateTime";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_PAYMENT_DATE_TIME)
  private OffsetDateTime scheduledPaymentDateTime;

  public static final String SERIALIZED_NAME_SCHEDULED_TYPE = "ScheduledType";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_TYPE)
  private OBExternalScheduleType1Code scheduledType;

  public static final String SERIALIZED_NAME_REFERENCE = "Reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_DEBTOR_REFERENCE = "DebtorReference";
  @SerializedName(SERIALIZED_NAME_DEBTOR_REFERENCE)
  private String debtorReference;

  public static final String SERIALIZED_NAME_INSTRUCTED_AMOUNT = "InstructedAmount";
  @SerializedName(SERIALIZED_NAME_INSTRUCTED_AMOUNT)
  private OBActiveOrHistoricCurrencyAndAmount1 instructedAmount;

  public static final String SERIALIZED_NAME_CREDITOR_AGENT = "CreditorAgent";
  @SerializedName(SERIALIZED_NAME_CREDITOR_AGENT)
  private OBBranchAndFinancialInstitutionIdentification51 creditorAgent;

  public static final String SERIALIZED_NAME_CREDITOR_ACCOUNT = "CreditorAccount";
  @SerializedName(SERIALIZED_NAME_CREDITOR_ACCOUNT)
  private OBCashAccount51 creditorAccount;

  public OBScheduledPayment3() {
  }

  public OBScheduledPayment3 accountId(String accountId) {
    
    
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


  public OBScheduledPayment3 scheduledPaymentId(String scheduledPaymentId) {
    
    
    if (scheduledPaymentId != null && scheduledPaymentId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for scheduledPaymentId. Length must be greater than or equal to 1.");
    }
    
    this.scheduledPaymentId = scheduledPaymentId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.
   * @return scheduledPaymentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ScheduledPaymentId", value = "A unique and immutable identifier used to identify the scheduled payment resource. This identifier has no meaning to the account owner.")

  public String getScheduledPaymentId() {
    return scheduledPaymentId;
  }


  public void setScheduledPaymentId(String scheduledPaymentId) {
    
    
    if (scheduledPaymentId != null && scheduledPaymentId.length() < 1) {
      throw new IllegalArgumentException("Invalid value for scheduledPaymentId. Length must be greater than or equal to 1.");
    }
    this.scheduledPaymentId = scheduledPaymentId;
  }


  public OBScheduledPayment3 scheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    
    
    
    
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
    return this;
  }

   /**
   * The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00
   * @return scheduledPaymentDateTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2023-01-04T00:00Z", required = true, value = "The date on which the scheduled payment will be made.All dates in the JSON payloads are represented in ISO 8601 date-time format.  All date-time fields in responses must include the timezone. An example is below: 2017-04-05T10:43:07+00:00")

  public OffsetDateTime getScheduledPaymentDateTime() {
    return scheduledPaymentDateTime;
  }


  public void setScheduledPaymentDateTime(OffsetDateTime scheduledPaymentDateTime) {
    
    
    
    this.scheduledPaymentDateTime = scheduledPaymentDateTime;
  }


  public OBScheduledPayment3 scheduledType(OBExternalScheduleType1Code scheduledType) {
    
    
    
    
    this.scheduledType = scheduledType;
    return this;
  }

   /**
   * Get scheduledType
   * @return scheduledType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBExternalScheduleType1Code getScheduledType() {
    return scheduledType;
  }


  public void setScheduledType(OBExternalScheduleType1Code scheduledType) {
    
    
    
    this.scheduledType = scheduledType;
  }


  public OBScheduledPayment3 reference(String reference) {
    
    
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


  public OBScheduledPayment3 debtorReference(String debtorReference) {
    
    
    if (debtorReference != null && debtorReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for debtorReference. Length must be greater than or equal to 1.");
    }
    
    this.debtorReference = debtorReference;
    return this;
  }

   /**
   * A reference value provided by the PSU to the PISP while setting up the scheduled payment.
   * @return debtorReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A sample referance.", value = "A reference value provided by the PSU to the PISP while setting up the scheduled payment.")

  public String getDebtorReference() {
    return debtorReference;
  }


  public void setDebtorReference(String debtorReference) {
    
    
    if (debtorReference != null && debtorReference.length() < 1) {
      throw new IllegalArgumentException("Invalid value for debtorReference. Length must be greater than or equal to 1.");
    }
    this.debtorReference = debtorReference;
  }


  public OBScheduledPayment3 instructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    
    
    
    
    this.instructedAmount = instructedAmount;
    return this;
  }

   /**
   * Get instructedAmount
   * @return instructedAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OBActiveOrHistoricCurrencyAndAmount1 getInstructedAmount() {
    return instructedAmount;
  }


  public void setInstructedAmount(OBActiveOrHistoricCurrencyAndAmount1 instructedAmount) {
    
    
    
    this.instructedAmount = instructedAmount;
  }


  public OBScheduledPayment3 creditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    
    
    
    
    this.creditorAgent = creditorAgent;
    return this;
  }

   /**
   * Get creditorAgent
   * @return creditorAgent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBBranchAndFinancialInstitutionIdentification51 getCreditorAgent() {
    return creditorAgent;
  }


  public void setCreditorAgent(OBBranchAndFinancialInstitutionIdentification51 creditorAgent) {
    
    
    
    this.creditorAgent = creditorAgent;
  }


  public OBScheduledPayment3 creditorAccount(OBCashAccount51 creditorAccount) {
    
    
    
    
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OBCashAccount51 getCreditorAccount() {
    return creditorAccount;
  }


  public void setCreditorAccount(OBCashAccount51 creditorAccount) {
    
    
    
    this.creditorAccount = creditorAccount;
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
   * @return the OBScheduledPayment3 instance itself
   */
  public OBScheduledPayment3 putAdditionalProperty(String key, Object value) {
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
    OBScheduledPayment3 obScheduledPayment3 = (OBScheduledPayment3) o;
    return Objects.equals(this.accountId, obScheduledPayment3.accountId) &&
        Objects.equals(this.scheduledPaymentId, obScheduledPayment3.scheduledPaymentId) &&
        Objects.equals(this.scheduledPaymentDateTime, obScheduledPayment3.scheduledPaymentDateTime) &&
        Objects.equals(this.scheduledType, obScheduledPayment3.scheduledType) &&
        Objects.equals(this.reference, obScheduledPayment3.reference) &&
        Objects.equals(this.debtorReference, obScheduledPayment3.debtorReference) &&
        Objects.equals(this.instructedAmount, obScheduledPayment3.instructedAmount) &&
        Objects.equals(this.creditorAgent, obScheduledPayment3.creditorAgent) &&
        Objects.equals(this.creditorAccount, obScheduledPayment3.creditorAccount)&&
        Objects.equals(this.additionalProperties, obScheduledPayment3.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, scheduledPaymentId, scheduledPaymentDateTime, scheduledType, reference, debtorReference, instructedAmount, creditorAgent, creditorAccount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OBScheduledPayment3 {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    scheduledPaymentId: ").append(toIndentedString(scheduledPaymentId)).append("\n");
    sb.append("    scheduledPaymentDateTime: ").append(toIndentedString(scheduledPaymentDateTime)).append("\n");
    sb.append("    scheduledType: ").append(toIndentedString(scheduledType)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    debtorReference: ").append(toIndentedString(debtorReference)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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
    openapiFields.add("ScheduledPaymentId");
    openapiFields.add("ScheduledPaymentDateTime");
    openapiFields.add("ScheduledType");
    openapiFields.add("Reference");
    openapiFields.add("DebtorReference");
    openapiFields.add("InstructedAmount");
    openapiFields.add("CreditorAgent");
    openapiFields.add("CreditorAccount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AccountId");
    openapiRequiredFields.add("ScheduledPaymentDateTime");
    openapiRequiredFields.add("ScheduledType");
    openapiRequiredFields.add("InstructedAmount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OBScheduledPayment3
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OBScheduledPayment3.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OBScheduledPayment3 is not found in the empty JSON string", OBScheduledPayment3.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OBScheduledPayment3.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AccountId").toString()));
      }
      if ((jsonObj.get("ScheduledPaymentId") != null && !jsonObj.get("ScheduledPaymentId").isJsonNull()) && !jsonObj.get("ScheduledPaymentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ScheduledPaymentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ScheduledPaymentId").toString()));
      }
      if ((jsonObj.get("Reference") != null && !jsonObj.get("Reference").isJsonNull()) && !jsonObj.get("Reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Reference").toString()));
      }
      if ((jsonObj.get("DebtorReference") != null && !jsonObj.get("DebtorReference").isJsonNull()) && !jsonObj.get("DebtorReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DebtorReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DebtorReference").toString()));
      }
      // validate the required field `InstructedAmount`
      OBActiveOrHistoricCurrencyAndAmount1.validateJsonObject(jsonObj.getAsJsonObject("InstructedAmount"));
      // validate the optional field `CreditorAgent`
      if (jsonObj.get("CreditorAgent") != null && !jsonObj.get("CreditorAgent").isJsonNull()) {
        OBBranchAndFinancialInstitutionIdentification51.validateJsonObject(jsonObj.getAsJsonObject("CreditorAgent"));
      }
      // validate the optional field `CreditorAccount`
      if (jsonObj.get("CreditorAccount") != null && !jsonObj.get("CreditorAccount").isJsonNull()) {
        OBCashAccount51.validateJsonObject(jsonObj.getAsJsonObject("CreditorAccount"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OBScheduledPayment3.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OBScheduledPayment3' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OBScheduledPayment3> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OBScheduledPayment3.class));

       return (TypeAdapter<T>) new TypeAdapter<OBScheduledPayment3>() {
           @Override
           public void write(JsonWriter out, OBScheduledPayment3 value) throws IOException {
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
           public OBScheduledPayment3 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OBScheduledPayment3 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OBScheduledPayment3 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OBScheduledPayment3
  * @throws IOException if the JSON string is invalid with respect to OBScheduledPayment3
  */
  public static OBScheduledPayment3 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OBScheduledPayment3.class);
  }

 /**
  * Convert an instance of OBScheduledPayment3 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
