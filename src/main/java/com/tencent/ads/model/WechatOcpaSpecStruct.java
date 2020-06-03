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
 * oCPC/oCPM投放能力
 */
@ApiModel(description = "oCPC/oCPM投放能力")

public class WechatOcpaSpecStruct {

  @SerializedName("optimization_goal")
  private OptimizationGoal optimizationGoal = null;

  @SerializedName("max_price")
  private Long maxPrice = null;

  @SerializedName("min_price")
  private Long minPrice = null;

  public WechatOcpaSpecStruct optimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
    return this;
  }

  /**
   * Get optimizationGoal
   *
   * @return optimizationGoal
   **/
  @ApiModelProperty(value = "")
  public OptimizationGoal getOptimizationGoal() {
    return optimizationGoal;
  }

  public void setOptimizationGoal(OptimizationGoal optimizationGoal) {
    this.optimizationGoal = optimizationGoal;
  }

  public WechatOcpaSpecStruct maxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
    return this;
  }

  /**
   * Get maxPrice
   *
   * @return maxPrice
   **/
  @ApiModelProperty(value = "")
  public Long getMaxPrice() {
    return maxPrice;
  }

  public void setMaxPrice(Long maxPrice) {
    this.maxPrice = maxPrice;
  }

  public WechatOcpaSpecStruct minPrice(Long minPrice) {
    this.minPrice = minPrice;
    return this;
  }

  /**
   * Get minPrice
   *
   * @return minPrice
   **/
  @ApiModelProperty(value = "")
  public Long getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(Long minPrice) {
    this.minPrice = minPrice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatOcpaSpecStruct wechatOcpaSpecStruct = (WechatOcpaSpecStruct) o;
    return Objects.equals(this.optimizationGoal, wechatOcpaSpecStruct.optimizationGoal) &&
        Objects.equals(this.maxPrice, wechatOcpaSpecStruct.maxPrice) &&
        Objects.equals(this.minPrice, wechatOcpaSpecStruct.minPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optimizationGoal, maxPrice, minPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WechatOcpaSpecStruct {\n");

    sb.append("    optimizationGoal: ").append(toIndentedString(optimizationGoal)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
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
