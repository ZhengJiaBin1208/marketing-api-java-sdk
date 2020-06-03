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
 * 扣费方式
 */
@JsonAdapter(CostType.Adapter.class)
public enum CostType {

  BID_TYPE_CPC("BID_TYPE_CPC"),

  BID_TYPE_CPA("BID_TYPE_CPA"),

  BID_TYPE_CPS("BID_TYPE_CPS"),

  BID_TYPE_CPM("BID_TYPE_CPM"),

  BID_TYPE_CPD("BID_TYPE_CPD"),

  COSTTYPE_UNKNOWN("COSTTYPE_UNKNOWN"),

  COSTTYPE_CPC("COSTTYPE_CPC"),

  COSTTYPE_CPA("COSTTYPE_CPA"),

  COSTTYPE_CPS("COSTTYPE_CPS"),

  COSTTYPE_CPM("COSTTYPE_CPM"),

  COSTTYPE_CPD("COSTTYPE_CPD"),

  COSTTYPE_CPT("COSTTYPE_CPT");

  private String value;

  CostType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CostType fromValue(String text) {
    for (CostType b : CostType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CostType> {

    @Override
    public void write(final JsonWriter jsonWriter, final CostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CostType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CostType.fromValue(String.valueOf(value));
    }
  }
}
