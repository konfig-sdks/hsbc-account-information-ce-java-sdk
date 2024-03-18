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
 * Status of a transaction entry on the books of the account servicer.
 */
@JsonAdapter(OBEntryStatus1Code.Adapter.class)public enum OBEntryStatus1Code {
  
  BOOKED("Booked"),
  
  PENDING("Pending"),
  
  REJECTED("Rejected");

  private String value;

  OBEntryStatus1Code(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OBEntryStatus1Code fromValue(String value) {
    for (OBEntryStatus1Code b : OBEntryStatus1Code.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OBEntryStatus1Code> {
    @Override
    public void write(final JsonWriter jsonWriter, final OBEntryStatus1Code enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OBEntryStatus1Code read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OBEntryStatus1Code.fromValue(value);
    }
  }
}

