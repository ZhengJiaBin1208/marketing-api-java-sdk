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
import java.util.Objects;

/** 调整时长 */
@ApiModel(description = "调整时长")
public class LengthAdjustment {
  @SerializedName("target_length")
  private Long targetLength = null;

  @SerializedName("length_adjustment_method")
  private LengthAdjustmentMethod lengthAdjustmentMethod = null;

  public LengthAdjustment targetLength(Long targetLength) {
    this.targetLength = targetLength;
    return this;
  }

  /**
   * Get targetLength
   *
   * @return targetLength
   */
  @ApiModelProperty(value = "")
  public Long getTargetLength() {
    return targetLength;
  }

  public void setTargetLength(Long targetLength) {
    this.targetLength = targetLength;
  }

  public LengthAdjustment lengthAdjustmentMethod(LengthAdjustmentMethod lengthAdjustmentMethod) {
    this.lengthAdjustmentMethod = lengthAdjustmentMethod;
    return this;
  }

  /**
   * Get lengthAdjustmentMethod
   *
   * @return lengthAdjustmentMethod
   */
  @ApiModelProperty(value = "")
  public LengthAdjustmentMethod getLengthAdjustmentMethod() {
    return lengthAdjustmentMethod;
  }

  public void setLengthAdjustmentMethod(LengthAdjustmentMethod lengthAdjustmentMethod) {
    this.lengthAdjustmentMethod = lengthAdjustmentMethod;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LengthAdjustment lengthAdjustment = (LengthAdjustment) o;
    return Objects.equals(this.targetLength, lengthAdjustment.targetLength)
        && Objects.equals(this.lengthAdjustmentMethod, lengthAdjustment.lengthAdjustmentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetLength, lengthAdjustmentMethod);
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
