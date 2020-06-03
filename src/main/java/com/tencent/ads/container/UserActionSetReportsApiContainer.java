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
import com.tencent.ads.api.UserActionSetReportsApi;
import com.tencent.ads.model.UserActionSetReportsGetResponse;
import com.tencent.ads.model.UserActionSetReportsGetResponseData;
import java.util.List;
import java.util.Map;


public class UserActionSetReportsApiContainer extends ApiContainer {

  @Inject
  UserActionSetReportsApi api;


  /**
   * 获取用户行为数据源报表
   *
   * @param accountId (required)
   * @param userActionSetId (required)
   * @param dateRange (required)
   * @param timeGranularity (required)
   * @param aggregation (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return UserActionSetReportsGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public UserActionSetReportsGetResponseData userActionSetReportsGet(Long accountId,
      Long userActionSetId, Map<String, Object> dateRange, String timeGranularity,
      String aggregation, List<String> fields) throws ApiException {
    UserActionSetReportsGetResponse resp = api
        .userActionSetReportsGet(accountId, userActionSetId, dateRange, timeGranularity,
            aggregation, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}