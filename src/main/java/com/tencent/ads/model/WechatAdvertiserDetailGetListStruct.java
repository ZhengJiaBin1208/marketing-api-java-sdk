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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class WechatAdvertiserDetailGetListStruct {
  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("wechat_account_name")
  private String wechatAccountName = null;

  @SerializedName("system_industry_id")
  private Long systemIndustryId = null;

  @SerializedName("wechat_account_id")
  private String wechatAccountId = null;

  @SerializedName("account_type")
  private WechatAdvertiserAccountType accountType = null;

  @SerializedName("corporation_name")
  private String corporationName = null;

  @SerializedName("auth_status")
  private WechatAuthStatus authStatus = null;

  @SerializedName("auth_time")
  private Long authTime = null;

  @SerializedName("agency_id_list")
  private List<Long> agencyIdList = null;

  @SerializedName("staff_wechat_id_list")
  private List<String> staffWechatIdList = null;

  @SerializedName("daily_budget")
  private Long dailyBudget = null;

  public WechatAdvertiserDetailGetListStruct accountId(Long accountId) {
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

  public WechatAdvertiserDetailGetListStruct wechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
    return this;
  }

  /**
   * Get wechatAccountName
   *
   * @return wechatAccountName
   */
  @ApiModelProperty(value = "")
  public String getWechatAccountName() {
    return wechatAccountName;
  }

  public void setWechatAccountName(String wechatAccountName) {
    this.wechatAccountName = wechatAccountName;
  }

  public WechatAdvertiserDetailGetListStruct systemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
    return this;
  }

  /**
   * Get systemIndustryId
   *
   * @return systemIndustryId
   */
  @ApiModelProperty(value = "")
  public Long getSystemIndustryId() {
    return systemIndustryId;
  }

  public void setSystemIndustryId(Long systemIndustryId) {
    this.systemIndustryId = systemIndustryId;
  }

  public WechatAdvertiserDetailGetListStruct wechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
    return this;
  }

  /**
   * Get wechatAccountId
   *
   * @return wechatAccountId
   */
  @ApiModelProperty(value = "")
  public String getWechatAccountId() {
    return wechatAccountId;
  }

  public void setWechatAccountId(String wechatAccountId) {
    this.wechatAccountId = wechatAccountId;
  }

  public WechatAdvertiserDetailGetListStruct accountType(WechatAdvertiserAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   *
   * @return accountType
   */
  @ApiModelProperty(value = "")
  public WechatAdvertiserAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(WechatAdvertiserAccountType accountType) {
    this.accountType = accountType;
  }

  public WechatAdvertiserDetailGetListStruct corporationName(String corporationName) {
    this.corporationName = corporationName;
    return this;
  }

  /**
   * Get corporationName
   *
   * @return corporationName
   */
  @ApiModelProperty(value = "")
  public String getCorporationName() {
    return corporationName;
  }

  public void setCorporationName(String corporationName) {
    this.corporationName = corporationName;
  }

  public WechatAdvertiserDetailGetListStruct authStatus(WechatAuthStatus authStatus) {
    this.authStatus = authStatus;
    return this;
  }

  /**
   * Get authStatus
   *
   * @return authStatus
   */
  @ApiModelProperty(value = "")
  public WechatAuthStatus getAuthStatus() {
    return authStatus;
  }

  public void setAuthStatus(WechatAuthStatus authStatus) {
    this.authStatus = authStatus;
  }

  public WechatAdvertiserDetailGetListStruct authTime(Long authTime) {
    this.authTime = authTime;
    return this;
  }

  /**
   * Get authTime
   *
   * @return authTime
   */
  @ApiModelProperty(value = "")
  public Long getAuthTime() {
    return authTime;
  }

  public void setAuthTime(Long authTime) {
    this.authTime = authTime;
  }

  public WechatAdvertiserDetailGetListStruct agencyIdList(List<Long> agencyIdList) {
    this.agencyIdList = agencyIdList;
    return this;
  }

  public WechatAdvertiserDetailGetListStruct addAgencyIdListItem(Long agencyIdListItem) {
    if (this.agencyIdList == null) {
      this.agencyIdList = new ArrayList<Long>();
    }
    this.agencyIdList.add(agencyIdListItem);
    return this;
  }

  /**
   * Get agencyIdList
   *
   * @return agencyIdList
   */
  @ApiModelProperty(value = "")
  public List<Long> getAgencyIdList() {
    return agencyIdList;
  }

  public void setAgencyIdList(List<Long> agencyIdList) {
    this.agencyIdList = agencyIdList;
  }

  public WechatAdvertiserDetailGetListStruct staffWechatIdList(List<String> staffWechatIdList) {
    this.staffWechatIdList = staffWechatIdList;
    return this;
  }

  public WechatAdvertiserDetailGetListStruct addStaffWechatIdListItem(
      String staffWechatIdListItem) {
    if (this.staffWechatIdList == null) {
      this.staffWechatIdList = new ArrayList<String>();
    }
    this.staffWechatIdList.add(staffWechatIdListItem);
    return this;
  }

  /**
   * Get staffWechatIdList
   *
   * @return staffWechatIdList
   */
  @ApiModelProperty(value = "")
  public List<String> getStaffWechatIdList() {
    return staffWechatIdList;
  }

  public void setStaffWechatIdList(List<String> staffWechatIdList) {
    this.staffWechatIdList = staffWechatIdList;
  }

  public WechatAdvertiserDetailGetListStruct dailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
    return this;
  }

  /**
   * Get dailyBudget
   *
   * @return dailyBudget
   */
  @ApiModelProperty(value = "")
  public Long getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(Long dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WechatAdvertiserDetailGetListStruct wechatAdvertiserDetailGetListStruct =
        (WechatAdvertiserDetailGetListStruct) o;
    return Objects.equals(this.accountId, wechatAdvertiserDetailGetListStruct.accountId)
        && Objects.equals(
            this.wechatAccountName, wechatAdvertiserDetailGetListStruct.wechatAccountName)
        && Objects.equals(
            this.systemIndustryId, wechatAdvertiserDetailGetListStruct.systemIndustryId)
        && Objects.equals(this.wechatAccountId, wechatAdvertiserDetailGetListStruct.wechatAccountId)
        && Objects.equals(this.accountType, wechatAdvertiserDetailGetListStruct.accountType)
        && Objects.equals(this.corporationName, wechatAdvertiserDetailGetListStruct.corporationName)
        && Objects.equals(this.authStatus, wechatAdvertiserDetailGetListStruct.authStatus)
        && Objects.equals(this.authTime, wechatAdvertiserDetailGetListStruct.authTime)
        && Objects.equals(this.agencyIdList, wechatAdvertiserDetailGetListStruct.agencyIdList)
        && Objects.equals(
            this.staffWechatIdList, wechatAdvertiserDetailGetListStruct.staffWechatIdList)
        && Objects.equals(this.dailyBudget, wechatAdvertiserDetailGetListStruct.dailyBudget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        wechatAccountName,
        systemIndustryId,
        wechatAccountId,
        accountType,
        corporationName,
        authStatus,
        authTime,
        agencyIdList,
        staffWechatIdList,
        dailyBudget);
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
