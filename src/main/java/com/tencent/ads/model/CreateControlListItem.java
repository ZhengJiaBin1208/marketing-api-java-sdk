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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** 表单项 */
@ApiModel(description = "表单项")
public class CreateControlListItem {
  @SerializedName("item_type")
  private ItemType itemType = null;

  @SerializedName("item_name")
  private String itemName = null;

  @SerializedName("placeholder")
  private String placeholder = null;

  @SerializedName("select_elements")
  private List<String> selectElements = null;

  public CreateControlListItem itemType(ItemType itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   *
   * @return itemType
   */
  @ApiModelProperty(value = "")
  public ItemType getItemType() {
    return itemType;
  }

  public void setItemType(ItemType itemType) {
    this.itemType = itemType;
  }

  public CreateControlListItem itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Get itemName
   *
   * @return itemName
   */
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public CreateControlListItem placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * Get placeholder
   *
   * @return placeholder
   */
  @ApiModelProperty(value = "")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public CreateControlListItem selectElements(List<String> selectElements) {
    this.selectElements = selectElements;
    return this;
  }

  public CreateControlListItem addSelectElementsItem(String selectElementsItem) {
    if (this.selectElements == null) {
      this.selectElements = new ArrayList<String>();
    }
    this.selectElements.add(selectElementsItem);
    return this;
  }

  /**
   * Get selectElements
   *
   * @return selectElements
   */
  @ApiModelProperty(value = "")
  public List<String> getSelectElements() {
    return selectElements;
  }

  public void setSelectElements(List<String> selectElements) {
    this.selectElements = selectElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateControlListItem createControlListItem = (CreateControlListItem) o;
    return Objects.equals(this.itemType, createControlListItem.itemType)
        && Objects.equals(this.itemName, createControlListItem.itemName)
        && Objects.equals(this.placeholder, createControlListItem.placeholder)
        && Objects.equals(this.selectElements, createControlListItem.selectElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, itemName, placeholder, selectElements);
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