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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AdcreativesUpdateRequest
 */

public class AdcreativesUpdateRequest {

  @SerializedName("adcreative_id")
  private Long adcreativeId = null;

  @SerializedName("adcreative_name")
  private String adcreativeName = null;

  @SerializedName("page_type")
  private DestinationType pageType = null;

  @SerializedName("page_spec")
  private PageSpec pageSpec = null;

  @SerializedName("link_page_type")
  private LinkPageType linkPageType = null;

  @SerializedName("link_name_type")
  private LinkUrlLinkNameType linkNameType = null;

  @SerializedName("link_page_spec")
  private LinkPageSpec linkPageSpec = null;

  @SerializedName("qq_mini_game_tracking_query_string")
  private String qqMiniGameTrackingQueryString = null;

  @SerializedName("deep_link_url")
  private String deepLinkUrl = null;

  @SerializedName("universal_link_url")
  private String universalLinkUrl = null;

  @SerializedName("share_content_spec")
  private ShareContentSpec shareContentSpec = null;

  @SerializedName("multi_share_optimization_enabled")
  private Boolean multiShareOptimizationEnabled = null;

  @SerializedName("profile_id")
  private Long profileId = null;

  @SerializedName("component_id")
  private Long componentId = null;

  @SerializedName("online_enabled")
  private Boolean onlineEnabled = null;

  @SerializedName("revised_adcreative_spec")
  private RevisedAdcreativeSpec revisedAdcreativeSpec = null;

  @SerializedName("category")
  private List<Long> category = null;

  @SerializedName("label")
  private List<String> label = null;

  @SerializedName("union_market_switch")
  private Boolean unionMarketSwitch = null;

  @SerializedName("playable_page_material_id")
  private String playablePageMaterialId = null;

  @SerializedName("feeds_video_comment_switch")
  private Boolean feedsVideoCommentSwitch = null;

  @SerializedName("account_id")
  private Long accountId = null;

  @SerializedName("adcreative_elements")
  private AdcreativeCreativeElementsMp adcreativeElements = null;

  public AdcreativesUpdateRequest adcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
    return this;
  }

  /**
   * Get adcreativeId
   *
   * @return adcreativeId
   **/
  @ApiModelProperty(value = "")
  public Long getAdcreativeId() {
    return adcreativeId;
  }

  public void setAdcreativeId(Long adcreativeId) {
    this.adcreativeId = adcreativeId;
  }

  public AdcreativesUpdateRequest adcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
    return this;
  }

  /**
   * Get adcreativeName
   *
   * @return adcreativeName
   **/
  @ApiModelProperty(value = "")
  public String getAdcreativeName() {
    return adcreativeName;
  }

  public void setAdcreativeName(String adcreativeName) {
    this.adcreativeName = adcreativeName;
  }

  public AdcreativesUpdateRequest pageType(DestinationType pageType) {
    this.pageType = pageType;
    return this;
  }

  /**
   * Get pageType
   *
   * @return pageType
   **/
  @ApiModelProperty(value = "")
  public DestinationType getPageType() {
    return pageType;
  }

  public void setPageType(DestinationType pageType) {
    this.pageType = pageType;
  }

  public AdcreativesUpdateRequest pageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
    return this;
  }

  /**
   * Get pageSpec
   *
   * @return pageSpec
   **/
  @ApiModelProperty(value = "")
  public PageSpec getPageSpec() {
    return pageSpec;
  }

  public void setPageSpec(PageSpec pageSpec) {
    this.pageSpec = pageSpec;
  }

  public AdcreativesUpdateRequest linkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
    return this;
  }

  /**
   * Get linkPageType
   *
   * @return linkPageType
   **/
  @ApiModelProperty(value = "")
  public LinkPageType getLinkPageType() {
    return linkPageType;
  }

  public void setLinkPageType(LinkPageType linkPageType) {
    this.linkPageType = linkPageType;
  }

  public AdcreativesUpdateRequest linkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
    return this;
  }

  /**
   * Get linkNameType
   *
   * @return linkNameType
   **/
  @ApiModelProperty(value = "")
  public LinkUrlLinkNameType getLinkNameType() {
    return linkNameType;
  }

  public void setLinkNameType(LinkUrlLinkNameType linkNameType) {
    this.linkNameType = linkNameType;
  }

  public AdcreativesUpdateRequest linkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
    return this;
  }

  /**
   * Get linkPageSpec
   *
   * @return linkPageSpec
   **/
  @ApiModelProperty(value = "")
  public LinkPageSpec getLinkPageSpec() {
    return linkPageSpec;
  }

  public void setLinkPageSpec(LinkPageSpec linkPageSpec) {
    this.linkPageSpec = linkPageSpec;
  }

  public AdcreativesUpdateRequest qqMiniGameTrackingQueryString(
      String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
    return this;
  }

  /**
   * Get qqMiniGameTrackingQueryString
   *
   * @return qqMiniGameTrackingQueryString
   **/
  @ApiModelProperty(value = "")
  public String getQqMiniGameTrackingQueryString() {
    return qqMiniGameTrackingQueryString;
  }

  public void setQqMiniGameTrackingQueryString(String qqMiniGameTrackingQueryString) {
    this.qqMiniGameTrackingQueryString = qqMiniGameTrackingQueryString;
  }

  public AdcreativesUpdateRequest deepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
    return this;
  }

  /**
   * Get deepLinkUrl
   *
   * @return deepLinkUrl
   **/
  @ApiModelProperty(value = "")
  public String getDeepLinkUrl() {
    return deepLinkUrl;
  }

  public void setDeepLinkUrl(String deepLinkUrl) {
    this.deepLinkUrl = deepLinkUrl;
  }

  public AdcreativesUpdateRequest universalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
    return this;
  }

  /**
   * Get universalLinkUrl
   *
   * @return universalLinkUrl
   **/
  @ApiModelProperty(value = "")
  public String getUniversalLinkUrl() {
    return universalLinkUrl;
  }

  public void setUniversalLinkUrl(String universalLinkUrl) {
    this.universalLinkUrl = universalLinkUrl;
  }

  public AdcreativesUpdateRequest shareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
    return this;
  }

  /**
   * Get shareContentSpec
   *
   * @return shareContentSpec
   **/
  @ApiModelProperty(value = "")
  public ShareContentSpec getShareContentSpec() {
    return shareContentSpec;
  }

  public void setShareContentSpec(ShareContentSpec shareContentSpec) {
    this.shareContentSpec = shareContentSpec;
  }

  public AdcreativesUpdateRequest multiShareOptimizationEnabled(
      Boolean multiShareOptimizationEnabled) {
    this.multiShareOptimizationEnabled = multiShareOptimizationEnabled;
    return this;
  }

  /**
   * Get multiShareOptimizationEnabled
   *
   * @return multiShareOptimizationEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isMultiShareOptimizationEnabled() {
    return multiShareOptimizationEnabled;
  }

  public void setMultiShareOptimizationEnabled(Boolean multiShareOptimizationEnabled) {
    this.multiShareOptimizationEnabled = multiShareOptimizationEnabled;
  }

  public AdcreativesUpdateRequest profileId(Long profileId) {
    this.profileId = profileId;
    return this;
  }

  /**
   * Get profileId
   *
   * @return profileId
   **/
  @ApiModelProperty(value = "")
  public Long getProfileId() {
    return profileId;
  }

  public void setProfileId(Long profileId) {
    this.profileId = profileId;
  }

  public AdcreativesUpdateRequest componentId(Long componentId) {
    this.componentId = componentId;
    return this;
  }

  /**
   * Get componentId
   *
   * @return componentId
   **/
  @ApiModelProperty(value = "")
  public Long getComponentId() {
    return componentId;
  }

  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }

  public AdcreativesUpdateRequest onlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
    return this;
  }

  /**
   * Get onlineEnabled
   *
   * @return onlineEnabled
   **/
  @ApiModelProperty(value = "")
  public Boolean isOnlineEnabled() {
    return onlineEnabled;
  }

  public void setOnlineEnabled(Boolean onlineEnabled) {
    this.onlineEnabled = onlineEnabled;
  }

  public AdcreativesUpdateRequest revisedAdcreativeSpec(
      RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
    return this;
  }

  /**
   * Get revisedAdcreativeSpec
   *
   * @return revisedAdcreativeSpec
   **/
  @ApiModelProperty(value = "")
  public RevisedAdcreativeSpec getRevisedAdcreativeSpec() {
    return revisedAdcreativeSpec;
  }

  public void setRevisedAdcreativeSpec(RevisedAdcreativeSpec revisedAdcreativeSpec) {
    this.revisedAdcreativeSpec = revisedAdcreativeSpec;
  }

  public AdcreativesUpdateRequest category(List<Long> category) {
    this.category = category;
    return this;
  }

  public AdcreativesUpdateRequest addCategoryItem(Long categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<Long>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * Get category
   *
   * @return category
   **/
  @ApiModelProperty(value = "")
  public List<Long> getCategory() {
    return category;
  }

  public void setCategory(List<Long> category) {
    this.category = category;
  }

  public AdcreativesUpdateRequest label(List<String> label) {
    this.label = label;
    return this;
  }

  public AdcreativesUpdateRequest addLabelItem(String labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<String>();
    }
    this.label.add(labelItem);
    return this;
  }

  /**
   * Get label
   *
   * @return label
   **/
  @ApiModelProperty(value = "")
  public List<String> getLabel() {
    return label;
  }

  public void setLabel(List<String> label) {
    this.label = label;
  }

  public AdcreativesUpdateRequest unionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
    return this;
  }

  /**
   * Get unionMarketSwitch
   *
   * @return unionMarketSwitch
   **/
  @ApiModelProperty(value = "")
  public Boolean isUnionMarketSwitch() {
    return unionMarketSwitch;
  }

  public void setUnionMarketSwitch(Boolean unionMarketSwitch) {
    this.unionMarketSwitch = unionMarketSwitch;
  }

  public AdcreativesUpdateRequest playablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
    return this;
  }

  /**
   * Get playablePageMaterialId
   *
   * @return playablePageMaterialId
   **/
  @ApiModelProperty(value = "")
  public String getPlayablePageMaterialId() {
    return playablePageMaterialId;
  }

  public void setPlayablePageMaterialId(String playablePageMaterialId) {
    this.playablePageMaterialId = playablePageMaterialId;
  }

  public AdcreativesUpdateRequest feedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
    return this;
  }

  /**
   * Get feedsVideoCommentSwitch
   *
   * @return feedsVideoCommentSwitch
   **/
  @ApiModelProperty(value = "")
  public Boolean isFeedsVideoCommentSwitch() {
    return feedsVideoCommentSwitch;
  }

  public void setFeedsVideoCommentSwitch(Boolean feedsVideoCommentSwitch) {
    this.feedsVideoCommentSwitch = feedsVideoCommentSwitch;
  }

  public AdcreativesUpdateRequest accountId(Long accountId) {
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

  public AdcreativesUpdateRequest adcreativeElements(
      AdcreativeCreativeElementsMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
    return this;
  }

  /**
   * Get adcreativeElements
   *
   * @return adcreativeElements
   **/
  @ApiModelProperty(value = "")
  public AdcreativeCreativeElementsMp getAdcreativeElements() {
    return adcreativeElements;
  }

  public void setAdcreativeElements(AdcreativeCreativeElementsMp adcreativeElements) {
    this.adcreativeElements = adcreativeElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdcreativesUpdateRequest adcreativesUpdateRequest = (AdcreativesUpdateRequest) o;
    return Objects.equals(this.adcreativeId, adcreativesUpdateRequest.adcreativeId) &&
        Objects.equals(this.adcreativeName, adcreativesUpdateRequest.adcreativeName) &&
        Objects.equals(this.pageType, adcreativesUpdateRequest.pageType) &&
        Objects.equals(this.pageSpec, adcreativesUpdateRequest.pageSpec) &&
        Objects.equals(this.linkPageType, adcreativesUpdateRequest.linkPageType) &&
        Objects.equals(this.linkNameType, adcreativesUpdateRequest.linkNameType) &&
        Objects.equals(this.linkPageSpec, adcreativesUpdateRequest.linkPageSpec) &&
        Objects.equals(this.qqMiniGameTrackingQueryString,
            adcreativesUpdateRequest.qqMiniGameTrackingQueryString) &&
        Objects.equals(this.deepLinkUrl, adcreativesUpdateRequest.deepLinkUrl) &&
        Objects.equals(this.universalLinkUrl, adcreativesUpdateRequest.universalLinkUrl) &&
        Objects.equals(this.shareContentSpec, adcreativesUpdateRequest.shareContentSpec) &&
        Objects.equals(this.multiShareOptimizationEnabled,
            adcreativesUpdateRequest.multiShareOptimizationEnabled) &&
        Objects.equals(this.profileId, adcreativesUpdateRequest.profileId) &&
        Objects.equals(this.componentId, adcreativesUpdateRequest.componentId) &&
        Objects.equals(this.onlineEnabled, adcreativesUpdateRequest.onlineEnabled) &&
        Objects.equals(this.revisedAdcreativeSpec, adcreativesUpdateRequest.revisedAdcreativeSpec)
        &&
        Objects.equals(this.category, adcreativesUpdateRequest.category) &&
        Objects.equals(this.label, adcreativesUpdateRequest.label) &&
        Objects.equals(this.unionMarketSwitch, adcreativesUpdateRequest.unionMarketSwitch) &&
        Objects.equals(this.playablePageMaterialId, adcreativesUpdateRequest.playablePageMaterialId)
        &&
        Objects
            .equals(this.feedsVideoCommentSwitch, adcreativesUpdateRequest.feedsVideoCommentSwitch)
        &&
        Objects.equals(this.accountId, adcreativesUpdateRequest.accountId) &&
        Objects.equals(this.adcreativeElements, adcreativesUpdateRequest.adcreativeElements);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(adcreativeId, adcreativeName, pageType, pageSpec, linkPageType, linkNameType,
            linkPageSpec, qqMiniGameTrackingQueryString, deepLinkUrl, universalLinkUrl,
            shareContentSpec, multiShareOptimizationEnabled, profileId, componentId, onlineEnabled,
            revisedAdcreativeSpec, category, label, unionMarketSwitch, playablePageMaterialId,
            feedsVideoCommentSwitch, accountId, adcreativeElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdcreativesUpdateRequest {\n");

    sb.append("    adcreativeId: ").append(toIndentedString(adcreativeId)).append("\n");
    sb.append("    adcreativeName: ").append(toIndentedString(adcreativeName)).append("\n");
    sb.append("    pageType: ").append(toIndentedString(pageType)).append("\n");
    sb.append("    pageSpec: ").append(toIndentedString(pageSpec)).append("\n");
    sb.append("    linkPageType: ").append(toIndentedString(linkPageType)).append("\n");
    sb.append("    linkNameType: ").append(toIndentedString(linkNameType)).append("\n");
    sb.append("    linkPageSpec: ").append(toIndentedString(linkPageSpec)).append("\n");
    sb.append("    qqMiniGameTrackingQueryString: ")
        .append(toIndentedString(qqMiniGameTrackingQueryString)).append("\n");
    sb.append("    deepLinkUrl: ").append(toIndentedString(deepLinkUrl)).append("\n");
    sb.append("    universalLinkUrl: ").append(toIndentedString(universalLinkUrl)).append("\n");
    sb.append("    shareContentSpec: ").append(toIndentedString(shareContentSpec)).append("\n");
    sb.append("    multiShareOptimizationEnabled: ")
        .append(toIndentedString(multiShareOptimizationEnabled)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    onlineEnabled: ").append(toIndentedString(onlineEnabled)).append("\n");
    sb.append("    revisedAdcreativeSpec: ").append(toIndentedString(revisedAdcreativeSpec))
        .append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    unionMarketSwitch: ").append(toIndentedString(unionMarketSwitch)).append("\n");
    sb.append("    playablePageMaterialId: ").append(toIndentedString(playablePageMaterialId))
        .append("\n");
    sb.append("    feedsVideoCommentSwitch: ").append(toIndentedString(feedsVideoCommentSwitch))
        .append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    adcreativeElements: ").append(toIndentedString(adcreativeElements)).append("\n");
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
