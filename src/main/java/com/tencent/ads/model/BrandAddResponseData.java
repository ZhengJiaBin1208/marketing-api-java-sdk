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
 * BrandAddResponseData
 */

public class BrandAddResponseData {

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("image_id")
  private String imageId = null;

  @SerializedName("width")
  private Long width = null;

  @SerializedName("height")
  private Long height = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("created_time")
  private Long createdTime = null;

  public BrandAddResponseData accountId(Long accountId) {
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

  public BrandAddResponseData name(String name) {
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

  public BrandAddResponseData imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }

  /**
   * Get imageId
   *
   * @return imageId
   **/
  @ApiModelProperty(value = "")
  public String getImageId() {
    return imageId;
  }

  public void setImageId(String imageId) {
    this.imageId = imageId;
  }

  public BrandAddResponseData width(Long width) {
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

  public BrandAddResponseData height(Long height) {
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

  public BrandAddResponseData imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   *
   * @return imageUrl
   **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public BrandAddResponseData createdTime(Long createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Get createdTime
   *
   * @return createdTime
   **/
  @ApiModelProperty(value = "")
  public Long getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Long createdTime) {
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
    BrandAddResponseData brandAddResponseData = (BrandAddResponseData) o;
    return Objects.equals(this.accountId, brandAddResponseData.accountId) &&
        Objects.equals(this.name, brandAddResponseData.name) &&
        Objects.equals(this.imageId, brandAddResponseData.imageId) &&
        Objects.equals(this.width, brandAddResponseData.width) &&
        Objects.equals(this.height, brandAddResponseData.height) &&
        Objects.equals(this.imageUrl, brandAddResponseData.imageUrl) &&
        Objects.equals(this.createdTime, brandAddResponseData.createdTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, name, imageId, width, height, imageUrl, createdTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAddResponseData {\n");

    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
