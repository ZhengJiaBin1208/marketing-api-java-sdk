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
import java.util.Objects;

/**
 * 任务所需条件
 */
@ApiModel(description = "任务所需条件")

public class TaskSpec {

  @SerializedName("report_task_spec")
  private ReportTaskSpec reportTaskSpec = null;

  @SerializedName("task_type_ad_hourly_report_spec")
  private TaskTypeAdHourlyReportSpec taskTypeAdHourlyReportSpec = null;

  @SerializedName("task_type_wechat_moments_adgroup_hourly_report_spec")
  private TaskTypeWechatMomentsAdgroupHourlyReportSpec taskTypeWechatMomentsAdgroupHourlyReportSpec = null;

  @SerializedName("task_type_wechat_adgroup_hourly_report_spec")
  private TaskTypeWechatAdgroupHourlyReportSpec taskTypeWechatAdgroupHourlyReportSpec = null;

  @SerializedName("task_type_wechat_adgroup_daily_report_spec")
  private TaskTypeWechatAdgroupDailyReportSpec taskTypeWechatAdgroupDailyReportSpec = null;

  @SerializedName("task_type_wechat_ad_hourly_report_spec")
  private TaskTypeWechatAdHourlyReportSpec taskTypeWechatAdHourlyReportSpec = null;

  @SerializedName("task_type_wechat_ad_daily_report_spec")
  private TaskTypeWechatAdDailyReportSpec taskTypeWechatAdDailyReportSpec = null;

  @SerializedName("task_type_wechat_advertising_data_spec")
  private TaskTypeWechatAdvertisingDataSpec taskTypeWechatAdvertisingDataSpec = null;

  @SerializedName("task_type_wechat_poi_hourly_report_spec")
  private TaskTypeWechatPoiHourlyReportSpec taskTypeWechatPoiHourlyReportSpec = null;

  @SerializedName("task_type_create_android_channel_package_spec")
  private TaskTypeCreateAndroidChannelPackageSpec taskTypeCreateAndroidChannelPackageSpec = null;

  @SerializedName("task_type_update_android_channel_package_spec")
  private TaskTypeUpdateAndroidChannelPackageSpec taskTypeUpdateAndroidChannelPackageSpec = null;

  @SerializedName("task_type_create_android_union_channel_package_spec")
  private TaskTypeCreateAndroidUnionChannelPackageSpec taskTypeCreateAndroidUnionChannelPackageSpec = null;

  @SerializedName("task_type_update_android_union_channel_package_spec")
  private TaskTypeUpdateAndroidUnionChannelPackageSpec taskTypeUpdateAndroidUnionChannelPackageSpec = null;

  @SerializedName("task_type_union_position_report_spec")
  private TaskTypeUnionPositionReportSpec taskTypeUnionPositionReportSpec = null;

  public TaskSpec reportTaskSpec(ReportTaskSpec reportTaskSpec) {
    this.reportTaskSpec = reportTaskSpec;
    return this;
  }

  /**
   * Get reportTaskSpec
   *
   * @return reportTaskSpec
   **/
  @ApiModelProperty(value = "")
  public ReportTaskSpec getReportTaskSpec() {
    return reportTaskSpec;
  }

  public void setReportTaskSpec(ReportTaskSpec reportTaskSpec) {
    this.reportTaskSpec = reportTaskSpec;
  }

  public TaskSpec taskTypeAdHourlyReportSpec(
      TaskTypeAdHourlyReportSpec taskTypeAdHourlyReportSpec) {
    this.taskTypeAdHourlyReportSpec = taskTypeAdHourlyReportSpec;
    return this;
  }

  /**
   * Get taskTypeAdHourlyReportSpec
   *
   * @return taskTypeAdHourlyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeAdHourlyReportSpec getTaskTypeAdHourlyReportSpec() {
    return taskTypeAdHourlyReportSpec;
  }

  public void setTaskTypeAdHourlyReportSpec(TaskTypeAdHourlyReportSpec taskTypeAdHourlyReportSpec) {
    this.taskTypeAdHourlyReportSpec = taskTypeAdHourlyReportSpec;
  }

  public TaskSpec taskTypeWechatMomentsAdgroupHourlyReportSpec(
      TaskTypeWechatMomentsAdgroupHourlyReportSpec taskTypeWechatMomentsAdgroupHourlyReportSpec) {
    this.taskTypeWechatMomentsAdgroupHourlyReportSpec = taskTypeWechatMomentsAdgroupHourlyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatMomentsAdgroupHourlyReportSpec
   *
   * @return taskTypeWechatMomentsAdgroupHourlyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatMomentsAdgroupHourlyReportSpec getTaskTypeWechatMomentsAdgroupHourlyReportSpec() {
    return taskTypeWechatMomentsAdgroupHourlyReportSpec;
  }

  public void setTaskTypeWechatMomentsAdgroupHourlyReportSpec(
      TaskTypeWechatMomentsAdgroupHourlyReportSpec taskTypeWechatMomentsAdgroupHourlyReportSpec) {
    this.taskTypeWechatMomentsAdgroupHourlyReportSpec = taskTypeWechatMomentsAdgroupHourlyReportSpec;
  }

  public TaskSpec taskTypeWechatAdgroupHourlyReportSpec(
      TaskTypeWechatAdgroupHourlyReportSpec taskTypeWechatAdgroupHourlyReportSpec) {
    this.taskTypeWechatAdgroupHourlyReportSpec = taskTypeWechatAdgroupHourlyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatAdgroupHourlyReportSpec
   *
   * @return taskTypeWechatAdgroupHourlyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatAdgroupHourlyReportSpec getTaskTypeWechatAdgroupHourlyReportSpec() {
    return taskTypeWechatAdgroupHourlyReportSpec;
  }

  public void setTaskTypeWechatAdgroupHourlyReportSpec(
      TaskTypeWechatAdgroupHourlyReportSpec taskTypeWechatAdgroupHourlyReportSpec) {
    this.taskTypeWechatAdgroupHourlyReportSpec = taskTypeWechatAdgroupHourlyReportSpec;
  }

  public TaskSpec taskTypeWechatAdgroupDailyReportSpec(
      TaskTypeWechatAdgroupDailyReportSpec taskTypeWechatAdgroupDailyReportSpec) {
    this.taskTypeWechatAdgroupDailyReportSpec = taskTypeWechatAdgroupDailyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatAdgroupDailyReportSpec
   *
   * @return taskTypeWechatAdgroupDailyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatAdgroupDailyReportSpec getTaskTypeWechatAdgroupDailyReportSpec() {
    return taskTypeWechatAdgroupDailyReportSpec;
  }

  public void setTaskTypeWechatAdgroupDailyReportSpec(
      TaskTypeWechatAdgroupDailyReportSpec taskTypeWechatAdgroupDailyReportSpec) {
    this.taskTypeWechatAdgroupDailyReportSpec = taskTypeWechatAdgroupDailyReportSpec;
  }

  public TaskSpec taskTypeWechatAdHourlyReportSpec(
      TaskTypeWechatAdHourlyReportSpec taskTypeWechatAdHourlyReportSpec) {
    this.taskTypeWechatAdHourlyReportSpec = taskTypeWechatAdHourlyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatAdHourlyReportSpec
   *
   * @return taskTypeWechatAdHourlyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatAdHourlyReportSpec getTaskTypeWechatAdHourlyReportSpec() {
    return taskTypeWechatAdHourlyReportSpec;
  }

  public void setTaskTypeWechatAdHourlyReportSpec(
      TaskTypeWechatAdHourlyReportSpec taskTypeWechatAdHourlyReportSpec) {
    this.taskTypeWechatAdHourlyReportSpec = taskTypeWechatAdHourlyReportSpec;
  }

  public TaskSpec taskTypeWechatAdDailyReportSpec(
      TaskTypeWechatAdDailyReportSpec taskTypeWechatAdDailyReportSpec) {
    this.taskTypeWechatAdDailyReportSpec = taskTypeWechatAdDailyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatAdDailyReportSpec
   *
   * @return taskTypeWechatAdDailyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatAdDailyReportSpec getTaskTypeWechatAdDailyReportSpec() {
    return taskTypeWechatAdDailyReportSpec;
  }

  public void setTaskTypeWechatAdDailyReportSpec(
      TaskTypeWechatAdDailyReportSpec taskTypeWechatAdDailyReportSpec) {
    this.taskTypeWechatAdDailyReportSpec = taskTypeWechatAdDailyReportSpec;
  }

  public TaskSpec taskTypeWechatAdvertisingDataSpec(
      TaskTypeWechatAdvertisingDataSpec taskTypeWechatAdvertisingDataSpec) {
    this.taskTypeWechatAdvertisingDataSpec = taskTypeWechatAdvertisingDataSpec;
    return this;
  }

  /**
   * Get taskTypeWechatAdvertisingDataSpec
   *
   * @return taskTypeWechatAdvertisingDataSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatAdvertisingDataSpec getTaskTypeWechatAdvertisingDataSpec() {
    return taskTypeWechatAdvertisingDataSpec;
  }

  public void setTaskTypeWechatAdvertisingDataSpec(
      TaskTypeWechatAdvertisingDataSpec taskTypeWechatAdvertisingDataSpec) {
    this.taskTypeWechatAdvertisingDataSpec = taskTypeWechatAdvertisingDataSpec;
  }

  public TaskSpec taskTypeWechatPoiHourlyReportSpec(
      TaskTypeWechatPoiHourlyReportSpec taskTypeWechatPoiHourlyReportSpec) {
    this.taskTypeWechatPoiHourlyReportSpec = taskTypeWechatPoiHourlyReportSpec;
    return this;
  }

  /**
   * Get taskTypeWechatPoiHourlyReportSpec
   *
   * @return taskTypeWechatPoiHourlyReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeWechatPoiHourlyReportSpec getTaskTypeWechatPoiHourlyReportSpec() {
    return taskTypeWechatPoiHourlyReportSpec;
  }

  public void setTaskTypeWechatPoiHourlyReportSpec(
      TaskTypeWechatPoiHourlyReportSpec taskTypeWechatPoiHourlyReportSpec) {
    this.taskTypeWechatPoiHourlyReportSpec = taskTypeWechatPoiHourlyReportSpec;
  }

  public TaskSpec taskTypeCreateAndroidChannelPackageSpec(
      TaskTypeCreateAndroidChannelPackageSpec taskTypeCreateAndroidChannelPackageSpec) {
    this.taskTypeCreateAndroidChannelPackageSpec = taskTypeCreateAndroidChannelPackageSpec;
    return this;
  }

  /**
   * Get taskTypeCreateAndroidChannelPackageSpec
   *
   * @return taskTypeCreateAndroidChannelPackageSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeCreateAndroidChannelPackageSpec getTaskTypeCreateAndroidChannelPackageSpec() {
    return taskTypeCreateAndroidChannelPackageSpec;
  }

  public void setTaskTypeCreateAndroidChannelPackageSpec(
      TaskTypeCreateAndroidChannelPackageSpec taskTypeCreateAndroidChannelPackageSpec) {
    this.taskTypeCreateAndroidChannelPackageSpec = taskTypeCreateAndroidChannelPackageSpec;
  }

  public TaskSpec taskTypeUpdateAndroidChannelPackageSpec(
      TaskTypeUpdateAndroidChannelPackageSpec taskTypeUpdateAndroidChannelPackageSpec) {
    this.taskTypeUpdateAndroidChannelPackageSpec = taskTypeUpdateAndroidChannelPackageSpec;
    return this;
  }

  /**
   * Get taskTypeUpdateAndroidChannelPackageSpec
   *
   * @return taskTypeUpdateAndroidChannelPackageSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeUpdateAndroidChannelPackageSpec getTaskTypeUpdateAndroidChannelPackageSpec() {
    return taskTypeUpdateAndroidChannelPackageSpec;
  }

  public void setTaskTypeUpdateAndroidChannelPackageSpec(
      TaskTypeUpdateAndroidChannelPackageSpec taskTypeUpdateAndroidChannelPackageSpec) {
    this.taskTypeUpdateAndroidChannelPackageSpec = taskTypeUpdateAndroidChannelPackageSpec;
  }

  public TaskSpec taskTypeCreateAndroidUnionChannelPackageSpec(
      TaskTypeCreateAndroidUnionChannelPackageSpec taskTypeCreateAndroidUnionChannelPackageSpec) {
    this.taskTypeCreateAndroidUnionChannelPackageSpec = taskTypeCreateAndroidUnionChannelPackageSpec;
    return this;
  }

  /**
   * Get taskTypeCreateAndroidUnionChannelPackageSpec
   *
   * @return taskTypeCreateAndroidUnionChannelPackageSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeCreateAndroidUnionChannelPackageSpec getTaskTypeCreateAndroidUnionChannelPackageSpec() {
    return taskTypeCreateAndroidUnionChannelPackageSpec;
  }

  public void setTaskTypeCreateAndroidUnionChannelPackageSpec(
      TaskTypeCreateAndroidUnionChannelPackageSpec taskTypeCreateAndroidUnionChannelPackageSpec) {
    this.taskTypeCreateAndroidUnionChannelPackageSpec = taskTypeCreateAndroidUnionChannelPackageSpec;
  }

  public TaskSpec taskTypeUpdateAndroidUnionChannelPackageSpec(
      TaskTypeUpdateAndroidUnionChannelPackageSpec taskTypeUpdateAndroidUnionChannelPackageSpec) {
    this.taskTypeUpdateAndroidUnionChannelPackageSpec = taskTypeUpdateAndroidUnionChannelPackageSpec;
    return this;
  }

  /**
   * Get taskTypeUpdateAndroidUnionChannelPackageSpec
   *
   * @return taskTypeUpdateAndroidUnionChannelPackageSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeUpdateAndroidUnionChannelPackageSpec getTaskTypeUpdateAndroidUnionChannelPackageSpec() {
    return taskTypeUpdateAndroidUnionChannelPackageSpec;
  }

  public void setTaskTypeUpdateAndroidUnionChannelPackageSpec(
      TaskTypeUpdateAndroidUnionChannelPackageSpec taskTypeUpdateAndroidUnionChannelPackageSpec) {
    this.taskTypeUpdateAndroidUnionChannelPackageSpec = taskTypeUpdateAndroidUnionChannelPackageSpec;
  }

  public TaskSpec taskTypeUnionPositionReportSpec(
      TaskTypeUnionPositionReportSpec taskTypeUnionPositionReportSpec) {
    this.taskTypeUnionPositionReportSpec = taskTypeUnionPositionReportSpec;
    return this;
  }

  /**
   * Get taskTypeUnionPositionReportSpec
   *
   * @return taskTypeUnionPositionReportSpec
   **/
  @ApiModelProperty(value = "")
  public TaskTypeUnionPositionReportSpec getTaskTypeUnionPositionReportSpec() {
    return taskTypeUnionPositionReportSpec;
  }

  public void setTaskTypeUnionPositionReportSpec(
      TaskTypeUnionPositionReportSpec taskTypeUnionPositionReportSpec) {
    this.taskTypeUnionPositionReportSpec = taskTypeUnionPositionReportSpec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpec taskSpec = (TaskSpec) o;
    return Objects.equals(this.reportTaskSpec, taskSpec.reportTaskSpec) &&
        Objects.equals(this.taskTypeAdHourlyReportSpec, taskSpec.taskTypeAdHourlyReportSpec) &&
        Objects.equals(this.taskTypeWechatMomentsAdgroupHourlyReportSpec,
            taskSpec.taskTypeWechatMomentsAdgroupHourlyReportSpec) &&
        Objects.equals(this.taskTypeWechatAdgroupHourlyReportSpec,
            taskSpec.taskTypeWechatAdgroupHourlyReportSpec) &&
        Objects.equals(this.taskTypeWechatAdgroupDailyReportSpec,
            taskSpec.taskTypeWechatAdgroupDailyReportSpec) &&
        Objects.equals(this.taskTypeWechatAdHourlyReportSpec,
            taskSpec.taskTypeWechatAdHourlyReportSpec) &&
        Objects
            .equals(this.taskTypeWechatAdDailyReportSpec, taskSpec.taskTypeWechatAdDailyReportSpec)
        &&
        Objects.equals(this.taskTypeWechatAdvertisingDataSpec,
            taskSpec.taskTypeWechatAdvertisingDataSpec) &&
        Objects.equals(this.taskTypeWechatPoiHourlyReportSpec,
            taskSpec.taskTypeWechatPoiHourlyReportSpec) &&
        Objects.equals(this.taskTypeCreateAndroidChannelPackageSpec,
            taskSpec.taskTypeCreateAndroidChannelPackageSpec) &&
        Objects.equals(this.taskTypeUpdateAndroidChannelPackageSpec,
            taskSpec.taskTypeUpdateAndroidChannelPackageSpec) &&
        Objects.equals(this.taskTypeCreateAndroidUnionChannelPackageSpec,
            taskSpec.taskTypeCreateAndroidUnionChannelPackageSpec) &&
        Objects.equals(this.taskTypeUpdateAndroidUnionChannelPackageSpec,
            taskSpec.taskTypeUpdateAndroidUnionChannelPackageSpec) &&
        Objects
            .equals(this.taskTypeUnionPositionReportSpec, taskSpec.taskTypeUnionPositionReportSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportTaskSpec, taskTypeAdHourlyReportSpec,
        taskTypeWechatMomentsAdgroupHourlyReportSpec, taskTypeWechatAdgroupHourlyReportSpec,
        taskTypeWechatAdgroupDailyReportSpec, taskTypeWechatAdHourlyReportSpec,
        taskTypeWechatAdDailyReportSpec, taskTypeWechatAdvertisingDataSpec,
        taskTypeWechatPoiHourlyReportSpec, taskTypeCreateAndroidChannelPackageSpec,
        taskTypeUpdateAndroidChannelPackageSpec, taskTypeCreateAndroidUnionChannelPackageSpec,
        taskTypeUpdateAndroidUnionChannelPackageSpec, taskTypeUnionPositionReportSpec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpec {\n");

    sb.append("    reportTaskSpec: ").append(toIndentedString(reportTaskSpec)).append("\n");
    sb.append("    taskTypeAdHourlyReportSpec: ")
        .append(toIndentedString(taskTypeAdHourlyReportSpec)).append("\n");
    sb.append("    taskTypeWechatMomentsAdgroupHourlyReportSpec: ")
        .append(toIndentedString(taskTypeWechatMomentsAdgroupHourlyReportSpec)).append("\n");
    sb.append("    taskTypeWechatAdgroupHourlyReportSpec: ")
        .append(toIndentedString(taskTypeWechatAdgroupHourlyReportSpec)).append("\n");
    sb.append("    taskTypeWechatAdgroupDailyReportSpec: ")
        .append(toIndentedString(taskTypeWechatAdgroupDailyReportSpec)).append("\n");
    sb.append("    taskTypeWechatAdHourlyReportSpec: ")
        .append(toIndentedString(taskTypeWechatAdHourlyReportSpec)).append("\n");
    sb.append("    taskTypeWechatAdDailyReportSpec: ")
        .append(toIndentedString(taskTypeWechatAdDailyReportSpec)).append("\n");
    sb.append("    taskTypeWechatAdvertisingDataSpec: ")
        .append(toIndentedString(taskTypeWechatAdvertisingDataSpec)).append("\n");
    sb.append("    taskTypeWechatPoiHourlyReportSpec: ")
        .append(toIndentedString(taskTypeWechatPoiHourlyReportSpec)).append("\n");
    sb.append("    taskTypeCreateAndroidChannelPackageSpec: ")
        .append(toIndentedString(taskTypeCreateAndroidChannelPackageSpec)).append("\n");
    sb.append("    taskTypeUpdateAndroidChannelPackageSpec: ")
        .append(toIndentedString(taskTypeUpdateAndroidChannelPackageSpec)).append("\n");
    sb.append("    taskTypeCreateAndroidUnionChannelPackageSpec: ")
        .append(toIndentedString(taskTypeCreateAndroidUnionChannelPackageSpec)).append("\n");
    sb.append("    taskTypeUpdateAndroidUnionChannelPackageSpec: ")
        .append(toIndentedString(taskTypeUpdateAndroidUnionChannelPackageSpec)).append("\n");
    sb.append("    taskTypeUnionPositionReportSpec: ")
        .append(toIndentedString(taskTypeUnionPositionReportSpec)).append("\n");
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
