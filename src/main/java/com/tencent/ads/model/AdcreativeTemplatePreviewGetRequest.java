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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * AdcreativeTemplatePreviewGetRequest
 */

public class AdcreativeTemplatePreviewGetRequest {

  @SerializedName("preview_spec")
  private AdcreativePreviewSpec previewSpec = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public AdcreativeTemplatePreviewGetRequest previewSpec(AdcreativePreviewSpec previewSpec) {
    this.previewSpec = previewSpec;
    return this;
  }

  /**
   * Get previewSpec
   *
   * @return previewSpec
   **/
  @ApiModelProperty(value = "")
  public AdcreativePreviewSpec getPreviewSpec() {
    return previewSpec;
  }

  public void setPreviewSpec(AdcreativePreviewSpec previewSpec) {
    this.previewSpec = previewSpec;
  }

  public AdcreativeTemplatePreviewGetRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   **/
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeTemplatePreviewGetRequest adcreativeTemplatePreviewGetRequest = (AdcreativeTemplatePreviewGetRequest) o;
    return Objects.equals(this.previewSpec, adcreativeTemplatePreviewGetRequest.previewSpec) &&
        Objects.equals(this.accountId, adcreativeTemplatePreviewGetRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewSpec, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreativeTemplatePreviewGetRequest {\n");

    sb.append("    previewSpec: ").append(toIndentedString(previewSpec)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first
   * line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
