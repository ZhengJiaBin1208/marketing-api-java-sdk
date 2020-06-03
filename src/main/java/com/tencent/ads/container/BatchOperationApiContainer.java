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
import com.tencent.ads.api.BatchOperationApi;
import com.tencent.ads.model.BatchOperationAddRequest;
import com.tencent.ads.model.BatchOperationAddResponse;


public class BatchOperationApiContainer extends ApiContainer {

  @Inject
  BatchOperationApi api;


  /**
   * 创建批量操作(待废弃)
   *
   * @param data (required)
   * @return BatchOperationAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public BatchOperationAddResponse batchOperationAdd(BatchOperationAddRequest data)
      throws ApiException {
    BatchOperationAddResponse resp = api.batchOperationAdd(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }


}