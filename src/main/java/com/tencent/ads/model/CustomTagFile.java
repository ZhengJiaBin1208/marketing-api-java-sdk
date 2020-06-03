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
 * custom_tag_file返回结构
 */
@ApiModel(description = "custom_tag_file返回结构")

public class CustomTagFile {

  @SerializedName("tag_id")
  private Long tagId = null;

  @SerializedName("custom_tag_file_id")
  private Long customTagFileId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("user_id_type")
  private UserIdType userIdType = null;

  @SerializedName("operation_type")
  private OperationType operationType = null;

  @SerializedName("open_app_id")
  private String openAppId = null;

  @SerializedName("process_status")
  private FileProcessStatus processStatus = null;

  @SerializedName("process_code")
  private Long processCode = null;

  @SerializedName("error_message")
  private String errorMessage = null;

  @SerializedName("line_count")
  private Long lineCount = null;

  @SerializedName("valid_line_count")
  private Long validLineCount = null;

  @SerializedName("user_count")
  private Long userCount = null;

  @SerializedName("created_time")
  private String createdTime = null;

  public CustomTagFile tagId(Long tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Get tagId
   *
   * @return tagId
   **/
  @ApiModelProperty(value = "")
  public Long getTagId() {
    return tagId;
  }

  public void setTagId(Long tagId) {
    this.tagId = tagId;
  }

  public CustomTagFile customTagFileId(Long customTagFileId) {
    this.customTagFileId = customTagFileId;
    return this;
  }

  /**
   * Get customTagFileId
   *
   * @return customTagFileId
   **/
  @ApiModelProperty(value = "")
  public Long getCustomTagFileId() {
    return customTagFileId;
  }

  public void setCustomTagFileId(Long customTagFileId) {
    this.customTagFileId = customTagFileId;
  }

  public CustomTagFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomTagFile userIdType(UserIdType userIdType) {
    this.userIdType = userIdType;
    return this;
  }

  /**
   * Get userIdType
   *
   * @return userIdType
   **/
  @ApiModelProperty(value = "")
  public UserIdType getUserIdType() {
    return userIdType;
  }

  public void setUserIdType(UserIdType userIdType) {
    this.userIdType = userIdType;
  }

  public CustomTagFile operationType(OperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Get operationType
   *
   * @return operationType
   **/
  @ApiModelProperty(value = "")
  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public CustomTagFile openAppId(String openAppId) {
    this.openAppId = openAppId;
    return this;
  }

  /**
   * Get openAppId
   *
   * @return openAppId
   **/
  @ApiModelProperty(value = "")
  public String getOpenAppId() {
    return openAppId;
  }

  public void setOpenAppId(String openAppId) {
    this.openAppId = openAppId;
  }

  public CustomTagFile processStatus(FileProcessStatus processStatus) {
    this.processStatus = processStatus;
    return this;
  }

  /**
   * Get processStatus
   *
   * @return processStatus
   **/
  @ApiModelProperty(value = "")
  public FileProcessStatus getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(FileProcessStatus processStatus) {
    this.processStatus = processStatus;
  }

  public CustomTagFile processCode(Long processCode) {
    this.processCode = processCode;
    return this;
  }

  /**
   * Get processCode
   *
   * @return processCode
   **/
  @ApiModelProperty(value = "")
  public Long getProcessCode() {
    return processCode;
  }

  public void setProcessCode(Long processCode) {
    this.processCode = processCode;
  }

  public CustomTagFile errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   *
   * @return errorMessage
   **/
  @ApiModelProperty(value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public CustomTagFile lineCount(Long lineCount) {
    this.lineCount = lineCount;
    return this;
  }

  /**
   * Get lineCount
   *
   * @return lineCount
   **/
  @ApiModelProperty(value = "")
  public Long getLineCount() {
    return lineCount;
  }

  public void setLineCount(Long lineCount) {
    this.lineCount = lineCount;
  }

  public CustomTagFile validLineCount(Long validLineCount) {
    this.validLineCount = validLineCount;
    return this;
  }

  /**
   * Get validLineCount
   *
   * @return validLineCount
   **/
  @ApiModelProperty(value = "")
  public Long getValidLineCount() {
    return validLineCount;
  }

  public void setValidLineCount(Long validLineCount) {
    this.validLineCount = validLineCount;
  }

  public CustomTagFile userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * Get userCount
   *
   * @return userCount
   **/
  @ApiModelProperty(value = "")
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
  }

  public CustomTagFile createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   **/
  @ApiModelProperty(value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTagFile customTagFile = (CustomTagFile) o;
    return Objects.equals(this.tagId, customTagFile.tagId) &&
        Objects.equals(this.customTagFileId, customTagFile.customTagFileId) &&
        Objects.equals(this.name, customTagFile.name) &&
        Objects.equals(this.userIdType, customTagFile.userIdType) &&
        Objects.equals(this.operationType, customTagFile.operationType) &&
        Objects.equals(this.openAppId, customTagFile.openAppId) &&
        Objects.equals(this.processStatus, customTagFile.processStatus) &&
        Objects.equals(this.processCode, customTagFile.processCode) &&
        Objects.equals(this.errorMessage, customTagFile.errorMessage) &&
        Objects.equals(this.lineCount, customTagFile.lineCount) &&
        Objects.equals(this.validLineCount, customTagFile.validLineCount) &&
        Objects.equals(this.userCount, customTagFile.userCount) &&
        Objects.equals(this.createdTime, customTagFile.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(tagId, customTagFileId, name, userIdType, operationType, openAppId, processStatus,
            processCode, errorMessage, lineCount, validLineCount, userCount, createdTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTagFile {\n");

    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    customTagFileId: ").append(toIndentedString(customTagFileId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userIdType: ").append(toIndentedString(userIdType)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    openAppId: ").append(toIndentedString(openAppId)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
    sb.append("    processCode: ").append(toIndentedString(processCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    lineCount: ").append(toIndentedString(lineCount)).append("\n");
    sb.append("    validLineCount: ").append(toIndentedString(validLineCount)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
