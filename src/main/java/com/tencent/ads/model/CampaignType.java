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
 * 推广计划类型
 */
@JsonAdapter(CampaignType.Adapter.class)
public enum CampaignType {

  SEARCH("CAMPAIGN_TYPE_SEARCH"),

  NORMAL("CAMPAIGN_TYPE_NORMAL"),

  CONTRACT("CAMPAIGN_TYPE_CONTRACT"),

  WECHAT_OFFICIAL_ACCOUNTS("CAMPAIGN_TYPE_WECHAT_OFFICIAL_ACCOUNTS"),

  WECHAT_MOMENTS("CAMPAIGN_TYPE_WECHAT_MOMENTS"),

  UNSUPPORTED("CAMPAIGN_TYPE_UNSUPPORTED");

  private String value;

  CampaignType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CampaignType fromValue(String text) {
    for (CampaignType b : CampaignType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CampaignType> {

    @Override
    public void write(final JsonWriter jsonWriter, final CampaignType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CampaignType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CampaignType.fromValue(String.valueOf(value));
    }
  }
}
