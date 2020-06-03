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
import com.tencent.ads.api.ProfilesApi;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.ProfilesAddRequest;
import com.tencent.ads.model.ProfilesAddResponse;
import com.tencent.ads.model.ProfilesAddResponseData;
import com.tencent.ads.model.ProfilesDeleteRequest;
import com.tencent.ads.model.ProfilesDeleteResponse;
import com.tencent.ads.model.ProfilesDeleteResponseData;
import com.tencent.ads.model.ProfilesGetResponse;
import com.tencent.ads.model.ProfilesGetResponseData;
import java.util.List;


public class ProfilesApiContainer extends ApiContainer {

  @Inject
  ProfilesApi api;


  /**
   * 创建朋友圈头像昵称跳转页
   *
   * @param data (required)
   * @return ProfilesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ProfilesAddResponseData profilesAdd(ProfilesAddRequest data) throws ApiException {
    ProfilesAddResponse resp = api.profilesAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 删除朋友圈头像昵称跳转页
   *
   * @param data (required)
   * @return ProfilesDeleteResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ProfilesDeleteResponseData profilesDelete(ProfilesDeleteRequest data) throws ApiException {
    ProfilesDeleteResponse resp = api.profilesDelete(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 获取朋友圈头像昵称跳转页
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProfilesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public ProfilesGetResponseData profilesGet(Long accountId, List<FilteringStruct> filtering,
      Long page, Long pageSize, List<String> fields) throws ApiException {
    ProfilesGetResponse resp = api.profilesGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}