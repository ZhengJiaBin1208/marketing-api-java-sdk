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
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Objects;

/**
 * 注意，该结构为二维数组，外层数组中的每个元素为imgae_list，内层数组中的元素为image，示例：image_list_options:[[image1_1,
 * image1_2],[image2_1, image2_2]]
 */
@ApiModel(
    description =
        "注意，该结构为二维数组，外层数组中的每个元素为imgae_list，内层数组中的元素为image，示例：image_list_options:[[image1_1, image1_2],[image2_1, image2_2]]")
public class ImageListOptions extends ArrayList<AdcreativeImageList> {

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
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
