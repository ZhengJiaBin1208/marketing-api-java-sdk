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
 * QualificationsUpdateResponseData
 */

public class QualificationsUpdateResponseData {

  @SerializedName("qualification_id")
  private Long qualificationId = null;

  public QualificationsUpdateResponseData qualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
    return this;
  }

  /**
   * Get qualificationId
   *
   * @return qualificationId
   **/
  @ApiModelProperty(value = "")
  public Long getQualificationId() {
    return qualificationId;
  }

  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsUpdateResponseData qualificationsUpdateResponseData = (QualificationsUpdateResponseData) o;
    return Objects.equals(this.qualificationId, qualificationsUpdateResponseData.qualificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualificationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationsUpdateResponseData {\n");

    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
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
