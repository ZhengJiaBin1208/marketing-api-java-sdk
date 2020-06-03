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
import com.tencent.ads.api.DynamicAdImagesApi;
import com.tencent.ads.model.DynamicAdImagesAddRequest;
import com.tencent.ads.model.DynamicAdImagesAddResponse;
import com.tencent.ads.model.DynamicAdImagesAddResponseData;
import com.tencent.ads.model.DynamicAdImagesGetResponse;
import com.tencent.ads.model.DynamicAdImagesGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;


public class DynamicAdImagesApiContainer extends ApiContainer {

  @Inject
  DynamicAdImagesApi api;


  /**
   * 创建用于广告投放的动态广告图片
   *
   * @param data (required)
   * @return DynamicAdImagesAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public DynamicAdImagesAddResponseData dynamicAdImagesAdd(DynamicAdImagesAddRequest data)
      throws ApiException {
    DynamicAdImagesAddResponse resp = api.dynamicAdImagesAdd(data);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 获取动态广告图片信息
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdImagesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public DynamicAdImagesGetResponseData dynamicAdImagesGet(Long accountId,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields)
      throws ApiException {
    DynamicAdImagesGetResponse resp = api
        .dynamicAdImagesGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}