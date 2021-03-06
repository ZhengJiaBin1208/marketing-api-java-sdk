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

/** 返回结构 */
@ApiModel(description = "返回结构")
public class BatchRequestsAddListStruct {
  @SerializedName("http_code")
  private Long httpCode = null;

  @SerializedName("headers")
  private List<HeaderStruct> headers = null;

  @SerializedName("body")
  private String body = null;

  public BatchRequestsAddListStruct httpCode(Long httpCode) {
    this.httpCode = httpCode;
    return this;
  }

  /**
   * Get httpCode
   *
   * @return httpCode
   */
  @ApiModelProperty(value = "")
  public Long getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Long httpCode) {
    this.httpCode = httpCode;
  }

  public BatchRequestsAddListStruct headers(List<HeaderStruct> headers) {
    this.headers = headers;
    return this;
  }

  public BatchRequestsAddListStruct addHeadersItem(HeaderStruct headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<HeaderStruct>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * Get headers
   *
   * @return headers
   */
  @ApiModelProperty(value = "")
  public List<HeaderStruct> getHeaders() {
    return headers;
  }

  public void setHeaders(List<HeaderStruct> headers) {
    this.headers = headers;
  }

  public BatchRequestsAddListStruct body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Get body
   *
   * @return body
   */
  @ApiModelProperty(value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestsAddListStruct batchRequestsAddListStruct = (BatchRequestsAddListStruct) o;
    return Objects.equals(this.httpCode, batchRequestsAddListStruct.httpCode)
        && Objects.equals(this.headers, batchRequestsAddListStruct.headers)
        && Objects.equals(this.body, batchRequestsAddListStruct.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpCode, headers, body);
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
