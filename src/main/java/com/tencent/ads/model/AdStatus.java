/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.2
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

/**
 * 客户设置的状态
 */
@JsonAdapter(AdStatus.Adapter.class)
public enum AdStatus {

  NORMAL("AD_STATUS_NORMAL"),

  SUSPEND("AD_STATUS_SUSPEND"),

  WITHDRAW("AD_STATUS_WITHDRAW"),

  PENDING("AD_STATUS_PENDING"),

  DENIED("AD_STATUS_DENIED"),

  FROZEN("AD_STATUS_FROZEN"),

  PREPARE("AD_STATUS_PREPARE"),

  DELETED("AD_STATUS_DELETED");

  private String value;

  AdStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AdStatus fromValue(String text) {
    for (AdStatus b : AdStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AdStatus> {

    @Override
    public void write(final JsonWriter jsonWriter, final AdStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AdStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AdStatus.fromValue(String.valueOf(value));
    }
  }
}
