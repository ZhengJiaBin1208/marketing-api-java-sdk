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
 * QualificationsAddRequest
 */

public class QualificationsAddRequest {

  @SerializedName("qualification_type")
  private QualificationType qualificationType = null;

  @SerializedName("qualification_spec")
  private QualificationSpec qualificationSpec = null;

  @SerializedName("account_id")
  private Long accountId = null;

  public QualificationsAddRequest qualificationType(QualificationType qualificationType) {
    this.qualificationType = qualificationType;
    return this;
  }

  /**
   * Get qualificationType
   *
   * @return qualificationType
   **/
  @ApiModelProperty(value = "")
  public QualificationType getQualificationType() {
    return qualificationType;
  }

  public void setQualificationType(QualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }

  public QualificationsAddRequest qualificationSpec(QualificationSpec qualificationSpec) {
    this.qualificationSpec = qualificationSpec;
    return this;
  }

  /**
   * Get qualificationSpec
   *
   * @return qualificationSpec
   **/
  @ApiModelProperty(value = "")
  public QualificationSpec getQualificationSpec() {
    return qualificationSpec;
  }

  public void setQualificationSpec(QualificationSpec qualificationSpec) {
    this.qualificationSpec = qualificationSpec;
  }

  public QualificationsAddRequest accountId(Long accountId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualificationsAddRequest qualificationsAddRequest = (QualificationsAddRequest) o;
    return Objects.equals(this.qualificationType, qualificationsAddRequest.qualificationType) &&
        Objects.equals(this.qualificationSpec, qualificationsAddRequest.qualificationSpec) &&
        Objects.equals(this.accountId, qualificationsAddRequest.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualificationType, qualificationSpec, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationsAddRequest {\n");

    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    qualificationSpec: ").append(toIndentedString(qualificationSpec)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
