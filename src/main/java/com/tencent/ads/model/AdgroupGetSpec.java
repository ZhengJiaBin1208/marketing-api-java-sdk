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

/** 广告结构 */
@ApiModel(description = "广告结构")
public class AdgroupGetSpec {
  @SerializedName("adgroup_id")
  private Long adgroupId = null;

  @SerializedName("configured_status")
  private AdStatus configuredStatus = null;

  @SerializedName("adgroup_name")
  private String adgroupName = null;

  @SerializedName("begin_date")
  private String beginDate = null;

  @SerializedName("targeting")
  private DpWriteTargetingSetting targeting = null;

  @SerializedName("calc_status")
  private CalculateStatus calcStatus = null;

  @SerializedName("reject_message")
  private String rejectMessage = null;

  @SerializedName("poi_list")
  private List<String> poiList = null;

  @SerializedName("cold_start_audience")
  private List<Long> coldStartAudience = null;

  public AdgroupGetSpec adgroupId(Long adgroupId) {
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

  public AdgroupGetSpec configuredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
    return this;
  }

  /**
   * Get configuredStatus
   *
   * @return configuredStatus
   */
  @ApiModelProperty(value = "")
  public AdStatus getConfiguredStatus() {
    return configuredStatus;
  }

  public void setConfiguredStatus(AdStatus configuredStatus) {
    this.configuredStatus = configuredStatus;
  }

  public AdgroupGetSpec adgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
    return this;
  }

  /**
   * Get adgroupName
   *
   * @return adgroupName
   */
  @ApiModelProperty(value = "")
  public String getAdgroupName() {
    return adgroupName;
  }

  public void setAdgroupName(String adgroupName) {
    this.adgroupName = adgroupName;
  }

  public AdgroupGetSpec beginDate(String beginDate) {
    this.beginDate = beginDate;
    return this;
  }

  /**
   * Get beginDate
   *
   * @return beginDate
   */
  @ApiModelProperty(value = "")
  public String getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }

  public AdgroupGetSpec targeting(DpWriteTargetingSetting targeting) {
    this.targeting = targeting;
    return this;
  }

  /**
   * Get targeting
   *
   * @return targeting
   */
  @ApiModelProperty(value = "")
  public DpWriteTargetingSetting getTargeting() {
    return targeting;
  }

  public void setTargeting(DpWriteTargetingSetting targeting) {
    this.targeting = targeting;
  }

  public AdgroupGetSpec calcStatus(CalculateStatus calcStatus) {
    this.calcStatus = calcStatus;
    return this;
  }

  /**
   * Get calcStatus
   *
   * @return calcStatus
   */
  @ApiModelProperty(value = "")
  public CalculateStatus getCalcStatus() {
    return calcStatus;
  }

  public void setCalcStatus(CalculateStatus calcStatus) {
    this.calcStatus = calcStatus;
  }

  public AdgroupGetSpec rejectMessage(String rejectMessage) {
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

  public AdgroupGetSpec poiList(List<String> poiList) {
    this.poiList = poiList;
    return this;
  }

  public AdgroupGetSpec addPoiListItem(String poiListItem) {
    if (this.poiList == null) {
      this.poiList = new ArrayList<String>();
    }
    this.poiList.add(poiListItem);
    return this;
  }

  /**
   * Get poiList
   *
   * @return poiList
   */
  @ApiModelProperty(value = "")
  public List<String> getPoiList() {
    return poiList;
  }

  public void setPoiList(List<String> poiList) {
    this.poiList = poiList;
  }

  public AdgroupGetSpec coldStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
    return this;
  }

  public AdgroupGetSpec addColdStartAudienceItem(Long coldStartAudienceItem) {
    if (this.coldStartAudience == null) {
      this.coldStartAudience = new ArrayList<Long>();
    }
    this.coldStartAudience.add(coldStartAudienceItem);
    return this;
  }

  /**
   * Get coldStartAudience
   *
   * @return coldStartAudience
   */
  @ApiModelProperty(value = "")
  public List<Long> getColdStartAudience() {
    return coldStartAudience;
  }

  public void setColdStartAudience(List<Long> coldStartAudience) {
    this.coldStartAudience = coldStartAudience;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupGetSpec adgroupGetSpec = (AdgroupGetSpec) o;
    return Objects.equals(this.adgroupId, adgroupGetSpec.adgroupId)
        && Objects.equals(this.configuredStatus, adgroupGetSpec.configuredStatus)
        && Objects.equals(this.adgroupName, adgroupGetSpec.adgroupName)
        && Objects.equals(this.beginDate, adgroupGetSpec.beginDate)
        && Objects.equals(this.targeting, adgroupGetSpec.targeting)
        && Objects.equals(this.calcStatus, adgroupGetSpec.calcStatus)
        && Objects.equals(this.rejectMessage, adgroupGetSpec.rejectMessage)
        && Objects.equals(this.poiList, adgroupGetSpec.poiList)
        && Objects.equals(this.coldStartAudience, adgroupGetSpec.coldStartAudience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        adgroupId,
        configuredStatus,
        adgroupName,
        beginDate,
        targeting,
        calcStatus,
        rejectMessage,
        poiList,
        coldStartAudience);
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
