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
public class AgencyRealtimeCostGetListStruct {
  @SerializedName("cost")
  private Long cost = null;

  @SerializedName("caculate_time")
  private Long caculateTime = null;

  @SerializedName("fund_type")
  private AccountTypeMap fundType = null;

  public AgencyRealtimeCostGetListStruct cost(Long cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   *
   * @return cost
   */
  @ApiModelProperty(value = "")
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }

  public AgencyRealtimeCostGetListStruct caculateTime(Long caculateTime) {
    this.caculateTime = caculateTime;
    return this;
  }

  /**
   * Get caculateTime
   *
   * @return caculateTime
   */
  @ApiModelProperty(value = "")
  public Long getCaculateTime() {
    return caculateTime;
  }

  public void setCaculateTime(Long caculateTime) {
    this.caculateTime = caculateTime;
  }

  public AgencyRealtimeCostGetListStruct fundType(AccountTypeMap fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  @ApiModelProperty(value = "")
  public AccountTypeMap getFundType() {
    return fundType;
  }

  public void setFundType(AccountTypeMap fundType) {
    this.fundType = fundType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgencyRealtimeCostGetListStruct agencyRealtimeCostGetListStruct =
        (AgencyRealtimeCostGetListStruct) o;
    return Objects.equals(this.cost, agencyRealtimeCostGetListStruct.cost)
        && Objects.equals(this.caculateTime, agencyRealtimeCostGetListStruct.caculateTime)
        && Objects.equals(this.fundType, agencyRealtimeCostGetListStruct.fundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, caculateTime, fundType);
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
