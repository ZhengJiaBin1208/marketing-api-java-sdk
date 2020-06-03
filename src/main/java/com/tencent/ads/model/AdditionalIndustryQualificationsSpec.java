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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 附加行业资质信息，当且仅当qualification_type&#x3D;ADDITIONAL_INDUSTRY_QUALIFICATION时可填且必填
 */
@ApiModel(description = "附加行业资质信息，当且仅当qualification_type=ADDITIONAL_INDUSTRY_QUALIFICATION时可填且必填")

public class AdditionalIndustryQualificationsSpec {

  @SerializedName("system_industry_id")
  private Long systemIndustryId = null;

  @SerializedName("business_scope_id")
  private Long businessScopeId = null;

  @SerializedName("qualification_code")
  private String qualificationCode = null;

  @SerializedName("image_id_list")
  private List<String> imageIdList = null;

  public AdditionalIndustryQualificationsSpec systemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  /**
   * Get systemIndustryId
   *
   * @return systemIndustryId
   **/
  @ApiModelProperty(value = "")
  public Long getSystemIndustryId() {
    return systemIndustryId;
  }

  public void setSystemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
  }

  public AdditionalIndustryQualificationsSpec businessScopeId(Long businessScopeId) {
    this.businessScopeId = businessScopeId;
    return this;
  }

  /**
   * Get businessScopeId
   *
   * @return businessScopeId
   **/
  @ApiModelProperty(value = "")
  public Long getBusinessScopeId() {
    return businessScopeId;
  }

  public void setBusinessScopeId(Long businessScopeId) {
    this.businessScopeId = businessScopeId;
  }

  public AdditionalIndustryQualificationsSpec qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

  /**
   * Get qualificationCode
   *
   * @return qualificationCode
   **/
  @ApiModelProperty(value = "")
  public String getQualificationCode() {
    return qualificationCode;
  }

  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }

  public AdditionalIndustryQualificationsSpec imageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  public AdditionalIndustryQualificationsSpec addImageIdListItem(String imageIdListItem) {
    if (this.imageIdList == null) {
      this.imageIdList = new ArrayList<String>();
    }
    this.imageIdList.add(imageIdListItem);
    return this;
  }

  /**
   * Get imageIdList
   *
   * @return imageIdList
   **/
  @ApiModelProperty(value = "")
  public List<String> getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalIndustryQualificationsSpec additionalIndustryQualificationsSpec = (AdditionalIndustryQualificationsSpec) o;
    return
        Objects.equals(this.systemIndustryId, additionalIndustryQualificationsSpec.systemIndustryId)
            &&
            Objects
                .equals(this.businessScopeId, additionalIndustryQualificationsSpec.businessScopeId)
            &&
            Objects.equals(this.qualificationCode,
                additionalIndustryQualificationsSpec.qualificationCode) &&
            Objects.equals(this.imageIdList, additionalIndustryQualificationsSpec.imageIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(systemIndustryId, businessScopeId, qualificationCode, imageIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalIndustryQualificationsSpec {\n");

    sb.append("    systemIndustryId: ").append(toIndentedString(systemIndustryId)).append("\n");
    sb.append("    businessScopeId: ").append(toIndentedString(businessScopeId)).append("\n");
    sb.append("    qualificationCode: ").append(toIndentedString(qualificationCode)).append("\n");
    sb.append("    imageIdList: ").append(toIndentedString(imageIdList)).append("\n");
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
