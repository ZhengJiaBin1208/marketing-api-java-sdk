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

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AndroidUnionChannelPackagesUpdateRequest */
public class AndroidUnionChannelPackagesUpdateRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("android_union_app_id")
  private Long androidUnionAppId = null;

  @SerializedName("app_android_channel_package_id")
  private String appAndroidChannelPackageId = null;

  public AndroidUnionChannelPackagesUpdateRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AndroidUnionChannelPackagesUpdateRequest androidUnionAppId(Long androidUnionAppId) {
    this.androidUnionAppId = androidUnionAppId;
    return this;
  }

  /**
   * Get androidUnionAppId
   *
   * @return androidUnionAppId
   */
  @ApiModelProperty(value = "")
  public Long getAndroidUnionAppId() {
    return androidUnionAppId;
  }

  public void setAndroidUnionAppId(Long androidUnionAppId) {
    this.androidUnionAppId = androidUnionAppId;
  }

  public AndroidUnionChannelPackagesUpdateRequest appAndroidChannelPackageId(
      String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
    return this;
  }

  /**
   * Get appAndroidChannelPackageId
   *
   * @return appAndroidChannelPackageId
   */
  @ApiModelProperty(value = "")
  public String getAppAndroidChannelPackageId() {
    return appAndroidChannelPackageId;
  }

  public void setAppAndroidChannelPackageId(String appAndroidChannelPackageId) {
    this.appAndroidChannelPackageId = appAndroidChannelPackageId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AndroidUnionChannelPackagesUpdateRequest androidUnionChannelPackagesUpdateRequest =
        (AndroidUnionChannelPackagesUpdateRequest) o;
    return Objects.equals(this.accountId, androidUnionChannelPackagesUpdateRequest.accountId)
        && Objects.equals(
            this.androidUnionAppId, androidUnionChannelPackagesUpdateRequest.androidUnionAppId)
        && Objects.equals(
            this.appAndroidChannelPackageId,
            androidUnionChannelPackagesUpdateRequest.appAndroidChannelPackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, androidUnionAppId, appAndroidChannelPackageId);
  }

  @Override
  public String toString() {
    Gson gson = new Gson();
    return gson.toJson(this);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
