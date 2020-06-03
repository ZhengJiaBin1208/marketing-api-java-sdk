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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EstimationGetResponseData
 */

public class EstimationGetResponseData {

  @SerializedName("max_active_user_count")
  private Long maxActiveUserCount = null;

  @SerializedName("approximate_count")
  private Long approximateCount = null;

  @SerializedName("impression")
  private Long impression = null;

  @SerializedName("min_bid_amount")
  private Long minBidAmount = null;

  @SerializedName("max_bid_amount")
  private Long maxBidAmount = null;

  @SerializedName("suggest_min_bid_amount")
  private Long suggestMinBidAmount = null;

  @SerializedName("suggest_max_bid_amount")
  private Long suggestMaxBidAmount = null;

  @SerializedName("suggest_bid_content_ocpa")
  private String suggestBidContentOcpa = null;

  @SerializedName("min_users_daily")
  private Long minUsersDaily = null;

  @SerializedName("max_users_daily")
  private Long maxUsersDaily = null;

  @SerializedName("min_exposure_daily")
  private Long minExposureDaily = null;

  @SerializedName("max_exposure_daily")
  private Long maxExposureDaily = null;

  @SerializedName("targeting_status")
  private TargetingStatus targetingStatus = null;

  @SerializedName("suggest_targeting")
  private List<String> suggestTargeting = null;

  @SerializedName("is_real_exposure_supported")
  private Boolean isRealExposureSupported = null;

  public EstimationGetResponseData maxActiveUserCount(Long maxActiveUserCount) {
    this.maxActiveUserCount = maxActiveUserCount;
    return this;
  }

  /**
   * Get maxActiveUserCount
   *
   * @return maxActiveUserCount
   **/
  @ApiModelProperty(value = "")
  public Long getMaxActiveUserCount() {
    return maxActiveUserCount;
  }

  public void setMaxActiveUserCount(Long maxActiveUserCount) {
    this.maxActiveUserCount = maxActiveUserCount;
  }

  public EstimationGetResponseData approximateCount(Long approximateCount) {
    this.approximateCount = approximateCount;
    return this;
  }

  /**
   * Get approximateCount
   *
   * @return approximateCount
   **/
  @ApiModelProperty(value = "")
  public Long getApproximateCount() {
    return approximateCount;
  }

  public void setApproximateCount(Long approximateCount) {
    this.approximateCount = approximateCount;
  }

  public EstimationGetResponseData impression(Long impression) {
    this.impression = impression;
    return this;
  }

  /**
   * Get impression
   *
   * @return impression
   **/
  @ApiModelProperty(value = "")
  public Long getImpression() {
    return impression;
  }

  public void setImpression(Long impression) {
    this.impression = impression;
  }

  public EstimationGetResponseData minBidAmount(Long minBidAmount) {
    this.minBidAmount = minBidAmount;
    return this;
  }

  /**
   * Get minBidAmount
   *
   * @return minBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getMinBidAmount() {
    return minBidAmount;
  }

  public void setMinBidAmount(Long minBidAmount) {
    this.minBidAmount = minBidAmount;
  }

  public EstimationGetResponseData maxBidAmount(Long maxBidAmount) {
    this.maxBidAmount = maxBidAmount;
    return this;
  }

  /**
   * Get maxBidAmount
   *
   * @return maxBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getMaxBidAmount() {
    return maxBidAmount;
  }

  public void setMaxBidAmount(Long maxBidAmount) {
    this.maxBidAmount = maxBidAmount;
  }

  public EstimationGetResponseData suggestMinBidAmount(Long suggestMinBidAmount) {
    this.suggestMinBidAmount = suggestMinBidAmount;
    return this;
  }

  /**
   * Get suggestMinBidAmount
   *
   * @return suggestMinBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getSuggestMinBidAmount() {
    return suggestMinBidAmount;
  }

  public void setSuggestMinBidAmount(Long suggestMinBidAmount) {
    this.suggestMinBidAmount = suggestMinBidAmount;
  }

  public EstimationGetResponseData suggestMaxBidAmount(Long suggestMaxBidAmount) {
    this.suggestMaxBidAmount = suggestMaxBidAmount;
    return this;
  }

  /**
   * Get suggestMaxBidAmount
   *
   * @return suggestMaxBidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getSuggestMaxBidAmount() {
    return suggestMaxBidAmount;
  }

  public void setSuggestMaxBidAmount(Long suggestMaxBidAmount) {
    this.suggestMaxBidAmount = suggestMaxBidAmount;
  }

  public EstimationGetResponseData suggestBidContentOcpa(String suggestBidContentOcpa) {
    this.suggestBidContentOcpa = suggestBidContentOcpa;
    return this;
  }

  /**
   * Get suggestBidContentOcpa
   *
   * @return suggestBidContentOcpa
   **/
  @ApiModelProperty(value = "")
  public String getSuggestBidContentOcpa() {
    return suggestBidContentOcpa;
  }

  public void setSuggestBidContentOcpa(String suggestBidContentOcpa) {
    this.suggestBidContentOcpa = suggestBidContentOcpa;
  }

  public EstimationGetResponseData minUsersDaily(Long minUsersDaily) {
    this.minUsersDaily = minUsersDaily;
    return this;
  }

  /**
   * Get minUsersDaily
   *
   * @return minUsersDaily
   **/
  @ApiModelProperty(value = "")
  public Long getMinUsersDaily() {
    return minUsersDaily;
  }

  public void setMinUsersDaily(Long minUsersDaily) {
    this.minUsersDaily = minUsersDaily;
  }

  public EstimationGetResponseData maxUsersDaily(Long maxUsersDaily) {
    this.maxUsersDaily = maxUsersDaily;
    return this;
  }

  /**
   * Get maxUsersDaily
   *
   * @return maxUsersDaily
   **/
  @ApiModelProperty(value = "")
  public Long getMaxUsersDaily() {
    return maxUsersDaily;
  }

  public void setMaxUsersDaily(Long maxUsersDaily) {
    this.maxUsersDaily = maxUsersDaily;
  }

  public EstimationGetResponseData minExposureDaily(Long minExposureDaily) {
    this.minExposureDaily = minExposureDaily;
    return this;
  }

  /**
   * Get minExposureDaily
   *
   * @return minExposureDaily
   **/
  @ApiModelProperty(value = "")
  public Long getMinExposureDaily() {
    return minExposureDaily;
  }

  public void setMinExposureDaily(Long minExposureDaily) {
    this.minExposureDaily = minExposureDaily;
  }

  public EstimationGetResponseData maxExposureDaily(Long maxExposureDaily) {
    this.maxExposureDaily = maxExposureDaily;
    return this;
  }

  /**
   * Get maxExposureDaily
   *
   * @return maxExposureDaily
   **/
  @ApiModelProperty(value = "")
  public Long getMaxExposureDaily() {
    return maxExposureDaily;
  }

  public void setMaxExposureDaily(Long maxExposureDaily) {
    this.maxExposureDaily = maxExposureDaily;
  }

  public EstimationGetResponseData targetingStatus(TargetingStatus targetingStatus) {
    this.targetingStatus = targetingStatus;
    return this;
  }

  /**
   * Get targetingStatus
   *
   * @return targetingStatus
   **/
  @ApiModelProperty(value = "")
  public TargetingStatus getTargetingStatus() {
    return targetingStatus;
  }

  public void setTargetingStatus(TargetingStatus targetingStatus) {
    this.targetingStatus = targetingStatus;
  }

  public EstimationGetResponseData suggestTargeting(List<String> suggestTargeting) {
    this.suggestTargeting = suggestTargeting;
    return this;
  }

  public EstimationGetResponseData addSuggestTargetingItem(String suggestTargetingItem) {
    if (this.suggestTargeting == null) {
      this.suggestTargeting = new ArrayList<String>();
    }
    this.suggestTargeting.add(suggestTargetingItem);
    return this;
  }

  /**
   * Get suggestTargeting
   *
   * @return suggestTargeting
   **/
  @ApiModelProperty(value = "")
  public List<String> getSuggestTargeting() {
    return suggestTargeting;
  }

  public void setSuggestTargeting(List<String> suggestTargeting) {
    this.suggestTargeting = suggestTargeting;
  }

  public EstimationGetResponseData isRealExposureSupported(Boolean isRealExposureSupported) {
    this.isRealExposureSupported = isRealExposureSupported;
    return this;
  }

  /**
   * Get isRealExposureSupported
   *
   * @return isRealExposureSupported
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsRealExposureSupported() {
    return isRealExposureSupported;
  }

  public void setIsRealExposureSupported(Boolean isRealExposureSupported) {
    this.isRealExposureSupported = isRealExposureSupported;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EstimationGetResponseData estimationGetResponseData = (EstimationGetResponseData) o;
    return Objects.equals(this.maxActiveUserCount, estimationGetResponseData.maxActiveUserCount) &&
        Objects.equals(this.approximateCount, estimationGetResponseData.approximateCount) &&
        Objects.equals(this.impression, estimationGetResponseData.impression) &&
        Objects.equals(this.minBidAmount, estimationGetResponseData.minBidAmount) &&
        Objects.equals(this.maxBidAmount, estimationGetResponseData.maxBidAmount) &&
        Objects.equals(this.suggestMinBidAmount, estimationGetResponseData.suggestMinBidAmount) &&
        Objects.equals(this.suggestMaxBidAmount, estimationGetResponseData.suggestMaxBidAmount) &&
        Objects.equals(this.suggestBidContentOcpa, estimationGetResponseData.suggestBidContentOcpa)
        &&
        Objects.equals(this.minUsersDaily, estimationGetResponseData.minUsersDaily) &&
        Objects.equals(this.maxUsersDaily, estimationGetResponseData.maxUsersDaily) &&
        Objects.equals(this.minExposureDaily, estimationGetResponseData.minExposureDaily) &&
        Objects.equals(this.maxExposureDaily, estimationGetResponseData.maxExposureDaily) &&
        Objects.equals(this.targetingStatus, estimationGetResponseData.targetingStatus) &&
        Objects.equals(this.suggestTargeting, estimationGetResponseData.suggestTargeting) &&
        Objects.equals(this.isRealExposureSupported,
            estimationGetResponseData.isRealExposureSupported);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(maxActiveUserCount, approximateCount, impression, minBidAmount, maxBidAmount,
            suggestMinBidAmount, suggestMaxBidAmount, suggestBidContentOcpa, minUsersDaily,
            maxUsersDaily, minExposureDaily, maxExposureDaily, targetingStatus, suggestTargeting,
            isRealExposureSupported);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EstimationGetResponseData {\n");

    sb.append("    maxActiveUserCount: ").append(toIndentedString(maxActiveUserCount)).append("\n");
    sb.append("    approximateCount: ").append(toIndentedString(approximateCount)).append("\n");
    sb.append("    impression: ").append(toIndentedString(impression)).append("\n");
    sb.append("    minBidAmount: ").append(toIndentedString(minBidAmount)).append("\n");
    sb.append("    maxBidAmount: ").append(toIndentedString(maxBidAmount)).append("\n");
    sb.append("    suggestMinBidAmount: ").append(toIndentedString(suggestMinBidAmount))
        .append("\n");
    sb.append("    suggestMaxBidAmount: ").append(toIndentedString(suggestMaxBidAmount))
        .append("\n");
    sb.append("    suggestBidContentOcpa: ").append(toIndentedString(suggestBidContentOcpa))
        .append("\n");
    sb.append("    minUsersDaily: ").append(toIndentedString(minUsersDaily)).append("\n");
    sb.append("    maxUsersDaily: ").append(toIndentedString(maxUsersDaily)).append("\n");
    sb.append("    minExposureDaily: ").append(toIndentedString(minExposureDaily)).append("\n");
    sb.append("    maxExposureDaily: ").append(toIndentedString(maxExposureDaily)).append("\n");
    sb.append("    targetingStatus: ").append(toIndentedString(targetingStatus)).append("\n");
    sb.append("    suggestTargeting: ").append(toIndentedString(suggestTargeting)).append("\n");
    sb.append("    isRealExposureSupported: ").append(toIndentedString(isRealExposureSupported))
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
