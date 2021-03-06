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
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** WechatFundTransferAddRequest */
public class WechatFundTransferAddRequest {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("fund_type")
  private WechatAccountFundType fundType = null;

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("transfer_type")
  private TransferType transferType = null;

  @SerializedName("operator")
  private String operator = null;

  public WechatFundTransferAddRequest accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   *
   * @return accountId
   */
  @ApiModelProperty(value = "")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public WechatFundTransferAddRequest fundType(WechatAccountFundType fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   */
  @ApiModelProperty(value = "")
  public WechatAccountFundType getFundType() {
    return fundType;
  }

  public void setFundType(WechatAccountFundType fundType) {
    this.fundType = fundType;
  }

  public WechatFundTransferAddRequest amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   */
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public WechatFundTransferAddRequest transferType(TransferType transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * Get transferType
   *
   * @return transferType
   */
  @ApiModelProperty(value = "")
  public TransferType getTransferType() {
    return transferType;
  }

  public void setTransferType(TransferType transferType) {
    this.transferType = transferType;
  }

  public WechatFundTransferAddRequest operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   *
   * @return operator
   */
  @ApiModelProperty(value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatFundTransferAddRequest wechatFundTransferAddRequest = (WechatFundTransferAddRequest) o;
    return Objects.equals(this.accountId, wechatFundTransferAddRequest.accountId)
        && Objects.equals(this.fundType, wechatFundTransferAddRequest.fundType)
        && Objects.equals(this.amount, wechatFundTransferAddRequest.amount)
        && Objects.equals(this.transferType, wechatFundTransferAddRequest.transferType)
        && Objects.equals(this.operator, wechatFundTransferAddRequest.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, fundType, amount, transferType, operator);
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
