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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CreativetoolsTextGetResponseData */
public class CreativetoolsTextGetResponseData {
  @SerializedName("return_number")
  private Long returnNumber = null;

  @SerializedName("return_texts")
  private List<TextListStruct> returnTexts = null;

  public CreativetoolsTextGetResponseData returnNumber(Long returnNumber) {
    this.returnNumber = returnNumber;
    return this;
  }

  /**
   * Get returnNumber
   *
   * @return returnNumber
   */
  @ApiModelProperty(value = "")
  public Long getReturnNumber() {
    return returnNumber;
  }

  public void setReturnNumber(Long returnNumber) {
    this.returnNumber = returnNumber;
  }

  public CreativetoolsTextGetResponseData returnTexts(List<TextListStruct> returnTexts) {
    this.returnTexts = returnTexts;
    return this;
  }

  public CreativetoolsTextGetResponseData addReturnTextsItem(TextListStruct returnTextsItem) {
    if (this.returnTexts == null) {
      this.returnTexts = new ArrayList<TextListStruct>();
    }
    this.returnTexts.add(returnTextsItem);
    return this;
  }

  /**
   * Get returnTexts
   *
   * @return returnTexts
   */
  @ApiModelProperty(value = "")
  public List<TextListStruct> getReturnTexts() {
    return returnTexts;
  }

  public void setReturnTexts(List<TextListStruct> returnTexts) {
    this.returnTexts = returnTexts;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativetoolsTextGetResponseData creativetoolsTextGetResponseData =
        (CreativetoolsTextGetResponseData) o;
    return Objects.equals(this.returnNumber, creativetoolsTextGetResponseData.returnNumber)
        && Objects.equals(this.returnTexts, creativetoolsTextGetResponseData.returnTexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnNumber, returnTexts);
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