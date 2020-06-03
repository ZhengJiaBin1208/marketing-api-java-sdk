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
 * 完整视频结构
 */
@ApiModel(description = "完整视频结构")

public class LongVideoStruct {

  @SerializedName("long_video1")
  private Long longVideo1 = null;

  @SerializedName("long_video2")
  private Long longVideo2 = null;

  public LongVideoStruct longVideo1(Long longVideo1) {
    this.longVideo1 = longVideo1;
    return this;
  }

  /**
   * Get longVideo1
   *
   * @return longVideo1
   **/
  @ApiModelProperty(value = "")
  public Long getLongVideo1() {
    return longVideo1;
  }

  public void setLongVideo1(Long longVideo1) {
    this.longVideo1 = longVideo1;
  }

  public LongVideoStruct longVideo2(Long longVideo2) {
    this.longVideo2 = longVideo2;
    return this;
  }

  /**
   * Get longVideo2
   *
   * @return longVideo2
   **/
  @ApiModelProperty(value = "")
  public Long getLongVideo2() {
    return longVideo2;
  }

  public void setLongVideo2(Long longVideo2) {
    this.longVideo2 = longVideo2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongVideoStruct longVideoStruct = (LongVideoStruct) o;
    return Objects.equals(this.longVideo1, longVideoStruct.longVideo1) &&
        Objects.equals(this.longVideo2, longVideoStruct.longVideo2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longVideo1, longVideo2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongVideoStruct {\n");

    sb.append("    longVideo1: ").append(toIndentedString(longVideo1)).append("\n");
    sb.append("    longVideo2: ").append(toIndentedString(longVideo2)).append("\n");
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
