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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SplitTestsUpdateRequest
 */

public class SplitTestsUpdateRequest {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("split_test_id")
  private Long splitTestId = null;

  @SerializedName("split_test_status")
  private SplitTestStatus splitTestStatus = null;

  @SerializedName("split_test_name")
  private String splitTestName = null;

  @SerializedName("adgroup_id_list")
  private List<Long> adgroupIdList = null;

  public SplitTestsUpdateRequest accountId(Long accountId) {
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

  public SplitTestsUpdateRequest splitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
    return this;
  }

  /**
   * Get splitTestId
   *
   * @return splitTestId
   **/
  @ApiModelProperty(value = "")
  public Long getSplitTestId() {
    return splitTestId;
  }

  public void setSplitTestId(Long splitTestId) {
    this.splitTestId = splitTestId;
  }

  public SplitTestsUpdateRequest splitTestStatus(SplitTestStatus splitTestStatus) {
    this.splitTestStatus = splitTestStatus;
    return this;
  }

  /**
   * Get splitTestStatus
   *
   * @return splitTestStatus
   **/
  @ApiModelProperty(value = "")
  public SplitTestStatus getSplitTestStatus() {
    return splitTestStatus;
  }

  public void setSplitTestStatus(SplitTestStatus splitTestStatus) {
    this.splitTestStatus = splitTestStatus;
  }

  public SplitTestsUpdateRequest splitTestName(String splitTestName) {
    this.splitTestName = splitTestName;
    return this;
  }

  /**
   * Get splitTestName
   *
   * @return splitTestName
   **/
  @ApiModelProperty(value = "")
  public String getSplitTestName() {
    return splitTestName;
  }

  public void setSplitTestName(String splitTestName) {
    this.splitTestName = splitTestName;
  }

  public SplitTestsUpdateRequest adgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
    return this;
  }

  public SplitTestsUpdateRequest addAdgroupIdListItem(Long adgroupIdListItem) {
    if (this.adgroupIdList == null) {
      this.adgroupIdList = new ArrayList<Long>();
    }
    this.adgroupIdList.add(adgroupIdListItem);
    return this;
  }

  /**
   * Get adgroupIdList
   *
   * @return adgroupIdList
   **/
  @ApiModelProperty(value = "")
  public List<Long> getAdgroupIdList() {
    return adgroupIdList;
  }

  public void setAdgroupIdList(List<Long> adgroupIdList) {
    this.adgroupIdList = adgroupIdList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitTestsUpdateRequest splitTestsUpdateRequest = (SplitTestsUpdateRequest) o;
    return Objects.equals(this.accountId, splitTestsUpdateRequest.accountId) &&
        Objects.equals(this.splitTestId, splitTestsUpdateRequest.splitTestId) &&
        Objects.equals(this.splitTestStatus, splitTestsUpdateRequest.splitTestStatus) &&
        Objects.equals(this.splitTestName, splitTestsUpdateRequest.splitTestName) &&
        Objects.equals(this.adgroupIdList, splitTestsUpdateRequest.adgroupIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, splitTestId, splitTestStatus, splitTestName, adgroupIdList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitTestsUpdateRequest {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    splitTestId: ").append(toIndentedString(splitTestId)).append("\n");
    sb.append("    splitTestStatus: ").append(toIndentedString(splitTestStatus)).append("\n");
    sb.append("    splitTestName: ").append(toIndentedString(splitTestName)).append("\n");
    sb.append("    adgroupIdList: ").append(toIndentedString(adgroupIdList)).append("\n");
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
