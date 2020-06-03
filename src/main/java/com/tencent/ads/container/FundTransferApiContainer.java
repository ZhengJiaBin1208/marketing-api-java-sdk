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

package com.tencent.ads.container;

import com.google.inject.Inject;
import com.tencent.ads.ApiContainer;
import com.tencent.ads.ApiException;
import com.tencent.ads.api.FundTransferApi;
import com.tencent.ads.model.FundTransferAddRequest;
import com.tencent.ads.model.FundTransferAddResponse;
import com.tencent.ads.model.FundTransferAddResponseData;


public class FundTransferApiContainer extends ApiContainer {

  @Inject
  FundTransferApi api;


  /**
   * 发起代理商与子客户之间转账
   *
   * @param data (required)
   * @return FundTransferAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public FundTransferAddResponseData fundTransferAdd(FundTransferAddRequest data)
      throws ApiException {
    FundTransferAddResponse resp = api.fundTransferAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}