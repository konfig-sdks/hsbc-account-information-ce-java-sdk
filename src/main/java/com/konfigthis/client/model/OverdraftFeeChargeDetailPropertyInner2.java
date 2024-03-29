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
import com.konfigthis.client.model.OtherApplicationFrequencyProperty5;
import com.konfigthis.client.model.OtherCalculationFrequencyProperty5;
import com.konfigthis.client.model.OtherFeeRateTypeProperty3;
import com.konfigthis.client.model.OtherFeeTypeProperty3;
import com.konfigthis.client.model.OverdraftFeeChargeCapProperty;
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
 * Details about the fees/charges
 */
@ApiModel(description = "Details about the fees/charges")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OverdraftFeeChargeDetailPropertyInner2 {
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
  private FeeTypeEnum feeType;

  public static final String SERIALIZED_NAME_OVERDRAFT_CONTROL_INDICATOR = "OverdraftControlIndicator";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_CONTROL_INDICATOR)
  private Boolean overdraftControlIndicator;

  public static final String SERIALIZED_NAME_INCREMENTAL_BORROWING_AMOUNT = "IncrementalBorrowingAmount";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_BORROWING_AMOUNT)
  private String incrementalBorrowingAmount;

  public static final String SERIALIZED_NAME_FEE_AMOUNT = "FeeAmount";
  @SerializedName(SERIALIZED_NAME_FEE_AMOUNT)
  private String feeAmount;

  public static final String SERIALIZED_NAME_FEE_RATE = "FeeRate";
  @SerializedName(SERIALIZED_NAME_FEE_RATE)
  private String feeRate;

  /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   */
  @JsonAdapter(FeeRateTypeEnum.Adapter.class)
 public enum FeeRateTypeEnum {
    LINKEDBASERATE("LinkedBaseRate"),
    
    GROSS("Gross"),
    
    NET("Net"),
    
    OTHER("Other");

    private String value;

    FeeRateTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FeeRateTypeEnum fromValue(String value) {
      for (FeeRateTypeEnum b : FeeRateTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FeeRateTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FeeRateTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FeeRateTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FeeRateTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FEE_RATE_TYPE = "FeeRateType";
  @SerializedName(SERIALIZED_NAME_FEE_RATE_TYPE)
  private FeeRateTypeEnum feeRateType;

  /**
   * Frequency at which the overdraft charge is applied to the account
   */
  @JsonAdapter(ApplicationFrequencyEnum.Adapter.class)
 public enum ApplicationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    
    ACCOUNTOPENING("AccountOpening"),
    
    ACADEMICTERM("AcademicTerm"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PERHOUR("PerHour"),
    
    PEROCCURRENCE("PerOccurrence"),
    
    PERSHEET("PerSheet"),
    
    PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    ApplicationFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ApplicationFrequencyEnum fromValue(String value) {
      for (ApplicationFrequencyEnum b : ApplicationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ApplicationFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ApplicationFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ApplicationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ApplicationFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_APPLICATION_FREQUENCY = "ApplicationFrequency";
  @SerializedName(SERIALIZED_NAME_APPLICATION_FREQUENCY)
  private ApplicationFrequencyEnum applicationFrequency;

  /**
   * How often is the overdraft fee/charge calculated for the account.
   */
  @JsonAdapter(CalculationFrequencyEnum.Adapter.class)
 public enum CalculationFrequencyEnum {
    ACCOUNTCLOSING("AccountClosing"),
    
    ACCOUNTOPENING("AccountOpening"),
    
    ACADEMICTERM("AcademicTerm"),
    
    CHARGINGPERIOD("ChargingPeriod"),
    
    DAILY("Daily"),
    
    PERITEM("PerItem"),
    
    MONTHLY("Monthly"),
    
    ONACCOUNTANNIVERSARY("OnAccountAnniversary"),
    
    OTHER("Other"),
    
    PERHOUR("PerHour"),
    
    PEROCCURRENCE("PerOccurrence"),
    
    PERSHEET("PerSheet"),
    
    PERTRANSACTION("PerTransaction"),
    
    PERTRANSACTIONAMOUNT("PerTransactionAmount"),
    
    PERTRANSACTIONPERCENTAGE("PerTransactionPercentage"),
    
    QUARTERLY("Quarterly"),
    
    SIXMONTHLY("SixMonthly"),
    
    STATEMENTMONTHLY("StatementMonthly"),
    
    WEEKLY("Weekly"),
    
    YEARLY("Yearly");

    private String value;

    CalculationFrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CalculationFrequencyEnum fromValue(String value) {
      for (CalculationFrequencyEnum b : CalculationFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CalculationFrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CalculationFrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CalculationFrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CalculationFrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CALCULATION_FREQUENCY = "CalculationFrequency";
  @SerializedName(SERIALIZED_NAME_CALCULATION_FREQUENCY)
  private CalculationFrequencyEnum calculationFrequency;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES)
  private List<String> notes = null;

  public static final String SERIALIZED_NAME_OTHER_FEE_TYPE = "OtherFeeType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_TYPE)
  private OtherFeeTypeProperty3 otherFeeType;

  public static final String SERIALIZED_NAME_OTHER_FEE_RATE_TYPE = "OtherFeeRateType";
  @SerializedName(SERIALIZED_NAME_OTHER_FEE_RATE_TYPE)
  private OtherFeeRateTypeProperty3 otherFeeRateType;

  public static final String SERIALIZED_NAME_OTHER_APPLICATION_FREQUENCY = "OtherApplicationFrequency";
  @SerializedName(SERIALIZED_NAME_OTHER_APPLICATION_FREQUENCY)
  private OtherApplicationFrequencyProperty5 otherApplicationFrequency;

  public static final String SERIALIZED_NAME_OTHER_CALCULATION_FREQUENCY = "OtherCalculationFrequency";
  @SerializedName(SERIALIZED_NAME_OTHER_CALCULATION_FREQUENCY)
  private OtherCalculationFrequencyProperty5 otherCalculationFrequency;

  public static final String SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_CAP = "OverdraftFeeChargeCap";
  @SerializedName(SERIALIZED_NAME_OVERDRAFT_FEE_CHARGE_CAP)
  private OverdraftFeeChargeCapProperty overdraftFeeChargeCap;

  public OverdraftFeeChargeDetailPropertyInner2() {
  }

  public OverdraftFeeChargeDetailPropertyInner2 feeType(FeeTypeEnum feeType) {
    
    
    
    
    this.feeType = feeType;
    return this;
  }

   /**
   * Overdraft fee type
   * @return feeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Overdraft fee type")

  public FeeTypeEnum getFeeType() {
    return feeType;
  }


  public void setFeeType(FeeTypeEnum feeType) {
    
    
    
    this.feeType = feeType;
  }


  public OverdraftFeeChargeDetailPropertyInner2 overdraftControlIndicator(Boolean overdraftControlIndicator) {
    
    
    
    
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


  public OverdraftFeeChargeDetailPropertyInner2 incrementalBorrowingAmount(String incrementalBorrowingAmount) {
    
    
    
    
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
    return this;
  }

   /**
   * Every additional tranche of an overdraft balance to which an overdraft fee is applied
   * @return incrementalBorrowingAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "Every additional tranche of an overdraft balance to which an overdraft fee is applied")

  public String getIncrementalBorrowingAmount() {
    return incrementalBorrowingAmount;
  }


  public void setIncrementalBorrowingAmount(String incrementalBorrowingAmount) {
    
    
    
    this.incrementalBorrowingAmount = incrementalBorrowingAmount;
  }


  public OverdraftFeeChargeDetailPropertyInner2 feeAmount(String feeAmount) {
    
    
    
    
    this.feeAmount = feeAmount;
    return this;
  }

   /**
   * Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)
   * @return feeAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5,000.00", value = "Amount charged for an overdraft fee/charge (where it is charged in terms of an amount rather than a rate)")

  public String getFeeAmount() {
    return feeAmount;
  }


  public void setFeeAmount(String feeAmount) {
    
    
    
    this.feeAmount = feeAmount;
  }


  public OverdraftFeeChargeDetailPropertyInner2 feeRate(String feeRate) {
    
    
    
    
    this.feeRate = feeRate;
    return this;
  }

   /**
   * Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.11", value = "Rate charged for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")

  public String getFeeRate() {
    return feeRate;
  }


  public void setFeeRate(String feeRate) {
    
    
    
    this.feeRate = feeRate;
  }


  public OverdraftFeeChargeDetailPropertyInner2 feeRateType(FeeRateTypeEnum feeRateType) {
    
    
    
    
    this.feeRateType = feeRateType;
    return this;
  }

   /**
   * Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)
   * @return feeRateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GROSS", value = "Rate type for overdraft fee/charge (where it is charged in terms of a rate rather than an amount)")

  public FeeRateTypeEnum getFeeRateType() {
    return feeRateType;
  }


  public void setFeeRateType(FeeRateTypeEnum feeRateType) {
    
    
    
    this.feeRateType = feeRateType;
  }


  public OverdraftFeeChargeDetailPropertyInner2 applicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    
    
    
    
    this.applicationFrequency = applicationFrequency;
    return this;
  }

   /**
   * Frequency at which the overdraft charge is applied to the account
   * @return applicationFrequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ACCOUNTOPENING", required = true, value = "Frequency at which the overdraft charge is applied to the account")

  public ApplicationFrequencyEnum getApplicationFrequency() {
    return applicationFrequency;
  }


  public void setApplicationFrequency(ApplicationFrequencyEnum applicationFrequency) {
    
    
    
    this.applicationFrequency = applicationFrequency;
  }


  public OverdraftFeeChargeDetailPropertyInner2 calculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    
    
    
    
    this.calculationFrequency = calculationFrequency;
    return this;
  }

   /**
   * How often is the overdraft fee/charge calculated for the account.
   * @return calculationFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DAILY", value = "How often is the overdraft fee/charge calculated for the account.")

  public CalculationFrequencyEnum getCalculationFrequency() {
    return calculationFrequency;
  }


  public void setCalculationFrequency(CalculationFrequencyEnum calculationFrequency) {
    
    
    
    this.calculationFrequency = calculationFrequency;
  }


  public OverdraftFeeChargeDetailPropertyInner2 notes(List<String> notes) {
    
    
    
    
    this.notes = notes;
    return this;
  }

  public OverdraftFeeChargeDetailPropertyInner2 addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<>();
    }
    this.notes.add(notesItem);
    return this;
  }

   /**
   * Free text for capturing any other info related to Overdraft Fees Charge Details
   * @return notes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Free text for capturing any other info related to Overdraft Fees Charge Details")

  public List<String> getNotes() {
    return notes;
  }


  public void setNotes(List<String> notes) {
    
    
    
    this.notes = notes;
  }


  public OverdraftFeeChargeDetailPropertyInner2 otherFeeType(OtherFeeTypeProperty3 otherFeeType) {
    
    
    
    
    this.otherFeeType = otherFeeType;
    return this;
  }

   /**
   * Get otherFeeType
   * @return otherFeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherFeeTypeProperty3 getOtherFeeType() {
    return otherFeeType;
  }


  public void setOtherFeeType(OtherFeeTypeProperty3 otherFeeType) {
    
    
    
    this.otherFeeType = otherFeeType;
  }


  public OverdraftFeeChargeDetailPropertyInner2 otherFeeRateType(OtherFeeRateTypeProperty3 otherFeeRateType) {
    
    
    
    
    this.otherFeeRateType = otherFeeRateType;
    return this;
  }

   /**
   * Get otherFeeRateType
   * @return otherFeeRateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherFeeRateTypeProperty3 getOtherFeeRateType() {
    return otherFeeRateType;
  }


  public void setOtherFeeRateType(OtherFeeRateTypeProperty3 otherFeeRateType) {
    
    
    
    this.otherFeeRateType = otherFeeRateType;
  }


  public OverdraftFeeChargeDetailPropertyInner2 otherApplicationFrequency(OtherApplicationFrequencyProperty5 otherApplicationFrequency) {
    
    
    
    
    this.otherApplicationFrequency = otherApplicationFrequency;
    return this;
  }

   /**
   * Get otherApplicationFrequency
   * @return otherApplicationFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherApplicationFrequencyProperty5 getOtherApplicationFrequency() {
    return otherApplicationFrequency;
  }


  public void setOtherApplicationFrequency(OtherApplicationFrequencyProperty5 otherApplicationFrequency) {
    
    
    
    this.otherApplicationFrequency = otherApplicationFrequency;
  }


  public OverdraftFeeChargeDetailPropertyInner2 otherCalculationFrequency(OtherCalculationFrequencyProperty5 otherCalculationFrequency) {
    
    
    
    
    this.otherCalculationFrequency = otherCalculationFrequency;
    return this;
  }

   /**
   * Get otherCalculationFrequency
   * @return otherCalculationFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OtherCalculationFrequencyProperty5 getOtherCalculationFrequency() {
    return otherCalculationFrequency;
  }


  public void setOtherCalculationFrequency(OtherCalculationFrequencyProperty5 otherCalculationFrequency) {
    
    
    
    this.otherCalculationFrequency = otherCalculationFrequency;
  }


  public OverdraftFeeChargeDetailPropertyInner2 overdraftFeeChargeCap(OverdraftFeeChargeCapProperty overdraftFeeChargeCap) {
    
    
    
    
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
    return this;
  }

   /**
   * Get overdraftFeeChargeCap
   * @return overdraftFeeChargeCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OverdraftFeeChargeCapProperty getOverdraftFeeChargeCap() {
    return overdraftFeeChargeCap;
  }


  public void setOverdraftFeeChargeCap(OverdraftFeeChargeCapProperty overdraftFeeChargeCap) {
    
    
    
    this.overdraftFeeChargeCap = overdraftFeeChargeCap;
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
   * @return the OverdraftFeeChargeDetailPropertyInner2 instance itself
   */
  public OverdraftFeeChargeDetailPropertyInner2 putAdditionalProperty(String key, Object value) {
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
    OverdraftFeeChargeDetailPropertyInner2 overdraftFeeChargeDetailPropertyInner2 = (OverdraftFeeChargeDetailPropertyInner2) o;
    return Objects.equals(this.feeType, overdraftFeeChargeDetailPropertyInner2.feeType) &&
        Objects.equals(this.overdraftControlIndicator, overdraftFeeChargeDetailPropertyInner2.overdraftControlIndicator) &&
        Objects.equals(this.incrementalBorrowingAmount, overdraftFeeChargeDetailPropertyInner2.incrementalBorrowingAmount) &&
        Objects.equals(this.feeAmount, overdraftFeeChargeDetailPropertyInner2.feeAmount) &&
        Objects.equals(this.feeRate, overdraftFeeChargeDetailPropertyInner2.feeRate) &&
        Objects.equals(this.feeRateType, overdraftFeeChargeDetailPropertyInner2.feeRateType) &&
        Objects.equals(this.applicationFrequency, overdraftFeeChargeDetailPropertyInner2.applicationFrequency) &&
        Objects.equals(this.calculationFrequency, overdraftFeeChargeDetailPropertyInner2.calculationFrequency) &&
        Objects.equals(this.notes, overdraftFeeChargeDetailPropertyInner2.notes) &&
        Objects.equals(this.otherFeeType, overdraftFeeChargeDetailPropertyInner2.otherFeeType) &&
        Objects.equals(this.otherFeeRateType, overdraftFeeChargeDetailPropertyInner2.otherFeeRateType) &&
        Objects.equals(this.otherApplicationFrequency, overdraftFeeChargeDetailPropertyInner2.otherApplicationFrequency) &&
        Objects.equals(this.otherCalculationFrequency, overdraftFeeChargeDetailPropertyInner2.otherCalculationFrequency) &&
        Objects.equals(this.overdraftFeeChargeCap, overdraftFeeChargeDetailPropertyInner2.overdraftFeeChargeCap)&&
        Objects.equals(this.additionalProperties, overdraftFeeChargeDetailPropertyInner2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feeType, overdraftControlIndicator, incrementalBorrowingAmount, feeAmount, feeRate, feeRateType, applicationFrequency, calculationFrequency, notes, otherFeeType, otherFeeRateType, otherApplicationFrequency, otherCalculationFrequency, overdraftFeeChargeCap, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OverdraftFeeChargeDetailPropertyInner2 {\n");
    sb.append("    feeType: ").append(toIndentedString(feeType)).append("\n");
    sb.append("    overdraftControlIndicator: ").append(toIndentedString(overdraftControlIndicator)).append("\n");
    sb.append("    incrementalBorrowingAmount: ").append(toIndentedString(incrementalBorrowingAmount)).append("\n");
    sb.append("    feeAmount: ").append(toIndentedString(feeAmount)).append("\n");
    sb.append("    feeRate: ").append(toIndentedString(feeRate)).append("\n");
    sb.append("    feeRateType: ").append(toIndentedString(feeRateType)).append("\n");
    sb.append("    applicationFrequency: ").append(toIndentedString(applicationFrequency)).append("\n");
    sb.append("    calculationFrequency: ").append(toIndentedString(calculationFrequency)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    otherFeeType: ").append(toIndentedString(otherFeeType)).append("\n");
    sb.append("    otherFeeRateType: ").append(toIndentedString(otherFeeRateType)).append("\n");
    sb.append("    otherApplicationFrequency: ").append(toIndentedString(otherApplicationFrequency)).append("\n");
    sb.append("    otherCalculationFrequency: ").append(toIndentedString(otherCalculationFrequency)).append("\n");
    sb.append("    overdraftFeeChargeCap: ").append(toIndentedString(overdraftFeeChargeCap)).append("\n");
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
    openapiFields.add("IncrementalBorrowingAmount");
    openapiFields.add("FeeAmount");
    openapiFields.add("FeeRate");
    openapiFields.add("FeeRateType");
    openapiFields.add("ApplicationFrequency");
    openapiFields.add("CalculationFrequency");
    openapiFields.add("Notes");
    openapiFields.add("OtherFeeType");
    openapiFields.add("OtherFeeRateType");
    openapiFields.add("OtherApplicationFrequency");
    openapiFields.add("OtherCalculationFrequency");
    openapiFields.add("OverdraftFeeChargeCap");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("FeeType");
    openapiRequiredFields.add("ApplicationFrequency");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OverdraftFeeChargeDetailPropertyInner2
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OverdraftFeeChargeDetailPropertyInner2.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OverdraftFeeChargeDetailPropertyInner2 is not found in the empty JSON string", OverdraftFeeChargeDetailPropertyInner2.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OverdraftFeeChargeDetailPropertyInner2.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("FeeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeType").toString()));
      }
      if ((jsonObj.get("IncrementalBorrowingAmount") != null && !jsonObj.get("IncrementalBorrowingAmount").isJsonNull()) && !jsonObj.get("IncrementalBorrowingAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IncrementalBorrowingAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IncrementalBorrowingAmount").toString()));
      }
      if ((jsonObj.get("FeeAmount") != null && !jsonObj.get("FeeAmount").isJsonNull()) && !jsonObj.get("FeeAmount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeAmount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeAmount").toString()));
      }
      if ((jsonObj.get("FeeRate") != null && !jsonObj.get("FeeRate").isJsonNull()) && !jsonObj.get("FeeRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeRate").toString()));
      }
      if ((jsonObj.get("FeeRateType") != null && !jsonObj.get("FeeRateType").isJsonNull()) && !jsonObj.get("FeeRateType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeeRateType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeeRateType").toString()));
      }
      if (!jsonObj.get("ApplicationFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ApplicationFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ApplicationFrequency").toString()));
      }
      if ((jsonObj.get("CalculationFrequency") != null && !jsonObj.get("CalculationFrequency").isJsonNull()) && !jsonObj.get("CalculationFrequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CalculationFrequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CalculationFrequency").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Notes") != null && !jsonObj.get("Notes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Notes` to be an array in the JSON string but got `%s`", jsonObj.get("Notes").toString()));
      }
      // validate the optional field `OtherFeeType`
      if (jsonObj.get("OtherFeeType") != null && !jsonObj.get("OtherFeeType").isJsonNull()) {
        OtherFeeTypeProperty3.validateJsonObject(jsonObj.getAsJsonObject("OtherFeeType"));
      }
      // validate the optional field `OtherFeeRateType`
      if (jsonObj.get("OtherFeeRateType") != null && !jsonObj.get("OtherFeeRateType").isJsonNull()) {
        OtherFeeRateTypeProperty3.validateJsonObject(jsonObj.getAsJsonObject("OtherFeeRateType"));
      }
      // validate the optional field `OtherApplicationFrequency`
      if (jsonObj.get("OtherApplicationFrequency") != null && !jsonObj.get("OtherApplicationFrequency").isJsonNull()) {
        OtherApplicationFrequencyProperty5.validateJsonObject(jsonObj.getAsJsonObject("OtherApplicationFrequency"));
      }
      // validate the optional field `OtherCalculationFrequency`
      if (jsonObj.get("OtherCalculationFrequency") != null && !jsonObj.get("OtherCalculationFrequency").isJsonNull()) {
        OtherCalculationFrequencyProperty5.validateJsonObject(jsonObj.getAsJsonObject("OtherCalculationFrequency"));
      }
      // validate the optional field `OverdraftFeeChargeCap`
      if (jsonObj.get("OverdraftFeeChargeCap") != null && !jsonObj.get("OverdraftFeeChargeCap").isJsonNull()) {
        OverdraftFeeChargeCapProperty.validateJsonObject(jsonObj.getAsJsonObject("OverdraftFeeChargeCap"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OverdraftFeeChargeDetailPropertyInner2.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OverdraftFeeChargeDetailPropertyInner2' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OverdraftFeeChargeDetailPropertyInner2> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OverdraftFeeChargeDetailPropertyInner2.class));

       return (TypeAdapter<T>) new TypeAdapter<OverdraftFeeChargeDetailPropertyInner2>() {
           @Override
           public void write(JsonWriter out, OverdraftFeeChargeDetailPropertyInner2 value) throws IOException {
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
           public OverdraftFeeChargeDetailPropertyInner2 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OverdraftFeeChargeDetailPropertyInner2 instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OverdraftFeeChargeDetailPropertyInner2 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OverdraftFeeChargeDetailPropertyInner2
  * @throws IOException if the JSON string is invalid with respect to OverdraftFeeChargeDetailPropertyInner2
  */
  public static OverdraftFeeChargeDetailPropertyInner2 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OverdraftFeeChargeDetailPropertyInner2.class);
  }

 /**
  * Convert an instance of OverdraftFeeChargeDetailPropertyInner2 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

