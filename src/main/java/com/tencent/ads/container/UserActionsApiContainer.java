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
import com.tencent.ads.api.UserActionsApi;
import com.tencent.ads.model.UserActionsAddRequest;
import com.tencent.ads.model.UserActionsAddResponse;


public class UserActionsApiContainer extends ApiContainer {

  @Inject
  UserActionsApi api;


  /**
   * 上传用户行为数据
   *
   * @param data (required)
   * @return UserActionsAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public UserActionsAddResponse userActionsAdd(UserActionsAddRequest data) throws ApiException {
    UserActionsAddResponse resp = api.userActionsAdd(data);
    handleResponse(gson.toJson(resp));

    return resp;
  }


}