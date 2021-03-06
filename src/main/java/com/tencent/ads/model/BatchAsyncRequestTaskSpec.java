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

/** 任务所需条件 */
@ApiModel(description = "任务所需条件")
public class BatchAsyncRequestTaskSpec {
  @SerializedName("update_union_position_package_spec")
  private List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec = null;

  @SerializedName("update_exclude_union_position_package_spec")
  private List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec = null;

  @SerializedName("update_targeting_id_spec")
  private List<UpdateTargetingIdItem> updateTargetingIdSpec = null;

  @SerializedName("update_bid_strategy_spec")
  private List<UpdateBidStrategyItem> updateBidStrategySpec = null;

  @SerializedName("update_deep_conversion_behavior_bid_spec")
  private List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec = null;

  @SerializedName("update_adgroup_app_android_channel_package_id_spec")
  private List<UpdateAdgroupAppAndroidChannelPackageIdItem>
      updateAdgroupAppAndroidChannelPackageIdSpec = null;

  @SerializedName("update_campaign_speed_mode_spec")
  private List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec = null;

  @SerializedName("delete_campaign_spec")
  private List<DeleteCampaignItem> deleteCampaignSpec = null;

  @SerializedName("delete_adgroup_spec")
  private List<DeleteAdgroupItem> deleteAdgroupSpec = null;

  @SerializedName("delete_ad_spec")
  private List<DeleteAdItem> deleteAdSpec = null;

  @SerializedName("targetings_share_spec")
  private List<TargetingsShareItem> targetingsShareSpec = null;

  public BatchAsyncRequestTaskSpec updateUnionPositionPackageSpec(
      List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec) {
    this.updateUnionPositionPackageSpec = updateUnionPositionPackageSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateUnionPositionPackageSpecItem(
      UpdateUnionPositionPackageItem updateUnionPositionPackageSpecItem) {
    if (this.updateUnionPositionPackageSpec == null) {
      this.updateUnionPositionPackageSpec = new ArrayList<UpdateUnionPositionPackageItem>();
    }
    this.updateUnionPositionPackageSpec.add(updateUnionPositionPackageSpecItem);
    return this;
  }

  /**
   * Get updateUnionPositionPackageSpec
   *
   * @return updateUnionPositionPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateUnionPositionPackageItem> getUpdateUnionPositionPackageSpec() {
    return updateUnionPositionPackageSpec;
  }

  public void setUpdateUnionPositionPackageSpec(
      List<UpdateUnionPositionPackageItem> updateUnionPositionPackageSpec) {
    this.updateUnionPositionPackageSpec = updateUnionPositionPackageSpec;
  }

  public BatchAsyncRequestTaskSpec updateExcludeUnionPositionPackageSpec(
      List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec) {
    this.updateExcludeUnionPositionPackageSpec = updateExcludeUnionPositionPackageSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateExcludeUnionPositionPackageSpecItem(
      UpdateExcludeUnionPositionPackageItem updateExcludeUnionPositionPackageSpecItem) {
    if (this.updateExcludeUnionPositionPackageSpec == null) {
      this.updateExcludeUnionPositionPackageSpec =
          new ArrayList<UpdateExcludeUnionPositionPackageItem>();
    }
    this.updateExcludeUnionPositionPackageSpec.add(updateExcludeUnionPositionPackageSpecItem);
    return this;
  }

  /**
   * Get updateExcludeUnionPositionPackageSpec
   *
   * @return updateExcludeUnionPositionPackageSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateExcludeUnionPositionPackageItem> getUpdateExcludeUnionPositionPackageSpec() {
    return updateExcludeUnionPositionPackageSpec;
  }

  public void setUpdateExcludeUnionPositionPackageSpec(
      List<UpdateExcludeUnionPositionPackageItem> updateExcludeUnionPositionPackageSpec) {
    this.updateExcludeUnionPositionPackageSpec = updateExcludeUnionPositionPackageSpec;
  }

  public BatchAsyncRequestTaskSpec updateTargetingIdSpec(
      List<UpdateTargetingIdItem> updateTargetingIdSpec) {
    this.updateTargetingIdSpec = updateTargetingIdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateTargetingIdSpecItem(
      UpdateTargetingIdItem updateTargetingIdSpecItem) {
    if (this.updateTargetingIdSpec == null) {
      this.updateTargetingIdSpec = new ArrayList<UpdateTargetingIdItem>();
    }
    this.updateTargetingIdSpec.add(updateTargetingIdSpecItem);
    return this;
  }

  /**
   * Get updateTargetingIdSpec
   *
   * @return updateTargetingIdSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateTargetingIdItem> getUpdateTargetingIdSpec() {
    return updateTargetingIdSpec;
  }

  public void setUpdateTargetingIdSpec(List<UpdateTargetingIdItem> updateTargetingIdSpec) {
    this.updateTargetingIdSpec = updateTargetingIdSpec;
  }

  public BatchAsyncRequestTaskSpec updateBidStrategySpec(
      List<UpdateBidStrategyItem> updateBidStrategySpec) {
    this.updateBidStrategySpec = updateBidStrategySpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateBidStrategySpecItem(
      UpdateBidStrategyItem updateBidStrategySpecItem) {
    if (this.updateBidStrategySpec == null) {
      this.updateBidStrategySpec = new ArrayList<UpdateBidStrategyItem>();
    }
    this.updateBidStrategySpec.add(updateBidStrategySpecItem);
    return this;
  }

  /**
   * Get updateBidStrategySpec
   *
   * @return updateBidStrategySpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateBidStrategyItem> getUpdateBidStrategySpec() {
    return updateBidStrategySpec;
  }

  public void setUpdateBidStrategySpec(List<UpdateBidStrategyItem> updateBidStrategySpec) {
    this.updateBidStrategySpec = updateBidStrategySpec;
  }

  public BatchAsyncRequestTaskSpec updateDeepConversionBehaviorBidSpec(
      List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec) {
    this.updateDeepConversionBehaviorBidSpec = updateDeepConversionBehaviorBidSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateDeepConversionBehaviorBidSpecItem(
      UpdateDeepConversionBehaviorBidItem updateDeepConversionBehaviorBidSpecItem) {
    if (this.updateDeepConversionBehaviorBidSpec == null) {
      this.updateDeepConversionBehaviorBidSpec =
          new ArrayList<UpdateDeepConversionBehaviorBidItem>();
    }
    this.updateDeepConversionBehaviorBidSpec.add(updateDeepConversionBehaviorBidSpecItem);
    return this;
  }

  /**
   * Get updateDeepConversionBehaviorBidSpec
   *
   * @return updateDeepConversionBehaviorBidSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateDeepConversionBehaviorBidItem> getUpdateDeepConversionBehaviorBidSpec() {
    return updateDeepConversionBehaviorBidSpec;
  }

  public void setUpdateDeepConversionBehaviorBidSpec(
      List<UpdateDeepConversionBehaviorBidItem> updateDeepConversionBehaviorBidSpec) {
    this.updateDeepConversionBehaviorBidSpec = updateDeepConversionBehaviorBidSpec;
  }

  public BatchAsyncRequestTaskSpec updateAdgroupAppAndroidChannelPackageIdSpec(
      List<UpdateAdgroupAppAndroidChannelPackageIdItem>
          updateAdgroupAppAndroidChannelPackageIdSpec) {
    this.updateAdgroupAppAndroidChannelPackageIdSpec = updateAdgroupAppAndroidChannelPackageIdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateAdgroupAppAndroidChannelPackageIdSpecItem(
      UpdateAdgroupAppAndroidChannelPackageIdItem updateAdgroupAppAndroidChannelPackageIdSpecItem) {
    if (this.updateAdgroupAppAndroidChannelPackageIdSpec == null) {
      this.updateAdgroupAppAndroidChannelPackageIdSpec =
          new ArrayList<UpdateAdgroupAppAndroidChannelPackageIdItem>();
    }
    this.updateAdgroupAppAndroidChannelPackageIdSpec.add(
        updateAdgroupAppAndroidChannelPackageIdSpecItem);
    return this;
  }

  /**
   * Get updateAdgroupAppAndroidChannelPackageIdSpec
   *
   * @return updateAdgroupAppAndroidChannelPackageIdSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateAdgroupAppAndroidChannelPackageIdItem>
      getUpdateAdgroupAppAndroidChannelPackageIdSpec() {
    return updateAdgroupAppAndroidChannelPackageIdSpec;
  }

  public void setUpdateAdgroupAppAndroidChannelPackageIdSpec(
      List<UpdateAdgroupAppAndroidChannelPackageIdItem>
          updateAdgroupAppAndroidChannelPackageIdSpec) {
    this.updateAdgroupAppAndroidChannelPackageIdSpec = updateAdgroupAppAndroidChannelPackageIdSpec;
  }

  public BatchAsyncRequestTaskSpec updateCampaignSpeedModeSpec(
      List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec) {
    this.updateCampaignSpeedModeSpec = updateCampaignSpeedModeSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addUpdateCampaignSpeedModeSpecItem(
      UpdateCampaignSpeedModeItem updateCampaignSpeedModeSpecItem) {
    if (this.updateCampaignSpeedModeSpec == null) {
      this.updateCampaignSpeedModeSpec = new ArrayList<UpdateCampaignSpeedModeItem>();
    }
    this.updateCampaignSpeedModeSpec.add(updateCampaignSpeedModeSpecItem);
    return this;
  }

  /**
   * Get updateCampaignSpeedModeSpec
   *
   * @return updateCampaignSpeedModeSpec
   */
  @ApiModelProperty(value = "")
  public List<UpdateCampaignSpeedModeItem> getUpdateCampaignSpeedModeSpec() {
    return updateCampaignSpeedModeSpec;
  }

  public void setUpdateCampaignSpeedModeSpec(
      List<UpdateCampaignSpeedModeItem> updateCampaignSpeedModeSpec) {
    this.updateCampaignSpeedModeSpec = updateCampaignSpeedModeSpec;
  }

  public BatchAsyncRequestTaskSpec deleteCampaignSpec(List<DeleteCampaignItem> deleteCampaignSpec) {
    this.deleteCampaignSpec = deleteCampaignSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteCampaignSpecItem(
      DeleteCampaignItem deleteCampaignSpecItem) {
    if (this.deleteCampaignSpec == null) {
      this.deleteCampaignSpec = new ArrayList<DeleteCampaignItem>();
    }
    this.deleteCampaignSpec.add(deleteCampaignSpecItem);
    return this;
  }

  /**
   * Get deleteCampaignSpec
   *
   * @return deleteCampaignSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteCampaignItem> getDeleteCampaignSpec() {
    return deleteCampaignSpec;
  }

  public void setDeleteCampaignSpec(List<DeleteCampaignItem> deleteCampaignSpec) {
    this.deleteCampaignSpec = deleteCampaignSpec;
  }

  public BatchAsyncRequestTaskSpec deleteAdgroupSpec(List<DeleteAdgroupItem> deleteAdgroupSpec) {
    this.deleteAdgroupSpec = deleteAdgroupSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteAdgroupSpecItem(
      DeleteAdgroupItem deleteAdgroupSpecItem) {
    if (this.deleteAdgroupSpec == null) {
      this.deleteAdgroupSpec = new ArrayList<DeleteAdgroupItem>();
    }
    this.deleteAdgroupSpec.add(deleteAdgroupSpecItem);
    return this;
  }

  /**
   * Get deleteAdgroupSpec
   *
   * @return deleteAdgroupSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteAdgroupItem> getDeleteAdgroupSpec() {
    return deleteAdgroupSpec;
  }

  public void setDeleteAdgroupSpec(List<DeleteAdgroupItem> deleteAdgroupSpec) {
    this.deleteAdgroupSpec = deleteAdgroupSpec;
  }

  public BatchAsyncRequestTaskSpec deleteAdSpec(List<DeleteAdItem> deleteAdSpec) {
    this.deleteAdSpec = deleteAdSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addDeleteAdSpecItem(DeleteAdItem deleteAdSpecItem) {
    if (this.deleteAdSpec == null) {
      this.deleteAdSpec = new ArrayList<DeleteAdItem>();
    }
    this.deleteAdSpec.add(deleteAdSpecItem);
    return this;
  }

  /**
   * Get deleteAdSpec
   *
   * @return deleteAdSpec
   */
  @ApiModelProperty(value = "")
  public List<DeleteAdItem> getDeleteAdSpec() {
    return deleteAdSpec;
  }

  public void setDeleteAdSpec(List<DeleteAdItem> deleteAdSpec) {
    this.deleteAdSpec = deleteAdSpec;
  }

  public BatchAsyncRequestTaskSpec targetingsShareSpec(
      List<TargetingsShareItem> targetingsShareSpec) {
    this.targetingsShareSpec = targetingsShareSpec;
    return this;
  }

  public BatchAsyncRequestTaskSpec addTargetingsShareSpecItem(
      TargetingsShareItem targetingsShareSpecItem) {
    if (this.targetingsShareSpec == null) {
      this.targetingsShareSpec = new ArrayList<TargetingsShareItem>();
    }
    this.targetingsShareSpec.add(targetingsShareSpecItem);
    return this;
  }

  /**
   * Get targetingsShareSpec
   *
   * @return targetingsShareSpec
   */
  @ApiModelProperty(value = "")
  public List<TargetingsShareItem> getTargetingsShareSpec() {
    return targetingsShareSpec;
  }

  public void setTargetingsShareSpec(List<TargetingsShareItem> targetingsShareSpec) {
    this.targetingsShareSpec = targetingsShareSpec;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchAsyncRequestTaskSpec batchAsyncRequestTaskSpec = (BatchAsyncRequestTaskSpec) o;
    return Objects.equals(
            this.updateUnionPositionPackageSpec,
            batchAsyncRequestTaskSpec.updateUnionPositionPackageSpec)
        && Objects.equals(
            this.updateExcludeUnionPositionPackageSpec,
            batchAsyncRequestTaskSpec.updateExcludeUnionPositionPackageSpec)
        && Objects.equals(
            this.updateTargetingIdSpec, batchAsyncRequestTaskSpec.updateTargetingIdSpec)
        && Objects.equals(
            this.updateBidStrategySpec, batchAsyncRequestTaskSpec.updateBidStrategySpec)
        && Objects.equals(
            this.updateDeepConversionBehaviorBidSpec,
            batchAsyncRequestTaskSpec.updateDeepConversionBehaviorBidSpec)
        && Objects.equals(
            this.updateAdgroupAppAndroidChannelPackageIdSpec,
            batchAsyncRequestTaskSpec.updateAdgroupAppAndroidChannelPackageIdSpec)
        && Objects.equals(
            this.updateCampaignSpeedModeSpec, batchAsyncRequestTaskSpec.updateCampaignSpeedModeSpec)
        && Objects.equals(this.deleteCampaignSpec, batchAsyncRequestTaskSpec.deleteCampaignSpec)
        && Objects.equals(this.deleteAdgroupSpec, batchAsyncRequestTaskSpec.deleteAdgroupSpec)
        && Objects.equals(this.deleteAdSpec, batchAsyncRequestTaskSpec.deleteAdSpec)
        && Objects.equals(this.targetingsShareSpec, batchAsyncRequestTaskSpec.targetingsShareSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        updateUnionPositionPackageSpec,
        updateExcludeUnionPositionPackageSpec,
        updateTargetingIdSpec,
        updateBidStrategySpec,
        updateDeepConversionBehaviorBidSpec,
        updateAdgroupAppAndroidChannelPackageIdSpec,
        updateCampaignSpeedModeSpec,
        deleteCampaignSpec,
        deleteAdgroupSpec,
        deleteAdSpec,
        targetingsShareSpec);
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
