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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ReportConversionsPredictRequest */
public class ReportConversionsPredictRequest {
  @SerializedName("filtering")
  private List<FilteringStruct> filtering = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public ReportConversionsPredictRequest filtering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
    return this;
  }

  public ReportConversionsPredictRequest addFilteringItem(FilteringStruct filteringItem) {
    if (this.filtering == null) {
      this.filtering = new ArrayList<FilteringStruct>();
    }
    this.filtering.add(filteringItem);
    return this;
  }

  /**
   * Get filtering
   *
   * @return filtering
   */
  @ApiModelProperty(value = "")
  public List<FilteringStruct> getFiltering() {
    return filtering;
  }

  public void setFiltering(List<FilteringStruct> filtering) {
    this.filtering = filtering;
  }

  public ReportConversionsPredictRequest accountId(Long accountId) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportConversionsPredictRequest reportConversionsPredictRequest =
        (ReportConversionsPredictRequest) o;
    return Objects.equals(this.filtering, reportConversionsPredictRequest.filtering)
        && Objects.equals(this.accountId, reportConversionsPredictRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filtering, accountId);
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
