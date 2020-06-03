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
 * LeadCluesGetResponseData
 */

public class LeadCluesGetResponseData {

  @SerializedName("leads_info")
  private List<LeadCluesGetListStruct> leadsInfo = null;

  @SerializedName("page_info")
  private Conf pageInfo = null;

  public LeadCluesGetResponseData leadsInfo(List<LeadCluesGetListStruct> leadsInfo) {
    this.leadsInfo = leadsInfo;
    return this;
  }

  public LeadCluesGetResponseData addLeadsInfoItem(LeadCluesGetListStruct leadsInfoItem) {
    if (this.leadsInfo == null) {
      this.leadsInfo = new ArrayList<LeadCluesGetListStruct>();
    }
    this.leadsInfo.add(leadsInfoItem);
    return this;
  }

  /**
   * Get leadsInfo
   *
   * @return leadsInfo
   **/
  @ApiModelProperty(value = "")
  public List<LeadCluesGetListStruct> getLeadsInfo() {
    return leadsInfo;
  }

  public void setLeadsInfo(List<LeadCluesGetListStruct> leadsInfo) {
    this.leadsInfo = leadsInfo;
  }

  public LeadCluesGetResponseData pageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }

  /**
   * Get pageInfo
   *
   * @return pageInfo
   **/
  @ApiModelProperty(value = "")
  public Conf getPageInfo() {
    return pageInfo;
  }

  public void setPageInfo(Conf pageInfo) {
    this.pageInfo = pageInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadCluesGetResponseData leadCluesGetResponseData = (LeadCluesGetResponseData) o;
    return Objects.equals(this.leadsInfo, leadCluesGetResponseData.leadsInfo) &&
        Objects.equals(this.pageInfo, leadCluesGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leadsInfo, pageInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadCluesGetResponseData {\n");

    sb.append("    leadsInfo: ").append(toIndentedString(leadsInfo)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
