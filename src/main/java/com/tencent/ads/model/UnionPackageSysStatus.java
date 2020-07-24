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

/** 渠道包状态 */
@JsonAdapter(UnionPackageSysStatus.Adapter.class)
public enum UnionPackageSysStatus {
  PASSED("CHANNEL_PACKAGE_STATUS_PASSED"),

  REVIEWING("CHANNEL_PACKAGE_STATUS_REVIEWING"),

  DENIED("CHANNEL_PACKAGE_STATUS_DENIED"),

  DENIED_AGAIN("CHANNEL_PACKAGE_STATUS_DENIED_AGAIN"),

  REVIEWING_AGAIN("CHANNEL_PACKAGE_STATUS_REVIEWING_AGAIN"),

  ON_OFFLINE("CHANNEL_PACKAGE_STATUS_ON_OFFLINE"),

  OFFLINE("CHANNEL_PACKAGE_STATUS_OFFLINE"),

  DRAFT("CHANNEL_PACKAGE_STATUS_DRAFT");

  private String value;

  UnionPackageSysStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UnionPackageSysStatus fromValue(String text) {
    for (UnionPackageSysStatus b : UnionPackageSysStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<UnionPackageSysStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final UnionPackageSysStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UnionPackageSysStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UnionPackageSysStatus.fromValue(String.valueOf(value));
    }
  }
}
