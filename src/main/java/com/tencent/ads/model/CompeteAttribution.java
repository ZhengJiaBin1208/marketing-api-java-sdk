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
 * 竞争力属性
 */
@JsonAdapter(CompeteAttribution.Adapter.class)
public enum CompeteAttribution {

  ECPM("ATTRIBUTE_ECPM"),

  BID("ATTRIBUTE_BID"),

  PCTR("ATTRIBUTE_PCTR"),

  TARGETING("ATTRIBUTE_TARGETING"),

  COLD_START("ATTRIBUTE_COLD_START"),

  EXPERIMENT("ATTRIBUTE_EXPERIMENT"),

  CAMPAIGN("ATTRIBUTE_CAMPAIGN"),

  EXPERIENCE_OTHERS("ATTRIBUTE_EXPERIENCE_OTHERS"),

  OTHERS("ATTRIBUTE_OTHERS"),

  EXPERIENCE_PRODUCT("ATTRIBUTE_EXPERIENCE_PRODUCT"),

  EXPERIENCE_CREATIVE("ATTRIBUTE_EXPERIENCE_CREATIVE"),

  LEARNING_FAILED("ATTRIBUTE_LEARNING_FAILED"),

  EXPERIENCE_FEEDBACK("ATTRIBUTE_EXPERIENCE_FEEDBACK"),

  EXPERIENCE_FRESHNESS("ATTRIBUTE_EXPERIENCE_FRESHNESS"),

  BUDGET("ATTRIBUTE_BUDGET"),

  INNER_COMPETE("ATTRIBUTE_INNER_COMPETE"),

  PCVR("ATTRIBUTE_PCVR");

  private String value;

  CompeteAttribution(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CompeteAttribution fromValue(String text) {
    for (CompeteAttribution b : CompeteAttribution.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CompeteAttribution> {

    @Override
    public void write(final JsonWriter jsonWriter, final CompeteAttribution enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CompeteAttribution read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CompeteAttribution.fromValue(String.valueOf(value));
    }
  }
}
