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
 * 点击竞争力趋势变化
 */
@ApiModel(description = "点击竞争力趋势变化")

public class CompetePctrPcvrTrendsStruct {

  @SerializedName("score")
  private Long score = null;

  @SerializedName("self_avg")
  private List<PointStruct> selfAvg = null;

  @SerializedName("self_chose_avg")
  private List<PointStruct> selfChoseAvg = null;

  @SerializedName("winner_chose_avg")
  private List<PointStruct> winnerChoseAvg = null;

  @SerializedName("conclusion")
  private String conclusion = null;

  public CompetePctrPcvrTrendsStruct score(Long score) {
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

  public CompetePctrPcvrTrendsStruct selfAvg(List<PointStruct> selfAvg) {
    this.selfAvg = selfAvg;
    return this;
  }

  public CompetePctrPcvrTrendsStruct addSelfAvgItem(PointStruct selfAvgItem) {
    if (this.selfAvg == null) {
      this.selfAvg = new ArrayList<PointStruct>();
    }
    this.selfAvg.add(selfAvgItem);
    return this;
  }

  /**
   * Get selfAvg
   *
   * @return selfAvg
   **/
  @ApiModelProperty(value = "")
  public List<PointStruct> getSelfAvg() {
    return selfAvg;
  }

  public void setSelfAvg(List<PointStruct> selfAvg) {
    this.selfAvg = selfAvg;
  }

  public CompetePctrPcvrTrendsStruct selfChoseAvg(List<PointStruct> selfChoseAvg) {
    this.selfChoseAvg = selfChoseAvg;
    return this;
  }

  public CompetePctrPcvrTrendsStruct addSelfChoseAvgItem(PointStruct selfChoseAvgItem) {
    if (this.selfChoseAvg == null) {
      this.selfChoseAvg = new ArrayList<PointStruct>();
    }
    this.selfChoseAvg.add(selfChoseAvgItem);
    return this;
  }

  /**
   * Get selfChoseAvg
   *
   * @return selfChoseAvg
   **/
  @ApiModelProperty(value = "")
  public List<PointStruct> getSelfChoseAvg() {
    return selfChoseAvg;
  }

  public void setSelfChoseAvg(List<PointStruct> selfChoseAvg) {
    this.selfChoseAvg = selfChoseAvg;
  }

  public CompetePctrPcvrTrendsStruct winnerChoseAvg(List<PointStruct> winnerChoseAvg) {
    this.winnerChoseAvg = winnerChoseAvg;
    return this;
  }

  public CompetePctrPcvrTrendsStruct addWinnerChoseAvgItem(PointStruct winnerChoseAvgItem) {
    if (this.winnerChoseAvg == null) {
      this.winnerChoseAvg = new ArrayList<PointStruct>();
    }
    this.winnerChoseAvg.add(winnerChoseAvgItem);
    return this;
  }

  /**
   * Get winnerChoseAvg
   *
   * @return winnerChoseAvg
   **/
  @ApiModelProperty(value = "")
  public List<PointStruct> getWinnerChoseAvg() {
    return winnerChoseAvg;
  }

  public void setWinnerChoseAvg(List<PointStruct> winnerChoseAvg) {
    this.winnerChoseAvg = winnerChoseAvg;
  }

  public CompetePctrPcvrTrendsStruct conclusion(String conclusion) {
    this.conclusion = conclusion;
    return this;
  }

  /**
   * Get conclusion
   *
   * @return conclusion
   **/
  @ApiModelProperty(value = "")
  public String getConclusion() {
    return conclusion;
  }

  public void setConclusion(String conclusion) {
    this.conclusion = conclusion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompetePctrPcvrTrendsStruct competePctrPcvrTrendsStruct = (CompetePctrPcvrTrendsStruct) o;
    return Objects.equals(this.score, competePctrPcvrTrendsStruct.score) &&
        Objects.equals(this.selfAvg, competePctrPcvrTrendsStruct.selfAvg) &&
        Objects.equals(this.selfChoseAvg, competePctrPcvrTrendsStruct.selfChoseAvg) &&
        Objects.equals(this.winnerChoseAvg, competePctrPcvrTrendsStruct.winnerChoseAvg) &&
        Objects.equals(this.conclusion, competePctrPcvrTrendsStruct.conclusion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, selfAvg, selfChoseAvg, winnerChoseAvg, conclusion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompetePctrPcvrTrendsStruct {\n");

    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    selfAvg: ").append(toIndentedString(selfAvg)).append("\n");
    sb.append("    selfChoseAvg: ").append(toIndentedString(selfChoseAvg)).append("\n");
    sb.append("    winnerChoseAvg: ").append(toIndentedString(winnerChoseAvg)).append("\n");
    sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
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
