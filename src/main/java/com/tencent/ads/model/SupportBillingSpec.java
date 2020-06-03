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
 * 支持的计费信息
 */
@ApiModel(description = "支持的计费信息")

public class SupportBillingSpec {

  @SerializedName("billing_event")
  private BillingEvent billingEvent = null;

  @SerializedName("min_price")
  private Long minPrice = null;

  @SerializedName("max_price")
  private Long maxPrice = null;

  public SupportBillingSpec billingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
    return this;
  }

  /**
   * Get billingEvent
   *
   * @return billingEvent
   **/
  @ApiModelProperty(value = "")
  public BillingEvent getBillingEvent() {
    return billingEvent;
  }

  public void setBillingEvent(BillingEvent billingEvent) {
    this.billingEvent = billingEvent;
  }

  public SupportBillingSpec minPrice(Long minPrice) {
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

  public SupportBillingSpec maxPrice(Long maxPrice) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportBillingSpec supportBillingSpec = (SupportBillingSpec) o;
    return Objects.equals(this.billingEvent, supportBillingSpec.billingEvent) &&
        Objects.equals(this.minPrice, supportBillingSpec.minPrice) &&
        Objects.equals(this.maxPrice, supportBillingSpec.maxPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingEvent, minPrice, maxPrice);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportBillingSpec {\n");

    sb.append("    billingEvent: ").append(toIndentedString(billingEvent)).append("\n");
    sb.append("    minPrice: ").append(toIndentedString(minPrice)).append("\n");
    sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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
