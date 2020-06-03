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
 * AdsGetResponseData
 */

public class AdsGetResponseData {

  @SerializedName("list")
  private List<AdsGetListStruct> list = null;

  @SerializedName("page_info")
  private Conf pageInfo = null;

  public AdsGetResponseData list(List<AdsGetListStruct> list) {
    this.list = list;
    return this;
  }

  public AdsGetResponseData addListItem(AdsGetListStruct listItem) {
    if (this.list == null) {
      this.list = new ArrayList<AdsGetListStruct>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   *
   * @return list
   **/
  @ApiModelProperty(value = "")
  public List<AdsGetListStruct> getList() {
    return list;
  }

  public void setList(List<AdsGetListStruct> list) {
    this.list = list;
  }

  public AdsGetResponseData pageInfo(Conf pageInfo) {
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
    AdsGetResponseData adsGetResponseData = (AdsGetResponseData) o;
    return Objects.equals(this.list, adsGetResponseData.list) &&
        Objects.equals(this.pageInfo, adsGetResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list, pageInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsGetResponseData {\n");

    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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
