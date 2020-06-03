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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 视频需满足的限制条件，仅当element_type是ELEMENT_TYPE_VIDEO时返回
 */
@ApiModel(description = "视频需满足的限制条件，仅当element_type是ELEMENT_TYPE_VIDEO时返回")

public class VideoRestriction {

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("min_width")
  private Long minWidth = null;

  @SerializedName("min_height")
  private Long minHeight = null;

  @SerializedName("ratio_width")
  private Long ratioWidth = null;

  @SerializedName("ratio_height")
  private Long ratioHeight = null;

  @SerializedName("file_size")
  private Long fileSize = null;

  @SerializedName("file_format")
  private List<String> fileFormat = null;

  @SerializedName("min_duration")
  private Long minDuration = null;

  @SerializedName("max_duration")
  private Long maxDuration = null;

  public VideoRestriction width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   *
   * @return width
   **/
  @ApiModelProperty(value = "")
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
  }

  public VideoRestriction height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   *
   * @return height
   **/
  @ApiModelProperty(value = "")
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public VideoRestriction minWidth(Long minWidth) {
    this.minWidth = minWidth;
    return this;
  }

  /**
   * Get minWidth
   *
   * @return minWidth
   **/
  @ApiModelProperty(value = "")
  public Long getMinWidth() {
    return minWidth;
  }

  public void setMinWidth(Long minWidth) {
    this.minWidth = minWidth;
  }

  public VideoRestriction minHeight(Long minHeight) {
    this.minHeight = minHeight;
    return this;
  }

  /**
   * Get minHeight
   *
   * @return minHeight
   **/
  @ApiModelProperty(value = "")
  public Long getMinHeight() {
    return minHeight;
  }

  public void setMinHeight(Long minHeight) {
    this.minHeight = minHeight;
  }

  public VideoRestriction ratioWidth(Long ratioWidth) {
    this.ratioWidth = ratioWidth;
    return this;
  }

  /**
   * Get ratioWidth
   *
   * @return ratioWidth
   **/
  @ApiModelProperty(value = "")
  public Long getRatioWidth() {
    return ratioWidth;
  }

  public void setRatioWidth(Long ratioWidth) {
    this.ratioWidth = ratioWidth;
  }

  public VideoRestriction ratioHeight(Long ratioHeight) {
    this.ratioHeight = ratioHeight;
    return this;
  }

  /**
   * Get ratioHeight
   *
   * @return ratioHeight
   **/
  @ApiModelProperty(value = "")
  public Long getRatioHeight() {
    return ratioHeight;
  }

  public void setRatioHeight(Long ratioHeight) {
    this.ratioHeight = ratioHeight;
  }

  public VideoRestriction fileSize(Long fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   *
   * @return fileSize
   **/
  @ApiModelProperty(value = "")
  public Long getFileSize() {
    return fileSize;
  }

  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }

  public VideoRestriction fileFormat(List<String> fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  public VideoRestriction addFileFormatItem(String fileFormatItem) {
    if (this.fileFormat == null) {
      this.fileFormat = new ArrayList<String>();
    }
    this.fileFormat.add(fileFormatItem);
    return this;
  }

  /**
   * Get fileFormat
   *
   * @return fileFormat
   **/
  @ApiModelProperty(value = "")
  public List<String> getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(List<String> fileFormat) {
    this.fileFormat = fileFormat;
  }

  public VideoRestriction minDuration(Long minDuration) {
    this.minDuration = minDuration;
    return this;
  }

  /**
   * Get minDuration
   *
   * @return minDuration
   **/
  @ApiModelProperty(value = "")
  public Long getMinDuration() {
    return minDuration;
  }

  public void setMinDuration(Long minDuration) {
    this.minDuration = minDuration;
  }

  public VideoRestriction maxDuration(Long maxDuration) {
    this.maxDuration = maxDuration;
    return this;
  }

  /**
   * Get maxDuration
   *
   * @return maxDuration
   **/
  @ApiModelProperty(value = "")
  public Long getMaxDuration() {
    return maxDuration;
  }

  public void setMaxDuration(Long maxDuration) {
    this.maxDuration = maxDuration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoRestriction videoRestriction = (VideoRestriction) o;
    return Objects.equals(this.width, videoRestriction.width) &&
        Objects.equals(this.height, videoRestriction.height) &&
        Objects.equals(this.minWidth, videoRestriction.minWidth) &&
        Objects.equals(this.minHeight, videoRestriction.minHeight) &&
        Objects.equals(this.ratioWidth, videoRestriction.ratioWidth) &&
        Objects.equals(this.ratioHeight, videoRestriction.ratioHeight) &&
        Objects.equals(this.fileSize, videoRestriction.fileSize) &&
        Objects.equals(this.fileFormat, videoRestriction.fileFormat) &&
        Objects.equals(this.minDuration, videoRestriction.minDuration) &&
        Objects.equals(this.maxDuration, videoRestriction.maxDuration);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(width, height, minWidth, minHeight, ratioWidth, ratioHeight, fileSize, fileFormat,
            minDuration, maxDuration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoRestriction {\n");

    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
    sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
    sb.append("    ratioWidth: ").append(toIndentedString(ratioWidth)).append("\n");
    sb.append("    ratioHeight: ").append(toIndentedString(ratioHeight)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    minDuration: ").append(toIndentedString(minDuration)).append("\n");
    sb.append("    maxDuration: ").append(toIndentedString(maxDuration)).append("\n");
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
