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

/** 创意规格结构体 */
@ApiModel(description = "创意规格结构体")
public class CreativeStruct {
  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("adcreative_template_id")
  private Long adcreativeTemplateId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElementsWithOptions adcreativeElements = null;

  public CreativeStruct deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   */
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public CreativeStruct adcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
    return this;
  }

  /**
   * Get adcreativeTemplateId
   *
   * @return adcreativeTemplateId
   */
  @ApiModelProperty(value = "")
  public Long getAdcreativeTemplateId() {
    return adcreativeTemplateId;
  }

  public void setAdcreativeTemplateId(Long adcreativeTemplateId) {
    this.adcreativeTemplateId = adcreativeTemplateId;
  }

  public CreativeStruct adcreativeElements(
      AdcreativeCreativeElementsWithOptions adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   */
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElementsWithOptions getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElementsWithOptions adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeStruct creativeStruct = (CreativeStruct) o;
    return Objects.equals(this.deepLinkUrl, creativeStruct.deepLinkUrl)
        && Objects.equals(this.adcreativeTemplateId, creativeStruct.adcreativeTemplateId)
        && Objects.equals(this.adcreativeElements, creativeStruct.adcreativeElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deepLinkUrl, adcreativeTemplateId, adcreativeElements);
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
