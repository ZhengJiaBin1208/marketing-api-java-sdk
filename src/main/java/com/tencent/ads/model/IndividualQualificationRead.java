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
 * 个人身份证明
 */
@ApiModel(description = "个人身份证明")

public class IndividualQualificationRead {

  @SerializedName("identification_front_image_id")
  private String identificationFrontImageId = null;

  @SerializedName("identification_back_image_id")
  private String identificationBackImageId = null;

  public IndividualQualificationRead identificationFrontImageId(String identificationFrontImageId) {
    this.identificationFrontImageId = identificationFrontImageId;
    return this;
  }

  /**
   * Get identificationFrontImageId
   *
   * @return identificationFrontImageId
   **/
  @ApiModelProperty(value = "")
  public String getIdentificationFrontImageId() {
    return identificationFrontImageId;
  }

  public void setIdentificationFrontImageId(String identificationFrontImageId) {
    this.identificationFrontImageId = identificationFrontImageId;
  }

  public IndividualQualificationRead identificationBackImageId(String identificationBackImageId) {
    this.identificationBackImageId = identificationBackImageId;
    return this;
  }

  /**
   * Get identificationBackImageId
   *
   * @return identificationBackImageId
   **/
  @ApiModelProperty(value = "")
  public String getIdentificationBackImageId() {
    return identificationBackImageId;
  }

  public void setIdentificationBackImageId(String identificationBackImageId) {
    this.identificationBackImageId = identificationBackImageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndividualQualificationRead individualQualificationRead = (IndividualQualificationRead) o;
    return Objects.equals(this.identificationFrontImageId,
        individualQualificationRead.identificationFrontImageId) &&
        Objects.equals(this.identificationBackImageId,
            individualQualificationRead.identificationBackImageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationFrontImageId, identificationBackImageId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndividualQualificationRead {\n");

    sb.append("    identificationFrontImageId: ")
        .append(toIndentedString(identificationFrontImageId)).append("\n");
    sb.append("    identificationBackImageId: ").append(toIndentedString(identificationBackImageId))
        .append("\n");
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
