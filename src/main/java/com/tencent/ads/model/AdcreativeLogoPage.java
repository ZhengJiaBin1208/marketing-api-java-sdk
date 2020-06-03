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
 * logo页
 */
@ApiModel(description = "logo页")

public class AdcreativeLogoPage {

  @SerializedName("image")
  private Long image = null;

  public AdcreativeLogoPage image(Long image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   **/
  @ApiModelProperty(value = "")
  public Long getImage() {
    return image;
  }

  public void setImage(Long image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativeLogoPage adcreativeLogoPage = (AdcreativeLogoPage) o;
    return Objects.equals(this.image, adcreativeLogoPage.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreativeLogoPage {\n");

    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
