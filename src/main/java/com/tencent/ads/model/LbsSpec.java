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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** LBS人群信息 */
@ApiModel(description = "LBS人群信息")
public class LbsSpec {
  @SerializedName("lbs_type")
  private LbsType lbsType = null;

  @SerializedName("cross_city_rule")
  private CrossCityRule crossCityRule = null;

  @SerializedName("poi_rule")
  private PoiRule poiRule = null;

  @SerializedName("custom_location_rule")
  private CustomLocationRule customLocationRule = null;

  public LbsSpec lbsType(LbsType lbsType) {
    this.lbsType = lbsType;
    return this;
  }

  /**
   * Get lbsType
   *
   * @return lbsType
   */
  @ApiModelProperty(value = "")
  public LbsType getLbsType() {
    return lbsType;
  }

  public void setLbsType(LbsType lbsType) {
    this.lbsType = lbsType;
  }

  public LbsSpec crossCityRule(CrossCityRule crossCityRule) {
    this.crossCityRule = crossCityRule;
    return this;
  }

  /**
   * Get crossCityRule
   *
   * @return crossCityRule
   */
  @ApiModelProperty(value = "")
  public CrossCityRule getCrossCityRule() {
    return crossCityRule;
  }

  public void setCrossCityRule(CrossCityRule crossCityRule) {
    this.crossCityRule = crossCityRule;
  }

  public LbsSpec poiRule(PoiRule poiRule) {
    this.poiRule = poiRule;
    return this;
  }

  /**
   * Get poiRule
   *
   * @return poiRule
   */
  @ApiModelProperty(value = "")
  public PoiRule getPoiRule() {
    return poiRule;
  }

  public void setPoiRule(PoiRule poiRule) {
    this.poiRule = poiRule;
  }

  public LbsSpec customLocationRule(CustomLocationRule customLocationRule) {
    this.customLocationRule = customLocationRule;
    return this;
  }

  /**
   * Get customLocationRule
   *
   * @return customLocationRule
   */
  @ApiModelProperty(value = "")
  public CustomLocationRule getCustomLocationRule() {
    return customLocationRule;
  }

  public void setCustomLocationRule(CustomLocationRule customLocationRule) {
    this.customLocationRule = customLocationRule;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LbsSpec lbsSpec = (LbsSpec) o;
    return Objects.equals(this.lbsType, lbsSpec.lbsType)
        && Objects.equals(this.crossCityRule, lbsSpec.crossCityRule)
        && Objects.equals(this.poiRule, lbsSpec.poiRule)
        && Objects.equals(this.customLocationRule, lbsSpec.customLocationRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lbsType, crossCityRule, poiRule, customLocationRule);
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
