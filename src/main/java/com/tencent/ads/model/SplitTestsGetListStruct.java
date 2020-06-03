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
 * 返回结构
 */
@ApiModel(description = "返回结构")

public class SplitTestsGetListStruct {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("split_test_id")
  private Long splitTestId = null;

  @SerializedName("split_test_status")
  private SplitTestStatus splitTestStatus = null;

  @SerializedName("split_test_name")
  private String splitTestName = null;

  @SerializedName("begin_time")
  private Long beginTime = null;

  @SerializedName("end_time")
  private Long endTime = null;

  @SerializedName("smart_expand_enabled")
  private Boolean smartExpandEnabled = null;

  @SerializedName("adgroup_id_list")
  private List<Long> adgroupIdList = null;

  @SerializedName("recommended_rating")
  private RecommendedRating recommendedRating = null;

  @SerializedName("recommended_adgroup_id_list")
  private List<Long> recommendedAdgroupIdList = null;

  public SplitTestsGetListStruct accountId(Long accountId) {
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

  public SplitTestsGetListStruct splitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
    return this;
  }

  /**
   * Get splitTestId
   *
   * @return splitTestId
   **/
  @ApiModelProperty(value = "")
  public Long getSplitTestId() {
    return splitTestId;
  }

  public void setSplitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
  }

  public SplitTestsGetListStruct splitTestStatus(SplitTestStatus splitTestStatus) {
    this.splitTestStatus = splitTestStatus;
    return this;
  }

  /**
   * Get splitTestStatus
   *
   * @return splitTestStatus
   **/
  @ApiModelProperty(value = "")
  public SplitTestStatus getSplitTestStatus() {
    return splitTestStatus;
  }

  public void setSplitTestStatus(SplitTestStatus splitTestStatus) {
    this.splitTestStatus = splitTestStatus;
  }

  public SplitTestsGetListStruct splitTestName(String splitTestName) {
    this.splitTestName = splitTestName;
    return this;
  }

  /**
   * Get splitTestName
   *
   * @return splitTestName
   **/
  @ApiModelProperty(value = "")
  public String getSplitTestName() {
    return splitTestName;
  }

  public void setSplitTestName(String splitTestName) {
    this.splitTestName = splitTestName;
  }

  public SplitTestsGetListStruct beginTime(Long beginTime) {
    this.beginTime = beginTime;
    return this;
  }

  /**
   * Get beginTime
   *
   * @return beginTime
   **/
  @ApiModelProperty(value = "")
  public Long getBeginTime() {
    return beginTime;
  }

  public void setBeginTime(Long beginTime) {
    this.beginTime = beginTime;
  }

  public SplitTestsGetListStruct endTime(Long endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   *
   * @return endTime
   **/
  @ApiModelProperty(value = "")
  public Long getEndTime() {
    return endTime;
  }

  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }

  public SplitTestsGetListStruct smartExpandEnabled(Boolean smartExpandEnabled) {
    this.smartExpandEnabled = smartExpandEnabled;
    return this;
  }

  /**
   * Get smartExpandEnabled
   *
   * @return smartExpandEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isSmartExpandEnabled() {
    return smartExpandEnabled;
  }

  public void setSmartExpandEnabled(Boolean smartExpandEnabled) {
    this.smartExpandEnabled = smartExpandEnabled;
  }

  public SplitTestsGetListStruct adgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
    return this;
  }

  public SplitTestsGetListStruct addAdgroupIdListItem(Long adgroupIdListItem) {
    if (this.adgroupIdList == null) {
      this.adgroupIdList = new ArrayList<Long>();
    }
    this.adgroupIdList.add(adgroupIdListItem);
    return this;
  }

  /**
   * Get adgroupIdList
   *
   * @return adgroupIdList
   **/
  @ApiModelProperty(value = "")
  public List<Long> getAdgroupIdList() {
    return adgroupIdList;
  }

  public void setAdgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
  }

  public SplitTestsGetListStruct recommendedRating(RecommendedRating recommendedRating) {
    this.recommendedRating = recommendedRating;
    return this;
  }

  /**
   * Get recommendedRating
   *
   * @return recommendedRating
   **/
  @ApiModelProperty(value = "")
  public RecommendedRating getRecommendedRating() {
    return recommendedRating;
  }

  public void setRecommendedRating(RecommendedRating recommendedRating) {
    this.recommendedRating = recommendedRating;
  }

  public SplitTestsGetListStruct recommendedAdgroupIdList(List<Long> recommendedAdgroupIdList) {
    this.recommendedAdgroupIdList = recommendedAdgroupIdList;
    return this;
  }

  public SplitTestsGetListStruct addRecommendedAdgroupIdListItem(
      Long recommendedAdgroupIdListItem) {
    if (this.recommendedAdgroupIdList == null) {
      this.recommendedAdgroupIdList = new ArrayList<Long>();
    }
    this.recommendedAdgroupIdList.add(recommendedAdgroupIdListItem);
    return this;
  }

  /**
   * Get recommendedAdgroupIdList
   *
   * @return recommendedAdgroupIdList
   **/
  @ApiModelProperty(value = "")
  public List<Long> getRecommendedAdgroupIdList() {
    return recommendedAdgroupIdList;
  }

  public void setRecommendedAdgroupIdList(List<Long> recommendedAdgroupIdList) {
    this.recommendedAdgroupIdList = recommendedAdgroupIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTestsGetListStruct splitTestsGetListStruct = (SplitTestsGetListStruct) o;
    return Objects.equals(this.accountId, splitTestsGetListStruct.accountId) &&
        Objects.equals(this.splitTestId, splitTestsGetListStruct.splitTestId) &&
        Objects.equals(this.splitTestStatus, splitTestsGetListStruct.splitTestStatus) &&
        Objects.equals(this.splitTestName, splitTestsGetListStruct.splitTestName) &&
        Objects.equals(this.beginTime, splitTestsGetListStruct.beginTime) &&
        Objects.equals(this.endTime, splitTestsGetListStruct.endTime) &&
        Objects.equals(this.smartExpandEnabled, splitTestsGetListStruct.smartExpandEnabled) &&
        Objects.equals(this.adgroupIdList, splitTestsGetListStruct.adgroupIdList) &&
        Objects.equals(this.recommendedRating, splitTestsGetListStruct.recommendedRating) &&
        Objects.equals(this.recommendedAdgroupIdList,
            splitTestsGetListStruct.recommendedAdgroupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, splitTestId, splitTestStatus, splitTestName, beginTime, endTime,
        smartExpandEnabled, adgroupIdList, recommendedRating, recommendedAdgroupIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTestsGetListStruct {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    splitTestId: ").append(toIndentedString(splitTestId)).append("\n");
    sb.append("    splitTestStatus: ").append(toIndentedString(splitTestStatus)).append("\n");
    sb.append("    splitTestName: ").append(toIndentedString(splitTestName)).append("\n");
    sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    smartExpandEnabled: ").append(toIndentedString(smartExpandEnabled)).append("\n");
    sb.append("    adgroupIdList: ").append(toIndentedString(adgroupIdList)).append("\n");
    sb.append("    recommendedRating: ").append(toIndentedString(recommendedRating)).append("\n");
    sb.append("    recommendedAdgroupIdList: ").append(toIndentedString(recommendedAdgroupIdList))
        .append("\n");
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
