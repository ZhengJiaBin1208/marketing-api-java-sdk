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
 * 推广目标详细信息
 */
@ApiModel(description = "推广目标详细信息")

public class PromotedObjectSpec {

  @SerializedName("jd_item")
  private EcInfo jdItem = null;

  @SerializedName("jd_shop")
  private EcInfo jdShop = null;

  @SerializedName("dianping_shop")
  private ProductTypeDianpingShop dianpingShop = null;

  public PromotedObjectSpec jdItem(EcInfo jdItem) {
    this.jdItem = jdItem;
    return this;
  }

  /**
   * Get jdItem
   *
   * @return jdItem
   **/
  @ApiModelProperty(value = "")
  public EcInfo getJdItem() {
    return jdItem;
  }

  public void setJdItem(EcInfo jdItem) {
    this.jdItem = jdItem;
  }

  public PromotedObjectSpec jdShop(EcInfo jdShop) {
    this.jdShop = jdShop;
    return this;
  }

  /**
   * Get jdShop
   *
   * @return jdShop
   **/
  @ApiModelProperty(value = "")
  public EcInfo getJdShop() {
    return jdShop;
  }

  public void setJdShop(EcInfo jdShop) {
    this.jdShop = jdShop;
  }

  public PromotedObjectSpec dianpingShop(ProductTypeDianpingShop dianpingShop) {
    this.dianpingShop = dianpingShop;
    return this;
  }

  /**
   * Get dianpingShop
   *
   * @return dianpingShop
   **/
  @ApiModelProperty(value = "")
  public ProductTypeDianpingShop getDianpingShop() {
    return dianpingShop;
  }

  public void setDianpingShop(ProductTypeDianpingShop dianpingShop) {
    this.dianpingShop = dianpingShop;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotedObjectSpec promotedObjectSpec = (PromotedObjectSpec) o;
    return Objects.equals(this.jdItem, promotedObjectSpec.jdItem) &&
        Objects.equals(this.jdShop, promotedObjectSpec.jdShop) &&
        Objects.equals(this.dianpingShop, promotedObjectSpec.dianpingShop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jdItem, jdShop, dianpingShop);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotedObjectSpec {\n");

    sb.append("    jdItem: ").append(toIndentedString(jdItem)).append("\n");
    sb.append("    jdShop: ").append(toIndentedString(jdShop)).append("\n");
    sb.append("    dianpingShop: ").append(toIndentedString(dianpingShop)).append("\n");
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
