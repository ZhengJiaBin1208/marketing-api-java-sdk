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
import com.tencent.ads.api.AdcreativeTemplateDetailApi;
import com.tencent.ads.model.AdcreativeTemplateDetailGetResponse;
import com.tencent.ads.model.AdcreativeTemplateDetailGetResponseData;
import java.util.List;


public class AdcreativeTemplateDetailApiContainer extends ApiContainer {

  @Inject
  AdcreativeTemplateDetailApi api;


  /**
   * 获取创意规格信息
   *
   * @param adcreativeTemplateId (required)
   * @param promotedObjectType (required)
   * @param accountId (optional)
   * @param automaticSiteEnabled (optional)
   * @param siteSet (optional)
   * @param isDynamicCreativeAd (optional)
   * @param fields 返回参数的字段列表 (optional)
   * @return AdcreativeTemplateDetailGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   * response body
   */
  public AdcreativeTemplateDetailGetResponseData adcreativeTemplateDetailGet(
      Long adcreativeTemplateId, String promotedObjectType, Long accountId,
      Boolean automaticSiteEnabled, List<String> siteSet, Boolean isDynamicCreativeAd,
      List<String> fields) throws ApiException {
    AdcreativeTemplateDetailGetResponse resp = api
        .adcreativeTemplateDetailGet(adcreativeTemplateId, promotedObjectType, accountId,
            automaticSiteEnabled, siteSet, isDynamicCreativeAd, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }


}