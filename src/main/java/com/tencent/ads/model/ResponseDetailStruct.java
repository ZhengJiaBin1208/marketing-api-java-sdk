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
 * 诊断详细信息
 */
@ApiModel(description = "诊断详细信息")

public class ResponseDetailStruct {

  @SerializedName("funnel")
  private DetailFunnelStruct funnel = null;

  @SerializedName("target_detail")
  private DetailTargetDetailStruct targetDetail = null;

  @SerializedName("compete_detail")
  private DetailCompeteDetailStruct competeDetail = null;

  @SerializedName("exposure_detail")
  private GetExposureDetailStruct exposureDetail = null;

  @SerializedName("click_detail")
  private GetExposureDetailStruct clickDetail = null;

  @SerializedName("conversion_detail")
  private GetExposureDetailStruct conversionDetail = null;

  @SerializedName("cpa_detail")
  private DetailCpaDetailStruct cpaDetail = null;

  @SerializedName("operation_log")
  private List<DetailOperationLogListItem> operationLog = null;

  @SerializedName("optimization")
  private OptimizeContentMainStruct optimization = null;

  public ResponseDetailStruct funnel(DetailFunnelStruct funnel) {
    this.funnel = funnel;
    return this;
  }

  /**
   * Get funnel
   *
   * @return funnel
   **/
  @ApiModelProperty(value = "")
  public DetailFunnelStruct getFunnel() {
    return funnel;
  }

  public void setFunnel(DetailFunnelStruct funnel) {
    this.funnel = funnel;
  }

  public ResponseDetailStruct targetDetail(DetailTargetDetailStruct targetDetail) {
    this.targetDetail = targetDetail;
    return this;
  }

  /**
   * Get targetDetail
   *
   * @return targetDetail
   **/
  @ApiModelProperty(value = "")
  public DetailTargetDetailStruct getTargetDetail() {
    return targetDetail;
  }

  public void setTargetDetail(DetailTargetDetailStruct targetDetail) {
    this.targetDetail = targetDetail;
  }

  public ResponseDetailStruct competeDetail(DetailCompeteDetailStruct competeDetail) {
    this.competeDetail = competeDetail;
    return this;
  }

  /**
   * Get competeDetail
   *
   * @return competeDetail
   **/
  @ApiModelProperty(value = "")
  public DetailCompeteDetailStruct getCompeteDetail() {
    return competeDetail;
  }

  public void setCompeteDetail(DetailCompeteDetailStruct competeDetail) {
    this.competeDetail = competeDetail;
  }

  public ResponseDetailStruct exposureDetail(GetExposureDetailStruct exposureDetail) {
    this.exposureDetail = exposureDetail;
    return this;
  }

  /**
   * Get exposureDetail
   *
   * @return exposureDetail
   **/
  @ApiModelProperty(value = "")
  public GetExposureDetailStruct getExposureDetail() {
    return exposureDetail;
  }

  public void setExposureDetail(GetExposureDetailStruct exposureDetail) {
    this.exposureDetail = exposureDetail;
  }

  public ResponseDetailStruct clickDetail(GetExposureDetailStruct clickDetail) {
    this.clickDetail = clickDetail;
    return this;
  }

  /**
   * Get clickDetail
   *
   * @return clickDetail
   **/
  @ApiModelProperty(value = "")
  public GetExposureDetailStruct getClickDetail() {
    return clickDetail;
  }

  public void setClickDetail(GetExposureDetailStruct clickDetail) {
    this.clickDetail = clickDetail;
  }

  public ResponseDetailStruct conversionDetail(GetExposureDetailStruct conversionDetail) {
    this.conversionDetail = conversionDetail;
    return this;
  }

  /**
   * Get conversionDetail
   *
   * @return conversionDetail
   **/
  @ApiModelProperty(value = "")
  public GetExposureDetailStruct getConversionDetail() {
    return conversionDetail;
  }

  public void setConversionDetail(GetExposureDetailStruct conversionDetail) {
    this.conversionDetail = conversionDetail;
  }

  public ResponseDetailStruct cpaDetail(DetailCpaDetailStruct cpaDetail) {
    this.cpaDetail = cpaDetail;
    return this;
  }

  /**
   * Get cpaDetail
   *
   * @return cpaDetail
   **/
  @ApiModelProperty(value = "")
  public DetailCpaDetailStruct getCpaDetail() {
    return cpaDetail;
  }

  public void setCpaDetail(DetailCpaDetailStruct cpaDetail) {
    this.cpaDetail = cpaDetail;
  }

  public ResponseDetailStruct operationLog(List<DetailOperationLogListItem> operationLog) {
    this.operationLog = operationLog;
    return this;
  }

  public ResponseDetailStruct addOperationLogItem(DetailOperationLogListItem operationLogItem) {
    if (this.operationLog == null) {
      this.operationLog = new ArrayList<DetailOperationLogListItem>();
    }
    this.operationLog.add(operationLogItem);
    return this;
  }

  /**
   * Get operationLog
   *
   * @return operationLog
   **/
  @ApiModelProperty(value = "")
  public List<DetailOperationLogListItem> getOperationLog() {
    return operationLog;
  }

  public void setOperationLog(List<DetailOperationLogListItem> operationLog) {
    this.operationLog = operationLog;
  }

  public ResponseDetailStruct optimization(OptimizeContentMainStruct optimization) {
    this.optimization = optimization;
    return this;
  }

  /**
   * Get optimization
   *
   * @return optimization
   **/
  @ApiModelProperty(value = "")
  public OptimizeContentMainStruct getOptimization() {
    return optimization;
  }

  public void setOptimization(OptimizeContentMainStruct optimization) {
    this.optimization = optimization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseDetailStruct responseDetailStruct = (ResponseDetailStruct) o;
    return Objects.equals(this.funnel, responseDetailStruct.funnel) &&
        Objects.equals(this.targetDetail, responseDetailStruct.targetDetail) &&
        Objects.equals(this.competeDetail, responseDetailStruct.competeDetail) &&
        Objects.equals(this.exposureDetail, responseDetailStruct.exposureDetail) &&
        Objects.equals(this.clickDetail, responseDetailStruct.clickDetail) &&
        Objects.equals(this.conversionDetail, responseDetailStruct.conversionDetail) &&
        Objects.equals(this.cpaDetail, responseDetailStruct.cpaDetail) &&
        Objects.equals(this.operationLog, responseDetailStruct.operationLog) &&
        Objects.equals(this.optimization, responseDetailStruct.optimization);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(funnel, targetDetail, competeDetail, exposureDetail, clickDetail, conversionDetail,
            cpaDetail, operationLog, optimization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseDetailStruct {\n");

    sb.append("    funnel: ").append(toIndentedString(funnel)).append("\n");
    sb.append("    targetDetail: ").append(toIndentedString(targetDetail)).append("\n");
    sb.append("    competeDetail: ").append(toIndentedString(competeDetail)).append("\n");
    sb.append("    exposureDetail: ").append(toIndentedString(exposureDetail)).append("\n");
    sb.append("    clickDetail: ").append(toIndentedString(clickDetail)).append("\n");
    sb.append("    conversionDetail: ").append(toIndentedString(conversionDetail)).append("\n");
    sb.append("    cpaDetail: ").append(toIndentedString(cpaDetail)).append("\n");
    sb.append("    operationLog: ").append(toIndentedString(operationLog)).append("\n");
    sb.append("    optimization: ").append(toIndentedString(optimization)).append("\n");
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
