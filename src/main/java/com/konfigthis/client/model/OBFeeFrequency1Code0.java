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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Frequency at which the overdraft charge is applied to the account
 */
@JsonAdapter(OBFeeFrequency1Code0.Adapter.class)public enum OBFeeFrequency1Code0 {
  
  FEAC("FEAC"),
  
  FEAO("FEAO"),
  
  FECP("FECP"),
  
  FEDA("FEDA"),
  
  FEHO("FEHO"),
  
  FEI("FEI"),
  
  FEMO("FEMO"),
  
  FEOA("FEOA"),
  
  FEOT("FEOT"),
  
  FEPC("FEPC"),
  
  FEPH("FEPH"),
  
  FEPO("FEPO"),
  
  FEPS("FEPS"),
  
  FEPT("FEPT"),
  
  FEPTA("FEPTA"),
  
  FEPTP("FEPTP"),
  
  FEQU("FEQU"),
  
  FESM("FESM"),
  
  FEST("FEST"),
  
  FEWE("FEWE"),
  
  FEYE("FEYE");

  private String value;

  OBFeeFrequency1Code0(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBFeeFrequency1Code0 fromValue(String value) {
    for (OBFeeFrequency1Code0 b : OBFeeFrequency1Code0.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OBFeeFrequency1Code0> {
    @Override
    public void write(final JsonWriter jsonWriter, final OBFeeFrequency1Code0 enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OBFeeFrequency1Code0 read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OBFeeFrequency1Code0.fromValue(value);
    }
  }
}

