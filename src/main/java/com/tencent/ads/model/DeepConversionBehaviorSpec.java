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
 * oCPC/oCPM 优化转化行为配置
 */
@ApiModel(description = "oCPC/oCPM 优化转化行为配置")

public class DeepConversionBehaviorSpec {

  @SerializedName("goal")
  private DeepConversionBehaviorGoal goal = null;

  @SerializedName("bid_amount")
  private Long bidAmount = null;

  public DeepConversionBehaviorSpec goal(DeepConversionBehaviorGoal goal) {
    this.goal = goal;
    return this;
  }

  /**
   * Get goal
   *
   * @return goal
   **/
  @ApiModelProperty(value = "")
  public DeepConversionBehaviorGoal getGoal() {
    return goal;
  }

  public void setGoal(DeepConversionBehaviorGoal goal) {
    this.goal = goal;
  }

  public DeepConversionBehaviorSpec bidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
    return this;
  }

  /**
   * Get bidAmount
   *
   * @return bidAmount
   **/
  @ApiModelProperty(value = "")
  public Long getBidAmount() {
    return bidAmount;
  }

  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeepConversionBehaviorSpec deepConversionBehaviorSpec = (DeepConversionBehaviorSpec) o;
    return Objects.equals(this.goal, deepConversionBehaviorSpec.goal) &&
        Objects.equals(this.bidAmount, deepConversionBehaviorSpec.bidAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(goal, bidAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeepConversionBehaviorSpec {\n");

    sb.append("    goal: ").append(toIndentedString(goal)).append("\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
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
