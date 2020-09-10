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

/** 蹊径落地页发布状态 */
@JsonAdapter(PagePublishStatus.Adapter.class)
public enum PagePublishStatus {
  UNPUBLISH("LANDING_PAGE_STATUS_UNPUBLISH"),

  PUBLISHED("LANDING_PAGE_STATUS_PUBLISHED"),

  OFFLINE("LANDING_PAGE_STATUS_OFFLINE"),

  DELETING("LANDING_PAGE_STATUS_DELETING"),

  DELETED("LANDING_PAGE_STATUS_DELETED");

  private String value;

  PagePublishStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PagePublishStatus fromValue(String text) {
    for (PagePublishStatus b : PagePublishStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PagePublishStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final PagePublishStatus enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PagePublishStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PagePublishStatus.fromValue(String.valueOf(value));
    }
  }
}