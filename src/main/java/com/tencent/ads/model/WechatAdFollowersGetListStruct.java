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
public class WechatAdFollowersGetListStruct {
  @SerializedName("openid")
  private String openid = null;

  @SerializedName("wechat_adgroup_id")
  private Long wechatAdgroupId = null;

  @SerializedName("wechat_campaign_id")
  private Long wechatCampaignId = null;

  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  @SerializedName("wechat_agency_id")
  private String wechatAgencyId = null;

  @SerializedName("campaign_id")
  private Long campaignId = null;

  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("subscribe_time")
  private Long subscribeTime = null;

  @SerializedName("position_type")
  private WechatPositionType positionType = null;

  public WechatAdFollowersGetListStruct openid(String openid) {
    this.openid = openid;
    return this;
  }

  /**
   * Get openid
   *
   * @return openid
   */
  @ApiModelProperty(value = "")
  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  public WechatAdFollowersGetListStruct wechatAdgroupId(Long wechatAdgroupId) {
    this.wechatAdgroupId = wechatAdgroupId;
    return this;
  }

  /**
   * Get wechatAdgroupId
   *
   * @return wechatAdgroupId
   */
  @ApiModelProperty(value = "")
  public Long getWechatAdgroupId() {
    return wechatAdgroupId;
  }

  public void setWechatAdgroupId(Long wechatAdgroupId) {
    this.wechatAdgroupId = wechatAdgroupId;
  }

  public WechatAdFollowersGetListStruct wechatCampaignId(Long wechatCampaignId) {
    this.wechatCampaignId = wechatCampaignId;
    return this;
  }

  /**
   * Get wechatCampaignId
   *
   * @return wechatCampaignId
   */
  @ApiModelProperty(value = "")
  public Long getWechatCampaignId() {
    return wechatCampaignId;
  }

  public void setWechatCampaignId(Long wechatCampaignId) {
    this.wechatCampaignId = wechatCampaignId;
  }

  public WechatAdFollowersGetListStruct wechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  /**
   * Get wechatAccountId
   *
   * @return wechatAccountId
   */
  @ApiModelProperty(value = "")
  public String getWechatAccountId() {
    return wechatAccountId;
  }

  public void setWechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
  }

  public WechatAdFollowersGetListStruct wechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
    return this;
  }

  /**
   * Get wechatAgencyId
   *
   * @return wechatAgencyId
   */
  @ApiModelProperty(value = "")
  public String getWechatAgencyId() {
    return wechatAgencyId;
  }

  public void setWechatAgencyId(String wechatAgencyId) {
    this.wechatAgencyId = wechatAgencyId;
  }

  public WechatAdFollowersGetListStruct campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Get campaignId
   *
   * @return campaignId
   */
  @ApiModelProperty(value = "")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public WechatAdFollowersGetListStruct adgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
    return this;
  }

  /**
   * Get adgroupId
   *
   * @return adgroupId
   */
  @ApiModelProperty(value = "")
  public Long getAdgroupId() {
    return adgroupId;
  }

  public void setAdgroupId(Long adgroupId) {
    this.adgroupId = adgroupId;
  }

  public WechatAdFollowersGetListStruct subscribeTime(Long subscribeTime) {
    this.subscribeTime = subscribeTime;
    return this;
  }

  /**
   * Get subscribeTime
   *
   * @return subscribeTime
   */
  @ApiModelProperty(value = "")
  public Long getSubscribeTime() {
    return subscribeTime;
  }

  public void setSubscribeTime(Long subscribeTime) {
    this.subscribeTime = subscribeTime;
  }

  public WechatAdFollowersGetListStruct positionType(WechatPositionType positionType) {
    this.positionType = positionType;
    return this;
  }

  /**
   * Get positionType
   *
   * @return positionType
   */
  @ApiModelProperty(value = "")
  public WechatPositionType getPositionType() {
    return positionType;
  }

  public void setPositionType(WechatPositionType positionType) {
    this.positionType = positionType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatAdFollowersGetListStruct wechatAdFollowersGetListStruct =
        (WechatAdFollowersGetListStruct) o;
    return Objects.equals(this.openid, wechatAdFollowersGetListStruct.openid)
        && Objects.equals(this.wechatAdgroupId, wechatAdFollowersGetListStruct.wechatAdgroupId)
        && Objects.equals(this.wechatCampaignId, wechatAdFollowersGetListStruct.wechatCampaignId)
        && Objects.equals(this.wechatAccountId, wechatAdFollowersGetListStruct.wechatAccountId)
        && Objects.equals(this.wechatAgencyId, wechatAdFollowersGetListStruct.wechatAgencyId)
        && Objects.equals(this.campaignId, wechatAdFollowersGetListStruct.campaignId)
        && Objects.equals(this.adgroupId, wechatAdFollowersGetListStruct.adgroupId)
        && Objects.equals(this.subscribeTime, wechatAdFollowersGetListStruct.subscribeTime)
        && Objects.equals(this.positionType, wechatAdFollowersGetListStruct.positionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        openid,
        wechatAdgroupId,
        wechatCampaignId,
        wechatAccountId,
        wechatAgencyId,
        campaignId,
        adgroupId,
        subscribeTime,
        positionType);
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
