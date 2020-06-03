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
import com.tencent.ads.api.VideosApi;
import com.tencent.ads.model.FilteringStruct;
import com.tencent.ads.model.VideosAddResponse;
import com.tencent.ads.model.VideosAddResponseData;
import com.tencent.ads.model.VideosGetResponse;
import com.tencent.ads.model.VideosGetResponseData;
import java.io.File;
import java.util.List;


public class VideosApiContainer extends ApiContainer {

  @Inject
  VideosApi api;


  /**
   * 添加视频文件
   *
   * @param accountId (required)
   * @param videoFile (required)
   * @param signature (required)
   * @param description (optional)
   * @param adcreativeTemplateId (optional)
   * @return VideosAddResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public VideosAddResponseData videosAdd(Long accountId, File videoFile, String signature,
      String description, Long adcreativeTemplateId) throws ApiException {
    VideosAddResponse resp = api
        .videosAdd(accountId, videoFile, signature, description, adcreativeTemplateId);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


  /**
   * 获取视频文件
   *
   * @param accountId (required)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return VideosGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public VideosGetResponseData videosGet(Long accountId, List<FilteringStruct> filtering, Long page,
      Long pageSize, List<String> fields) throws ApiException {
    VideosGetResponse resp = api.videosGet(accountId, filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}