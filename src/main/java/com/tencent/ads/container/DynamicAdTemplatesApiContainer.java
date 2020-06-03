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
import com.tencent.ads.api.DynamicAdTemplatesApi;
import com.tencent.ads.model.DynamicAdTemplatesGetResponse;
import com.tencent.ads.model.DynamicAdTemplatesGetResponseData;
import com.tencent.ads.model.FilteringStruct;
import java.util.List;


public class DynamicAdTemplatesApiContainer extends ApiContainer {

  @Inject
  DynamicAdTemplatesApi api;


  /**
   * 获取动态模板信息
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param dynamicAdTemplateWidth (required)
   * @param dynamicAdTemplateHeight (required)
   * @param dynamicAdTemplateType (optional)
   * @param dynamicAdTemplateOwnershipType (optional)
   * @param filtering (optional)
   * @param page (optional)
   * @param pageSize (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return DynamicAdTemplatesGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public DynamicAdTemplatesGetResponseData dynamicAdTemplatesGet(Long accountId,
      Long productCatalogId, Long dynamicAdTemplateWidth, Long dynamicAdTemplateHeight,
      String dynamicAdTemplateType, String dynamicAdTemplateOwnershipType,
      List<FilteringStruct> filtering, Long page, Long pageSize, List<String> fields)
      throws ApiException {
    DynamicAdTemplatesGetResponse resp = api
        .dynamicAdTemplatesGet(accountId, productCatalogId, dynamicAdTemplateWidth,
            dynamicAdTemplateHeight, dynamicAdTemplateType, dynamicAdTemplateOwnershipType,
            filtering, page, pageSize, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}