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
 * 返回结构
 */
@ApiModel(description = "返回结构")

public class DailyCostGetListStruct {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("cost")
  private Long cost = null;

  public DailyCostGetListStruct accountId(Long accountId) {
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

  public DailyCostGetListStruct wechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  /**
   * Get wechatAccountId
   *
   * @return wechatAccountId
   **/
  @ApiModelProperty(value = "")
  public String getWechatAccountId() {
    return wechatAccountId;
  }

  public void setWechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
  }

  public DailyCostGetListStruct date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   *
   * @return date
   **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public DailyCostGetListStruct cost(Long cost) {
    this.cost = cost;
    return this;
  }

  /**
   * Get cost
   *
   * @return cost
   **/
  @ApiModelProperty(value = "")
  public Long getCost() {
    return cost;
  }

  public void setCost(Long cost) {
    this.cost = cost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailyCostGetListStruct dailyCostGetListStruct = (DailyCostGetListStruct) o;
    return Objects.equals(this.accountId, dailyCostGetListStruct.accountId) &&
        Objects.equals(this.wechatAccountId, dailyCostGetListStruct.wechatAccountId) &&
        Objects.equals(this.date, dailyCostGetListStruct.date) &&
        Objects.equals(this.cost, dailyCostGetListStruct.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, wechatAccountId, date, cost);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailyCostGetListStruct {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    wechatAccountId: ").append(toIndentedString(wechatAccountId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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
