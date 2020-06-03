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
 * 授权账号身份类型
 */
@JsonAdapter(AccountRoleType.Adapter.class)
public enum AccountRoleType {

  ADVERTISER("ACCOUNT_ROLE_TYPE_ADVERTISER"),

  AGENCY("ACCOUNT_ROLE_TYPE_AGENCY"),

  T1("ACCOUNT_ROLE_TYPE_T1"),

  BUSINESS_MANAGER("ACCOUNT_ROLE_TYPE_BUSINESS_MANAGER");

  private String value;

  AccountRoleType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static AccountRoleType fromValue(String text) {
    for (AccountRoleType b : AccountRoleType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<AccountRoleType> {

    @Override
    public void write(final JsonWriter jsonWriter, final AccountRoleType enumeration)
        throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public AccountRoleType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return AccountRoleType.fromValue(String.valueOf(value));
    }
  }
}
