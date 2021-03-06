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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class PlayablePagesGetListStruct {
  @SerializedName("landing_page_id")
  private String landingPageId = null;

  @SerializedName("playable_page_id")
  private String playablePageId = null;

  @SerializedName("playable_page_material_id")
  private String playablePageMaterialId = null;

  @SerializedName("playable_page_name")
  private String playablePageName = null;

  @SerializedName("playable_page_cdn_base_url")
  private String playablePageCdnBaseUrl = null;

  @SerializedName("playable_page_direction")
  private PlayablePageDirection playablePageDirection = null;

  @SerializedName("audit_status")
  private PlayablePageAuditStatus auditStatus = null;

  @SerializedName("audit_msg")
  private String auditMsg = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  @SerializedName("last_modified_time")
  private Long lastModifiedTime = null;

  public PlayablePagesGetListStruct landingPageId(String landingPageId) {
    this.landingPageId = landingPageId;
    return this;
  }

  /**
   * Get landingPageId
   *
   * @return landingPageId
   */
  @ApiModelProperty(value = "")
  public String getLandingPageId() {
    return landingPageId;
  }

  public void setLandingPageId(String landingPageId) {
    this.landingPageId = landingPageId;
  }

  public PlayablePagesGetListStruct playablePageId(String playablePageId) {
    this.playablePageId = playablePageId;
    return this;
  }

  /**
   * Get playablePageId
   *
   * @return playablePageId
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageId() {
    return playablePageId;
  }

  public void setPlayablePageId(String playablePageId) {
    this.playablePageId = playablePageId;
  }

  public PlayablePagesGetListStruct playablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
    return this;
  }

  /**
   * Get playablePageMaterialId
   *
   * @return playablePageMaterialId
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageMaterialId() {
    return playablePageMaterialId;
  }

  public void setPlayablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
  }

  public PlayablePagesGetListStruct playablePageName(String playablePageName) {
    this.playablePageName = playablePageName;
    return this;
  }

  /**
   * Get playablePageName
   *
   * @return playablePageName
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageName() {
    return playablePageName;
  }

  public void setPlayablePageName(String playablePageName) {
    this.playablePageName = playablePageName;
  }

  public PlayablePagesGetListStruct playablePageCdnBaseUrl(String playablePageCdnBaseUrl) {
    this.playablePageCdnBaseUrl = playablePageCdnBaseUrl;
    return this;
  }

  /**
   * Get playablePageCdnBaseUrl
   *
   * @return playablePageCdnBaseUrl
   */
  @ApiModelProperty(value = "")
  public String getPlayablePageCdnBaseUrl() {
    return playablePageCdnBaseUrl;
  }

  public void setPlayablePageCdnBaseUrl(String playablePageCdnBaseUrl) {
    this.playablePageCdnBaseUrl = playablePageCdnBaseUrl;
  }

  public PlayablePagesGetListStruct playablePageDirection(
      PlayablePageDirection playablePageDirection) {
    this.playablePageDirection = playablePageDirection;
    return this;
  }

  /**
   * Get playablePageDirection
   *
   * @return playablePageDirection
   */
  @ApiModelProperty(value = "")
  public PlayablePageDirection getPlayablePageDirection() {
    return playablePageDirection;
  }

  public void setPlayablePageDirection(PlayablePageDirection playablePageDirection) {
    this.playablePageDirection = playablePageDirection;
  }

  public PlayablePagesGetListStruct auditStatus(PlayablePageAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
    return this;
  }

  /**
   * Get auditStatus
   *
   * @return auditStatus
   */
  @ApiModelProperty(value = "")
  public PlayablePageAuditStatus getAuditStatus() {
    return auditStatus;
  }

  public void setAuditStatus(PlayablePageAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }

  public PlayablePagesGetListStruct auditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
    return this;
  }

  /**
   * Get auditMsg
   *
   * @return auditMsg
   */
  @ApiModelProperty(value = "")
  public String getAuditMsg() {
    return auditMsg;
  }

  public void setAuditMsg(String auditMsg) {
    this.auditMsg = auditMsg;
  }

  public PlayablePagesGetListStruct createdTime(Long createdTime) {
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

  public PlayablePagesGetListStruct lastModifiedTime(Long lastModifiedTime) {
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
    PlayablePagesGetListStruct playablePagesGetListStruct = (PlayablePagesGetListStruct) o;
    return Objects.equals(this.landingPageId, playablePagesGetListStruct.landingPageId)
        && Objects.equals(this.playablePageId, playablePagesGetListStruct.playablePageId)
        && Objects.equals(
            this.playablePageMaterialId, playablePagesGetListStruct.playablePageMaterialId)
        && Objects.equals(this.playablePageName, playablePagesGetListStruct.playablePageName)
        && Objects.equals(
            this.playablePageCdnBaseUrl, playablePagesGetListStruct.playablePageCdnBaseUrl)
        && Objects.equals(
            this.playablePageDirection, playablePagesGetListStruct.playablePageDirection)
        && Objects.equals(this.auditStatus, playablePagesGetListStruct.auditStatus)
        && Objects.equals(this.auditMsg, playablePagesGetListStruct.auditMsg)
        && Objects.equals(this.createdTime, playablePagesGetListStruct.createdTime)
        && Objects.equals(this.lastModifiedTime, playablePagesGetListStruct.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        landingPageId,
        playablePageId,
        playablePageMaterialId,
        playablePageName,
        playablePageCdnBaseUrl,
        playablePageDirection,
        auditStatus,
        auditMsg,
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
