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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 附加行业资质信息 */
@ApiModel(description = "附加行业资质信息")
public class AdditionalIndustryQualificationsStruct {
  @SerializedName("qualification_id")
  private Long qualificationId = null;

  @SerializedName("system_industry_id")
  private Long systemIndustryId = null;

  @SerializedName("business_scope_id")
  private Long businessScopeId = null;

  @SerializedName("qualification_code")
  private String qualificationCode = null;

  @SerializedName("image_id_list")
  private List<String> imageIdList = null;

  @SerializedName("qualification_status")
  private QualificationStatus qualificationStatus = null;

  @SerializedName("expired_date")
  private String expiredDate = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public AdditionalIndustryQualificationsStruct qualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
    return this;
  }

  /**
   * Get qualificationId
   *
   * @return qualificationId
   */
  @ApiModelProperty(value = "")
  public Long getQualificationId() {
    return qualificationId;
  }

  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }

  public AdditionalIndustryQualificationsStruct systemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  /**
   * Get systemIndustryId
   *
   * @return systemIndustryId
   */
  @ApiModelProperty(value = "")
  public Long getSystemIndustryId() {
    return systemIndustryId;
  }

  public void setSystemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
  }

  public AdditionalIndustryQualificationsStruct businessScopeId(Long businessScopeId) {
    this.businessScopeId = businessScopeId;
    return this;
  }

  /**
   * Get businessScopeId
   *
   * @return businessScopeId
   */
  @ApiModelProperty(value = "")
  public Long getBusinessScopeId() {
    return businessScopeId;
  }

  public void setBusinessScopeId(Long businessScopeId) {
    this.businessScopeId = businessScopeId;
  }

  public AdditionalIndustryQualificationsStruct qualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
    return this;
  }

  /**
   * Get qualificationCode
   *
   * @return qualificationCode
   */
  @ApiModelProperty(value = "")
  public String getQualificationCode() {
    return qualificationCode;
  }

  public void setQualificationCode(String qualificationCode) {
    this.qualificationCode = qualificationCode;
  }

  public AdditionalIndustryQualificationsStruct imageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
    return this;
  }

  public AdditionalIndustryQualificationsStruct addImageIdListItem(String imageIdListItem) {
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
   */
  @ApiModelProperty(value = "")
  public List<String> getImageIdList() {
    return imageIdList;
  }

  public void setImageIdList(List<String> imageIdList) {
    this.imageIdList = imageIdList;
  }

  public AdditionalIndustryQualificationsStruct qualificationStatus(
      QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
    return this;
  }

  /**
   * Get qualificationStatus
   *
   * @return qualificationStatus
   */
  @ApiModelProperty(value = "")
  public QualificationStatus getQualificationStatus() {
    return qualificationStatus;
  }

  public void setQualificationStatus(QualificationStatus qualificationStatus) {
    this.qualificationStatus = qualificationStatus;
  }

  public AdditionalIndustryQualificationsStruct expiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
    return this;
  }

  /**
   * Get expiredDate
   *
   * @return expiredDate
   */
  @ApiModelProperty(value = "")
  public String getExpiredDate() {
    return expiredDate;
  }

  public void setExpiredDate(String expiredDate) {
    this.expiredDate = expiredDate;
  }

  public AdditionalIndustryQualificationsStruct rejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
    return this;
  }

  /**
   * Get rejectMessage
   *
   * @return rejectMessage
   */
  @ApiModelProperty(value = "")
  public String getRejectMessage() {
    return rejectMessage;
  }

  public void setRejectMessage(String rejectMessage) {
    this.rejectMessage = rejectMessage;
  }

  public AdditionalIndustryQualificationsStruct createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   */
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
    this.createdTime = createdTime;
  }

  public AdditionalIndustryQualificationsStruct lastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

  /**
   * Get lastModifiedTime
   *
   * @return lastModifiedTime
   */
  @ApiModelProperty(value = "")
  public Long getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(Long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalIndustryQualificationsStruct additionalIndustryQualificationsStruct =
        (AdditionalIndustryQualificationsStruct) o;
    return Objects.equals(
            this.qualificationId, additionalIndustryQualificationsStruct.qualificationId)
        && Objects.equals(
            this.systemIndustryId, additionalIndustryQualificationsStruct.systemIndustryId)
        && Objects.equals(
            this.businessScopeId, additionalIndustryQualificationsStruct.businessScopeId)
        && Objects.equals(
            this.qualificationCode, additionalIndustryQualificationsStruct.qualificationCode)
        && Objects.equals(this.imageIdList, additionalIndustryQualificationsStruct.imageIdList)
        && Objects.equals(
            this.qualificationStatus, additionalIndustryQualificationsStruct.qualificationStatus)
        && Objects.equals(this.expiredDate, additionalIndustryQualificationsStruct.expiredDate)
        && Objects.equals(this.rejectMessage, additionalIndustryQualificationsStruct.rejectMessage)
        && Objects.equals(this.createdTime, additionalIndustryQualificationsStruct.createdTime)
        && Objects.equals(
            this.lastModifiedTime, additionalIndustryQualificationsStruct.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        qualificationId,
        systemIndustryId,
        businessScopeId,
        qualificationCode,
        imageIdList,
        qualificationStatus,
        expiredDate,
        rejectMessage,
        createdTime,
        lastModifiedTime);
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
