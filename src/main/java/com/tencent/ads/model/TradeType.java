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

/** 交易类型 */
@JsonAdapter(TradeType.Adapter.class)
public enum TradeType {
  CHARGE("CHARGE"),

  PAY("PAY"),

  TRANSFER_BACK("TRANSFER_BACK"),

  EXPIRE("EXPIRE");

  private String value;

  TradeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TradeType fromValue(String text) {
    for (TradeType b : TradeType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<TradeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TradeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TradeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TradeType.fromValue(String.valueOf(value));
    }
  }
}
