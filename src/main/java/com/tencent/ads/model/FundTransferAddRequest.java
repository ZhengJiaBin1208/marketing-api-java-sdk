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
import java.util.Objects;

/**
 * FundTransferAddRequest
 */

public class FundTransferAddRequest {

  @SerializedName("amount")
  private Long amount = null;

  @SerializedName("transfer_type")
  private String transferType = null;

  @SerializedName("external_bill_no")
  private String externalBillNo = null;

  @SerializedName("memo")
  private String memo = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("fund_type")
  private AccountTypeMap fundType = null;

  public FundTransferAddRequest amount(Long amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   *
   * @return amount
   **/
  @ApiModelProperty(value = "")
  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public FundTransferAddRequest transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

  /**
   * Get transferType
   *
   * @return transferType
   **/
  @ApiModelProperty(value = "")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public FundTransferAddRequest externalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
    return this;
  }

  /**
   * Get externalBillNo
   *
   * @return externalBillNo
   **/
  @ApiModelProperty(value = "")
  public String getExternalBillNo() {
    return externalBillNo;
  }

  public void setExternalBillNo(String externalBillNo) {
    this.externalBillNo = externalBillNo;
  }

  public FundTransferAddRequest memo(String memo) {
    this.memo = memo;
    return this;
  }

  /**
   * Get memo
   *
   * @return memo
   **/
  @ApiModelProperty(value = "")
  public String getMemo() {
    return memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public FundTransferAddRequest accountId(Long accountId) {
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

  public FundTransferAddRequest fundType(AccountTypeMap fundType) {
    this.fundType = fundType;
    return this;
  }

  /**
   * Get fundType
   *
   * @return fundType
   **/
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
    FundTransferAddRequest fundTransferAddRequest = (FundTransferAddRequest) o;
    return Objects.equals(this.amount, fundTransferAddRequest.amount) &&
        Objects.equals(this.transferType, fundTransferAddRequest.transferType) &&
        Objects.equals(this.externalBillNo, fundTransferAddRequest.externalBillNo) &&
        Objects.equals(this.memo, fundTransferAddRequest.memo) &&
        Objects.equals(this.accountId, fundTransferAddRequest.accountId) &&
        Objects.equals(this.fundType, fundTransferAddRequest.fundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, transferType, externalBillNo, memo, accountId, fundType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundTransferAddRequest {\n");

    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    externalBillNo: ").append(toIndentedString(externalBillNo)).append("\n");
    sb.append("    memo: ").append(toIndentedString(memo)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
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
