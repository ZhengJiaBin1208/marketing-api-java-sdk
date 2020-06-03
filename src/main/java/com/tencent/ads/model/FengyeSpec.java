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
 * 枫叶信息
 */
@ApiModel(description = "枫叶信息")

public class FengyeSpec {

  @SerializedName("title")
  private String title = null;

  @SerializedName("fengye_id")
  private String fengyeId = null;

  public FengyeSpec title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   *
   * @return title
   **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FengyeSpec fengyeId(String fengyeId) {
    this.fengyeId = fengyeId;
    return this;
  }

  /**
   * Get fengyeId
   *
   * @return fengyeId
   **/
  @ApiModelProperty(value = "")
  public String getFengyeId() {
    return fengyeId;
  }

  public void setFengyeId(String fengyeId) {
    this.fengyeId = fengyeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FengyeSpec fengyeSpec = (FengyeSpec) o;
    return Objects.equals(this.title, fengyeSpec.title) &&
        Objects.equals(this.fengyeId, fengyeSpec.fengyeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, fengyeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FengyeSpec {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    fengyeId: ").append(toIndentedString(fengyeId)).append("\n");
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
