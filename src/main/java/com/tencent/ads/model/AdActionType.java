/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/** 人群报表行为类型 */
@JsonAdapter(AdActionType.Adapter.class)
public enum AdActionType {
  CLICK("CLICK"),

  EXPOSURE("EXPOSURE"),

  ORDER("ORDER"),

  APP_FINISH_DOWNLOAD("APP_FINISH_DOWNLOAD"),

  APP_INSTALL("APP_INSTALL"),

  APP_ACTIVATE("APP_ACTIVATE"),

  REGISTRATION_APP("REGISTRATION_APP"),

  APP_ONE_DAY_RETENTION("APP_ONE_DAY_RETENTION"),

  ADD_TO_CART_APP("ADD_TO_CART_APP"),

  APP_PURCHASE("APP_PURCHASE"),

  APP_APPLY("APP_APPLY"),

  REGISTRATION_WEB("REGISTRATION_WEB"),

  ADD_TO_CART_WEB("ADD_TO_CART_WEB"),

  WEB_ONLINE_CONSULT("WEB_ONLINE_CONSULT"),

  WEB_MAKE_PHONE_CALL("WEB_MAKE_PHONE_CALL"),

  WEB_RESERVE_PHONE_NUMBER("WEB_RESERVE_PHONE_NUMBER"),

  WEB_RESERVATION("WEB_RESERVATION"),

  APPLY_WEB("APPLY_WEB"),

  WEB_DELIVER("WEB_DELIVER"),

  PURCHASE_WEB("PURCHASE_WEB"),

  WEB_VIEW_COMMODITY_PAGE("WEB_VIEW_COMMODITY_PAGE");

  private String value;

  AdActionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdActionType fromValue(String text) {
    for (AdActionType b : AdActionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdActionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final AdActionType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdActionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdActionType.fromValue(String.valueOf(value));
    }
  }
}