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
import com.tencent.ads.api.SystemStatusApi;
import com.tencent.ads.model.SystemStatusGetResponse;
import com.tencent.ads.model.SystemStatusGetResponseData;
import java.util.List;
import java.util.Map;


public class SystemStatusApiContainer extends ApiContainer {

  @Inject
  SystemStatusApi api;


  /**
   * 获取广告组系统状态信息
   *
   * @param accountId (required)
   * @param statusType (required)
   * @param statusSpec (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return SystemStatusGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public SystemStatusGetResponseData systemStatusGet(Long accountId, String statusType,
      Map<String, Object> statusSpec, List<String> fields) throws ApiException {
    SystemStatusGetResponse resp = api.systemStatusGet(accountId, statusType, statusSpec, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}