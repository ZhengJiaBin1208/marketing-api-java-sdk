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
 * 竞争力明细
 */
@ApiModel(description = "竞争力明细")

public class DetailCompeteDetailStruct {

  @SerializedName("score")
  private Long score = null;

  @SerializedName("compete_attribution")
  private List<CompeteAttributionStruct> competeAttribution = null;

  @SerializedName("compete_budget_details")
  private CompeteBudgetDetailsStruct competeBudgetDetails = null;

  @SerializedName("compete_bid_details")
  private CompeteBidDetailsStruct competeBidDetails = null;

  @SerializedName("compete_user_acceptance")
  private CompeteUserAcceptanceStruct competeUserAcceptance = null;

  @SerializedName("compete_pctr_trends")
  private CompetePctrPcvrTrendsStruct competePctrTrends = null;

  @SerializedName("compete_pcvr_trends")
  private CompetePctrPcvrTrendsStruct competePcvrTrends = null;

  @SerializedName("compete_win_adgroup")
  private CompeteWinAdgroupStruct competeWinAdgroup = null;

  @SerializedName("compete_surroundings")
  private CompeteSurroundingsStruct competeSurroundings = null;

  public DetailCompeteDetailStruct score(Long score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   *
   * @return score
   **/
  @ApiModelProperty(value = "")
  public Long getScore() {
    return score;
  }

  public void setScore(Long score) {
    this.score = score;
  }

  public DetailCompeteDetailStruct competeAttribution(
      List<CompeteAttributionStruct> competeAttribution) {
    this.competeAttribution = competeAttribution;
    return this;
  }

  public DetailCompeteDetailStruct addCompeteAttributionItem(
      CompeteAttributionStruct competeAttributionItem) {
    if (this.competeAttribution == null) {
      this.competeAttribution = new ArrayList<CompeteAttributionStruct>();
    }
    this.competeAttribution.add(competeAttributionItem);
    return this;
  }

  /**
   * Get competeAttribution
   *
   * @return competeAttribution
   **/
  @ApiModelProperty(value = "")
  public List<CompeteAttributionStruct> getCompeteAttribution() {
    return competeAttribution;
  }

  public void setCompeteAttribution(List<CompeteAttributionStruct> competeAttribution) {
    this.competeAttribution = competeAttribution;
  }

  public DetailCompeteDetailStruct competeBudgetDetails(
      CompeteBudgetDetailsStruct competeBudgetDetails) {
    this.competeBudgetDetails = competeBudgetDetails;
    return this;
  }

  /**
   * Get competeBudgetDetails
   *
   * @return competeBudgetDetails
   **/
  @ApiModelProperty(value = "")
  public CompeteBudgetDetailsStruct getCompeteBudgetDetails() {
    return competeBudgetDetails;
  }

  public void setCompeteBudgetDetails(CompeteBudgetDetailsStruct competeBudgetDetails) {
    this.competeBudgetDetails = competeBudgetDetails;
  }

  public DetailCompeteDetailStruct competeBidDetails(CompeteBidDetailsStruct competeBidDetails) {
    this.competeBidDetails = competeBidDetails;
    return this;
  }

  /**
   * Get competeBidDetails
   *
   * @return competeBidDetails
   **/
  @ApiModelProperty(value = "")
  public CompeteBidDetailsStruct getCompeteBidDetails() {
    return competeBidDetails;
  }

  public void setCompeteBidDetails(CompeteBidDetailsStruct competeBidDetails) {
    this.competeBidDetails = competeBidDetails;
  }

  public DetailCompeteDetailStruct competeUserAcceptance(
      CompeteUserAcceptanceStruct competeUserAcceptance) {
    this.competeUserAcceptance = competeUserAcceptance;
    return this;
  }

  /**
   * Get competeUserAcceptance
   *
   * @return competeUserAcceptance
   **/
  @ApiModelProperty(value = "")
  public CompeteUserAcceptanceStruct getCompeteUserAcceptance() {
    return competeUserAcceptance;
  }

  public void setCompeteUserAcceptance(CompeteUserAcceptanceStruct competeUserAcceptance) {
    this.competeUserAcceptance = competeUserAcceptance;
  }

  public DetailCompeteDetailStruct competePctrTrends(
      CompetePctrPcvrTrendsStruct competePctrTrends) {
    this.competePctrTrends = competePctrTrends;
    return this;
  }

  /**
   * Get competePctrTrends
   *
   * @return competePctrTrends
   **/
  @ApiModelProperty(value = "")
  public CompetePctrPcvrTrendsStruct getCompetePctrTrends() {
    return competePctrTrends;
  }

  public void setCompetePctrTrends(CompetePctrPcvrTrendsStruct competePctrTrends) {
    this.competePctrTrends = competePctrTrends;
  }

  public DetailCompeteDetailStruct competePcvrTrends(
      CompetePctrPcvrTrendsStruct competePcvrTrends) {
    this.competePcvrTrends = competePcvrTrends;
    return this;
  }

  /**
   * Get competePcvrTrends
   *
   * @return competePcvrTrends
   **/
  @ApiModelProperty(value = "")
  public CompetePctrPcvrTrendsStruct getCompetePcvrTrends() {
    return competePcvrTrends;
  }

  public void setCompetePcvrTrends(CompetePctrPcvrTrendsStruct competePcvrTrends) {
    this.competePcvrTrends = competePcvrTrends;
  }

  public DetailCompeteDetailStruct competeWinAdgroup(CompeteWinAdgroupStruct competeWinAdgroup) {
    this.competeWinAdgroup = competeWinAdgroup;
    return this;
  }

  /**
   * Get competeWinAdgroup
   *
   * @return competeWinAdgroup
   **/
  @ApiModelProperty(value = "")
  public CompeteWinAdgroupStruct getCompeteWinAdgroup() {
    return competeWinAdgroup;
  }

  public void setCompeteWinAdgroup(CompeteWinAdgroupStruct competeWinAdgroup) {
    this.competeWinAdgroup = competeWinAdgroup;
  }

  public DetailCompeteDetailStruct competeSurroundings(
      CompeteSurroundingsStruct competeSurroundings) {
    this.competeSurroundings = competeSurroundings;
    return this;
  }

  /**
   * Get competeSurroundings
   *
   * @return competeSurroundings
   **/
  @ApiModelProperty(value = "")
  public CompeteSurroundingsStruct getCompeteSurroundings() {
    return competeSurroundings;
  }

  public void setCompeteSurroundings(CompeteSurroundingsStruct competeSurroundings) {
    this.competeSurroundings = competeSurroundings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailCompeteDetailStruct detailCompeteDetailStruct = (DetailCompeteDetailStruct) o;
    return Objects.equals(this.score, detailCompeteDetailStruct.score) &&
        Objects.equals(this.competeAttribution, detailCompeteDetailStruct.competeAttribution) &&
        Objects.equals(this.competeBudgetDetails, detailCompeteDetailStruct.competeBudgetDetails) &&
        Objects.equals(this.competeBidDetails, detailCompeteDetailStruct.competeBidDetails) &&
        Objects.equals(this.competeUserAcceptance, detailCompeteDetailStruct.competeUserAcceptance)
        &&
        Objects.equals(this.competePctrTrends, detailCompeteDetailStruct.competePctrTrends) &&
        Objects.equals(this.competePcvrTrends, detailCompeteDetailStruct.competePcvrTrends) &&
        Objects.equals(this.competeWinAdgroup, detailCompeteDetailStruct.competeWinAdgroup) &&
        Objects.equals(this.competeSurroundings, detailCompeteDetailStruct.competeSurroundings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, competeAttribution, competeBudgetDetails, competeBidDetails,
        competeUserAcceptance, competePctrTrends, competePcvrTrends, competeWinAdgroup,
        competeSurroundings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailCompeteDetailStruct {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    competeAttribution: ").append(toIndentedString(competeAttribution)).append("\n");
    sb.append("    competeBudgetDetails: ").append(toIndentedString(competeBudgetDetails))
        .append("\n");
    sb.append("    competeBidDetails: ").append(toIndentedString(competeBidDetails)).append("\n");
    sb.append("    competeUserAcceptance: ").append(toIndentedString(competeUserAcceptance))
        .append("\n");
    sb.append("    competePctrTrends: ").append(toIndentedString(competePctrTrends)).append("\n");
    sb.append("    competePcvrTrends: ").append(toIndentedString(competePcvrTrends)).append("\n");
    sb.append("    competeWinAdgroup: ").append(toIndentedString(competeWinAdgroup)).append("\n");
    sb.append("    competeSurroundings: ").append(toIndentedString(competeSurroundings))
        .append("\n");
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
