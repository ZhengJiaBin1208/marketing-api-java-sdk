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
import java.util.Objects;

/** VideomakerTasksGetResponseData */
public class VideomakerTasksGetResponseData {
  @SerializedName("code")
  private Long code = null;

  @SerializedName("task_id")
  private String taskId = null;

  @SerializedName("status")
  private Status status = null;

  @SerializedName("video_id")
  private String videoId = null;

  @SerializedName("other_data")
  private OtherData otherData = null;

  public VideomakerTasksGetResponseData code(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   *
   * @return code
   */
  @ApiModelProperty(value = "")
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public VideomakerTasksGetResponseData taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   *
   * @return taskId
   */
  @ApiModelProperty(value = "")
  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public VideomakerTasksGetResponseData status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @ApiModelProperty(value = "")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public VideomakerTasksGetResponseData videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * Get videoId
   *
   * @return videoId
   */
  @ApiModelProperty(value = "")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public VideomakerTasksGetResponseData otherData(OtherData otherData) {
    this.otherData = otherData;
    return this;
  }

  /**
   * Get otherData
   *
   * @return otherData
   */
  @ApiModelProperty(value = "")
  public OtherData getOtherData() {
    return otherData;
  }

  public void setOtherData(OtherData otherData) {
    this.otherData = otherData;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideomakerTasksGetResponseData videomakerTasksGetResponseData =
        (VideomakerTasksGetResponseData) o;
    return Objects.equals(this.code, videomakerTasksGetResponseData.code)
        && Objects.equals(this.taskId, videomakerTasksGetResponseData.taskId)
        && Objects.equals(this.status, videomakerTasksGetResponseData.status)
        && Objects.equals(this.videoId, videomakerTasksGetResponseData.videoId)
        && Objects.equals(this.otherData, videomakerTasksGetResponseData.otherData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, taskId, status, videoId, otherData);
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
