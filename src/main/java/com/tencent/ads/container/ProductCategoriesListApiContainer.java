/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 1.3
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
import com.tencent.ads.anno.*;
import com.tencent.ads.api.ProductCategoriesListApi;
import com.tencent.ads.exception.TencentAdsResponseException;
import com.tencent.ads.model.ProductCategoriesListGetResponse;
import com.tencent.ads.model.ProductCategoriesListGetResponseData;
import java.util.List;

public class ProductCategoriesListApiContainer extends ApiContainer {

  @Inject ProductCategoriesListApi api;

  /**
   * 获取商品类目
   *
   * @param accountId (required)
   * @param productCatalogId (required)
   * @param fields 返回参数的字段列表 (optional)
   * @return ProductCategoriesListGetResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   */
  public ProductCategoriesListGetResponseData productCategoriesListGet(
      Long accountId, Long productCatalogId, List<String> fields)
      throws ApiException, TencentAdsResponseException {
    ProductCategoriesListGetResponse resp =
        api.productCategoriesListGet(accountId, productCatalogId, fields);
    handleResponse(gson.toJson(resp));
    return resp.getData();
  }
}
