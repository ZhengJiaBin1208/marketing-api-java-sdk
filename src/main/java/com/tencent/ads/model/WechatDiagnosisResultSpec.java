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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** 微信广告的诊断结论&lt;br&gt;仅微信广告会返回此字段 */
@ApiModel(description = "微信广告的诊断结论<br>仅微信广告会返回此字段")
public class WechatDiagnosisResultSpec {
  @SerializedName("wechat_cost_diagnosis_result_spec")
  private WechatCostDiagnosisResultSpec wechatCostDiagnosisResultSpec = null;

  @SerializedName("wechat_exposure_diagnosis_result_spec")
  private WechatExposureDiagnosisResultSpec wechatExposureDiagnosisResultSpec = null;

  public WechatDiagnosisResultSpec wechatCostDiagnosisResultSpec(
      WechatCostDiagnosisResultSpec wechatCostDiagnosisResultSpec) {
    this.wechatCostDiagnosisResultSpec = wechatCostDiagnosisResultSpec;
    return this;
  }

  /**
   * Get wechatCostDiagnosisResultSpec
   *
   * @return wechatCostDiagnosisResultSpec
   */
  @ApiModelProperty(value = "")
  public WechatCostDiagnosisResultSpec getWechatCostDiagnosisResultSpec() {
    return wechatCostDiagnosisResultSpec;
  }

  public void setWechatCostDiagnosisResultSpec(
      WechatCostDiagnosisResultSpec wechatCostDiagnosisResultSpec) {
    this.wechatCostDiagnosisResultSpec = wechatCostDiagnosisResultSpec;
  }

  public WechatDiagnosisResultSpec wechatExposureDiagnosisResultSpec(
      WechatExposureDiagnosisResultSpec wechatExposureDiagnosisResultSpec) {
    this.wechatExposureDiagnosisResultSpec = wechatExposureDiagnosisResultSpec;
    return this;
  }

  /**
   * Get wechatExposureDiagnosisResultSpec
   *
   * @return wechatExposureDiagnosisResultSpec
   */
  @ApiModelProperty(value = "")
  public WechatExposureDiagnosisResultSpec getWechatExposureDiagnosisResultSpec() {
    return wechatExposureDiagnosisResultSpec;
  }

  public void setWechatExposureDiagnosisResultSpec(
      WechatExposureDiagnosisResultSpec wechatExposureDiagnosisResultSpec) {
    this.wechatExposureDiagnosisResultSpec = wechatExposureDiagnosisResultSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatDiagnosisResultSpec wechatDiagnosisResultSpec = (WechatDiagnosisResultSpec) o;
    return Objects.equals(
            this.wechatCostDiagnosisResultSpec,
            wechatDiagnosisResultSpec.wechatCostDiagnosisResultSpec)
        && Objects.equals(
            this.wechatExposureDiagnosisResultSpec,
            wechatDiagnosisResultSpec.wechatExposureDiagnosisResultSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wechatCostDiagnosisResultSpec, wechatExposureDiagnosisResultSpec);
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
