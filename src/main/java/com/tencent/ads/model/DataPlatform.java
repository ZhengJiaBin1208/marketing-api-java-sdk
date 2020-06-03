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
 * 数据应用
 */
@JsonAdapter(DataPlatform.Adapter.class)
public enum DataPlatform {

  DMP("DMP"),

  TDC("TDC"),

  TDP("TDP");

  private String value;

  DataPlatform(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DataPlatform fromValue(String text) {
    for (DataPlatform b : DataPlatform.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<DataPlatform> {

    @Override
    public void write(final JsonWriter jsonWriter, final DataPlatform enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DataPlatform read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DataPlatform.fromValue(String.valueOf(value));
    }
  }
}
